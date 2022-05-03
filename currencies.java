import java.util.List;

public class currencies implements ICryptos{
    int value;
    String name;
    int volume;
    int maxVolatility;
    public currencies(int value, String name,  int volume, int maxVolatility){
        this.value = value;
        this.name = name;
        this.volume = volume;
        this.maxVolatility = maxVolatility;
    }
    public int getMaxVolatility() {
        return maxVolatility;
    }
    public void setMaxVolatility(int maxVolatility) {
        this.maxVolatility = maxVolatility;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    

    //public int getPrice(String name){
       // double newVal = cryptos.get(cryptos.indexOf(name)).getValue()*Math.random()*cryptos.get(cryptos.indexOf(name)).getMaxVolatility();
    //}
    //public int getVol(String name){
     //   return cryptos.get(cryptos.indexOf(name)).getVolume();
    //}
}
