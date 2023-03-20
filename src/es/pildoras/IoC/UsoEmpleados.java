package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Empleados empleado1 = new DirectorEmpleado();
		Empleados empleado2 = contexto.getBean("miEmpleado",Empleados.class);
		
		System.out.println(empleado2.getTareas());
		contexto.close();

	}

}
