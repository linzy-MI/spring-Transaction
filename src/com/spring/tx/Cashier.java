package com.spring.tx;

import java.util.List;

public interface Cashier {
   public void checkout(int userId,List<Integer> isbns);
}
