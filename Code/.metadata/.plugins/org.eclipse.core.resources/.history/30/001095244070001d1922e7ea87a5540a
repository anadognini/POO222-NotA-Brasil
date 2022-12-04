package module_brasil;

import java.awt.Image;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fifa.NationalTeamInfos;
import fifa.NationalTeamStats;
//ADICIONAR JOGADORES

public class Brasil implements NationalTeamInfos {
	private String CountryName = "BRASIL";
	private ArrayList<Jogador> players = new ArrayList<>();
	private ArrayList<ComissaoTecnica> commission = new ArrayList<>();
	private ArrayList<Dirigente> leaders = new ArrayList<>();
	
	
	public void geraJogadores(int number, String name, String nickName, double height, double weight, LocalDate birthDate, 
			String position, String currentClub) {
		Jogador jogador1 = new Jogador();
		jogador1.setName(name);
		jogador1.setNickName(nickName);
		jogador1.setNumber(number);
		jogador1.setBirthDate(birthDate);
		jogador1.setHeight(height);
		jogador1.setPosition(position);
		jogador1.setWeight(weight);
		jogador1.setCurrentClub(currentClub);
		players.add(jogador1);
	}
	
	public void geraComissaoTecnica() {
		
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
		
		return null;
	}
	
	@Override
	public String getPressOfficerContacts() {
		//ACHO QUE ESTÁ ERRADO,
		//TEM QUE RETORNAR JSON, E A COMISSÃO TÉCNICA NÃO FAZ SENTIDO, TEM DATA DE ANIVERSÁRIO PQ ??
		//COMISSÃO TÉCNICA PRECISA SER FORMADA POR PESSOAS, ELA NÃO TEM DATA DE ANIVERSÁRIO ESPECIFICA
		//TALVEZ CRIAR A CLASS PESSOAS E USAR EXTENDS EM JOGAR E UTILIZAR EM MENBROS DA COMISSÃO TÉCNICA
		String pressOfficerContacts = "";
		
		for (Dirigente dirigente : leaders) {
			pressOfficerContacts += dirigente.getEmail() + "\n";
		}
		
		return pressOfficerContacts;
	}
	
	@Override
	public String getCountryName() {
		return this.CountryName;
	}
	
	@Override
	public Image getFlagImage() {
		URL bandeira = Brasil.class.getResource("bandeira.jpg");
		Image imagemBandeira = null;
		
		try {
			imagemBandeira = ImageIO.read(bandeira);
			System.out.println(imagemBandeira.toString());
			return imagemBandeira;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public Path getTechnicalCommittee() {
		//CRIAR UM JSON COM OS MENBROS DA COMISÃO TÉCNICA E AI CHAMAR ESTÁ ROTA
		//ANTES CORRIGIR E ADICIONAR MEMBROS A COMISSÃO TÉCNICA
		Path path = Paths.get("/CopaMundo/src/ComissaoTecnica.java");
		
		return path;
	}

	@Override
	public NationalTeamStats getStatsResponsible() {
		//MÉTODO PARA RETORNAR O OBJETO QUE RESPONDE PELAS 
		//ESTAT�STICAS DE CONSULTA - INTERFACE NATIONALTEAMSTATS. ???
		// TODO Auto-generated method stub
		return null;
	}
	
	public Brasil() {
		geraJogadores(01,"Alysson", "Ali", 1.93, 90, LocalDate.of(1992, 10, 2), "Goleiro", "Liverpool");//FAZER MAIS 10
	}
	
	
	public static void main(String[] args) {
		new Brasil();
	}
}
