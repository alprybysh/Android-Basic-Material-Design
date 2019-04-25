package com.fachrinfl.android_basic_material_design.scenarios


import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.agoda.kakao.screen.Screen.Companion.idle
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.fachrinfl.android_basic_material_design.DialogBasic
import com.fachrinfl.android_basic_material_design.screens.KakaoBasicDialogScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class KakaoBasicDialogScreenTest {

    @JvmField
    @Rule
    val testRule = ActivityTestRule<DialogBasic>(DialogBasic::class.java)

    @Test
    fun verifyPopUpDialog() {
        onScreen<KakaoBasicDialogScreen> {
            showDialogButton {
                hasText("Show Dialogs")
                click()
            }
            idle(1000)
            cancelButton {
                click()
            }

            showDialogButton {
                hasText("Show Dialogs")
                click()
            }

            discardButton {
                click()
            }
            showDialogButton {}
        }
    }
}