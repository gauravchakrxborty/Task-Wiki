package com.example.task_wiki.data.repository

import com.example.task_wiki.data.model.Note

interface NoteRepository {
    fun getNotes(): List<Note>
}