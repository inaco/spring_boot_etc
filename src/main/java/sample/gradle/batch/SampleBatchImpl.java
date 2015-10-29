package sample.gradle.batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import sample.gradle.service.ISampleService;

public class SampleBatchImpl implements ISampleBatch {

	@Autowired
	ISampleService sampleService;

	@Override
	@Scheduled(cron = "${scheduled.cron}", zone = "${scheduled.zone}")
	public void execute() {
		sampleService.start();
	}

	// @Scheduled(cron = "* * * * * *", zone = "Asia/Tokyo")
	public void execute2() {
		System.out.println("★★★★★");
		System.out.println("STOP");
		System.out.println("★★★★★");
	}
}
