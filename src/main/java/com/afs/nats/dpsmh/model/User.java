package com.afs.nats.dpsmh.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity(name = "USUARIO")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    @NotEmpty(message = "Nombre de usuario requerido")
    private @NonNull String name;
    @NotNull(message = "Indique Documento")
    @Enumerated(EnumType.STRING)
    private @NonNull TipoDocumento doc;
    @NotBlank(message = "Indique numero de documento")
    @Size(min = 8, max = 11, message = "Indique numero de documento de 8 a 11 caracteres")
    private @NonNull String nroDoc;
    @NotEmpty(message = "Nombre de usuario requerido")
    private @NonNull String email;
    @NotEmpty(message = "Nombre de usuario requerido")
    private @NonNull String phone;
	@NotEmpty(message = "Nombre de usuario requerido")
	private @NonNull String username;
	@NotEmpty(message = "Password requerido")
	private @NonNull String password;
	@NotEmpty(message = "Rol requerido")
    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "idUSer"), inverseJoinColumns = @JoinColumn(name = "idRole"))
	private @NonNull Set<Role> roles;
	// private @NonNull String password;
	// private @NonNull Boolean active;
	// @ManyToMany(cascade = CascadeType.ALL)
	// @JoinTable(name = "user_role",
	// joinColumns = @JoinColumn(name = "userId"),
	// inverseJoinColumns = @JoinColumn(name = "roleId")
	// )
	// private @NonNull Set<User> users = new HashSet<User>();
}
