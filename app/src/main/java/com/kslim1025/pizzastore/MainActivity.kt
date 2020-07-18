package com.kslim1025.pizzastore

import android.os.Bundle
import com.kslim1025.pizzastore.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

//        어댑터 생성 => 뷰페이저와 연결
        mvpa = MainViewPagerAdapter(supportFragmentManager)

        mainViewPager.adapter = mvpa

//        뷰페이저와 / 탭레이아웃 연결

        myTabLayout.setupWithViewPager(mainViewPager)

    }


}