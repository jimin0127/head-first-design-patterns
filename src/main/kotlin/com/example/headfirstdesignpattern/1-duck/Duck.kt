package com.example.headfirstdesignpattern.`1-duck`

abstract class Duck(
    private val flyBehavior: FlyBehavior,
    private val quackBehavior: QuackBehavior,
) {
    abstract fun display()

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun swim() {
        print("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠")
    }
}

class MallardDuck(): Duck(
    flyBehavior = FlyWithWings(),
    quackBehavior = Quack(),
) {
    override fun display() {
        print("저는 물오리입니다.")
    }
}

