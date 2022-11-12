##### H2 database springboot application

###### Developer Guide 
+ application.yml
  + first initial run time change 
    + ddl-auto : create
      + After once table created just always use 
    + ddl-auto : update
###### How to see table and data
+ http://localhost:8080/h2-console
###### Give absolute path 
+ jdbc:h2:C:\Users\your-user-dir\your-current-project-folder\data\dbname
+ you can chage your dbname 
  + url:  jdbc:h2:file:${user.dir}/data/your-db-name (application.yml file)
