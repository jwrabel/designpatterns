package pl.jwrabel.trainings.javandwro3.designpatterns.creational.singleton;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class MySingleton {
	public static final MySingleton INSTANCE = new MySingleton();

	private MySingleton() {
	}
}
