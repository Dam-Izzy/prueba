
DELIMITER //


CREATE PROCEDURE InsertarHorasTrabajadas (
    IN p_employee_id int, 
    IN p_worked_hours int, 
    IN p_worked_date date
)
BEGIN
	IF exists (SELECT 1 FROM EMPLOYEE_WORKED_HOURS WHERE EMPLOYEE_ID = p_employee_id AND WORKED_DATE = p_worked_date)  THEN
	SELECT 'empleado ya registrado';

    ELSE
	 IF p_worked_hours <= 20  THEN
        IF NOT EXISTS (SELECT 1 FROM employees WHERE ID_EMPLOYEES = p_employee_id and p_worked_date <= CURRENT_DATE() )  THEN
             INSERT INTO EMPLOYEE_WORKED_HOURS (EMPLOYEE_ID, WORKED_HOURS,WORKED_DATE) VALUES (p_employee_id, p_worked_hours, p_worked_date);
            SELECT 'Horas agregadas correctamente.';
        END IF;
	END IF;
    END IF;	
END //
 DELIMITER ;