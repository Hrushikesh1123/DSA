package observerPattern;

import java.util.ArrayList;

public interface MarketInterface  {

    void registerInvestor(Investor investor);

    void removeInvestor(Investor investor);

    void notifyUpdatedStocks();

}
