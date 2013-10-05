package OwenDiff
package test

import org.junit.runner.RunWith
import org.scalatest.FeatureSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class OwenDiffFeatureSpec
    extends FeatureSpec {

  import scala.io.Source.fromInputStream

  feature("OwenDiff should not throw Exceptions"){
    scenario("Should not throw IndexOutOfBoundsException") {
      val file1 = fromInputStream(getClass.getResourceAsStream("/ioobe/before.dsl")).getLines.toList
      val file2 = fromInputStream(getClass.getResourceAsStream("/ioobe/after.dsl")).getLines.toList

      Diff.diff(file1, file2)

      pending
    }

    scenario("Should not throw StackOverflowError") {
      val file1 = fromInputStream(getClass.getResourceAsStream("/soe/before.dsl")).getLines.toList
      val file2 = fromInputStream(getClass.getResourceAsStream("/soe/after.dsl")).getLines.toList

      Diff.diff(file1, file2)

      pending
    }
  }
}
