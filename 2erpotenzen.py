i = 0
j = 0
decimal_places = 1
while(i < 50):
    i+=1
    if((i+1) % 3 == 0):
        j+=1
        if(j%3 > 0):
            decimal_places += 1

        # if(i % 3 == 0):
            #  decimal_places -=1
        
    print(f"2 ^ {i: 3}: {pow(2,i): 20} : decimal places: {decimal_places}")
