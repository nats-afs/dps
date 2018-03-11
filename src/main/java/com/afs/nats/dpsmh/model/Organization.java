package com.afs.nats.dpsmh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Organization {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank(message = "Indique nombre")
	private @NonNull String name;
	@NotBlank(message = "Indique abreviatura")
	private @NonNull String shortName;
	@NotBlank(message = "Indique slogan")
	private @NonNull String slogan;
	@NotNull
	private @NonNull String ruc;
	@NotNull
	private @NonNull String img;
	@NotNull
	private @NonNull String phone;
	@NotNull
	private @NonNull String address;
	@NotNull
	private @NonNull String web;
}
