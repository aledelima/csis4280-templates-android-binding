package br.com.solanches.csis4280_binding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.solanches.csis4280_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set button click listeners
        binding.buttonChangeText.setOnClickListener {
            binding.textView.text = "Text Changed!"
        }

        binding.buttonResetText.setOnClickListener {
            binding.textView.text = "Hello, View Binding!"
        }
    }
}