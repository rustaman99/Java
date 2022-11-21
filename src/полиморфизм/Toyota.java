package полиморфизм;

public class Toyota extends Car{
    int getNumOfSeets =2;
  @Override // переопредление метода
  public int getNumOfSeets(){
      return numOfSeets;
    }
    }
