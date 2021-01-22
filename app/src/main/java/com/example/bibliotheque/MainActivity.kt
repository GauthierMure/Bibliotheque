package com.example.bibliotheque

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var Ajouter: Button
    lateinit var Supprimer: Button
    lateinit var liste: RecyclerView
    lateinit var layout: LinearLayoutManager

    val OnCreerClicListener: View.OnClickListener = View.OnClickListener { view->
        val monIntent: Intent = Intent(this,AjouterLivre::class.java)
        startActivity(monIntent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        Ajouter.setOnClickListener(OnCreerClicListener)
        liste.layoutManager = layout
    }

    fun init(){
        Ajouter = findViewById(R.id.button)
        Supprimer = findViewById(R.id.button2)
        liste = findViewById(R.id.recyclerview)
        layout = LinearLayoutManager(this)
    }


}