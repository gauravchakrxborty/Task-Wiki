package com.example.task_wiki.data.model

import com.google.firebase.firestore.ServerTimestamp
import com.google.type.Date
import org.w3c.dom.Text

data class Note(
    val id: String,
    val text: String,
    @ServerTimestamp
    val date: Date,
)
