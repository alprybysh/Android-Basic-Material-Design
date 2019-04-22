package com.fachrinfl.android_basic_material_design.screens

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KSnackbar
import com.fachrinfl.android_basic_material_design.R

class KakaoMainScreen : Screen<KakaoMainScreen> (){

    val oneBasicButton: KButton = KButton() {withId(R.id.basicOne)}

    val twoBasicButton: KButton = KButton() {withId(R.id.basicTwo)}

    val snackBar: KSnackbar = KSnackbar()

}