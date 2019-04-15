package com.fachrinfl.android_basic_material_design.screens

import com.agoda.kakao.KCheckBox
import com.agoda.kakao.Screen
import com.fachrinfl.android_basic_material_design.R

class KakaoMainScreen : Screen<KakaoMainScreen>() {

    val switch: KCheckBox =
            KCheckBox { withId(R.id.switch_id) }

    val checkbox: KCheckBox =
            KCheckBox { withId(R.id.checkbox_id) }

    val manButton: KCheckBox =
            KCheckBox { withId(R.id.man_id) }

    val womanButton: KCheckBox =
            KCheckBox {withId(R.id.women_id) }

}