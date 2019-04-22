package com.fachrinfl.android_basic_material_design.screens

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KSnackbar
import com.fachrinfl.android_basic_material_design.R

class KakaoSnackbarCoordinatorScreen : Screen<KakaoSnackbarCoordinatorScreen>() {

    val emailButton: KButton = KButton() { withId(R.id.btnEmail) }

    val snackBar: KSnackbar = KSnackbar()
}