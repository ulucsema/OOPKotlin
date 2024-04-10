package com.semauluc.oopkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        println("------SINIFLAR------")
        val kullanici = Kullanici("Sema", 15)
        val digerKullanici = Kullanici("Yüce",20)

        println("Encopsulation")
        val ahmet = Sanatci("Ahmet",50, "müzisyen")
        println(ahmet.isim)
        // ahmet.isim = "Ahmet2"
        println(ahmet.isim)

        println("Inheritance")
        val mehmet=  OzelSanatci("Mehmet", 32, "Tiyatrocu")
        mehmet.sarkıSoyle()

        println("Polymorphism")
        //Statik Polymorphism
           val islem = Islemler()
           println(islem.carpma())
           println(islem.carpma(23,2))
            println(islem.carpma(1,34,2))


        // Dİnamik Polymorphorism
        val momo = Hayvan()
        momo.sesCikar()

        val barley = Kopek()
        barley.sesCikar()
        barley.kopekFonksiyonu() //HAyvan sınıfı diycek çünkü super fonksiyonunu kullandık

        println("Abstraction & Interface") // Soyutluk //Arayüz

        kullanici.insanFonksiyonu()

        var gitar = Gitar()
        gitar.marka="A markası"
        gitar.elektro = true
        gitar.bilgi()
       println(gitar.oda)

        println("Lambda Expressions")

        yazdigimiYazdir("test")

        val yazdigimiYazdirLambda = {verilenString : String -> println(verilenString) }
        yazdigimiYazdirLambda("test Lambda")

        val carpmaIslemiLambda = {a:Int, b:Int -> a*b}
       println (carpmaIslemiLambda(6,7))

        val carpmaLambdaV2 : (Int, Int) -> Int = {a,b ->a*b}
        println(carpmaLambdaV2(6,7))

    }

    fun yazdigimiYazdir(string: String) {
        println(string)
    }

}