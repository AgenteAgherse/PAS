# Proyecto de Aula Semestral
## **Cambios añadidos el día 20 de Junio del 2023**
Se ha creado la nueva base de datos cuyo diagrama es basado en el diagrama E-R presentado a continuación.

![Imagen presentando el diagrama Entidad-Relación](Documentación/Diagrama%20E-R.png)

Además de esto, se ha agregado inicialmente tres eventos que corren diariamente verificando tanto los contratos que han sido repetidos (para evitar que el empleado tenga más de 1 contrato), la diferencia de tiempo que hay entre la hora de entrada y salida y el evento que define un pago diario teniendo en cuenta una hora de entrada y una hora de salida de los diferentes usuarios que tienen un contracto activo y que han presentado una entrada el día anterior (Los eventos están diseñados para que empiecen a medianoche). Dichos eventos tienen los detalles que se muestran a continuación.

![Imagen de lista de eventos](Documentación/Eventos.png)


**Procedures Creados**

Los procedures que han sido creados son específicamente para los diferentes eventos que se han puesto anteriormente. Serán listados a continuación.

* evaluate_users_contracts()
  - Este procedimiento almacenado tiene como objetivo tomar en cuenta todos los usuarios que presentan contratos activos actualmente.

  ![Imagen del Stored Procedure.](Documentación/evaluate_users_contracts.png)


* repeated_contracts(IN iduser INT)
    - Este procedimiento tiene como objetivo evaluar si un usuario ya tiene un contrato activo con la empresa. En caso de ser así, cancelará dicho contrato para mantener solo un contrato activo.

    ![Imagen del Stored Procedure.](Documentación/repeated_contracts.png)

* time_difference(IN iduser INT)
    - Este stored procedure es usado para definir la diferencia de tiempo que tiene un usuario en el día actual. Actualmente su uso es para un evento que va a ser ejecutado diariamente para insertar una nueva consignación del empleado.

    ![Imagen del Stored Procedure](Documentación/time_difference.png)

* get_daily_payment(IN id INT)
    - Usado para obtener el pago diario de los empleados registrados. El evento hace parte del evento updateRecaudoTable. Actualmente este método define el pago diario del usuario por 3 tipos de pagos. Por medio día, día completo y horas extra.

    ![Imagen del stored Procedure](Documentación/get_daily_payment.png)

**Funciones**
Las funciones creadas por el momento son las siguientes.

* verificacion_usuario(id INT)
    - Cuenta los contratos activos del usuario y, en caso que se encuentre alguno, esta función devuelve un valor verdadero. En caso contrario, se retorna un valor falso.

    ![Imagen de la función](Documentación/verificate_users_function.png)




> Escrito por Agustín Hernández. 21 de Junio del 2023.