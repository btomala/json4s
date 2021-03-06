package org.json4s

/** Stub implementation of the trait scala.collection.immutable.Map
 *  Only (and always) contains `content` -> ()
 */
class MapImplementation extends Map[List[String], Unit] {
  def get(key: List[String]): Option[Unit] = key match {
    case MapImplementation.content => Some(())
    case _ => None
  }
  def iterator: Iterator[(List[String], Unit)] = Iterator[(List[String], Unit)]((MapImplementation.content, ()))
  override def empty: MapImplementation = new MapImplementation
  def +[V1 >: Unit](kv: (List[String], V1)): MapImplementation = empty
  def -(key: List[String]): MapImplementation = empty
}

object MapImplementation {
  val content = List("foo", "bar")
}
