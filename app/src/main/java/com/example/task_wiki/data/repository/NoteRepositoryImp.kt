package com.example.task_wiki.data.repository

import com.example.task_wiki.data.model.Note

class NoteRepositoryImp: NoteRepository {

    override fun getNotes(): List<Note> {

        //Get Data from Firebase

        return arrayListOf()
    }
}