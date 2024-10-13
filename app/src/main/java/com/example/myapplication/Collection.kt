package com.example.myapplication

fun ContohList() {
    println ("== List ==")
    //List read only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("circle", "square", "triangle")
    println(shape)

    //menambahkan data ke dalam list mutable
    shape.add("circle")
    println(shape)

    //menghapus data dari List Mutable
    shape.remove("Triangle")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)
    println(shape)

    //mengubah data di dalam list mutable
    shape[0] = "oval"
    println(shape)

    //list read only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

fun main(){
    ContohList()
}