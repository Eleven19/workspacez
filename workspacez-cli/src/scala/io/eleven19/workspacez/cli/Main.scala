package io.eleven19.workspacez.cli

import fansi._
import zio._
import zio.cli._
import zio.cli.HelpDoc.Span.text

object Main extends ZIOCliDefault {
  val cliApp = CliApp.make(
    name = "workspacez",
    version = "0.1.0",
    summary = text("Explore your workspaces"),
    command = commands.root
  ){
    case _ => Console.printLine("Hello World")
  }

  object commands {
    val root = Command("root")
  }
}
