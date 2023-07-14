package heloo;

import java.awt.*;

public class Moto {
    private int x;
    private int y;
    private int largura;
    private int altura;
    private Color cor;
    private int velocidade;

    public Moto(int x, int y, int largura, int altura, Color cor, int velocidade) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
        this.cor = cor;
        this.velocidade = velocidade;
    }

    public void atualizar() {
        x -= velocidade; // Atualiza a posição x para mover a moto para a esquerda

        // Verifica se a moto saiu da tela pela esquerda
        if (x + largura < 0) {
            // Reposiciona a moto na parte direita da tela
            x = getWidth();
        }
    }

    private int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void desenhar(Graphics g) {
        g.setColor(cor);
        g.fillRect(x, y, largura, altura);
    }

	public void desenhar(java.awt.Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(cor);
        g.fillRect(x, y, largura, altura);
	}
}
