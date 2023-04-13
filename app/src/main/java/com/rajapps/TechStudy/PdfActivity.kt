package com.rajapps.TechStudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage
import com.rajapps.TechStudy.databinding.ActivityPdfBinding


class PdfActivity : AppCompatActivity() {
    val activity = this
    lateinit var binding: ActivityPdfBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfBinding.inflate(layoutInflater)
        this.window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(binding.root)
        supportActionBar?.hide()






        binding.apply {
            val bookPDF = intent.getStringExtra("book_pdf").toString()
            pdfView.fromAsset(bookPDF)
                .swipeHorizontal(true)
                .enableSwipe(true)
                .pageSnap(true)
                .autoSpacing(true)
                .pageFling(true)
                .load()
        }

    }


}















