package com.example.lamontanaapp.views

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lamontanaapp.R

class Home : AppCompatActivity() {
    private lateinit var viewProdctos: CardView
    private lateinit var viewPedidos: CardView
    private lateinit var viewCustomers: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        uiInit()
        initListeners()

    }

    private fun uiInit() {
        viewProdctos = findViewById(R.id.viewProdctos)
        viewPedidos = findViewById(R.id.viewPedidos)
        viewCustomers = findViewById(R.id.viewCustomers)
    }

    private fun initListeners() {
        viewProdctos.setOnClickListener {
            navigateToProducts()
        }

        viewPedidos.setOnClickListener { navigateToOrders() }
        viewCustomers.setOnClickListener { navigateToCustomers() }

    }

    private fun navigateToProducts() {
        val intent = Intent(this, Productos::class.java)
        startActivity(intent)
    }

    private fun navigateToOrders() {
        val intent = Intent(this, OrdersActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToCustomers() {
        val intent = Intent(this, CustomersActivity::class.java)
        startActivity(intent)
    }


}