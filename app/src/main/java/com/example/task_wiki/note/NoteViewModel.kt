package com.example.task_wiki.note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.task_wiki.data.model.Note
import com.example.task_wiki.data.repository.NoteRepository

class NoteViewModel(
    private val repository: NoteRepository): ViewModel() {

        private val _notes = MutableLiveData<List<Note>>()
        val note: LiveData<List<Note>>
                get() = _notes

    fun getNotes() {
        _notes.value = repository.getNotes()
    }

}