package pl.jwrabel.trainings.javandwro3.designpatterns.creational.singleton;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public enum Role {
	ADMIN("Admin"), USER("User"), MANAGER("Manager");

	public String displayName;

	Role(String displayName) {
		this.displayName = displayName;
	}
}
