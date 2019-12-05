package main.java.bo.factories;

import main.java.configuration.Properties;
import main.java.bo.motoren.AchsenMotor;
import main.java.bo.motoren.StiftMotor;
import main.java.bo.sensoren.LichtSensor;
import main.java.bo.sensoren.Sensor;
import main.java.bo.sensoren.TouchSensor;

public class SensorFactory implements AbstractFactory<Sensor, SensorenTyp>{

	@Override
	public Sensor create(SensorenTyp type) {
		if (type == SensorenTyp.LichtSensor) {
			return new LichtSensor(Properties.LichtSensorPort);
        } else if(type == SensorenTyp.TouchSensor) {
        	return new TouchSensor(Properties.TouchSensorPort);
        } 
        return null;// TODO Auto-generated method stub
	}

}
