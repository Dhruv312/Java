// Scenario 2: Sales Data Analysis
// In a retail business, create an array to store the daily sales data for different products. Perform operations such as calculating the total sales, finding the best-selling product, and generating a sales report for a specific period.


public class Task2 {
    public static int[] calculateTotalSale(String []product,int [][]dailySales){
        int totalsales[]=new int[product.length];
    
        for (int i = 0; i < product.length; i++) {
            int sum=0;
            for (int j = 0; j < dailySales[i].length; j++) {
                sum+=dailySales[i][j];
            }
            totalsales[i]=sum;
        }
        return totalsales;
    }
    public static String findingBestSellingProduct(String []product,int [][]dailySales){
        int totalsales[]=calculateTotalSale(product,dailySales);
        int maxSale=totalsales[0];
        int bestSellingProduct=0;
        for (int i = 1; i < totalsales.length; i++) {
            if (maxSale<totalsales[i]) {
                maxSale=totalsales[i];
                bestSellingProduct=i;
            }
        }

        return product[ bestSellingProduct];
    }

    public static void generatingSalesReport(String []product,int [][]dailySales,int start,int end){
        System.out.println("Sales Repor from Day "+start+ " to Day "+end);
        for (int i = 0; i < product.length; i++) {
            int sum=0;
            for (int j = start; j <= end; j++) {
                sum+=dailySales[i][j];
            }
            System.out.println(product[i]+": "+sum);
        }

    }
    public static void main(String[] args){
        String []product=new String[]{"Product A","Product B","Product C"};
        int [][]dailySales=new int[][]{
            {5, 3, 6, 7, 2}, 
            {2, 8, 6, 3, 4},
            {1, 4, 7, 8, 5}
        };

        // Calculate total sales
        int []totalsales=calculateTotalSale(product,dailySales);
        System.out.println("Total Sales: ");
        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i]+": "+totalsales[i]);
        }

        //finding the best-selling product
        String bestSellingProduct=findingBestSellingProduct(product,dailySales);
        System.out.println("Best-selling Product is: "+bestSellingProduct);

        //generating a sales report for a specific period
        generatingSalesReport(product,dailySales,1,3);

    }
}




