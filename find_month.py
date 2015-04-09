# !usr/bin/python

with open("Annual_Weather_Cleaned.csv") as fr:
    line = fr.readlines()
    print line[1]

    # if line[5] == 1:
    #     with open("january.csv") as f1:
    #         f1.write(line + "\n")
    # elif line[5] == 2:
    #     with open("february.csv") as f2:
    #         f2.write(line + "\n")
    # elif line[5] == 3:
    #     with open("march.csv") as f3:
    #         f3.write(line + "\n")
    # elif line[5] == 4:
    #     with open("april.csv") as f4:
    #         f4.write(line + "\n")
    # elif line[5] == 5:
    #     with open("march.csv") as f5:
    #         f5.write(line + "\n")
    # elif line[5] == 6:
    #     with open("june.csv") as f6:
    #         f6.write(line + "\n")
    # elif line[5] == 7:
    #     with open("july.csv") as f7:
    #         f7.write(line + "\n")
    # elif line[5] == 8:
    #     with open("august.csv") as f8:
    #         f8.write(line + "\n")
    # elif line[5] == 9:
    #     with open("september.csv") as f9:
    #         f9.write(line + "\n")
    # elif line[5] == 10:
    #     with open("october.csv") as f10:
    #         f10.write(line + "\n")
    # elif line[5] == 11:
    #     with open("november.csv") as f11:
    #         f11.write(line + "\n")
