package mm_visual_save;

import java.util.Set;

public class People {

	private Integer peopleId;
	private String peopleName;
	private String peopleAge;
	private String peopleQulifiction;
	private Set jobs;

	public Integer getPeopleId() {
		return peopleId;
	}

	public void setPeopleId(Integer peopleId) {
		this.peopleId = peopleId;
	}

	public String getPeopleName() {
		return peopleName;
	}

	public void setPeopleName(String peopleName) {
		this.peopleName = peopleName;
	}

	public String getPeopleAge() {
		return peopleAge;
	}

	public void setPeopleAge(String peopleAge) {
		this.peopleAge = peopleAge;
	}

	public String getPeopleQulifiction() {
		return peopleQulifiction;
	}

	public void setPeopleQulifiction(String peopleQulifiction) {
		this.peopleQulifiction = peopleQulifiction;
	}

	public Set getJobs() {
		return jobs;
	}

	public void setJobs(Set jobs) {
		this.jobs = jobs;
	}

}
