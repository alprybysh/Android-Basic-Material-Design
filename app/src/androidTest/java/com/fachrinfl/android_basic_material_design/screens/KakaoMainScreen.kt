package com.fachrinfl.android_basic_material_design.screens

import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.edit.KTextInputLayout
import com.agoda.kakao.screen.Screen
import com.fachrinfl.android_basic_material_design.R


class KakaoMainScreen : Screen<KakaoMainScreen>() {

    val username : KEditText = KEditText{withId(R.id.edtUsername)}

    val password : KEditText = KEditText{withId(R.id.edtPassword)}

    val usernameLayout : KTextInputLayout = KTextInputLayout{withId(R.id.tilUsername)}

    val passwordLayout : KTextInputLayout = KTextInputLayout{withId(R.id.tilPassword)}
}