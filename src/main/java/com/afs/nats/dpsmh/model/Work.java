package com.afs.nats.dpsmh.model;

import java.math.BigDecimal;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Work {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne
	@JoinColumn(name="idOrganization", referencedColumnName = "id")
	@NotNull(message = "Indique compañia")
	private @NonNull Organization organization;
	@OneToOne
	@JoinColumn(name="idTupa", referencedColumnName = "id")
	@NotNull(message = "Indique TUPA")
	private @NonNull Tupa tupa;
	private String name;
	private Integer year;
	@Digits(integer = 8, fraction = 2, message = "Numero fuera de estimacion")
	@DecimalMin(value = "0.00", inclusive = false, message = "Indique valor de UIT")
	private @NonNull BigDecimal uit;
}
