package sample.gradle.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import sample.gradle.batch.ISampleBatch;
import sample.gradle.batch.SampleBatchImpl;

@Configuration
@EnableScheduling
public class SampleConfig {

	@Bean
	public ISampleBatch getSampleBatch() {
		return new SampleBatchImpl();
		// return new SampleBatchMock();
	}

}
