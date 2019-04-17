package com.fachrinfl.android_basic_material_design.screens

import com.agoda.kakao.KBottomNavigationView
import com.agoda.kakao.KTextView
import com.agoda.kakao.Screen
import com.fachrinfl.android_basic_material_design.R

class KakaoMainScreen : Screen<KakaoMainScreen>() {


    val bottomNavigation: KBottomNavigationView =
            KBottomNavigationView  { withId(R.id.bottomNavigation_id) }

    val textView: KTextView =
            KTextView{ withId((R.id.textView_id))}

}