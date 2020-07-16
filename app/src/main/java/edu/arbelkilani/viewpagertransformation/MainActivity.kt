package edu.arbelkilani.viewpagertransformation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import edu.arbelkilani.viewpagertransformation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.viewpager.apply {
            adapter = PhotosAdapter(listOfPhotos())
            offscreenPageLimit = 4
            setPageTransformer(SliderTransformer(4))
        }
    }
}