package com.fachrinfl.android_basic_material_design.screens

import android.view.View
import com.agoda.kakao.image.KImageView
import com.agoda.kakao.recycler.KRecyclerItem
import com.agoda.kakao.recycler.KRecyclerView
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KTextView
import com.fachrinfl.android_basic_material_design.R
import org.hamcrest.Matcher

class KakaoMainScreen : Screen<KakaoMainScreen>() {

    val recycler: KRecyclerView = KRecyclerView({
        withId(R.id.recyclerView_id)
    }, itemTypeBuilder = {
        itemType(::Item)
    })

    class Item(parent: Matcher<View>) : KRecyclerItem<Item>(parent) {
        val title: KTextView = KTextView(parent) { withId(R.id.name_id) }
        val email: KTextView = KTextView(parent) { withId(R.id.email_id) }
        val image: KImageView = KImageView(parent) { withId(R.id.imageView_id) }


    }
}