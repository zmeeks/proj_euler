import scala.math._
object p_0027 {

	var v1 = Array.fill(1000)(0)
	var v2 = scala.collection.mutable.ArrayBuffer[Int]()
	v1(0) = 2
	var length = 1
	var max_prime = 0
	var max_n = 0
	var max_a = 0
	var max_b = 0

	def main(args: Array[String]) {
		prime_init()
		max_prime = v1(999)
		var temp_n = 0
		for(i <- -999 to 999 by 1){
			for(j <- -1000 to 1000 by 1){
				temp_n = quadratic_prime_calc(i,j)
				if(temp_n > max_n){
					max_n = temp_n
					max_a = i
					max_b = j
				}
			}
		}
		println(max_n)
		println(max_a*max_b)
		/* println(v2.toArray.deep.mkString(", ")) */
	
	}

	def prime_init() {
		var i = 3
		while(length < 1000){
			var j = 0
			var div = 0
			while(j < length && v1(j) <= sqrt(i)){
				if(i % v1(j) == 0)
					div = 1
				j+=1
			}
			if(div != 1){
				v1(length) = i
				length+=1 
			}
			i+=2
		}
	}

	def prime_check(num:Int) : Boolean = {
		val sqrt_v = sqrt(num)
		val (vt, vf) = v1.partition(_ <= sqrt_v)
		if(vt.exists(num % _ == 0))
			return false
		else if(sqrt_v > max_prime && v2.exists(num % _ == 0))
			return false
		else
			v2 = v2 :+ num
			return true
	}

	def quadratic_prime_calc(a:Int, b:Int) : Int = {
		var n = 0
		var k = 0
		while(true){
			k = n*n + a*n + b
			if(v1.exists(_ == k))
				n+=1
			else if(k < max_prime)
				return n
			else if(v2.exists(_ == k))
				n+=1
			else if(prime_check(k))
				n+=1
			else
				return n
		}
		return 0 // won't ever reach here but necesseary to deal with scala language requirements

	}
}