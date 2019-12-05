package main.java.bo.factories;

import main.java.configuration.Properties;
import main.java.bo.motoren.AchsenMotor;
import main.java.bo.motoren.Motor;
import main.java.bo.motoren.StiftMotor;

public class MotorFactory implements AbstractFactory<Motor, MotorTyp>{

	@Override
	public Motor create(MotorTyp type) {
		if (type == MotorTyp.XAchsenMotor) {
			return new AchsenMotor(Properties.XPort);
        } else if(type == MotorTyp.YAchsenMotor) {
        	return new AchsenMotor(Properties.YPort);
        } else if (type == MotorTyp.StiftMotor) {
            return new StiftMotor(Properties.StiftPort);
        }
        return null;
	}

}
