package com.fachrinfl.android_basic_material_design.screens

import com.agoda.kakao.check.KCheckBox
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.fachrinfl.android_basic_material_design.R


class KakaoConfirmationDialogScreen : Screen<KakaoConfirmationDialogScreen>() {

    val showDialogButton: KButton =
            KButton() {
                withId(R.id.btnDialogs_id)
                isDisplayed()
                isClickable()
            }

    val comedyButton: KCheckBox =
            KCheckBox() {
                withText("Comedy")
                isDisplayed()
            }

    val dramaButton: KCheckBox =
            KCheckBox() {
                withText("Drama")
                isDisplayed()
            }

    val hororButton: KCheckBox =
            KCheckBox() {
                withText("Horor")
                isDisplayed()
            }

    val romanceButton: KCheckBox =
            KCheckBox() {
                withText("Romance")
                isDisplayed()
            }

    val okButton: KButton =
            KButton() {
                withText("OK")
                isDisplayed()
                isClickable()
            }

    val cancelButton: KButton =
            KButton() {
                withText("CANCEL")
                isDisplayed()
                isClickable()
            }
}