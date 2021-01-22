package com.example.bibliotheque

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase


class AjouterLivre : AppCompatActivity() {

    lateinit var Creer: Button
    lateinit var annuler: Button
    lateinit var Titre: EditText
    lateinit var Auteur: EditText
    lateinit var NbPage: EditText
    lateinit var NumeroHall: EditText
    lateinit var Livre: Livre

    val database = FirebaseDatabase.getInstance()
    val myRef = database.getReference("Livre")

    val OnCreerClickListener: View.OnClickListener = View.OnClickListener{ view ->
        if (Titre.text != ""  && Auteur.text != null && String.NbPage.text. != "0" && )
    }

    val OnAnnulClicListener: View.OnClickListener = View.OnClickListener { view ->
        val monIntent: Intent = Intent(this,MainActivity::class.java)
        startActivity(monIntent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.creer_livre)
        init()
        Creer.setOnClickListener(OnCreerClickListener)
        annuler.setOnClickListener(OnAnnulClicListener)
    }

    fun init(){
        Creer = findViewById(R.id.button3)
        annuler = findViewById(R.id.button4)
        Titre = findViewById(R.id.editTextTextPersonName)
        Auteur = findViewById(R.id.editTextTextPersonName2)
        NbPage = findViewById(R.id.editTextTextPersonName3)
        NumeroHall = findViewById(R.id.editTextTextPersonName4)
    }
}
