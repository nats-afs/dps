package com.afs.nats.dpsmh;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.afs.nats.dpsmh.model.Claimant;
import com.afs.nats.dpsmh.model.TipoDocumento;
import com.afs.nats.dpsmh.repository.ClaimantRepository;


@SpringBootApplication
public class DpsMhApplication {

	public static void main(String[] args) {
		SpringApplication.run(DpsMhApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setData(ClaimantRepository repository) {
		return args -> {
			List<Claimant> claimantList = new ArrayList<Claimant>();
			for (int i = 1; i < 10; i++) {
				claimantList
				.add(new Claimant(
						String.format("Nombres %d",i),
						String.format("Direccion %d", i),
						String.format("Telefono %d", i),
						String.format("foo%d@bas.com", i),
						TipoDocumento.DNI,
						"98745678"));
			}
			claimantList.forEach(repository::save);
		};
	}
}
