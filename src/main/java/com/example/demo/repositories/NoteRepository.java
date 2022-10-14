package com.example.demo.repositories;

import com.example.demo.entities.Note;
import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findAllByUserEquals(User user);

    //void saveAndFlush(Note note);

    //Optional<Note> findById(Long noteId);

    //void delete(Note note);
}
