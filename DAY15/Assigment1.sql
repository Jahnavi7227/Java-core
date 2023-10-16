-- --1 Add new column to products table that stores tax rate for the products update tax rate to 12% to all products. 
-- ALTER TABLE products 
-- ADD Tax money  default 12;
-- UPDATE products
-- SET Tax= default
-- WHERE ProdId>104;
-- select * from products
-- -- 2Display tiles that End with 's'/'t'.
-- select * from titles
-- where title like '%s' or title like '%t';
-- -- 3Display books of type business, psychology & undecided.
-- select title as Books, type 
-- from titles
-- where type='business' or type='psychology' or type='undecided'; 
-- -- 4Display titles where the sales>5,000 & royality<20.
-- select title_id as titles
-- from titles
-- where  ytd_sales>5000 and royalty<20;
-- -- 5Display titles in the ascending of sales for publisher 0736. 
-- select title as  titles 
-- from titles 
-- where pub_id=0736
-- order by ytd_sales
-- --6Display the difference between maximum & minimum royality of books published day publisher 0877. 
-- select max(royalty)-min(royalty) as DIFFERENCE
-- from titles
-- where pub_id=0877
-- -- 7Display author_id & no of books written by Author.
-- select au_id,count(au_id) as no_of_books
-- from titleauthor
-- group by au_id
-- order by no_of_books
-- --8Display how many authors are there for each title.
-- SELECT * from titleauthor
-- select title_id,count(au_id) as NO_OF_AUTHORS
-- from titleauthor
-- group by title_id
-- --9Display average royality % for authors with order 1.
-- select * from titleauthor
-- select avg(royaltyper) as royaltypercentage
-- from titleauthor
-- where au_ord =1
-- --10Display titles in the order of price if sales are in the range 10k to 20k.
-- select *  from titles
-- select title ,ytd_sales,price
-- from titles
-- where ytd_sales>10000 and ytd_sales<20000
-- order by price
-- --11 Display how many authors are in the city Menlo park. 
-- SELECT * from authors
-- select count(city) as no_of_authors
-- from authors
-- where city='Menlo Park'
-- --12Display state and no of authors we have in the state in the order of state.
-- SELECT * from authors
-- select state,count(au_id)
-- from authors
-- GROUP by state
-- ORDER by state
-- --13Display States in which we have more than 2 authors, with 1st name starting with 's'.
-- select * from authors
-- select state
-- from authors
-- where  au_fname like 's%'
-- group by state
-- having count(au_fname)>2






--DAY 15

--1. Display title after replacing all spaces with (dots) and (hypens) with (stars).
select replace(replace(title,'-','*'), ' ','.') 
from titles
--2.Display title by Removing all spaces. 
select REPLACE(title,' ','')
from titles
-- 3. Display first word in the title.
select  left(title,charindex(' ',title)-1)
from titles
--4. Display month and no of year books published. 
select month(pubdate) as month,count(title) as no_of_books_published
from titles
group by pubdate
order by month
--5. Display title publisher name for titles where the publisher is in USA.

select pub_name ,title,country
from publishers p  join titles t 
ON (p.pub_id=t.pub_id)
where p.country='USA'

--6. Display publisher name and average price of books. 
select * from publishers
select * from titles
select pub_name ,avg(price) as average_price
from publishers p join titles t
on(p.pub_id=t.pub_id)
group by pub_name

--7. Display City of author and then no of books written by authors in the City.
select * from titleauthor
select * from titles
SELECT * FROM authors
select city,count(title) as no_of_books
from   titles t join titleauthor ta on(t.title_id=ta.title_id) join authors a on(ta.au_id=a.au_id)
group by city

--8. Display auther name, title for all authors including the once without a title.

select (au_fname +au_lname) as Author_name,title as title_of_the_book
from   titles t  join titleauthor ta on(t.title_id=ta.title_id) right join authors a on(ta.au_id=a.au_id)

--9. Display title publisher name and author name of the primary author. 



select * from titleauthor
select title,pub_name,(au_fname+au_lname) as author_name
from titles t left join publishers p on(t.pub_id=p.pub_id) left join titleauthor ta on(ta.title_id=t.title_id)  join authors a on(ta.au_id=a.au_id)  
where ta.au_ord=1

--10. Display City of publisher and maximum price & all titles.
select * from publishers

select city , price=(select max(price) from titles),title
from publishers p right join titles t on(t.pub_id=p.pub_id)
group by title,city,price


--11. Display titles written by any author in City (menlo park). 
select * from titles
SELECT * FROM authors
SELECT title ,au_fname+au_lname as author_name
from   titles t join titleauthor ta on(t.title_id=ta.title_id) join authors a on(ta.au_id=a.au_id)
where a.city='menlo park'

--12. Display publishers who published a titles in 1991.

select title,pub_name,year(pubdate)
from titles t  join publishers p on(t.pub_id=p.pub_id)
where year(pubdate)=1991

--13. Display titles not published in USA. 

select title,country
from titles t right   join publishers p on(p.pub_id=t.pub_id) 
where p.country!= 'USA'



--14. Display titles either published in USA (or) having price <5.
select * from titles
SELECT * from publishers
select title,price,country
from titles t  join publishers p on(t.pub_id=p.pub_id)
where    p.country='USA'  or t.price<5

--15. create a view to contain title, publisher, year of publishing, price and type. Make sure when price is null display dero and type is null display Zero.
create view  newtable (title,publisher,year_of_publishing,price_of_title,type_of_book)
as
select title,pub_name,year(pubdate),ISNULL(price,0),type 
from titles t join publishers p on(p.pub_id=t.pub_id)

select * from newtable
drop view newtable

--16. Display publishers who published books by author who wrote more than 2 titles.
SELECT * from publishers
select * from titles
select * from titleauthor
select * from authors
select pub_name
from   titles t  join titleauthor ta on(t.title_id=ta.title_id) join authors a on(ta.au_id=a.au_id) left join publishers p on(t.pub_id=p.pub_id)
group by pub_name
HAVING count(title)>2

--17. Delete rows from title author for author with first_name as dean.
DELETE FROM titleauthor
WHERE au_id IN (SELECT au_id FROM authors WHERE au_fname = 'Dean');
select * from authors
select * from titleauthor
select * from titles

--18. Update the price of the book BU1111 with the Price of book MC2222.
SELECT * from titles
UPDATE titles
set price=(Select price from titles where title_id='MC2222')
where  title_id='BU1111'

--19. Display titles published in last 25 years.

select title,year(pubdate) as year
from titles
where YEAR(pubdate)>DATEPART(yy,GETDATE())-25

--20. Display titles published by any publisher who published a title in 2021.

select title
from titles where year(pubdate)=2021

--21. Create a view to display publisher name, city, and no of books published.

create view newtable2(publishername,pub_city,no_of_books) AS
select pub_name,city,count(title)
from publishers p right join  titles t on(t.pub_id=p.pub_id) 
group by pub_name,city
drop view newtable2
select * from newtable2
SELECT * from  titles
select * from publishers
