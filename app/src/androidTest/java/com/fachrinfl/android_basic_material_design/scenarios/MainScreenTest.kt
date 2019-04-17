package com.fachrinfl.android_basic_material_design.scenarios

import android.support.design.internal.BottomNavigationMenu
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.support.v7.view.menu.MenuBuilder
import android.view.MenuItem
import com.fachrinfl.android_basic_material_design.MainActivity
import com.fachrinfl.android_basic_material_design.R
import com.fachrinfl.android_basic_material_design.screens.KakaoMainScreen
import org.hamcrest.Matchers.hasSize
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.regex.Matcher

@RunWith(AndroidJUnit4::class)
class MainScreenTest {

    @JvmField
    @Rule
    val testRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    private val kakaoMainScreen = KakaoMainScreen()



    @Test
    fun verifyBottomNavigationViewRecents(){
        kakaoMainScreen{
            bottomNavigation{
                isDisplayed()
                click()

            }
            textView{
                isDisplayed()
                hasText("Favorite")
            }
        }

    }


}

