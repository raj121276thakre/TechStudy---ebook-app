package com.rajapps.TechStudy

import android.os.Bundle
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.rajapps.TechStudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding

    val activity = this
    val list: ArrayList<BooksModel> = ArrayList()
    val adapter = BooksAdapter(list, activity)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //supportActionBar!!.hide()


        binding.apply {
            mRecyclerViewHome.adapter = adapter

            list.add(BooksModel(R.drawable.m3_nirali,"M3 Nirali",getString(R.string.M3),"m3_book.pdf"))
            list.add(BooksModel(R.drawable.book_1,"Rich Dad Poor Dad",getString(R.string.description_1),"sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_2,"Atomic Habits",getString(R.string.description_2),"se_bank.pdf"))
            list.add(BooksModel(R.drawable.book_3,"Best Self",getString(R.string.description_3),"se_bank.pdf"))
            list.add(BooksModel(R.drawable.book_4,"How To Be Fine",getString(R.string.description_4),"sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_5,"Out of the Box",getString(R.string.description_5),"sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_6,"Stripped",getString(R.string.description_6),"sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_7,"12 Rules for Life",getString(R.string.description_7),"sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_8,"Readistan",getString(R.string.description_8),"sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_9,"Reclaim Your Heart",getString(R.string.description_9),"sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_10,"Lost Islamic History",getString(R.string.description_10),"sample_book.pdf"))

        }

    }
}