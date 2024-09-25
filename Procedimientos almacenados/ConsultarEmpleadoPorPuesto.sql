
DELIMITER //


CREATE PROCEDURE ConsultarEmpleadoPorPuesto (
    IN p_name varchar(250))
BEGIN
	IF exists (SELECT 1 FROM JOBS WHERE  name like CONCAT('%', p_name , '%'))  THEN
    SELECT name FROM JOBS WHERE  name like CONCAT('%', p_name , '%');
    ELSE
		SELECT 'puesto no existe';

    END IF;
END //
 DELIMITER ;