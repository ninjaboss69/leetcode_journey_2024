CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN 
SET n = N-1;
  RETURN (
      SELECT distinct salary FROM Employee ORDER BY salary desc limit 1 offset n
       );
END