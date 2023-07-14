package heloo;

import java.awt.*;
import java.awt.Graphics;

public class Caminhao {
    private int x;
    private int y;
    private Color cor;
    private int velocidade;

    public Caminhao(int x, int y, Color cor, int velocidade) {
        this.x = x;
        this.y = y;
        this.cor = cor;
        this.velocidade = velocidade;
    }

    public void mover(int distancia) {
    	 y -= velocidade; // Atualiza a posição y para mover o caminhão para cima

    	    // Verifica se o caminhão atingiu o topo da tela
    	    if (y + 1800 < 0) {
    	        // Reposiciona o caminhão na parte inferior da tela
    	        y = getHeight();
    	    }
    }

    private int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void desenhar(Graphics g) {
        g.setColor(cor);
        g.fillRect(x, y, 40, 80);
    }
}
