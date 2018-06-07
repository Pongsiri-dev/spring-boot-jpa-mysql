package com.example.easydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easydemo.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long>{
	
}
