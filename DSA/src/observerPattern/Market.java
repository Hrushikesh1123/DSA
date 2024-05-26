package observerPattern;

import java.util.ArrayList;

public class Market implements MarketInterface {

    private ArrayList<Stocks> stocks;
    private ArrayList<Investor>investors;



    Market(ArrayList<Stocks> stocks){
        this.stocks=stocks;
        investors=new ArrayList<>();
    }

    @Override
    public void registerInvestor(Investor investor) {
        investors.add(investor);
        notifyUpdatedStocks();
    }

    @Override
    public void removeInvestor(Investor investor) {
        investors.remove(investor);

    }

    @Override
    public void notifyUpdatedStocks() {
        for(Investor investor:investors){
         investor.updatedData(stocks);
        }

    }

    public void updateStockData(ArrayList<Stocks> stocks) {
        this.stocks=stocks;
        notifyUpdatedStocks();

    }
}
