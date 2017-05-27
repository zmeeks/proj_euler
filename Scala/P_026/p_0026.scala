object p_0026 {
	def main(args: Array[String]) {

		var temp_max = 0
		var cur_max = 0
		var max_num = 0
		var breaker = false

		for(i <- 999 to 1 by -2){
			if(breaker){}
			else{
				temp_max = long_div(i,1,0)
				if(temp_max > cur_max){
					cur_max = temp_max
					max_num = i
				}
				if(cur_max > i){
					breaker = true
				}
			}  
		}
		printf("longest cycle is %d at integer %d \n", cur_max, max_num)
	
	}

	def long_div(denom:Int, remaind:Int, depth:Int) : Int = {
		var remainder = 0
		var cur_depth = 0
		if(remaind == 0 || remaind % denom == 0){
			depth
		}
		else if((remaind == 1 && depth > 0)|| (remaind == 10 && depth > 0)|| (remaind == 100 && depth >0)){
			depth
		}
		else if(denom < remaind){
			remainder = remaind % denom
			cur_depth = long_div(denom,remainder, depth+1)
			cur_depth
		}else{
			remainder = remaind * 10
			cur_depth = long_div(denom,remainder, depth)
			cur_depth
		}
	}
}