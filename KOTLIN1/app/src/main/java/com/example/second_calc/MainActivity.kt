package com.example.second_calc
import com.example.second_calc.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.add1.setOnClickListener{
            try {
                val a= binding.inp1.text.toString().toInt()
                val b= binding.inp2.text.toString().toInt()
                binding.result.text=(a+b).toString()
            }
            catch (e : Exception){

            binding.result.text="$e"
            }

        }
        binding.minus1.setOnClickListener {
            try {
                val a= binding.inp1.text.toString().toInt()
                val b= binding.inp2.text.toString().toInt()
                binding.result.text=(a-b).toString()
            }
            catch (e : Exception){

                binding.result.text="$e"
            }
        }
        binding.multi1.setOnClickListener {
            try {
                val a= binding.inp1.text.toString().toInt()
                val b= binding.inp2.text.toString().toInt()
                binding.result.text=(a*b).toString()
            }
            catch (e : Exception){

                binding.result.text="$e"
            }
        }
        binding.div1.setOnClickListener {
            try {
                val a= binding.inp1.text.toString().toInt()
                val b= binding.inp2.text.toString().toInt()
                binding.result.text=(a/b).toString()
            }
            catch (e : Exception){

                binding.result.text="$e"
            }
        }

    }

}