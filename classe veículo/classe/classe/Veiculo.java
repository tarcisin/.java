package classe;

public class Veiculo {
  private String tipo;
  private String marca;
  private String modelo;
  private String cor;
  private String id;
  private String fonteDeEnergia;
  private int totalCombustivel;
  private int potencia;

  public Veiculo(String tipo, String marca, String modelo, String cor, String id, String fonteDeEnergia, int totalCombustivel, int potencia)
  {
    this.tipo = tipo;
    this.modelo = modelo;
    this.id = id;
    this.marca = marca;
    this.cor = cor;
    this.fonteDeEnergia = fonteDeEnergia;
    this.totalCombustivel = totalCombustivel;
    this.potencia = potencia;
  }

	public boolean ligarVeiculo(int qtdCombustivel) {
		if (qtdCombustivel != 0) {
    return true;
		}
		return false;
	}

  public String getTipo()
  {
    return tipo;
  }


  public void setMarca(String marca)
  {
    this.marca = marca;
  }


  public void setTipo(String tipo)
  {
    this.tipo = tipo;
  }

  public String getModelo() 
  {
    return modelo;
  }

  public void setModelo(String modelo)
  {
    this.modelo = modelo;
  }

  public String getCor()
  {
    return cor;
  }

  public void setCor(String cor)
  {
    this.cor = cor;
  }

  public String getFonteDeEnergia()
  {
    return fonteDeEnergia;
  }

  public void setFonteDeEnergia(String fonteDeEnergia)
  {
    this.fonteDeEnergia = fonteDeEnergia;
  }

  public int getPotencia()
  {
    return potencia;
  }

  public void setPotencia(int potencia)
  {
    this.potencia = potencia;
  }

  public int getTotalCombustivel()
  {
    return totalCombustivel;
  }

  public void setTotalCombustivel(int totalCombustivel)
  {
    this.totalCombustivel = totalCombustivel;
  }


  public String toString()
  {
    return "Veículo: \n" + marca + " " + tipo + " " + modelo + "\nCor: " + cor + " Identificação: " + id + "\nPotência: " + potencia + "\nAbastecimento energético: " + fonteDeEnergia + " " + totalCombustivel; 
  }

}

