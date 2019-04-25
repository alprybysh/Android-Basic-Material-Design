package com.fachrinfl.android_basic_material_design.scenarios

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.fachrinfl.android_basic_material_design.DialogConfirmation
import com.fachrinfl.android_basic_material_design.screens.KakaoConfirmationDialogScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class KakaoConfirmationDialogScreenTest {

    @JvmField
    @Rule
    val testRule = ActivityTestRule<DialogConfirmation>(DialogConfirmation::class.java)

    @Test
    fun verifyPopUpDialog() {

        onScreen<KakaoConfirmationDialogScreen> {
            showDialogButton {
                isDisplayed()
                isClickable()
                hasText("Show Dialogs")
                click()
            }
            comedyButton {
                isDisplayed()
                click()
            }

            okButton {
                isDisplayed()
                isClickable()
            }

            cancelButton {
                isDisplayed()
                isClickable()
                click()
            }
        }
    }

    @Test
    fun verifyAllCategoriesPresents() {
        onScreen<KakaoConfirmationDialogScreen> {
            showDialogButton {
                isDisplayed()
                isClickable()
                hasText("Show Dialogs")
                click()
            }
            comedyButton {
                isNotChecked()
            }
            dramaButton {
                isNotChecked()
            }
            romanceButton {
                isNotChecked()
            }
            hororButton {
                isNotChecked()
            }

        }

    }

    @Test
    fun verifyOnlyOneItemSelected() {

        onScreen<KakaoConfirmationDialogScreen> {
            showDialogButton {
                hasText("Show Dialogs")
                click()
            }

            comedyButton {
                isNotChecked()
                click()
                isChecked()
            }
            hororButton {
                isNotChecked()
                click()
                isChecked()
            }
            comedyButton {
                isNotChecked()
            }
        }

    }

}