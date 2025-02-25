package com.example.myapplication

//data class adalah class yang digunakan untuk menyimpan data dan berfungsi equals, hashcode, dan to string
// data class menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan

data class DataClass(
    val id: Int,
    var email: String
)

fun main(){
    val data = DataClass(1, "safira@gmail.com")
    println(data)

    //fungsi equals
    val data2 = DataClass(1, "rara@gmail.com")
    println(data == data2)//false

    //fungsi copy
    val data3 =  data.copy()
    println(data3)

    //fungsi copy dengan perubahan
    val data4 = data.copy(email = "safirara@gmail.com")
    println(data4)


}