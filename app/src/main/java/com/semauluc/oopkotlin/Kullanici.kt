package com.semauluc.oopkotlin

class Kullanici : Insan {
    var isim: String? =null
    var yas: Int? = null
    constructor(isim: String, yas: Int){

        this.isim = isim
        this.yas = yas
        println("constructor çağrıldı")

    }
    init {
        //İlk çağrılan kod
        println("init çağrıldı")
    }
}