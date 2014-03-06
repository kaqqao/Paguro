// Copyright 2014-03-05 PlanBase Inc. & Glen Peterson
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.organicdesign.fp

import java.util.function.Function

// Note: Function1 is Scala's functional interface,
// Function (without the 1) is Java 8's.
case class JavaFunction1[U,V](f:Function1[U,V]) extends Function[U,V] {
  override def apply(t: U): V = f(t)
  override def compose[T](before:Function[_ >: T, _ <: U]):
    Function[T, V] = ???
  override def andThen[W](after:Function[_ >: V, _ <: W]):
    Function[U, W] = ???
}

