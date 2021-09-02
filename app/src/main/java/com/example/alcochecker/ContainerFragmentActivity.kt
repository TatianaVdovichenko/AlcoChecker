package com.example.alcochecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.alcochecker.databinding.ActivityFragmentContainerBinding

class ContainerFragmentActivity : AppCompatActivity() {

    lateinit var binding:ActivityFragmentContainerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentContainerBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}