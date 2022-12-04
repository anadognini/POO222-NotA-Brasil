package module_brasil;

import java.util.ArrayList;

import fifa.NationalTeamStats;

public class Stats implements NationalTeamStats {
	private int questions;
	private ArrayList<Integer> callsToPlayer;
	
	@Override
	//É UM CONTADOR PRA "getHowManyCallsToPlayer" ??
	//TERIA QUE SER ESPECÍFICO POR JOGADOR ??
	public int getHowManyQuestions() {
		return questions;
	}

	@Override
	//TERIA QUE TER A CLASS PLAYERS AQUI TAMBÉM PARA PERGUNTAR A UM JOGADOR
	//ESPECIFICO QUANTAS VEZES ELE FOI CHAMADO
	public String getHowManyCallsToPlayer(int number) {
		String calls = "" + callsToPlayer.size();
		
		return calls;
	}
}
