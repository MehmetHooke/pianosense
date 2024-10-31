package com.example.pianosense

import android.os.Bundle
//import android.view.View
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
// androidx.compose.ui.tooling.preview.Preview
import androidx.viewpager2.widget.ViewPager2
//import com.example.pianosense.ui.theme.PianosenseTheme
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), OnNextClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val adapter = ScreenSlidePagerAdapter(this)
        viewPager.adapter = adapter
    }

    override fun onNextClick() {
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val nextItem = viewPager.currentItem + 1
        if (nextItem < (viewPager.adapter?.itemCount ?: 0)) {
            viewPager.setCurrentItem(nextItem, true)
        }
    }
}