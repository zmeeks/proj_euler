number_dict={
'1':3, '2':3, '3':5, '4':4, '5':4, '6':3, '7':5, '8':5, '9':4, '10':3, '11':6,
'12':6, '13':8, '14':8, '15':7, '16':7, '17':9, '18':8, '19':8, '20':6, '30':6,
'40':5, '50':5, '60':5, '70':7, '80':6, '90':6, '1000':11, '0':0}

sum = 0
hun = 0
h_mod = 0
num = 0
dec = 0

for i in range(1,1000):
	if i > 99:
		h_mod = i//100
		if i % 100 != 0:
			sum += 3 #this accounts for the "and"
		sum += number_dict[str(h_mod)]
		sum += 7 #this account for the "hundred"
	num = i % 100
	if num < 20:
		sum += number_dict[str(num)]
	else:
		dec = num%10
		num = (num//10)*10
		sum += number_dict[str(num)]
		sum += number_dict[str(dec)]
		
sum += number_dict[str(1000)]

print("total sum = ", sum)	
	