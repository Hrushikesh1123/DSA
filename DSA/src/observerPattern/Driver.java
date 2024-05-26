package observerPattern;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        //lets add the stocks in the market
        ArrayList<Stocks>stocks=new ArrayList<>();
        Stocks stock=new Stocks();
        stock.setStockName("apple");
        stock.setCurrentStockPrice("100");
        stock.setLastMonthStockPrice("200");
        stock.setRecentStockPrice("65");
        stocks.add(stock);
        //lets open the market and add all the stocks
        Market market = new Market(stocks);
        //lets add the investor in the market
        Investor trader=new Trader();
        market.registerInvestor(trader);
        trader.showStocksData();
        Investor longTermInvestor=new LongTermInvestor();

        market.registerInvestor(longTermInvestor);
        longTermInvestor.showStocksData();
        market.removeInvestor(trader);


    }
}
