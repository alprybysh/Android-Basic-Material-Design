package com.fachrinfl.android_basic_material_design.scenarios

import android.support.test.espresso.matcher.ViewMatchers.withText
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
    fun testContentItemsRecyclerView() {

        onScreen<KakaoMainScreen> {
            recycler {
                isVisible()
                hasSize(4)

                firstChild<KakaoMainScreen.Item> {
                    isVisible()
                    title { hasText("Fachri Naufal") }
                    email { hasText("fachrinaufal@example.com") }
                }


                lastChild<KakaoMainScreen.Item> {
                    isVisible()
                    title { hasText("Robert Alex") }
                    email { hasText("robertalex@example.com") }
                }

                childAt<KakaoMainScreen.Item>(2) {
                    isVisible()
                    title { hasText("Steven Hadson") }
                    email { hasText("stevenhadson@example.com") }
                }
                childWith<KakaoMainScreen.Item> { withDescendant { withText("Jhon Doe") } } perform {
                    title {
                        isDisplayed()
                        hasText("Jhon Doe")
                    }
                }
            }
        }
    }

    @Test
    fun verifyAllComponentesAreDisplayed() {

        onScreen<KakaoMainScreen> {
            recycler {
                children<KakaoMainScreen.Item> {
                    title {
                        isDisplayed()
                        hasAnyText()
                    }
                    email {
                        isDisplayed()
                        hasAnyText()
                    }
                    image {
                        isDisplayed()
                    }
                }
            }
        }
    }
}