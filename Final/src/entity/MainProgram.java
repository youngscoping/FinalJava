package entity;

import java.util.List;

public class MainProgram {
	public void showManager(List<Project> pros) {

		System.out.println(". # Project member information                              .");
		System.out.println("....................................................");
		System.out.printf(".%5s%25s%20s.\n", "id", "fullname", "role");
		for (Project pro : pros) {
			System.out.printf(".%5s%25s%30s.\n", pro.getProjectId(), pro.getFullname(), pro.getRole());
		}
		}
	public void showMemberProById(List<Project> pros) {

		System.out.println(". # Manager information                              .");
		System.out.println("....................................................");
		System.out.printf(".%5s%25s%20s.\n", "id", "fullname", "role");
		for (Project pro : pros) {
			System.out.printf(".%5s%25s%30s.\n", pro.getProjectId(), pro.getFullname(), pro.getRole());
		}
	}
}
