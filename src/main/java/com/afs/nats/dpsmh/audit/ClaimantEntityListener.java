package com.afs.nats.dpsmh.audit;

import com.afs.nats.dpsmh.model.Action;
import com.afs.nats.dpsmh.model.BeanUtil;
import com.afs.nats.dpsmh.model.Claimant;
import com.afs.nats.dpsmh.model.ClaimantHistory;

import javax.persistence.EntityManager;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.transaction.Transactional;

import static com.afs.nats.dpsmh.model.Action.DELETED;
import static com.afs.nats.dpsmh.model.Action.INSERTED;
import static com.afs.nats.dpsmh.model.Action.UPDATED;
import static javax.transaction.Transactional.TxType.MANDATORY;

public class ClaimantEntityListener {
    @PrePersist
    public void prePersist(Claimant target) {
        perform(target, INSERTED);
    }

    @PreUpdate
    public void preUpdate(Claimant target) {
        perform(target, UPDATED);
    }

    @PreRemove
    public void preRemove(Claimant target) {
        perform(target, DELETED);
    }

    @Transactional(MANDATORY)
    private void perform(Claimant target, Action action) {
        EntityManager entityManager = BeanUtil.getBean(EntityManager.class);
        entityManager.persist(new ClaimantHistory(target, action));
    }
}
