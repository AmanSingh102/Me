declare
    cursor empcur
    is
        select first_name, salary, commission_pct
        from HR.Employees where department_id = 50;

    fnm HR.Employees.first_name%TYPE;
    sal HR.Employees.salary%TYPE;
    com HR.Employees.commission_pct%TYPE;
begin
    -- open empcur;
    -- fetch empcur into fnm, sal, com;
    for empcur into fnm, sal, com
    loop
        exit when empcur%NOTFOUND;
        if com is not null then
            sal := sal + ( sal * com );
        end if;

        dbms_output.put_line('Name : ' || fnm);
        dbms_output.put_line('Salary : ' || sal);

        -- fetch empcur into fnm, sal, com;
    end loop;
    -- close empcur;
end;

-- SQL> /
--     for empcur into fnm, sal, com;
--                *
-- ERROR at line 13:
-- ORA-06550: line 13, column 16:
-- PLS-00103: Encountered the symbol "INTO" when expecting one of the following:     
-- in
-- ORA-06550: line 14, column 5:
-- PLS-00103: Encountered the symbol "LOOP"