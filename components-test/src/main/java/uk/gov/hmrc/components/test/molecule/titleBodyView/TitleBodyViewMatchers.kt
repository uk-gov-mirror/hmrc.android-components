/*
 * Copyright 2019 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.gov.hmrc.components.test.molecule.titleBodyView

import android.view.View
import android.widget.TextView
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description
import org.hamcrest.Matcher
import uk.gov.hmrc.components.R
import uk.gov.hmrc.components.molecule.titleBodyView.TitleBodyView

object TitleBodyViewMatchers {

    fun hasTitle(text: String): Matcher<View> {
        return object : BoundedMatcher<View, TitleBodyView>(TitleBodyView::class.java) {
            override fun describeTo(description: Description?) {
                description?.appendText("has title = $text")
            }

            override fun matchesSafely(item: TitleBodyView?): Boolean {
                return item?.findViewById<TextView>(R.id.title)?.text == text
            }
        }
    }

    fun hasBody(text: String): Matcher<View> {
        return object : BoundedMatcher<View, TitleBodyView>(TitleBodyView::class.java) {
            override fun describeTo(description: Description?) {
                description?.appendText("has body = $text")
            }

            override fun matchesSafely(item: TitleBodyView?): Boolean {
                return item?.findViewById<TextView>(R.id.body)?.text == text
            }
        }
    }
}
