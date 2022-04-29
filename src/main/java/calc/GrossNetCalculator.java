package calc;

import java.math.BigInteger;
public class GrossNetCalculator {

  public BigInteger gross;
  public BigInteger net;
  public BigInteger vat;
  public BigInteger percentage;
  
  
  public void calculate(){
    vat = gross.subtract(gross.multiply(BigInteger.valueOf(10000)).divide(percentage.add(BigInteger.valueOf(10000))));
    net = gross.subtract(vat);
  }

  public BigInteger getGross() {
    return gross;
  }
  
  public BigInteger getNet() {
    return net;
  }

  public BigInteger getVAT() {
    return vat;
  }

  public BigInteger getPercentage() {
    return percentage;
  }

  public void setGross(BigInteger gross) {
    this.gross = gross.multiply(BigInteger.valueOf(100));
  }
  
  public void setNet(BigInteger net) {
    this.net = net;
  }
  
  public void setVAT(BigInteger vat) {
    this.vat = vat;
  }
  
  public void setPercentage(BigInteger percentage) {
    this.percentage = percentage.multiply(BigInteger.valueOf(100));
  }

}
