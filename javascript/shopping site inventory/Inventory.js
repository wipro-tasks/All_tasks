const inventory = (function () {
    let stock = 0; 
    return {
        getStock: function () {
            return stock;
        },
        addStock: function (quantity) {
            stock += quantity;
            console.log(`${quantity} items added. Current stock: ${stock}`);
        },
        sell: function (quantity) {
            if (quantity <= stock) {
                stock -= quantity;
                console.log(`${quantity} items sold. Current stock: ${stock}`);
            } else {
                console.log("Insufficient stock");
            }
        }
    };
})();
inventory.addStock(10); 
inventory.sell(3);      
console.log(`Final Stock: ${inventory.getStock()}`);