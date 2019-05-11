package com.felipejose.gridviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val grid = findViewById<GridView>(R.id.grid) as GridView

        val programacao = arrayOf("Kotlin", "Java", "JavaScript", "Python", "PHP", "CSS", "Swift", "Angular", "Flutter", "C++", "C#(sharp)", "C")

        val adp : ArrayAdapter<String> = ArrayAdapter(this@MainActivity,android.R.layout.simple_list_item_1, programacao)

        grid.adapter = adp

        grid.setOnItemClickListener({ parent, view, postition, id ->
            Toast.makeText(this@MainActivity,"Item clicado:-$id",Toast.LENGTH_SHORT).show()
        })
    }
}
