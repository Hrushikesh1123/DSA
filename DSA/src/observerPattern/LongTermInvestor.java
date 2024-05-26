package observerPattern;

import java.util.ArrayList;

public class LongTermInvestor implements Investor,DisplayInterface {

    private ArrayList<Stocks>stocks;
    @Override
    public void updatedData(ArrayList<Stocks> stocks) {
        this.stocks=stocks;
    }

    @Override
    public void showStocksData() {

        System.out.println("showing data for long term Investor with current stocks");
        for(Stocks stock:stocks){
            System.out.println(stock.getStockName()+"," +stock.getCurrentStockPrice()+ ","+stock.getRecentStockPrice() +","+ stock.getLastMonthStockPrice());

        }
    }
}
