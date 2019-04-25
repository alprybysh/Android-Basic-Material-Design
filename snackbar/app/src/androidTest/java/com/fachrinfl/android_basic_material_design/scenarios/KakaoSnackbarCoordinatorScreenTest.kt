package com.fachrinfl.android_basic_material_design.scenarios

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.fachrinfl.android_basic_material_design.SnackbarWithCoordinatorLayout
import com.fachrinfl.android_basic_material_design.screens.KakaoSnackbarCoordinatorScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class KakaoSnackbarCoordinatorScreenTest {

    @JvmField
    @Rule
    val testRule = ActivityTestRule<SnackbarWithCoordinatorLayout>(SnackbarWithCoordinatorLayout::class.java)

    @Test
    fun verifySNackbarWithCoorinator() {

        onScreen<KakaoSnackbarCoordinatorScreen> {
            emailButton {
                isDisplayed()
                click()
            }
            snackBar.action.hasText("OK")
            snackBar.text.hasText("Message sent.")
        }
    }
}