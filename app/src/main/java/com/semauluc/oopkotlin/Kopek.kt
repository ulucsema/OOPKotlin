package com.semauluc.oopkotlin

class Kopek : Hayvan()  {
    fun kopekFonksiyonu(){
        super.sesCikar()
    }
    override fun sesCikar (){
     println("Köpek Sınıfı")
    }
}