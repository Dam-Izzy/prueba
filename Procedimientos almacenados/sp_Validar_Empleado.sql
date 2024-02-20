DELIMITER //


CREATE PROCEDURE InsertarEmpleado (
    IN p_name VARCHAR(255),
    IN p_lastname VARCHAR(250),
    IN p_birthdate date
)
BEGIN
set @edad = TIMESTAMPDIFF(YEAR,p_birthdate,CURDATE()) ;
	IF @edad > 18 THEN
        IF NOT EXISTS (SELECT 1 FROM employees WHERE name = p_name and lastname =p_lastname)  THEN
             /*INSERT INTO EMPLOYEES (GENDER_ID, JOB_ID,NAME,LASTNAME,BIRTHDATE) VALUES (p_gender_id, p_job_id, p_name, p_lastname, p_birthdate);*/
            SELECT 'Empleado guardado correctamente.';
            ELSE
            SELECT 'Empleado ya existe.';
        END IF;
        ELSE
          SELECT 'Empleado menor de edad';

	END IF;
    

END //
 DELIMITER ;R ;