package com.fachrinfl.android_basic_material_design.screens


import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.fachrinfl.android_basic_material_design.R

class KakaoBasicDialogScreen : Screen<KakaoBasicDialogScreen>() {

    val showDialogButton: KButton =
            KButton() {
                withId(R.id.btnDialogs_id)
                isDisplayed()
                isClickable()
            }

    val cancelButton: KButton =
            KButton() {
                withText("CANCEL")
                isDisplayed()
                isClickable()
            }

    val discardButton: KButton =
            KButton() {
                withText("DISCARD")
                isDisplayed()
                isClickable()
            }
}