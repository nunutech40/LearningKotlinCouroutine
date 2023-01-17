package com.example.learningkotlincouroutine

import org.junit.jupiter.api.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun test() {
        var threadName = Thread.currentThread().name
        println("cek threadname: $threadName")
    }
}