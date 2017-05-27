object p_0026 {
	def main(args: Array[String]) {

		var temp_max = 0
		var cur_max = 0
		var max_num = 0
		var breaker = false

		for(i <- 999 to 1 by -1){	
			if(breaker){}
			else{
				temp_max = long_div(i,1,0,1,1)
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

	def long_div_helper(denom:Int, remaind:Int, depth_lim:Int) : Int = {
		var iter_value = 0
		var remainder = 0
		if(depth_lim == 0){
			remaind
		}
		else if(denom < remaind){
			remainder = remaind % denom
			iter_value = long_div_helper(denom,remainder, depth_lim - 1)
			iter_value
		}
		else{
			remainder = remaind * 10
			iter_value = long_div_helper(denom,remainder, depth_lim)
			iter_value
		}

	}

	def long_div(denom:Int, remaind:Int, depth:Int, iter:Int, iter_val:Int) : Int = {
		var remainder = 0
		var cur_depth = 0
		if(remaind == 0 || remaind % denom == 0){
			depth - iter + 1
		}
		else if((remaind == iter_val && depth >= iter)|| (remaind == 10*iter_val && depth >= iter)|| (remaind == 100*iter_val && depth >= iter)){
			depth - iter + 1
		}
		else if(denom < remaind){
			remainder = remaind % denom
			cur_depth = long_div(denom,remainder, depth+1, iter, iter_val)
			cur_depth
		}
		else if(depth > denom + iter){
			var new_iter_val = long_div_helper(denom, 1, iter+1)
			long_div(denom,1, 0, iter + 1, new_iter_val)
		}else{
			remainder = remaind * 10
			cur_depth = long_div(denom,remainder, depth, iter, iter_val)
			cur_depth
		}
	}
}