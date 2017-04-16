collatz_dic = {'1':1}
max_key = 0
longest_seq = 1

def collatz_func(num, cnt):	
	if str(num) in collatz_dic:
		temp = collatz_dic[str(num)]
		return temp + cnt
	elif num % 2 == 0:
		return collatz_func(num/2, cnt + 1)
	else:
		return collatz_func(num*3 + 1, cnt + 1)
		
def find_longest_seq():
	global longest_seq
	global max_key
	for i in xrange(1, 1000000):
		temp = collatz_dic[str(i)]
		if temp > longest_seq:
			longest_seq = temp
			max_key = i
	
def main():
	for i in xrange(1, 1000000):  
		if str(i) not in collatz_dic:
			tem = collatz_func(i, 0)
			collatz_dic[str(i)] = tem
	find_longest_seq()
	print max_key
			
main()


