-- 코드를 작성해주세요
SELECT COUNT(ID) COUNT
FROM ECOLI_DATA 
WHERE 
    CONV(GENOTYPE, 10, 2) NOT LIKE '%1_' AND
    (CONV(GENOTYPE, 10, 2) LIKE '%1' OR
    CONV(GENOTYPE, 10, 2) LIKE '%1__');