package module_brasil;

import java.awt.Image;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fifa.NationalTeamInfos;
import fifa.NationalTeamStats;

public class Brasil implements NationalTeamInfos {
	private String name;
	private ArrayList<Jogador> players;
	private ArrayList<ComissaoTecnica> commission;
	private ArrayList<Dirigente> leaders;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Jogador> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Jogador> players) {
		this.players = players;
	}

	public ArrayList<ComissaoTecnica> getCommission() {
		return commission;
	}

	public void setCommission(ArrayList<ComissaoTecnica> commission) {
		this.commission = commission;
	}

	public ArrayList<Dirigente> getLeaders() {
		return leaders;
	}

	public void setLeaders(ArrayList<Dirigente> leaders) {
		this.leaders = leaders;
	}
	
	@Override
	public int getHowManyMembers() {
		return players.size();
	}
	
	@Override
	public int getOldestPlayer() {
		Jogador jogadorMaisVelho = new Jogador();
		int idadeMaisVelha = jogadorMaisVelho.getIdade();
		
		for (Jogador jogador : players) {
			if (jogador.getIdade() > idadeMaisVelha) {
				idadeMaisVelha = jogador.getIdade();
				jogadorMaisVelho = jogador;
			}
		}
		return jogadorMaisVelho.getNumber();
	}
	
	@Override
	public int getYoungestPlayer() {
		Jogador jogadorMaisNovo = new Jogador();
		int idadeMaisNova = jogadorMaisNovo.getIdade();
		
		for (Jogador jogador : players) {
			if (jogador.getIdade() < idadeMaisNova) {
				idadeMaisNova = jogador.getIdade();
				jogadorMaisNovo = jogador;
			}
		}
		return jogadorMaisNovo.getNumber();
	}
	
	@Override
	public double getAverageAge() {
		int soma = 0;
		
		for (Jogador jogador : players) {
			soma += jogador.getIdade();
		}
		
		return soma / players.size();
	}
	
	@Override
	public String getPlayer(int number) {

		for (Jogador jogador : players) {
			if (jogador.getNumber() == number) {
				return "Nome: " + jogador.getName() 
				+ "\nApelido: " + jogador.getNickName()
				+ "\nAltura: " + jogador.getHeight()
				+ "\nPeso: " + jogador.getWeight()
				+ "\nData de nascimento: " + jogador.getBirthDate()
				+ "\nIdade: " + jogador.getIdade()
				+ "\nPosi��o" + jogador.getPosition()
				+ "\nClube atual: " + jogador.getCurrentClub();
			}
		}
		
		return "Jogador não encontrado.";
	}
	
	@Override
	public String getPressOfficerContacts() {
		String pressOfficerContacts = "";
		
		for (Dirigente dirigente : leaders) {
			pressOfficerContacts += dirigente.getEmail() + "\n";
		}
		
		return pressOfficerContacts;
	}
	
	@Override
	public String getCountryName() {
		return this.name;
	}
	
	@Override
	public Image getFlagImage() {
		File bandeira = new File("/Brasil/src/module_brasil/bandeira.jpg");
		Image imagemBandeira = null;
		
		try {
			imagemBandeira = ImageIO.read(bandeira);
			
			return imagemBandeira;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public Path getTechnicalCommittee() {
		Path path = Paths.get("/CopaMundo/src/ComissaoTecnica.java");
		
		return path;
	}

	@Override
	public NationalTeamStats getStatsResponsible() {
		// TODO Auto-generated method stub
		return null;
	}
}
