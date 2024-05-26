package observerPattern;

public class Stocks
{
    private String stockName;
    private String currentStockPrice;
    private String lastMonthStockPrice;

    private String recentStockPrice;

    public void setCurrentStockPrice(String currentStockPrice) {
        this.currentStockPrice = currentStockPrice;
    }

    public void setLastMonthStockPrice(String lastMonthStockPrice) {
        this.lastMonthStockPrice = lastMonthStockPrice;
    }

    public void setRecentStockPrice(String recentStockPrice) {
        this.recentStockPrice = recentStockPrice;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockName(){
        return stockName;
    }
    public String getCurrentStockPrice() {
        return currentStockPrice;
    }

    public String getRecentStockPrice(){
        return recentStockPrice;
    }

    public String getLastMonthStockPrice(){
        return lastMonthStockPrice;
    }
}
