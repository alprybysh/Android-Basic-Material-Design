package com.fachrinfl.android_basic_material_design.screens

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.fachrinfl.android_basic_material_design.R

class KakaoCircularProgressDialogScreen : Screen<KakaoCircularProgressDialogScreen>() {

    val showDialogButton: KButton =
            KButton() {
                withId(R.id.btnDialogs_id)
                isDisplayed()
                isClickable()
            }

    val title: KTextView =
            KTextView() {
                withText("Circular Progress Dialog")
            }

    val message: KTextView =
            KTextView() {
                withText("Please wait...")
            }
}