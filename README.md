# Android-Basic-Material-Design with simple Kakao tests

Each folder represents one of the Andoid Design material such as text-field, bottom-navigation, dialog and so on.
In the most of the folders you can find test examples how to use Kakao library to cretae  Android espresso tests
with Page Object Model.

Here is the github link to [Kakao library](https://github.com/agoda-com/Kakao)

Benefits of using Kakao:
* Readability
* Reusability
* Extensible DSL


## How to use it
### Create Screen
Create your entity Screen where you will add the views involved in the interactions of the tests:

`class FormScreen : Screen<FormScreen>()`

Screen can represent the whole user interface or a portion of UI. If you are using Page Object pattern you can put the interactions of Kakao inside the Page Objects.

## Create KViews
Screen contains KViews, these are the Android Framework views where you want to do the interactions:
~~~
class FormScreen : Screen<FormScreen>() {
    val phone = KView { withId(R.id.phone) }
    val email = KEditText { withId(R.id.email) }
    val submit = KButton { withId(R.id.submit) }
}
~~~
Kakao provides different types depending on the type of view:

* KView
* KEditText
* KTextView
* KButton
* KImageView
* KWebView
* KCheckbox
* KViewPager
* KSeekBar
* and more

Every KView contains matchers to retrieve the view involved in the ViewInteraction. Some examples of matchers provided by Kakao:

* withId
* withText
* withContentDescription
* withDrawable
* withBackgroundColor
* and more

Like in Espresso you can combine different matchers:
~~~
val email = KEditText { 
    withId(R.id.email)
    withText(R.string.email)
}
~~~
And you can use your custom matchers:
~~~
val email = KEditText { 
    withId(R.id.email)
    matches { MyCustomMatcher.matches(position) }
}
~~~
Write the interaction.
The syntax of the test with Kakao is very easy, once you have the Screen and the KViews defined, you only have to apply the actions or assertions like in Espresso:
~~~
onScreen<FormScreen> {
    phone {
       hasText("971201771")
    }
    button {
       click()
    }
}
~~~
Kakao provides multiple actions/assertions based on Espresso. Furthermore, you can combine them, just like the matchers. You can use your custom assertions or your custom actions too:
~~~
onScreen<FormScreen> {
    phone {
       assert { MyCustomAssertion.isThaiNumber() }
    }
    button {
       act { MyCustomAction.clickOnTheCorner() }
    }
}
~~~
### Advanced

**ListViews/RecyclersViews**

Kakao offers an easy way to interact with your RecyclerViews and ListViews

Create the `KListView/KRecyclerView`

Inside your Screen create the KView matching with your view:

For KListView:

`val list = KListView ({
           builder = { withId(R.id.list) } })`
           
For `KRecyclerView:`
~~~
val myList = KRecyclerView ({
             builder = { withId(R.id.recycler_view) } })
~~~
You can combine different matchers to retrieve your view.

Create `KAdapterItem/KRecyclerItem`

Every adapter contains different Items, Kakao provides an easy way to define the different items of your adapter with KAdapterItem and KRecyclerItem. If your adapter contains multiple Items but your interactions in your tests only work with one is not required to create all of them.

`KAdapterItem`
~~~
class Item(i: DataInteraction) : KAdapterItem<Item>(i) {
    val title = KTextView(i) { withId(R.id.title) }
    val subtitle = KTextView(i) { withId(R.id.subtitle) }
    val button = KButton(i) { withId(R.id.button) }
}
~~~
`KRecyclerItem`

~~~
class Item(parent: Matcher<View>) : KRecyclerItem<Item>(parent) {
    val title: KTextView = KTextView(parent) { withId(R.id.title) }
    val subtitle: KTextView = KTextView(parent) { withId(R.id.subtitle) }
}
~~~

The `KView` defined in the Item corresponds views used on the Item. You can assign the KItems to the KListView/ KRecyclerView like:
~~~
val recycler: KRecyclerView = KRecyclerView({
    withId(R.id.recycler_view)
}, itemTypeBuilder = {
    itemType(::Item)
})
~~~

And finally your final interaction will be:
~~~
onScreen<RecyclerScreen> {
    recycler {
        firstChild<TestRecyclerScreen.Item> {
            isVisible()
            title { hasText("Title 1") }
        }
    }
}
~~~

Kakao provides different accessors in the adapter:
* childAt
* firstChild
* lastChild
* childWith


## Setup
Maven
~~~
<dependency>
  <groupId>com.agoda.kakao</groupId>
  <artifactId>kakao</artifactId>
  <version>2.0.0</version>
  <type>pom</type>
</dependency>
~~~

or Gradle:
~~~
repositories {
    jcenter()
}
dependencies {
    // For Gradle Version below 3.0.0
    androidTestCompile 'com.agoda.kakao:kakao:2.0.0'`

    // For Gradle Version 3.0.0 or above
    androidTestImplementation 'com.agoda.kakao:kakao:2.0.0'
}
~~~