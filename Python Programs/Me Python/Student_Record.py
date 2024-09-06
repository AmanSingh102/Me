student = {}

while(True):

    menu = '''
------------- Menu ---------------
1. Display the Records
2. Entering Student 
3. Modification of field
4. Adding New fields
----------------------------------
    '''

    print(menu)
    option = int(input("Enter Your option [ For exit = 0 ] : "))

    if( option == 0 ):
        break

    if( option == 1 ):
        if( student == {} ):
            print("Empty Record....")
        else:
            print("\n------------- Records ------------\n")
            for i,j in student.items():
                print(f"Roll No : {i}")
                for k,l in j.items():
                    print(k, ":", l)
                print()
            print("----------------------------------")

    elif( option == 2 ):
        
        print("\n---------------- Entering Student ---------------- \n")
        num_of_student = int(input("Enter number of student : "))
        print()

        for i in range(num_of_student):
            roll = int(input("Enter roll : "))
            name = input("Enter name : ")
            semester = input("Enter semester : ")
            sgpa = float(input("Enter sgpa : "))
            session = input("Enter session : ")
            total = input("Enter total : ")

            student[roll] = {
                "Name"     : name,
                "Semester" : semester,
                "Session"  : session,
                "Sgpa"     : sgpa,
                "Total"    : total
            }
            print()

    elif( option == 3 ):

        print("\n---------------- Modification of Fields ---------------- \n")

        modify_roll = int(input("Enter Roll No of the student to be modify : "))

        print(f"\n--------- Record of Student Roll No.{modify_roll} ----------")
        for i,j in student.items():
            if i == modify_roll:
                print(f"Roll No : {i}")
            
                for k,l in j.items():
                    print(k, ":", l)
        print(f"------------------------------------------------\n")

        while(True):

            modify_field = input("Which Field are you want to modify [ for Stop : 'exit' ] : ").capitalize()

            if( modify_field == "Exit"):
                break

            if( modify_field in ["Name", "Semester", "Session", "Sgpa", "Total"]):
                for i,j in student.items():
                    if i == modify_roll:
                        for k,l in j.items():

                            if( k == "Name" and "Name" == modify_field ):
                                new_name = input("Enter New Name : ")
                                student[modify_roll][modify_field] = new_name
                                print("Name updated successfully.....\n")

                            elif( k == "Semester" and "Semester" == modify_field ):
                                new_semester = input("Enter new Semester : ")
                                student[modify_roll][modify_field] = new_semester
                                print("Semester updated successfully.....\n")

                            elif( k == "Session" and "Session" == modify_field ):
                                new_session = input("Enter new Session : ")
                                student[modify_roll][modify_field] = new_session
                                print("Session updated successfully.....\n")

                            elif( k == "Sgpa" and "Sgpa" == modify_field ):
                                new_sgpa = float(input("Enter new SGPA : "))
                                student[modify_roll][modify_field] = new_sgpa
                                print("Sgpa updated successfully.....\n")

                            elif( k == "Total" and "Total" == modify_field ):
                                new_total = int(input("Enter new Total : "))
                                student[modify_roll][modify_field] = new_total
                                print("Total updated successfully.....\n")
            else :
                print("Invalid Field !!!")

    elif( option == 4 ):

        print("\n------------------- Adding New Field ------------------- \n")

        add_field_roll = int(input("Enter Roll No of the student to be added the field : "))

        print(f"\n--------- Record of Student Roll No.{add_field_roll} ----------")
        for i,j in student.items():
            if i == add_field_roll:
                print(f"Roll No : {i}")
            
                for k,l in j.items():
                    print(k, ":", l)
        print(f"-------------------------------------------------\n")
    
        no_of_fields = int(input("How many fields are you want to add : "))

        for i in range(no_of_fields):
            newfield_name = input("Enter the name of the new field : ")
            newvalue_name = input(f"Emter the value of {newfield_name} : ")
            student[add_field_roll][newfield_name] = newvalue_name
            print(f"{newfield_name} field added successfully...........")
            print()
        
        
    else:
        print("Invalid Input !!!")
