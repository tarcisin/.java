package conta;

public class Conta {
  int idNumber;
  int balance;

  Conta(int idNumber, int balance)
  {
    this.idNumber = idNumber;
    this.balance = balance;
  }

  int balReturn()
  {
    return balance;
  }
  
  public int getIdNumber()
  {
    return idNumber;
  }

  public void setIdNumber() 
  {
    this.idNumber = idNumber;
  }

  public int getBalance()
  {
    return balance;
  }

  public void setBalance() 
  {
    this.balance = balance;
  }



}
