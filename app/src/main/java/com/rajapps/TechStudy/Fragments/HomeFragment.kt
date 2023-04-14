package com.rajapps.TechStudy.Fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rajapps.TechStudy.BooksAdapter
import com.rajapps.TechStudy.BooksModel
import com.rajapps.TechStudy.R
import com.rajapps.TechStudy.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: BooksAdapter
    private val list: ArrayList<BooksModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = BooksAdapter(list, requireContext())

        binding.apply {
            mRecyclerViewHome.adapter = adapter
            list.add(BooksModel(R.drawable.m3_nirali, "M3 Nirali", getString(R.string.M3), "m3_book.pdf"))
            list.add(BooksModel(R.drawable.book_1, "Rich Dad Poor Dad", getString(R.string.description_1), "sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_2, "Atomic Habits", getString(R.string.description_2), "se_bank.pdf"))
            list.add(BooksModel(R.drawable.book_3, "Best Self", getString(R.string.description_3), "se_bank.pdf"))
            list.add(BooksModel(R.drawable.book_4, "How To Be Fine", getString(R.string.description_4), "sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_5, "Out of the Box", getString(R.string.description_5), "sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_6, "Stripped", getString(R.string.description_6), "sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_7, "12 Rules for Life", getString(R.string.description_7), "sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_8, "Readistan", getString(R.string.description_8), "sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_9, "Reclaim Your Heart", getString(R.string.description_9), "sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_10, "Lost Islamic History", getString(R.string.description_10), "sample_book.pdf"))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}