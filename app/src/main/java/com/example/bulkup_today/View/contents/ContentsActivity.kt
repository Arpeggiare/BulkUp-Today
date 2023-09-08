package com.example.bulkup_today.View.contents

import android.os.Binder
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bulkup_today.databinding.ActivityContentsBinding

class ContentsActivity:AppCompatActivity() {

    private lateinit var binding: ActivityContentsBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = ActivityContentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    private fun switchPartyList() {

    }

    private fun switchQuestList() {

    }

    private fun switchDungeonList() {

    }

    private fun carryList() {

    }
}