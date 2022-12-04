package module_brasil;

import java.time.LocalDate;

public class Jogador {
	private int number;
	private String name;
	private String nickName;
	private double height;
	private double weight;
	private LocalDate birthDate;
	private String position;
	private String currentClub;
	private int vezesChamada = 0;
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getVezesChamada() {
		return vezesChamada;
	}

	public void setVezesChamada() {
		this.vezesChamada = this.vezesChamada++;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getCurrentClub() {
		return currentClub;
	}
	
	public void setCurrentClub(String currentClub) {
		this.currentClub = currentClub;
	}
	
	public int getIdade() {
		return LocalDate.now().compareTo(birthDate);
	}
}
