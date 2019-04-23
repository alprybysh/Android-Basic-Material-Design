package com.fachrinfl.android_basic_material_design.scenarios

import android.support.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen.Companion.idle
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.fachrinfl.android_basic_material_design.LinearProgressDialog
import com.fachrinfl.android_basic_material_design.screens.KakaoLinearProgressScreen
import org.junit.Rule
import org.junit.Test

class KakaoLinearProgressDialogScreenTest {

    @JvmField
    @Rule
    val testRule = ActivityTestRule<LinearProgressDialog>(LinearProgressDialog::class.java)

    @Test
    fun verifyPopUpDialog() {
        onScreen<KakaoLinearProgressScreen> {
            showDialogButton {
                hasText("Show Dialogs")
                click()
            }
            title {
                isDisplayed()
                isNotClickable()
            }
            message { isDisplayed() }
            idle(18_000)
            showDialogButton {
                hasText("Show Dialogs")
            }
        }
    }
}