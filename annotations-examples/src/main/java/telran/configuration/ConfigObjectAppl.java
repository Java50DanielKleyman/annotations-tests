package telran.configuration;

public class ConfigObjectAppl {

	public static void main(String[] args) throws Exception {
		ConfigObject configObj = new ConfigObject();
		Configuration configuration = new Configuration(configObj);
		try {
			configuration.configInjection();
			System.out.println(configObj);
		} catch (RuntimeException e) {			
			System.out.println("Exception caught: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
