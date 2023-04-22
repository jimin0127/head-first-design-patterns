package com.example.headfirstdesignpattern.`1-duck`

interface QuackBehavior {
    fun quack()
}

class Quack: QuackBehavior {
    override fun quack() {
        println("꽥")
    }
}

class MuteQuack: QuackBehavior {
    override fun quack() {
        println("<< 조용 >>")
    }
}

class Squeack: QuackBehavior {
    override fun quack() {
        println("삑")
    }
}
