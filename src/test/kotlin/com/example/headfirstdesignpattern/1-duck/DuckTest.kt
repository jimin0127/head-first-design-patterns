package com.example.headfirstdesignpattern.`1-duck`

import org.junit.jupiter.api.Test

class DuckTest {
    private val mallard = MallardDuck()

    @Test
    fun simulator() {
        mallard.performQuack()
        mallard.performFly()
    }
}
