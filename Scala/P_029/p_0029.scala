import scala.collection.mutable.HashMap
object p_0029 {
	def main(args: Array[String]) {
		val hmap : HashMap[BigInt, Int] = HashMap()
		for(a <- 2 to 100 by 1){
			for(b <- 2 to 100 by 1){
				hmap += ((BigInt(a) pow b) -> 1)
			}
		}
		printf("the number of unique entries is: %d \n", hmap.size)
	}
}