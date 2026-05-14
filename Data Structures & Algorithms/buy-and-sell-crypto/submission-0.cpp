class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int buy = 0;
        for (int i = 0; i < prices.size(); i++) {
            for (int j = i; j < prices.size(); j++) {
                if (i == j) {
                    continue;
                }
                else {
                    int diff = prices[j] - prices[i];
                    if (diff > 0) {
                        if (buy <= diff) {
                            buy = diff;
                        }
                    }
                }
            }
        }
        return buy;
    }
};
