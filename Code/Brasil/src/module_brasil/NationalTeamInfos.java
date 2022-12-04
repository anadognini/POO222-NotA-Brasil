package module_brasil;

import java.awt.Image;

import java.nio.file.Path;

public interface NationalTeamInfos {
	int getHowManyMembers();
	
	int getOldestPlayer();
	
	int getYoungestPlayer();
	
	double getAverageAge();
	
	String getPlayer(int number);
	
	String getPressOfficerContacts();
	
	String getCountryName();
	
	Image getFlagImage();
	
	Path getTechnicalCommittee();
	
	Stats getStatsReponsible();
}
