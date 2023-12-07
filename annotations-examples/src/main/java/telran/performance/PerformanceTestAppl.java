package telran.performance;

public class PerformanceTestAppl {

	public static void main(String[] args) throws Exception {
		PerformanceTestLibrary.runTests(new JoinStringsPerformanceTest());

	}

}