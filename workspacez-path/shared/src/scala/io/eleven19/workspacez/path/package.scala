package io.eleven19.workspacez
import zio.prelude._

package object path {
  type PosixPathStr = PosixPathStr.Type
  object PosixPathStr extends Newtype[String] {
    val root:PosixPathStr = wrap("/")

    final implicit class Ops(private val self: PosixPathStr) extends AnyVal {
      def /(other: String): PosixPathStr =
        if(self == root) wrap(s"$self$other")
        else wrap(s"$self/$other")
    }
  }
}
