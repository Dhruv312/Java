// Context:
// You are working for a retail company that has multiple stores. Each store records its sales data, which includes the sales amount and the date of the sale. Your task is to write a Java program that aggregates the sales data to provide insights such as total sales, average sales per day, and total sales for each store.

// Requirements:
// 1. Create a `Store` class that contains a list of `Sale` objects. Each `Sale` object should have attributes such as `date` (of type `LocalDate`) and `amount` (of type `double`).
// 2. Write methods in the `Store` class to:
//    - Calculate the total sales for the store.
//    - Calculate the average sales per day for the store.
//    - Group sales data by month and calculate the total sales for each month.
// 3. Write a `RetailCompany` class that contains a list of `Store` objects.
// 4. Write methods in the `RetailCompany` class to:
//    - Calculate the total sales for the company.
//    - Calculate the average sales per store.
//    - Find the store with the highest total sales.

// Example Usage:
import java.time.LocalDate;
import java.time.Month;

class Sale {
    LocalDate setdate;
    double amount;

    public Sale(LocalDate setdate, double amount) {
        this.setdate = setdate;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getSetDate() {
        return setdate;
    }
}

class Store {
    Sale sale[];
    int capacity;
    int salesCount;

    public Store() {
        capacity = 10;
        sale = new Sale[capacity];
        salesCount = 0;
    }

    void addSale(Sale sale1) {
        if (salesCount <= capacity) {
            sale[salesCount] = sale1;
            salesCount++;
        } else {
            System.out.println("Invelid");
        }
    }

    public double total_sales() {
        double totalSale = 0.0;
        for (int i = 0; i < salesCount; i++) {
            totalSale += sale[i].getAmount();
        }
        return totalSale;
    }

    public double getAverageSalesPerDay() {
        if (salesCount == 0) {
            return 0;
        }
        LocalDate uniqueDates[] = new LocalDate[salesCount];
        int uniqueCount = 0;
        int numDay = 0;
        double totalSales = total_sales();
        for (int i = 0; i < salesCount; i++) {
            Sale sales = sale[i];
            if (sales == null)
                continue;

            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueDates[j] != null && uniqueDates[j].equals(sales.getSetDate())) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueDates[uniqueCount++] = sales.getSetDate();
                numDay++;
            }
        }

        return totalSales / numDay;
    }

    int[] getMonthlySales() {
        int monthSales[] = new int[12];
        for (int i = 0; i < salesCount; i++) {
            Month month = sale[i].getSetDate().getMonth();
            monthSales[month.getValue() - 1] += sale[i].getAmount();
        }
        for (int j = 0; j < monthSales.length; j++) {
            if (monthSales[j] != 0) {
                System.out.println("Monthly Sales " + (j + 1) + ": " + monthSales[j]);
            }
        }

        return monthSales;
    }

}

class RetailCompany {
    Store store[];
    int capacity;
    int storeCount;

    public RetailCompany() {
        capacity = 10;
        store = new Store[capacity];
        storeCount = 0;
    }

    void addStore(Store store1) {
        if (storeCount < capacity) {
            store[storeCount] = store1;
        } else {
            System.out.println("Maximum stores reached for this company.");
        }
        storeCount++;
    }

    double getTotalSales() {
        double totalStore = 0.0;
        for (int i = 0; i < storeCount; i++) {
            totalStore += store[i].total_sales();
        }
        return totalStore;
    }

    double getAverageSalesPerStore() {
        if (storeCount == 0) {
            return 0.0;
        }
        return getTotalSales() / storeCount;
    }

    double storeWithHighestSales() {
        double highestSale = store[0].total_sales();
        for (int i = 1; i < storeCount; i++) {
            if (store[i].total_sales() > highestSale) {
                highestSale = store[i].total_sales();
            }
        }
        return highestSale;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Store store1 = new Store();
        store1.addSale(new Sale(LocalDate.of(2023, 1, 1), 100.0));
        store1.addSale(new Sale(LocalDate.of(2023, 1, 2), 150.0));

        Store store2 = new Store();
        store2.addSale(new Sale(LocalDate.of(2023, 1, 1), 200.0));
        store2.addSale(new Sale(LocalDate.of(2023, 1, 2), 250.0));

        RetailCompany company = new RetailCompany();
        company.addStore(store1);
        company.addStore(store2);

        System.out.println("Total sales for the company: " + company.getTotalSales());
        System.out.println("Average sales per store: " + company.getAverageSalesPerStore());
        System.out.println("Store with the highest sales: " + company.storeWithHighestSales());

        System.out.println("Store 1 - Average Sales per Day: " + store1.getAverageSalesPerDay());
        System.out.println("Store 2 - Average Sales per Day: " + store2.getAverageSalesPerDay());

    }
}

// for (Sale sales : sale) {
// boolean isUnique = true;
// for (LocalDate uniqueDate : uniqueDates) {
// if ( uniqueDate.equals(sales.getSetDate())) {
// isUnique = false;
// break;
// }
// }

// if (isUnique) {
// uniqueDates[uniquecount++] = sales.getSetDate();
// numDay++;
// }
// }