package com.semauluc.oopkotlin

open class Sanatci(isim :String, yas: Int, meslek:String) {

    //Encapsulation
//Open yazdık ki OzelSanatci dan miras alabilelim

    var isim : String? = null
        private set //ama bu kodla değiştirmene izin vermez
        get //bu kod kullanmana izin verir

    var yas : Int? = null
        private set
        get

    private var meslek : String? = meslek
}