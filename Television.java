public class Television {
                        
    
  private String manufacturer; 
  private int screensize;
  
  
  boolean powerOn;
  int channel;     
  int volume ;     
  
  
  public Television(String brand, int size) 
  {
    manufacturer = brand;
    screensize = size;
    powerOn = false;
    volume = 20;
    channel = 2;
  }
  public int getVolume() //  volume
  { 
    return volume;        
  }
  public int getChannel() //  channel
  { 
    return channel;       
  }
  public String getManufacturer() //  manufacturer
  { 
    return manufacturer;  
  }
  public int getScreenSize() // screen size
  { 
    return screensize;    
  }
  public void setChannel(int choosechannel) // set  TV channel
  { 
    channel = choosechannel;
  }
  public void power() // power on and off
  {
    powerOn = !powerOn;
  }
  public void increaseVolume() // increase the volume
  {
    volume = volume + 1;
  }
  public void decreaseVolume() // decrease the volume
  {
    volume = volume - 1;
  }
}
