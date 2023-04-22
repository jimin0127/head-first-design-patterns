package com.example.headfirstdesignpattern.`1-duck`

interface FlyBehavior {
    fun fly()
}

class FlyWithWings: FlyBehavior {
    override fun fly() {
        println("날고 있어요!")
    }
}

class FlyNoWay: FlyBehavior {
    override fun fly() {
        println("저는 못 날아요")
    }
}
