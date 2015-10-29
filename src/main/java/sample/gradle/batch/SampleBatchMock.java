package sample.gradle.batch;

public class SampleBatchMock implements ISampleBatch {

	@Override
	public void execute() {
		System.out.println("★★★★★");
		System.out.println("MOCK!");
		System.out.println("★★★★★");
	}

}
