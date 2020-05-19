package controllers;

import java.util.Random;

import javax.swing.JTextField;

import model.Dados;

public class CassinoControllerThread extends Thread{
	private Dados dado;
	private JTextField campoDados[];
	private JTextField _1lugar;
	private JTextField _2lugar;
	private JTextField _3lugar;
	private int player;
	private int pontos;
	
	public CassinoControllerThread(JTextField [] campoDados, int player, JTextField _1lugar, JTextField _2lugar,
			JTextField _3lugar) {
		dado = new Dados();
		pontos = 0;
		this._1lugar = _1lugar;
		this._2lugar = _2lugar;
		this._3lugar = _3lugar;
		this.player = player;
		this.campoDados = new JTextField [20];
		for(int i=0; i<20; i++) {
			this.campoDados[i] = campoDados[i];
		}
	}
	
	@Override
	public void run(){
		Rolagem();
	}
	
	public void Rolagem() {
		Random randomRoll = new Random();
		Random randomN = new Random();
		boolean verifC = false;
		while(!VerifAcabou() && !verifC) {
			int t = randomRoll.nextInt(120);
			for(int i=0; i<=t; i++) {
				dado.setDado1(randomN.nextInt(6)+1);
				campoDados[player].setText(""+dado.getDado1());
				dado.setDado2(randomN.nextInt(6)+1);
				campoDados[player+10].setText(""+dado.getDado2());
			}
			dado.setSoma(dado.getDado1()+dado.getDado2());
			Verif();
			verifC = VerifChampion();
			try {
				sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void Verif() {
		if(dado.getSoma() == 7 || dado.getSoma() == 11) {
			pontos++;
		}
	}
	
	public boolean VerifAcabou() {
		if(!this._1lugar.getText().isEmpty() && !this._2lugar.getText().isEmpty() && 
				!this._3lugar.getText().isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean VerifChampion() {
		if(pontos == 5) {
			if (this._1lugar.getText().isEmpty()) {
				this._1lugar.setText("Jogador " + (player+1));
			}else if(this._2lugar.getText().isEmpty()) {
				this._2lugar.setText("Jogador " + (player+1));
			}else if(this._3lugar.getText().isEmpty()) {
				this._3lugar.setText("Jogador " + (player+1));
			}
			return true;
		}else {
			return false;
		}
	}
}
