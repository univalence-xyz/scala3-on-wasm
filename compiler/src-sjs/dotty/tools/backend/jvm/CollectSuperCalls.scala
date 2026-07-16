package dotty.tools.backend.jvm

import dotty.tools.dotc.ast.tpd
import dotty.tools.dotc.core.Contexts.*
import dotty.tools.dotc.transform.MegaPhase.MiniPhase

/** Scala.js stub of the JVM-only `CollectSuperCalls` phase.
 *
 *  On the JVM, `CollectSuperCalls` records super calls to trait members into the
 *  `GenBCode` phase, which needs them to decide whether a redundant mixin class may
 *  be dropped. The Scala.js linker back-end has no such need and `GenBCode` is not
 *  part of the Scala.js compiler, so this stub is a no-op. It exists only so that
 *  shared code listing the phase compiles for Scala.js; it is never scheduled on the
 *  Scala.js pipeline (the JVM-only phase group is discarded there).
 */
class CollectSuperCalls extends MiniPhase {
  import tpd.*

  override def phaseName: String = CollectSuperCalls.name

  override def description: String = CollectSuperCalls.description
}

object CollectSuperCalls:
  val name: String = "collectSuperCalls"
  val description: String = "find classes that are called with super"
