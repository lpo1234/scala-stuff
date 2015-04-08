object Ex1 {
	def signum(x: Int): Int = if(x < 0) -x / x else if(x > 0) x / x else 0
	def main(args: Array[String]): Unit = println(signum(args(0).toInt))
}