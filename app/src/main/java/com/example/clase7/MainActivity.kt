package com.example.clase7

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.clase7.dao.DataBaseBuilder
import com.example.clase7.databinding.ActivityMainBinding
import com.example.clase7.entities.Citys
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate (savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        funMain()
    }

    private fun funMain() = runBlocking{

        val context = this@MainActivity
        val db = DataBaseBuilder.getInstance(context)

        val city1 = Citys(0, "Masaya", "Ciudad de las Flores", 50000)
        val city2 = Citys(0, "Managua", "Capital de Nicaragua", 150000)
        val city3 = Citys(0, "Granada", "La gran Sultana", 60000)
        val city4 = Citys(0, "Leon", "Ciudad Universitaria", 120000)

        var listCities : List<Citys> = listOf(city1, city2, city3, city4)

        val citydao = db.cityDao()

        listCities.forEach{
            citys -> citydao.insert(citys)
        }

    }

        }

