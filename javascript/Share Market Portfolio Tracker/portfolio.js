function createPortfolioTracker() {
  const portfolio = [];

  function buyShare(company, quantity, price) {
    const index = portfolio.findIndex(share => share.company === company);
    if (index !== -1) {
      portfolio[index].quantity += quantity;
      portfolio[index].price = price;
    } else {
      portfolio.push({ company, quantity, price });
    }
    console.log(`Bought ${quantity} shares of ${company} at ₹${price} each.`);
  }

  function sellShare(company, quantity) {
    const index = portfolio.findIndex(share => share.company === company);
    if (index === -1) {
      console.log(`No shares of ${company} found to sell.`);
      return;
    }
    if (portfolio[index].quantity < quantity) {
      console.log(`Not enough shares of ${company} to sell.`);
      return;
    }
    portfolio[index].quantity -= quantity;
    console.log(`Sold ${quantity} shares of ${company}.`);
    if (portfolio[index].quantity === 0) {
      portfolio.splice(index, 1);
    }
  }

  function totalValue() {
    let total = 0;
    for (const share of portfolio) {
      total += share.quantity * share.price;
    }
    return total;
  }

  return {
    buyShare,
    sellShare,
    totalValue,
  };
}

// Test the portfolio tracker
const myPortfolio = createPortfolioTracker();

myPortfolio.buyShare('TCS', 10, 3500);
myPortfolio.buyShare('Infosys', 5, 1500);
myPortfolio.sellShare('TCS', 3);

console.log(`Portfolio Value: ₹${myPortfolio.totalValue()}`);
