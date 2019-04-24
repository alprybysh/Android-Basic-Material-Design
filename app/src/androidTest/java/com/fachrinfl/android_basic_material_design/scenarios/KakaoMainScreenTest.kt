package com.fachrinfl.android_basic_material_design.scenarios

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.fachrinfl.android_basic_material_design.MainActivity
import com.fachrinfl.android_basic_material_design.screens.KakaoMainScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class KakaoMainScreenTest {


    @JvmField
    @Rule
    val testRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun fillPasswodLogin(){

        onScreen<KakaoMainScreen>{
            username{
                hasEmptyText()
                typeText("admin")
                hasText("admin")

            }
            password{
                hasEmptyText()
                typeText("admin1!")
            }
        }
    }

    @Test
    fun verifyTextInputLayouitWithNoFocusOnTextChanges() {

        onScreen<KakaoMainScreen> {
            usernameLayout{
                isHintEnabled()
                isErrorDisabled()
                isCounterDisabled()
                hasHint("Username")
            }

            passwordLayout{
                isHintEnabled()
                isErrorDisabled()
                isCounterDisabled()
                hasHint("Password")
            }
        }
    }

    @Test
    fun verifyTextInputLayouitWithFocusOnTextChanges() {

        onScreen<KakaoMainScreen> {
            username.typeText("admin")
            username.clearText()
            usernameLayout{
                isErrorEnabled()
                hasError("Username tidak boleh kosong")
                isCounterDisabled()
            }
            password.typeText("admin")
            password.clearText()
            passwordLayout{
                isErrorEnabled()
                hasError("Password tidak boleh kosong")
                isCounterDisabled()
            }
        }
    }

    @Test
    fun cleanTextField(){
        onScreen<KakaoMainScreen>{
            username{
                typeText("admin")
                hasText("admin")
                clearText()
                hasEmptyText()
            }
        }
    }

    @Test
    fun replaceText(){

        onScreen<KakaoMainScreen> {
            username{
                typeText("admin")
                hasText("admin")
                replaceText("test-admin")
                hasText("test-admin")
            }
        }
    }
}