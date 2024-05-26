package observerPattern;

import java.util.ArrayList;

public class Trader implements Investor{

    //since he is the trader i will show recentData;
    private ArrayList<Stocks>stocks;
    @Override
    public void updatedData(ArrayList<Stocks> stocks) {
        this.stocks=stocks;

    }

    @Override
    public void showStocksData() {
        System.out.println("showing data for trader with current stocks");
        for(Stocks stock:stocks){
            System.out.println(stock.getStockName()+"," +stock.getCurrentStockPrice()+ ","+stock.getRecentStockPrice());

        }
    }
}
