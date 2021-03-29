object Main {
  def foo = Map(1 -> 2).filterKeys(_ % 2 == 0)
  def bar: Int
}
