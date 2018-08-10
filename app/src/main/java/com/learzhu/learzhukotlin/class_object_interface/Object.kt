package com.learzhu.learzhukotlin.class_object_interface

import com.learzhu.learzhukotlin.base.Person

/**
 * Object.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-10 17:45
 * @update Learzhu 2018-08-10 17:45
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
object Payroll {
    val allEmployees = arrayListOf<Person>()
    fun calculateSalary() {
        for (person in allEmployees) {

        }
    }
}

//对象声明可以继承自类和接口
//object CaseInsensitiveFileComparator : Comparator<File> {
//    override fun compare(file1: File?, file2: File?): Int {
//        return file1?.getPath()?.compareTo(file2?.getPath(), ignoreCase = true)
//    }
//}

fun main(args: Array<String>) {
    Payroll.allEmployees.add(Person("Alice"))
    Payroll.calculateSalary()
}