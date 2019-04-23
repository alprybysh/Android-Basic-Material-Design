package com.fachrinfl.android_basic_material_design.scenarios

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.agoda.kakao.screen.Screen.Companion.onScreen

import com.fachrinfl.android_basic_material_design.MainActivity
import com.fachrinfl.android_basic_material_design.screens.KakaoBasicDialogScreen
import com.fachrinfl.android_basic_material_design.screens.KakaoLinearProgressScreen
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
    fun verifyBasicDialogButton() {

        onScreen<KakaoMainScreen> {
            basicDialogButton {
                hasText("Basic Dialog")
                click()
            }
        }
        onScreen<KakaoBasicDialogScreen> {
            showDialogButton {}
            pressBack()
        }
        onScreen<KakaoMainScreen> {
            basicDialogButton {
                hasText("Basic Dialog")
            }
        }
    }

    @Test
    fun verifyDialogConfirmationButton() {

        onScreen<KakaoMainScreen> {
            dialogConfirmationButton {
                hasText("Dialog Confirmation")
                click()
            }
        }
        onScreen<KakaoBasicDialogScreen> {
            showDialogButton {}
            pressBack()
        }
        onScreen<KakaoMainScreen> {
            dialogConfirmationButton {
                hasText("Dialog Confirmation")
            }
        }

    }

    @Test
    fun verifyLinearProgressDialog() {
        onScreen<KakaoMainScreen> {
            dialogLinearProgressButton {
                hasText("Linear Progress Dialog")
                click()
            }
        }
        onScreen<KakaoLinearProgressScreen> {
            showDialogButton {}

            pressBack()
        }
        onScreen<KakaoMainScreen> {
            dialogLinearProgressButton {
                hasText("Linear Progress Dialog")
            }
        }
    }

    @Test
    fun verifyCircularProgressDialog() {
        onScreen<KakaoMainScreen> {
            dialogCircularProgressButton {
                hasText("Circular Progress Dialog")
                click()
            }
        }
        onScreen<KakaoLinearProgressScreen> {
            showDialogButton {}
            pressBack()
        }
        onScreen<KakaoMainScreen> {
            dialogCircularProgressButton {
                hasText("Circular Progress Dialog")
            }
        }
    }
}
