package com.fachrinfl.android_basic_material_design.screens

import com.agoda.kakao.KRatingBar
import com.agoda.kakao.KSeekBar
import com.agoda.kakao.KTextView
import com.agoda.kakao.Screen
import com.fachrinfl.android_basic_material_design.R
import org.hamcrest.CoreMatchers.containsString

class KakaoMainScreen : Screen<KakaoMainScreen> () {

    val seekBar: KSeekBar =
            KSeekBar { withId(R.id.seekBar_id) }

    val valueSeekBar: KTextView =
            KTextView{ withId(R.id.valueSeekbar_id)}

    val textSeekBar: KTextView =
            KTextView {withText(containsString("Seekbar"))}

    val rangeBar: KRatingBar =
            KRatingBar { withId(R.id.rangeBar_id) }

}