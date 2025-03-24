declare
    cursor empcur
    is
        select first_name, commission_pct
        from HR.Employees where department_id is not null;
        for update of commission_pct;

    fnm HR.Employees.first_name%TYPE;
    com HR.Employees.commission_pct%TYPE;
begin
    for empcur into fnm, com
    loop
        update empcur
        set commission_pct = .05
        where current of ecur;
        dbms_output.put_line('Commission Updated for ' || fnm);
    end loop;
    close empcur;
end;

--  20  /
--         for update of commission_pct;
--         *
-- ERROR at line 6:
-- ORA-06550: line 6, column 9:
-- PLS-00103: Encountered the symbol "FOR" when expecting one of the following:
-- begin function pragma procedure subtype type <an identifier>
-- <a double-quoted delimited-identifier> current cursor delete
-- exists prior

-- SQL>