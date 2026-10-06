1# Write your MySQL query statement below
2select name as 'Customers' from Customers
3where id not in (select customerId from orders)