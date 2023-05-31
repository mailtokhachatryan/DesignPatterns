package abstractFactory.example.factory;

import abstractFactory.example.ComputerAbstractFactory;
import abstractFactory.example.model.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}