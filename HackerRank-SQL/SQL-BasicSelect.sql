

-----------------------------------
-----------------------------------
-----------------------------------
-----------------------------------
-----------------------------------
-----------------------------------
-----------------------------------

-----------------------------------
--Query the Name of any student in STUDENTS who scored higher than  Marks. Order your output by the last three characters of each name. 
--If two or more students both have names ending in the same last three characters (i.e.: Bobby, Robby, etc.), secondary sort them by ascending ID.

--Input Format
--
--The STUDENTS table is described as follows:
/*
Enter your query here.
*/
SELECT      NAME
FROM        STUDENTS
WHERE       MARKS > 75
ORDER BY    SUBSTRING(NAME, -3), ID ASC;
-----------------------------------
--Query the list of CITY names from STATION that do not start with vowels and do not end with vowels. Your result cannot contain duplicates.
/*
Enter your query here.
*/
select distinct city from station where city regexp '^[^aeiou].*[^aeiou]$'
-----------------------------------
--Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.
/*
Enter your query here.
*/
SELECT DISTINCT city 
FROM station 
WHERE city NOT REGEXP "^[aeiou].*[aeiou]$";

-----------------------------------
--Query the list of CITY names from STATION that do not end with vowels. Your result cannot contain duplicates.
/*
Enter your query here.
*/
SELECT DISTINCT city 
FROM station 
WHERE city NOT REGEXP "[aeiou]$";

-----------------------------------
--Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.
/*
Enter your query here.
*/

SELECT DISTINCT city 
FROM station 
WHERE city NOT REGEXP "^[aeiou].*";
--------------------------------------
--Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) 
--as both their first and last characters. Your result cannot contain duplicates.
/*
Enter your query here.
*/
SELECT DISTINCT city 
FROM station 
WHERE city REGEXP "^[aeiou].*[aeiou]$";

-------------------------------------
--Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates.
/*
Enter your query here.
*/
-- SELECT DISTINCT city 
-- FROM station 
-- WHERE city REGEXP "[aeiou]$";

SELECT DISTINCT CITY 
FROM STATION 
WHERE CITY LIKE '%a' 
OR CITY LIKE '%e' 
OR CITY LIKE '%i' 
OR CITY LIKE '%o' 
OR CITY LIKE '%u';
---------------------------------------------
--Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.
--Input Format
--The STATION table is described as follows:
--Station.jpg
--where LAT_N is the northern latitude and LONG_W is the western longitude.
/*
Enter your query here.
*/
SELECT DISTINCT city 
FROM station 
WHERE city REGEXP "^[aeiou].*";

---------------------------------
--Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths 
--(i.e.: number of characters in the name). If there is more than one smallest or largest city, 
--choose the one that comes first when ordered alphabetically.
--The STATION table is described as follows:
--Station.jpg
--where LAT_N is the northern latitude and LONG_W is the western longitude.
--Sample Input
--For example, CITY has four entries: DEF, ABC, PQRS and WXY.
--Sample Output
--ABC 3
--PQRS 4
--Explanation
--When ordered alphabetically, the CITY names are listed as ABC, DEF, PQRS, and WXY, with lengths  and . 
--The longest name is PQRS, but there are  options for shortest named city. Choose ABC, because it comes first alphabetically.
--
--Note
--You can write two separate queries to get the desired output. It need not be a single query.

/*
Enter your query here.
*/

-- (select city, length(city) from station order by length(city) desc, city asc limit 1);
-- (select city, length(city) from station order by length(city) asc, city asc limit 1);

(select city, length(city) 
from station
order by length(city) desc, city asc
limit 1)
union
(select city, length(city) 
from station
order by length(city) asc, city asc
limit 1)
----------------------------
--Query a list of CITY names from STATION for cities that have an even ID number. Print the results in any order, 
--but exclude duplicates from the answer.
--The STATION table is described as follows:
-- STATION-table.jpg
--where LAT_N is the northern latitude and LONG_W is the western longitude.
/*
Enter your query here.
*/
SELECT DISTINCT(CITY) 
FROM STATION
WHERE (ID % 2)=0;
---------------------------
--Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.
--The STATION table is described as follows:
--STATION-table.jpg
--where LAT_N is the northern latitude and LONG_W is the western longitude.
--For example, if there are three records in the table with CITY values 'New York', 'New York', 'Bengalaru', 
--there are 2 different city names: 'New York' and 'Bengalaru'. The query returns , because 
--total number OF records - number OF UNIQUE city names = 3 - 2 = 1
/*
Enter your query here.
*/
select ( count(CITY) - count(distinct CITY) ) from STATION;