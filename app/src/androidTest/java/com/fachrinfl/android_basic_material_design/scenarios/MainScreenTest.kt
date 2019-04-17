package com.fachrinfl.android_basic_material_design.scenarios


import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.fachrinfl.android_basic_material_design.MainActivity
import com.fachrinfl.android_basic_material_design.screens.KakaoMainScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainScreenTest {


    @JvmField
    @Rule
    val testRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    private val kakaoMainScreen = KakaoMainScreen()


    @Test
    fun verifySeekBar(){
        kakaoMainScreen{

            textSeekBar{
                isDisplayed()
            }

            valueSeekBar{
                isDisplayed()
                hasText("0")
            }

            seekBar{
                isDisplayed()
                dragProgressTo(90)
            }

            valueSeekBar{
                isDisplayed()
                hasText("90")
            }
        }
    }

}