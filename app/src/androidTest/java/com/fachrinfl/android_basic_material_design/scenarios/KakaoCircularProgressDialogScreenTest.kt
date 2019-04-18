package com.fachrinfl.android_basic_material_design.scenarios

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.agoda.kakao.screen.Screen
import com.fachrinfl.android_basic_material_design.CircularProgressDialogs
import com.fachrinfl.android_basic_material_design.screens.KakaoCircularProgressDialogScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class KakaoCircularProgressDialogScreenTest {

    @JvmField
    @Rule
    val testRule = ActivityTestRule<CircularProgressDialogs>(CircularProgressDialogs::class.java)

    @Test
    fun verifyPopUpDialog() {
        Screen.onScreen<KakaoCircularProgressDialogScreen> {
            showDialogButton {

                hasText("Show Dialogs")
                click()
            }
            title {
                isDisplayed()
                isNotClickable()
            }
            message { isDisplayed() }
            pressBack()
            showDialogButton {
                hasText("Show Dialogs")
            }
        }
    }
}