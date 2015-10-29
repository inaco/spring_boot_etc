package sample.gradle.service;

import org.springframework.stereotype.Component;

@Component
public class SampleService implements ISampleService {

	@Override
	public void start() {
		System.out.println("+++++++++");
		System.out.println("処理中...");
		System.out.println("+++++++++");
	}

	@Override
	public void end() {
		System.out.println("★★★★★");
		System.out.println("END");
		System.out.println("★★★★★");
	}
}
