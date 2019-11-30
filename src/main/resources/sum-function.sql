-- ref: https://www.logicbig.com/tutorials/spring-framework/spring-data-access-with-jdbc/simple-jdbc-calling-function.html
-- pilih salah satu database, lalu klik sql dan masukkan query dibawah

CREATE FUNCTION GET_SUM(first_num INT, second_num INT)
 RETURNS INT
   return first_num + second_num;