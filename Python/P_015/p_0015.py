lattice_rows = []

for i in xrange(0, 22):
	lattice_rows.append(i)

for i in xrange(1,20):
	for j in xrange(1,22):
		lattice_rows[j] += lattice_rows[j-1]
	
print lattice_rows[21]
