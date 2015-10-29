package sample.gradle.setting;


//@Component
//@ConfigurationProperties(prefix = "scheduled")
public class SampleSetting {

	private String cron;
	private String zone;

	public String getCron() {
		return cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
