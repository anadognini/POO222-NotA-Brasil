package module_brasil;

import java.time.LocalDate;
//NÃO FAZ SENTIDO ESSAS VARIÁVEIS
//IDEIA:
//CRIAR CLASSE PESSOA E ADICIONAR ELAS COMO MENBROS DA COMISSÃO TÉCNICA
//ACHO QUE TEM QUE SALVAR ALGO EM JSON PARA A FUNÇÃO "getPressOfficerContacts" DA CLASS "BRASIL"
//VER COMO SALVAR ISSO EM JSON ACHO QUE SÃO O NOME DOS PARTICIPANTES DA COMISSÃO
public class ComissaoTecnica {
	private String name;
	private String nickName;
	private String function;
	private LocalDate birthDate;
	
	
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
	
	public String getFunction() {
		return function;
	}
	
	public void setFunction(String function) {
		this.function = function;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public int getIdade() {
		return LocalDate.now().compareTo(birthDate);
	}
}
