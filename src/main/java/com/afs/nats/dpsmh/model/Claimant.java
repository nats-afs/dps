package com.afs.nats.dpsmh.model;

import com.afs.nats.dpsmh.audit.ClaimantEntityListener;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@EntityListeners(ClaimantEntityListener.class)
public class Claimant extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Indique nombre de solicitante")
    private @NonNull
    String name;
    @NotBlank(message = "Indique direccion de solicitante")
    private @NonNull
    String address;
    @Size(min = 7, message = "Telefono debe contener al menos 7 caracteres")
    private @NonNull
    String phone;
    @Email(message = "Ingrese una direccion de email valida")
    @NotBlank(message = "Indique email de solicitante")
    @NotNull
    private @NonNull
    String email;
    @NotNull(message = "Indique Documento")
    @Enumerated(EnumType.STRING)
    private @NonNull
    TipoDocumento doc;
    @NotBlank(message = "Indique numero de documento")
    @Size(min = 8, max = 11, message = "Indique numero de documento de 8 a 11 caracteres")
    private @NonNull
    String nroDoc;
}
