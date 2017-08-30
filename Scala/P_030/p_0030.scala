
object p_0030 {
	def main(args: Array[String]) {
		var a = new Array[Double](10)
		var b = new Array[Int](10)
		var c = new Array[Int](10)
		var d = new Array[Int](10)
		var sum = 0
		c(0) = 1
		b(0) = 0
		for(i <- 1 to 9 by 1){
			a(i) = scala.math.pow(i,5)
			b(i) = a(i).toInt
			c(i) = c(i-1)*10
		}
		for(x0 <- 0 to 9 by 1){
			d(0) = c(0)*x0
			for(x1 <- 0 to 9 by 1){
				d(1) = c(1)*x1
				for(x2 <- 0 to 9 by 1){
					d(2) = c(2)*x2
					for(x3 <- 0 to 9 by 1){
						d(3) = c(3)*x3
						for(x4 <- 0 to 9 by 1){
							d(4) = c(4)*x4
							for(x5 <- 0 to 9 by 1){
								d(5) = c(5)*x5
								if( d(0)+d(1)+d(2)+d(3)+d(4)+d(5) == b(x0)+b(x1)+b(x2)+b(x3)+b(x4)+b(x5) ){
									sum += b(x0)+b(x1)+b(x2)+b(x3)+b(x4)+b(x5)
								}
							}
						}
					}
				}
			}
		}
		printf("the sum's total is: %d \n", sum - 1)
	}	
}