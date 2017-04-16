months=[0,31,28,31,30,31,30,31,31,30,31,30,31]
year = 1901
days=[0,1,2,3,4,5,6]
dayWeek = (1 + 365) % 7
dayMonth = 0
total = 0
leap = 0
while year < 2001:
	if year%4 == 0:
		leap = 1
		if year %100 == 0:
			leap = 0
			if year %400 == 0:
				leap = 1
	for m in range(1, 13):
		dayWeek += months[m] 
		if m == 2:
			dayWeek += leap
		dayWeek = dayWeek % 7
		if dayWeek == 0:
			total += 1
	leap = 0
	year += 1
	
print("total such days = ", total)