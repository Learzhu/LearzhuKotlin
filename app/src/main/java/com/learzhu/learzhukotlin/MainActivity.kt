package com.learzhu.learzhukotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.learzhu.learzhukotlin.`fun`.FunTest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val funTest = FunTest()
        println("^^^^^^^^^")
        println(funTest.map.get(1))
        println(funTest.list.last())
        println(funTest.list.max())
        val list = listOf<Int>(1, 2, 3)
        println(funTest.joinToString(list, "; ", "(", ")"))
        println(funTest.joinToString(collection = list, separator = "; ", prefix = "(", postfix = ")"))
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
        }
    }

}
