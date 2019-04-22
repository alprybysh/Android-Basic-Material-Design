package com.fachrinfl.android_basic_material_design.screens


import com.agoda.kakao.progress.KProgressBar
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KTextView
import com.fachrinfl.android_basic_material_design.R


class KakaoMainScreen : Screen<KakaoMainScreen>() {

    val circleBarText: KTextView = KTextView() { withText("Progress Bar Circle") }

    val linearBarText: KTextView = KTextView() { withText("Progress Bar Linear") }

    val circleProgressBar: KProgressBar = KProgressBar() { withId(R.id.progressBar_circle) }

    val linearProgressBar: KProgressBar = KProgressBar() { withId(R.id.progressBar_linear) }
}