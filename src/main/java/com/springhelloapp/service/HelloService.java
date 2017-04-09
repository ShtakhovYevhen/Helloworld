package com.springhelloapp.service;

import com.springhelloapp.model.Note;


public interface HelloService {
    void createNote(Note note);

    Note findById(int id);

    void updateNote(Note note);

    void deleteNote(int id);
}

