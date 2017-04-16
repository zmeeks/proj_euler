max_sum = 0

triangle = (
"75,"
"95 64,"
"17 47 82,"
"18 35 87 10,"
"20 04 82 47 65,"
"19 01 23 75 03 34,"
"88 02 77 73 07 63 67,"
"99 65 04 28 06 16 70 92,"
"41 41 26 56 83 40 80 70 33,"
"41 48 72 33 47 32 37 16 94 29,"
"53 71 44 65 25 43 91 52 97 51 14,"
"70 11 33 28 77 73 17 78 39 68 17 57,"
"91 71 52 38 17 14 91 43 58 50 27 29 48,"
"63 66 04 68 89 53 67 30 73 16 69 87 40 31,"
"04 62 98 27 23 09 70 98 73 93 38 53 60 04 23")

tri_list = triangle.split(',')
tril = []

for r in tri_list:
	print("len = ",len(r))
	r = r.split(' ')
	print("length = ",len(r))
	k = []
	#this loop splits the string of rows into substrings to next be turned into integers
	for i in r:
		j = int(i)
		k.append(j)
	tril.append(k);	

for r in range(1,15):
	print(tril[r])
	for i in range(0, r+1):
		if i == 0:
			tril[r][i] += tril[r-1][i]
		elif i == r:
			tril[r][i] += tril[r-1][i-1]
		else:
			if tril[r-1][i-1] > tril[r-1][i]:
				tril[r][i] += tril[r-1][i-1]
			else:
				tril[r][i] += tril[r-1][i]


for x in tril[14]:
	if x > max_sum:
		max_sum = x
		
print("the sum of the greatest path is: ", max_sum)

	