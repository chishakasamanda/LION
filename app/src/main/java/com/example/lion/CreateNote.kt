package com.example.lion

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lion.databinding.ActivityCreateNoteBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class CreateNote : AppCompatActivity() {

    private lateinit var binding: ActivityCreateNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set the current date and time in `textDateTime`
        val currentDateTime = SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.getDefault()).format(Date())
        binding.textDateTime.text = currentDateTime

        // Set up the back button functionality
        binding.backimage.setOnClickListener {
            finish() // Finish the current activity to go back to the previous screen
        }

        // Set up the save button functionality
        binding.saveImage.setOnClickListener {
            saveNote()
        }
    }

    // Function to save the note (stub)
    private fun saveNote() {
        val title = binding.newTitle.text.toString().trim()
        val subtitle = binding.inputNoteSubtitle.text.toString().trim()
        val content = binding.inputNote.text.toString().trim()

        // Check if the note fields are empty
        if (title.isEmpty() && subtitle.isEmpty() && content.isEmpty()) {
            Toast.makeText(this, "Please add some content to save the note", Toast.LENGTH_SHORT).show()
            return
        }

        // This is where you'd add code to save the note (e.g., to a database or file)
        // For now, we'll display a message indicating the note has been saved.
        Toast.makeText(this, "Note saved successfully", Toast.LENGTH_SHORT).show()

        // Close the activity after saving
        finish()
    }
}
