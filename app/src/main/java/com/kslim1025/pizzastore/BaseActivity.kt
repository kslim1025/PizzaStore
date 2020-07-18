package com.kslim1025.pizzastore

/**
 * Created by KJStudio on 2017. 4. 17..
 */

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


/**
 * Created by KJStudio on 2017. 2. 27..
 */
class BaseActivity : AppCompatActivity() {
    var mTitleTextView: TextView? = null
    var titleLayout: LinearLayout? = null
    var toggleBtn: ImageButton? = null
    var titleImg: ImageView? = null
    var backBtn: ImageButton? = null
    var addBtn: ImageButton? = null
    var mContext: Context? = null

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
    }

    fun bindViews() {}
    fun setupEvents() {}
    fun setValues() {}
    fun setCustomActionbar() {
  /*      val mActionBar: ActionBar? = supportActionBar
        mActionBar.setDisplayShowHomeEnabled(false)
        mActionBar.setDisplayHomeAsUpEnabled(false)
        mActionBar.setDisplayShowTitleEnabled(false)
        mActionBar.setDisplayShowCustomEnabled(true)
        val mInflater = LayoutInflater.from(this)
        val mCustomView: View = mInflater.inflate(R.layout.custom_action_bar, null)
        //        FontChanger.setGlobalFont(FontChanger.setTypeFace(BaseActivity.this), BaseActivity.this, mTitleTextView);
        mActionBar.setCustomView(mCustomView)
        mActionBar.setDisplayShowCustomEnabled(true)
        val parent: Toolbar = mCustomView.parent as Toolbar
        parent.setContentInsetsAbsolute(0, 0)
        supportActionBar!!.elevation = 0f*/
/*        mTitleTextView = supportActionBar!!.customView
            .findViewById<View>(R.id.titleTxt) as TextView
        titleLayout = supportActionBar!!.customView
            .findViewById<View>(R.id.titleLayout) as LinearLayout
        toggleBtn = supportActionBar!!.customView
            .findViewById<View>(R.id.toggleBtn) as ImageButton
        titleImg = supportActionBar!!.customView
            .findViewById<View>(R.id.titleImg) as ImageView
        backBtn = supportActionBar!!.customView
            .findViewById<View>(R.id.backBtn) as ImageButton
        addBtn = supportActionBar!!.customView
            .findViewById<View>(R.id.addBtn) as ImageButton*/


//        mTitleTextView.setTypeface(Typeface.createFromAsset(getAssets(),"NotoSansKR-DemiLight-Hestia.otf"));
//        Typeface khandBold = Typeface.createFromAsset(BaseActivity.this.getAssets(), "NotoSansKR-DemiLight-Hestia.otf");

//        mTitleTextView.setTypeface(khandBold);
    }
}