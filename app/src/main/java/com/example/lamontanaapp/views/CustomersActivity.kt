package com.example.lamontanaapp.views

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lamontanaapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CustomersActivity : AppCompatActivity() {
    private lateinit var fabAddCustomers: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_customers)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        uiInit()
        initListeners()
    }

    private fun initListeners() {
        fabAddCustomers.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_customers)
        val btnAddTask: Button = dialog.findViewById(R.id.btnAddCustomers)
        btnAddTask.setOnClickListener { dialog.hide() }



        dialog.show()


    }

    private fun uiInit() {
        fabAddCustomers = findViewById(R.id.fabAddCustomers)
    }
}