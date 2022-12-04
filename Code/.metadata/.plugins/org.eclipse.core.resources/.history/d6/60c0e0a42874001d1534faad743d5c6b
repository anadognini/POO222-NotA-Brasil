package module_brasil;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import com.google.gson.Gson;

import fifa.NationalTeamInfos;
import fifa.NationalTeamStats;
//ADICIONAR JOGADORES

public class Brasil implements NationalTeamInfos, NationalTeamStats {
	private String CountryName = "BRASIL";
	private ArrayList<Jogador> players = new ArrayList<>();
	private ArrayList<ComissaoTecnica> commission = new ArrayList<>();
	private ArrayList<Dirigente> leaders = new ArrayList<>();
	public int vezesChamada = 0;
	
	
	public void geraJogadores(int number, String name, String nickName, double height, double weight, LocalDate birthDate, String position, String currentClub) {
		
		
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
	
	public void geraComissaotecnica(String name, String nickName, String function, LocalDate birthDate) {
		ComissaoTecnica comissao = new ComissaoTecnica();
		comissao.setBirthDate(birthDate);
		comissao.setFunction(function);
		comissao.setName(name);
		comissao.setNickName(nickName);
		commission.add(comissao);
		
	}
	
	public void geraDirigentes() {//FAZER
		Dirigente dirigente = new Dirigente();
		dirigente.setEmail(CountryName);
		dirigente.setName(CountryName);
		dirigente.setTell1(CountryName);
		dirigente.setTell2(CountryName);
		leaders.add(dirigente);
		
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
		vezesChamada++;
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
		vezesChamada++;
		Jogador jogadorMaisNovo = new Jogador();
		int idadeMaisNova = Integer.MAX_VALUE;
		
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
		vezesChamada++;
		int soma = 0;
		
		for (Jogador jogador : players) {
			soma += jogador.getIdade();
		}
		
		return (soma / players.size());
	}
	
	@Override
	public String getPlayer(int number) {
		vezesChamada++;
		for (Jogador jogador : players) {
			if (jogador.getNumber() == number) {
				jogador.setVezesChamada();
				return new Gson().toJson(jogador);
			}
		}
		
		return null;
	}
	
	@Override
	public String getPressOfficerContacts() {
		vezesChamada++;
		String pressOfficerContacts = "";
		
		for (Dirigente dirigente : leaders) {
			pressOfficerContacts += dirigente.getEmail() + "\n";
		}
		
		return pressOfficerContacts;
	}
	
	@Override
	public String getCountryName() {
		vezesChamada++;
		return this.CountryName;
	}
	
	@Override
	public Image getFlagImage() {
		vezesChamada++;
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
		vezesChamada++;
		
		return Paths.get("/Brasil/src/module_brasil/comissao.json");
		
	}

	@Override
	public NationalTeamStats getStatsResponsible() {		
		return this;
	}
	
	
	
	public Brasil() {
		geraJogadores(01,"Alysson", "Ali", 1.93, 90, LocalDate.of(1992, 10, 2), "Goleiro", "Liverpool");
		geraJogadores(3, "Thiago Emiliano da Silva", "Thiago Silva", 1.83, 77, LocalDate.of(1984, 9, 22), "Zagueiro", "Chelsea");
		geraJogadores(4, "Marcos Aoás Corrêa", "Marquinhos", 1.83, 73, LocalDate.of(1994, 05, 14), "Zagueiro", "Paris Saint-Germain");
		geraJogadores(5, "Carlos Henrique Casimiro", "Casemiro", 1.85, 81, LocalDate.of(1992, 02, 23), "Volante", "Manchester United");
		geraJogadores(7, "Rodinei Marcelo de Almeida", "Rodinei", 1.75, 78, LocalDate.of(1992, 02, 29), "Lateral-direito", "Flamengo");
		geraJogadores(8, "Guilherme Antonio Arana Lopes", "Arana", 1.76, 68, LocalDate.of(1997, 14, 04), "Lateral-esquerdo", "Atlético Mineiro");
		geraJogadores(9, "Richarlison de Andrade", "Richarlison", 1.84, 83, LocalDate.of(1997, 05, 10), "Atacante", "Tottenham");
		geraJogadores(10, "Neymar da Silva Santos Júnior", "Neymar", 1.75, 68, LocalDate.of(1992, 02, 05), "Atacante", "Paris Saint-Germain");
		geraJogadores(11, "Vinícius José Paixão de Oliveira Júnior", "Vinícius Júnior", 1.72, 63, LocalDate.of(2000, 2, 24), "Ponta", "Manchester United");
		geraJogadores(16, "Lucas Paquetá", "Paquetá", 1.80, 72, LocalDate.of(1997, 8, 27), "Meio-campista", "West Ham");
		geraJogadores(17, "Bruno Guimarães Rodrigues Moura", "Bruno Guimarães", 1.82, 74, LocalDate.of(1997, 11, 16), "Volante", "Newcastle United");
		
		geraComissaotecnica("Adenor Leonardo Bachi", "Tite", "Técnico", LocalDate.of(1961, 7, 5));
		geraComissaotecnica("Oswaldo Giroldo Júnior", "Juninho", "Coordenador", LocalDate.of(1973, 8, 2));
		geraComissaotecnica("Guilherme Passos", "Guilherme", "Fisioterapeuta", LocalDate.of(1987, 1, 9));
	}
	
	
	
	@Override
	public int getHowManyQuestions() {
		return vezesChamada;
	}

	@Override
	public String getHowManyCallsToPlayer(int number) {
		for (Jogador jogador : players) {
			if (jogador.getNumber() == number) {
				return String.valueOf(jogador.getVezesChamada());
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		new Brasil();
	}
}
