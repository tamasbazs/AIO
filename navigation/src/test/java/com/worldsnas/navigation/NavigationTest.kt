package com.worldsnas.navigation

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class NavigationTest {

    @Test
    fun `navigation returns correct object`(){
        assertThat(Navigation.createController(Screens.Test))
            .isInstanceOf(TestController::class.java)
    }
}