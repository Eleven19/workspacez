package io.eleven19.workspacez.path

import zio.test._

object PosixPathStrSpec extends ZIOSpecDefault {
  def spec = suite("PosixPathStrSpec")(
    suite("""Using "/"""")(
      test("Combining a rooted path should work"){
        val actual = PosixPathStr.root / "foo" / "bar"
        assertTrue(actual.toString == "/foo/bar")
      }
    )
  )
}
