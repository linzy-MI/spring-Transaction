# spring-Transaction
spring的事务
事务具有原子性：要么都执行，要么都不执行
这是一个spring事务购买图书的样例，用来解释spring声明式事务的使用方式。假设购买一本图书，则会执行purchase方法，根据用户名和书号，查找到该书号图书的价格，图书库存减1、用户账户余额减少购买对应图书的价格。
也说明了事务的传播性。
对应的数据库表有:account表：username,balance.
                book表：isbn,book_name,price.
                book_stock表：isbn,stock.
