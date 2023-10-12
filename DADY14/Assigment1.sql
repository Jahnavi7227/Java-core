--1 Add new column to products table that stores tax rate for the products update tax rate to 12% to all products. 
ALTER TABLE products 
ADD Tax money  default 12;
UPDATE products
SET Tax= default
WHERE ProdId>104;
select * from products
-- 2Display tiles that End with 's'/'t'.
select * from titles
where title like '%s' or title like '%t';
-- 3Display books of type business, psychology & undecided.
select title as Books, type 
from titles
where type='business' or type='psychology' or type='undecided'; 
-- 4Display titles where the sales>5,000 & royality<20.
select title_id as titles
from titles
where  ytd_sales>5000 and royalty<20;
-- 5Display titles in the ascending of sales for publisher 0736. 
select title as  titles 
from titles 
where pub_id=0736
order by ytd_sales
--6Display the difference between maximum & minimum royality of books published day publisher 0877. 
select max(royalty)-min(royalty) as DIFFERENCE
from titles
where pub_id=0877
-- 7Display author_id & no of books written by Author.
select au_id,count(au_id) as no_of_books
from titleauthor
group by au_id
order by no_of_books
--8Display how many authors are there for each title.
SELECT * from titleauthor
select title_id,count(au_id) as NO_OF_AUTHORS
from titleauthor
group by title_id
--9Display average royality % for authors with order 1.
select * from titleauthor
select avg(royaltyper) as royaltypercentage
from titleauthor
where au_ord =1
--10Display titles in the order of price if sales are in the range 10k to 20k.
select *  from titles
select title ,ytd_sales,price
from titles
where ytd_sales>10000 and ytd_sales<20000
order by price
--11 Display how many authors are in the city Menlo park. 
SELECT * from authors
select count(city) as no_of_authors
from authors
where city='Menlo Park'
--12Display state and no of authors we have in the state in the order of state.
SELECT * from authors
select state,count(au_id)
from authors
GROUP by state
ORDER by state
--13Display States in which we have more than 2 authors, with 1st name starting with 's'.
select * from authors
select state
from authors
where  au_fname like 's%'
group by state
having count(au_fname)>2