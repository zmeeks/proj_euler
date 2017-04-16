import math

huge_num = math.factorial(100)

huge_num_str = str(huge_num)

huge_num_sum = 0

for i in range(0, len(huge_num_str)):
	huge_num_sum += int(huge_num_str[i])
	
print("the sum of 100! is: ", huge_num_sum)
