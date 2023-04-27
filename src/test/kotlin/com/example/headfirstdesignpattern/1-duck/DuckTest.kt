package com.example.headfirstdesignpattern.`1-duck`

import org.junit.jupiter.api.Test

class DuckTest {
    private val mallard = MallardDuck()

    @Test
    fun simulator() {
        mallard.performQuack()
        mallard.performFly()
    }

    @Test
    fun `동적으로 실행하기`() {
        // 실행 중에 오리의 행동을 바꾸고 싶으면 원하는 행동에 해당하는 Duck의 세터 메소드 호출
        val model = ModelDuck()
        model.performFly()
        model.setFlyBehavior(FlyRocketPowered())
        model.performFly()
    }
}
