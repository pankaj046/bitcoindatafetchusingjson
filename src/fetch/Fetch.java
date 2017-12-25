package fetch;

import org.json.JSONException;
import org.json.JSONObject;

class data{
    public String sData;
    JSONObject data, ob;
    public data(){
        FetchData fd = new FetchData();
        fd.getURLContent("https://blockchain.info/ticker");
        sData = fd.getString;
        String main[]= {"USD", "AUD", "BRL", "CAD", "CHF", "CLP", "CNY", "DKK", 
                        "EUR", "GBP", "HKD", "INR", "ISK", "JPY", "KRW", "NZD",
                        "PLN", "RUB", "SEK", "SGD", "THB", "TWD"};
        try 
        {
            if(sData!= null){
                data= new JSONObject(sData);
                //System.out.println(data.getJSONObject("USD")); //Data is printed
                for(int i=0; i<22; i++)
                {
                    ob = data.getJSONObject(""+main[i]);
                    System.out.println("Data Fetching : "+main[i]);
                    String m1 = ob.getString("symbol");
                    System.out.println("symbol : "+m1);

                    double m2 = ob.getDouble("last");
                    System.out.println("last : "+m2); 

                    double m3 = ob.getDouble("buy");
                    System.out.println("buy : "+m3); 

                    double m4 = ob.getDouble("sell");
                    System.out.println("sell : "+m4); 


                    double m5 = ob.getDouble("15m");
                    System.out.println("15m : "+m5); 
                    
                    System.out.println("--------------------------------------------------"); 
                    
                }
            }
        } 
        catch (JSONException e) 
        {
             
        }
    }
        
}
public class Fetch {
    public static void main(String[] args) {
        
        data ob = new data();
    }
    
}
