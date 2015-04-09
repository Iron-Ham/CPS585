import csv
with open('Annual_Weather_Cleaned.csv', 'rb') as csvfile:
    reader = csv.reader(csvfile, delimiter=' ', quotechar='|')
    for row in reader:
        print ', '.join(row)
