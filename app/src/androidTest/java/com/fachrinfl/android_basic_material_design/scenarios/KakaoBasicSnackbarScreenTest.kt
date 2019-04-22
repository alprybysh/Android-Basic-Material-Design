package com.fachrinfl.android_basic_material_design.scenarios

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.agoda.kakao.screen.Screen.Companion.idle
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.fachrinfl.android_basic_material_design.BasicSnackbar
import com.fachrinfl.android_basic_material_design.screens.KakaoMainScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class KakaoBasicSnackbarScreenTest {


    @JvmField
    @Rule
    val testRule = ActivityTestRule<BasicSnackbar>(BasicSnackbar::class.java)


    @Test
    fun verifyBasicOneSnackBar() {
        onScreen<KakaoMainScreen> {
            oneBasicButton {
                isDisplayed()
                click()
            }
            snackBar.text.hasText("Basic one snackbar material design")
            idle(3000)
            snackBar.isGone()

        }
    }

    @Test
    fun verifyBasicTwoSnackBar() {
        onScreen<KakaoMainScreen> {
            twoBasicButton {
                isDisplayed()
                click()
            }
            snackBar.text.hasText("Basic two snackbar material design")
            idle(3000)
            snackBar.isGone()
        }
    }

}