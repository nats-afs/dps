package com.afs.nats.dpsmh.controller;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.afs.nats.dpsmh.model.Claimant;
import com.afs.nats.dpsmh.model.TipoDocumento;
import com.afs.nats.dpsmh.repository.ClaimantRepository;
//
//@RequestMapping("/claimants")
//public class ClaimantController {
//
//}