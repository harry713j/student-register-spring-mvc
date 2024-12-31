--  We have to create the database manually first for postgres
-- For external database we should create the schema manually too

CREATE TABLE IF NOT EXISTS student(
    rollno INTEGER PRIMARY KEY,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    majorsubject VARCHAR(255)
);