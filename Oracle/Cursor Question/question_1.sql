declare
    cursor empcur
    is
        select first_name, salary, commission_pct
        from HR.Employees where department_id = 50;

    fnm HR.Employees.first_name%TYPE;
    sal HR.Employees.salary%TYPE;
    com HR.Employees.commission_pct%TYPE;
begin
    open empcur;
    fetch empcur into fnm, sal, com;
    loop
        exit when empcur%NOTFOUND;
        if com is not null then
            sal := sal + ( sal * com );
        end if;

        dbms_output.put_line('Name : ' || fnm);
        dbms_output.put_line('Salary : ' || sal);

        fetch empcur into fnm, sal, com;
    end loop;
    close empcur;
end;


-- SQL> /
-- Name : Matthew
-- Salary : 8000
-- Name : Adam
-- Salary : 8200
-- Name : Payam
-- Salary : 7900
-- Name : Shanta
-- Salary : 6500
-- Name : Kevin
-- Salary : 5800
-- Name : Julia
-- Salary : 3200
-- Name : Irene
-- Salary : 2700
-- Name : James
-- Salary : 2400
-- Name : Steven
-- Salary : 2200
-- Name : Laura
-- Salary : 3300
-- Name : Mozhe
-- Salary : 2800
-- Name : James
-- Salary : 2500
-- Name : TJ
-- Salary : 2100
-- Name : Jason
-- Salary : 3300
-- Name : Michael
-- Salary : 2900
-- Name : Ki
-- Salary : 2400
-- Name : Hazel
-- Salary : 2200
-- Name : Renske
-- Salary : 3600
-- Name : Stephen
-- Salary : 3200
-- Name : John
-- Salary : 2700
-- Name : Joshua
-- Salary : 2500
-- Name : Trenna
-- Salary : 3500
-- Name : Curtis
-- Salary : 3100
-- Name : Randall
-- Salary : 2600
-- Name : Peter
-- Salary : 2500
-- Name : Winston
-- Salary : 3200
-- Name : Jean
-- Salary : 3100
-- Name : Martha
-- Salary : 2500
-- Name : Girard
-- Salary : 2800
-- Name : Nandita
-- Salary : 4200
-- Name : Alexis
-- Salary : 4100
-- Name : Julia
-- Salary : 3400
-- Name : Anthony
-- Salary : 3000
-- Name : Kelly
-- Salary : 3800
-- Name : Jennifer
-- Salary : 3600
-- Name : Timothy
-- Salary : 2900
-- Name : Randall
-- Salary : 2500
-- Name : Sarah
-- Salary : 4000
-- Name : Britney
-- Salary : 3900
-- Name : Samuel
-- Salary : 3200
-- Name : Vance
-- Salary : 2800
-- Name : Alana
-- Salary : 3100
-- Name : Kevin
-- Salary : 3000
-- Name : Donald
-- Salary : 2600
-- Name : Douglas
-- Salary : 2600

-- PL/SQL procedure successfully completed.

-- SQL>  