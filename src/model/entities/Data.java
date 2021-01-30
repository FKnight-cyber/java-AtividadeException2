package model.entities;

import model.exceptions.DataException;

public class Data {
	private Integer dia;
	private Integer mes;
	private Integer ano;
	
	public Data() {
	}
	
	public Data(Integer dia, Integer mes, Integer ano) throws DataException {
		if(ano < 1) {
			throw new DataException("Ano inválido");
		}else if(mes < 1 || mes > 12) {
			throw new DataException("Mês inválido\n");
		}else if(mes == 1 && (dia < 1 || dia > 31)) {
			throw new DataException("Dia inválido\n");
		}else if(mes == 2 && (dia < 1 || dia > 29)) {
			throw new DataException("Dia inválido\n");
		}else if(mes == 3 && (dia < 1 || dia > 31)) {
			throw new DataException("Dia inválido\n");
		}else if(mes == 4 && (dia < 1 || dia > 30)) {
			throw new DataException("Dia inválido\n");
		}else if(mes == 5 && (dia < 1 || dia > 31)) {
			throw new DataException("Dia inválido\n");
		}else if(mes == 6 && (dia < 1 || dia > 30)) {
			throw new DataException("Dia inválido\n");
		}else if(mes == 7 && (dia < 1 || dia > 31)) {
			throw new DataException("Dia inválido\n");
		}else if(mes == 8 && (dia < 1 || dia > 31)) {
			throw new DataException("Dia inválido\n");
		}else if(mes == 9 && (dia < 1 || dia > 30)) {
			throw new DataException("Dia inválido\n");
		}else if(mes == 10 && (dia < 1 || dia > 31)) {
			throw new DataException("Dia inválido\n");
		}else if(mes == 11 && (dia < 1 || dia > 30)) {
			throw new DataException("Dia inválido\n");
		}else if(mes == 12 && (dia < 1 || dia > 31)) {
			throw new DataException("Dia inválido\n");
		}else
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
	
}
