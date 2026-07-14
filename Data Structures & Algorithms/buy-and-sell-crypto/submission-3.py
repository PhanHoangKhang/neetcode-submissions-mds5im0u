class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left = 0
        maxProfit = 0

        for right in range(1, len(prices)):
            profit = prices[right] - prices[left]

            if prices[right] >= prices[left]:
                maxProfit = max(maxProfit, profit)
            else:
                left = right
                
        return maxProfit
