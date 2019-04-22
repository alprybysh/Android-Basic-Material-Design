package com.fachrinfl.android_basic_material_design.scenarios

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.agoda.kakao.screen.Screen.Companion.idle
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.fachrinfl.android_basic_material_design.MainActivity
import com.fachrinfl.android_basic_material_design.screens.KakaoMainScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class KakaoMainScreenTest {

    @JvmField
    @Rule
    val testRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun verifyProgressBars() {
        onScreen<KakaoMainScreen> {

            circleBarText {
                isDisplayed()
            }
            linearBarText {
                isDisplayed()
            }
            circleProgressBar.isDisplayed()
            linearProgressBar {
                isDisplayed()
                hasProgress(0)
            }
            idle(7_000)
            circleProgressBar.isGone()
            idle(50_000)
            linearProgressBar.hasProgress(100)
        }
    }
}