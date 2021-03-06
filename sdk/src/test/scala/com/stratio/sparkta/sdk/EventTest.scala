/**
 * Copyright (C) 2015 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stratio.sparkta.sdk

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class EventTest extends WordSpec with Matchers {

  "Event" should {
    val event = new Event(Map("field" -> 1))

    "Return the associated string" in {

      val expected = "Event(Map(field -> 1),None)"

      val result = event.toString

      result should be(expected)
    }

    "It throw an exception when properties is null" in {
      an[IllegalArgumentException] should be thrownBy new Event(null)
    }
  }
}

