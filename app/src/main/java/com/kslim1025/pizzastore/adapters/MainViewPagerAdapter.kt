package com.kslim1025.pizzastore.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kslim1025.pizzastore.fragments.MyProfileFragment
import com.kslim1025.pizzastore.fragments.PizzaStoreListFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "피자 주문"
            else -> "내 정보 설정"
        }
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> PizzaStoreListFragment()
            else -> MyProfileFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}