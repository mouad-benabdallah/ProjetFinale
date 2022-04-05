package com.exo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exo.entities.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Integer> {
	public List<Evaluation> findAllByOrderByNoteDesc();

}
