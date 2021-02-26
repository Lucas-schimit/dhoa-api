package com.hardtech.doabookapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hardtech.doabookapi.models.Temas;

@Repository
public interface TemasRepository extends JpaRepository<Temas, Long> {
	public List<Temas> findAllByNomeContainingIgnoreCase(String nome);
}
