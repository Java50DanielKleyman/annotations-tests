package telran.x;

import java.time.LocalDate;

import telran.reflect.SchemaProperties;

public class SchemaPropertiesApp {

	public static void main(String[] args) {
		try {
			SchemaProperties.displayFieldProperties(new PersonNormal(123, "Vasya", LocalDate.of(2000, 1, 1)));
		} catch (Exception e) {
			throw new RuntimeException("error: PersonNormal must no throw any exceptions");
		}
		try {
			SchemaProperties.displayFieldProperties(new PersonNoId(123, "Vasya", LocalDate.of(2000, 1, 1)));
			throw new RuntimeException("error: PersonNoId must throw IllegalStateException");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			SchemaProperties.displayFieldProperties(new PersonTwoId(123, "Vasya", LocalDate.of(2000, 1, 1)));
			throw new RuntimeException("error: PersonTwoId must throw IllegalStateException");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}