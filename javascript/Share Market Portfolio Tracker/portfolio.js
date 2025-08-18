function createPortfolioTracker() {
    let portfolio = [];
    function buyShare(company, quantity, pricePerShare) {
        portfolio.push({ company, quantity, pricePerShare });
        console.log(`Bought ${quantity} shares of ${company} at ₹${pricePerShare} each`);
    }
    function sellShare(company, quantity) {
        let found = false;
        for (let share of portfolio) {
            if (share.company === company) {
                if (share.quantity >= quantity) {
                    share.quantity -= quantity;
                    console.log(`Sold ${quantity} shares of ${company}`);
                } else {
                    console.log(`Not enough shares to sell for ${company}`);
                }
                found = true;
                break;
            }
        }
        if (!found) {
            console.log(`No shares found for ${company}`);
        }
    }
    function totalValue() {
        let total = 0;
        for (let share of portfolio) {
            total += share.quantity * share.pricePerShare;
        }
        console.log(`Portfolio Value: ₹${total}`);
    }
    return {
        buyShare,
        sellShare,
        totalValue
    };
}
const myPortfolio = createPortfolioTracker();
myPortfolio.buyShare("wipro", 10, 3900);
myPortfolio.buyShare("Infosys", 5, 1900);
myPortfolio.sellShare("wipro", 2);
myPortfolio.totalValue();



//index.html
<!DOCTYPE html>
<html>
<head>
    <title>Portfolio Tracker</title>
</head>
<body>
    <script src="External.js"></script>
</body>
</html>
