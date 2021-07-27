package com.christianpari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PriceCheck {

  public void startAlg() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    List<String> products = new ArrayList<>();
    List<Float> productPrices = new ArrayList<>();
    int i = 0;
    while (i++ < n) {
      products.add(sc.next());
      productPrices.add(sc.nextFloat());
    }

    List<String> soldProducts = new ArrayList<>();
    List<Float> soldProductPrices = new ArrayList<>();
    int j = 0;
    while (j++ < m) {
      soldProducts.add(sc.next());
      soldProductPrices.add(sc.nextFloat());
    }

    System.out.println(priceCheck(products, productPrices, soldProducts, soldProductPrices));
  }

  private int priceCheck(
    List<String> products,
    List<Float> productPrices,
    List<String> soldProducts,
    List<Float> soldProductPrices
    ) {
    int errors = 0;

    for (int index = 0; index < soldProducts.size(); index++) {
      String product = soldProducts.get(index);
      Float soldPrice = soldProductPrices.get(index);
      int productID = products.indexOf(product);
      Float productPrice = productPrices.get(productID);

      if (!productPrice.equals(soldPrice)) { errors++; }
    }

    return errors;
  }
}
