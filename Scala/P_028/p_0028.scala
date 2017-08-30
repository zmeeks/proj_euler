object p_0028 {
	def main(args: Array[String]) {
		var sum = 1
		var last = 1
		for(i <- 2 to 1000 by 2){
			for(j<- 1 to 4 by 1){
				last += i
				sum += last
			}
		}
		printf("the sum of the diagonals is: %d\n", sum)
	}
}