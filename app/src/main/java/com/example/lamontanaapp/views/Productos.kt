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

class Productos : AppCompatActivity() {
    private lateinit var fabAddProducts : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productos)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        uiInit()
        initListeners()
    }

    private fun initListeners() {
        fabAddProducts.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_product)
        val btnAddTask: Button = dialog.findViewById(R.id.btnAddProduct)
        btnAddTask.setOnClickListener { dialog.hide() }



        dialog.show()



    }

    private fun uiInit() {
        fabAddProducts=findViewById(R.id.fabAddProducts)
    }
}