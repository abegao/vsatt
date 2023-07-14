package heloo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Pista extends JPanel{
	
	private int comprimento=250;
    private int largura=250;
	private Carro carro;
	private Caminhao caminhao;
	//private RuaTransversal ruaTransversal;
	private Carro[] carros;
	private Moto[] motos;
	//private RuaVertical ruaVertical;

    public Pista(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
        setBackground(Color.WHITE);
        carros = new Carro[2];
        motos = new Moto[2];
        motos[0] = new Moto(getWidth(), 100, 50, 30, Color.BLUE, 3);
        motos[1] = new Moto(getWidth(), 200, 50, 30, Color.RED, 5);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(0, 0, comprimento, largura);

        for (Carro carro : carros) {
            if (carro != null) {
                carro.desenhar(g);
            }
        }
        if (caminhao != null) {
            caminhao.desenhar(g);
        }
        for (Moto moto : motos) {
            if (moto != null) {
                moto.desenhar(g);
            }
            
        }
   //     ruaTransversal.desenhar(g);
     //   ruaVertical.desenhar(g);
    }
    
    
    public void addCarro(Carro carro) {
        if (carros[0] == null) {
            carros[0] = carro;
        } else if (carros[1] == null) {
            carros[1] = carro;
        }
    }
    
    public void addMoto ( Moto moto ) {
    	if (motos[0] == null) {
    		motos[0] = moto;
    	} else if (motos[1] == null ) {
    		motos[1] = moto;
    	}
    }

    public void atualizarPosicaoCarro() {
        for (Carro carro : carros) {
            if (carro != null) {
                if (carro.isParado()) {
                    if (carro.tempoParadoExpirou()) {
                        carro.reiniciarMovimento(); // Reinicia o movimento do carro
                    } else {
                        continue; // Pula para o próximo carro
                    }
                }
                carro.mover(5); // Move o carro 5 pixels para a direita
                if (carro.chegouNoLimite()) {
                    carro.parar(); // Para o carro quando chegar no limite
                }
            }
        }
	        

	        if (caminhao != null) {
	            caminhao.mover(3); // Move o caminhão 3 pixels para a direita
	        }
	        for (Moto moto : motos) {
	            if (moto != null) {
	                moto.atualizar();
	            }
	        }
	    }
	    
	public void addCaminhao(Caminhao caminhao) {
		// TODO Auto-generated method stub
		this.caminhao = caminhao;
	}
/*	public void addRuaTransversal(RuaTransversal ruaTransversal) {
		// TODO Auto-generated method stub
		this.ruaTransversal = ruaTransversal;
	}
	public void ruaVertical(RuaVertical ruaVertical) {
		// TODO Auto-generated method stub
		this.ruaVertical = ruaVertical;
	}
  */
}
