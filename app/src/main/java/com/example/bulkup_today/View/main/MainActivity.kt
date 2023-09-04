package com.example.bulkup_today.View.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.bulkup_today.R
import com.example.bulkup_today.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var step = CATEGORY

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initNavigationBar()
    }

    private fun initNavigationBar() {
        val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_contents -> {
                    switchContentsFragment()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.page_home -> {
                    switchCategoryFragment()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.page_profile -> {
                    switchProfileFragment()
                    return@OnNavigationItemSelectedListener true
                }
                else -> {
                    false
                }
            }
        }
        binding.bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }                                                                                                                                  

    private fun switchContentsFragment() {
        step = SNS
        val bundle = Bundle()
        mFragment = SNSFragment()
        mFragment?.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.container, mFragment!!).commit()
    }

    private fun switchProfileFragment() {
        step = PROFILE
        val bundle = Bundle()
        mFragment = ProfileFragment()
        mFragment?.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.container, mFragment!!).commit()
    }

    private fun switchCategoryFragment() {
        step = CATEGORY
        val bundle = Bundle()
        mFragment = CategoryFragment()
        mFragment?.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.container, mFragment!!).commit()
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
        private var mFragment: Fragment? = null

        const val SNS = "SNS"
        const val PROFILE = "PROFILE"
        const val CATEGORY = "CATEGORY"
    }
}