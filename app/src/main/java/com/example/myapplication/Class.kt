package com.example.myapplication

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")

    //menampilkan value email
    println(contact.email)
}