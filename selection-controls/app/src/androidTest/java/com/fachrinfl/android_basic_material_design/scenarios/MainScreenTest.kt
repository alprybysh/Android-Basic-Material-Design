package com.fachrinfl.android_basic_material_design.scenarios

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.fachrinfl.android_basic_material_design.MainActivity
import com.fachrinfl.android_basic_material_design.screens.KakaoMainScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainScreenTest {


    @JvmField
    @Rule
    val testRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    private val kakaoMainScreen = KakaoMainScreen()


    @Test
    fun verifyCheckBox() {
        kakaoMainScreen {
            checkbox {
                isDisplayed()
                hasText("Comedy")
                isNotChecked()
                click()
                isChecked()
                click()
                isNotChecked()
            }
        }
    }

    @Test
    fun verifySwitch() {
        kakaoMainScreen {
            switch {
                isDisplayed()
                hasText("Comment")
                isNotChecked()
                click()
                isChecked()
                click()
                isNotChecked()
            }
        }
    }

    @Test
    fun verifyManBatton() {
        kakaoMainScreen {
            manButton {
                isDisplayed()
                hasText("Man")
                isNotChecked()
                click()
                isChecked()
            }
        }
    }

    @Test
    fun verifyWomenBatton() {
        kakaoMainScreen {
            womanButton {
                isDisplayed()
                hasText("Women")
                isNotChecked()
                click()
                isChecked()
            }
        }
    }

    @Test
    fun fillFormWoman() {
        kakaoMainScreen {
            checkbox {
                isDisplayed()
                click()
                isChecked()
            }
            switch {
                isDisplayed()
                click()
                isChecked()
            }
            womanButton {
                isDisplayed()
                isNotChecked()
                click()
                isChecked()
            }
        }

    }

    @Test
    fun fillFormMan() {
        kakaoMainScreen {
            checkbox {
                isDisplayed()
                click()
                isChecked()
            }
            switch {
                isDisplayed()
                click()
                isChecked()
            }
            manButton {
                isDisplayed()
                isNotChecked()
                click()
                isChecked()
            }
        }
    }
}