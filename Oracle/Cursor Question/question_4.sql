DECLARE
    CURSOR ecur (eid)
    is
        SELECT first_name, last_name, salary, commission_pct 
        FROM Emp
        WHERE Employee_id = :id;
    
    id  Emp.Employee_id%TYPE;
    fnm Emp.first_name%TYPE;
    lnm Emp.last_name%TYPE;
    com Emp.commission_pct%TYPE;
    net Emp.salary%TYPE;

    id number;
BEGIN
    id := &Employee_ID;
    OPEN ecur;
    FETCH ecur INTO fnm, lnm, sal, com;
    net := sal + (sal * NVL(com, 0));

    DBMS_OUTPUT.PUT_LINE('Name : ' || fnm || ' ' || lnm);
    DBMS_OUTPUT.PUT_LINE('Net Salary : ' || net);
    
    CLOSE ecur;
END;