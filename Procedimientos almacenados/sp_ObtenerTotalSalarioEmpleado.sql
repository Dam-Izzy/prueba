
DELIMITER //


CREATE PROCEDURE ValidarExistenciaEmpleado (
    IN p_fecha_inicio date,
	IN p_fecha_fin date,
    IN p_id_Empleado int
    )
BEGIN

IF (p_fecha_inicio <= p_fecha_fin) THEN
SELECT 'FECHA DE INICIO NO DEBE SER MAYOR A LA DE FIN';
ELSE
 IF  EXISTS (SELECT 1 FROM employees WHERE Id = p_id_Empleado )
  
  THEN
  SELECT 'USUARIO ENCONTRADO';
  ELSE
   SELECT 'USUARIO NO ENCONTRADO';

  END IF;
END IF;
 
END //
 DELIMITER ;