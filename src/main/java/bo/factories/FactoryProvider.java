package main.java.bo.factories;

public class FactoryProvider {

	public AbstractFactory getFactory(FactoryTyp typ) {
		if(typ == FactoryTyp.MotorFactory) {
            return new MotorFactory();
        } else if(typ == FactoryTyp.SensorenFactory){
            return new SensorFactory();
        }
        return null;
	}
	
}
