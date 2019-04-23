package com.fachrinfl.android_basic_material_design.screens


import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.fachrinfl.android_basic_material_design.R

class KakaoMainScreen : Screen<KakaoMainScreen>() {

    val basicDialogButton: KButton =
            KButton() {
                withId(R.id.mdDialogBasic)
                isDisplayed()
                isClickable()
            }

    val dialogConfirmationButton: KButton =
            KButton() {
                withId(R.id.mdDialogConfirmation)
                isDisplayed()
                isClickable()
            }

    val dialogCircularProgressButton: KButton =
            KButton() {
                withId(R.id.mdDialogProgressCircular)
                isDisplayed()
                isClickable()
            }

    val dialogLinearProgressButton: KButton =
            KButton() {
                withId(R.id.mdDialogProgressLinear)
                isDisplayed()
                isClickable()
            }
}