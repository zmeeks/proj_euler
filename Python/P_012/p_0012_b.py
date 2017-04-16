import math

divisors = 0
triangle = 1
count = 2
maxprime = 3
search = 167

primes = [2]

def init_prime_search():
	global maxprime
	for i in xrange(3,999,2):
		am_prime = True
		for j in primes:
			if i % j == 0:
				am_prime = False
				break
		if am_prime == True:
			primes.append(i)
			maxprime = i
				
def prime_search():	
	global maxprime
	global search
	i = search
	while i < 2*search:
		j = 6*i - 1
		am_prime = True
		for k in primes:
			if j % k == 0:
				am_prime = False
				break
		if am_prime == True:
			primes.append(j)
			maxprime = j
		j = 6*i + 1
		am_prime = True
		for k in primes:
			if j % k == 0:
				am_prime = False
				break
		if am_prime == True:
			primes.append(j)
			maxprime = j
		i += 1
	search *= 2 
						
init_prime_search()

verified = 1

while divisors < 500:
	divisors = 1
	triangle += count
	if math.ceil(math.sqrt(triangle)) + 1 > maxprime:
		prime_search()
	for i in primes: 
		if i < math.ceil(math.sqrt(triangle)) + 1:
			if triangle % i == 0:
				divisible = True
				j = i
				subdiv = 1
				while divisible:
					subdiv += 1
					j *= i
					if triangle % j == 0:
						divisible = True
					else:
						divisible = False
						divisors *= subdiv
	count += 1
	if divisors > 499:
		verified = 0
		for i in xrange(1, triangle//2 + 1):
			if triangle % i == 0:
				verified += 1
		verified += 1 #to account for the number == triangle itself
	
	
print triangle
print divisors
print verified


	