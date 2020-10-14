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