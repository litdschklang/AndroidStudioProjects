package com.example.testapp002

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.GoToAddProduct).setOnClickListener{
            startActivity(Intent(this,AddProductActivity::class.java))
        }

        val preferences = getSharedPreferences("database", Context.MODE_PRIVATE)
        val savedName = preferences.getString("savedProductName","this value doesn't exist")
        //d("ying","saved message is: $savedName")

        findViewById<TextView>(R.id.LastSavedProduct).text = "last saved item: $savedName"
    }
}