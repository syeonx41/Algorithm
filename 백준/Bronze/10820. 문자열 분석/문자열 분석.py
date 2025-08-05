while True:
    try:
        text = input()
        
        lowercase_count = 0
        uppercase_count = 0
        num_count = 0
        blank_count = 0
        
        for char in text:
            if char.islower():
                lowercase_count += 1
            elif char.isupper():
                uppercase_count += 1
            elif char.isnumeric():
                num_count += 1
            else:
                blank_count += 1
        print(lowercase_count, uppercase_count, num_count, blank_count)  
    except:
        break
