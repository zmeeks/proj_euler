divisors = 0
triangle = 1
count = 2

while divisors < 500:
	divisors = 0
	triangle += count
	for i in xrange(1, triangle//2 + 1):
		if triangle % i == 0:
			divisors += 1
	divisors += 1 #this is to account for the number itself
	count += 1
	#print "cur divisors: ",
	#print divisors
	
print triangle
	