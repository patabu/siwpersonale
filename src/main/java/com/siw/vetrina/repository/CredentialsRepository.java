package com.siw.vetrina.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.siw.vetrina.model.Credentials;

public interface CredentialsRepository extends CrudRepository<Credentials, Long> {

	public Optional<Credentials> findByUsername(String username);

}
