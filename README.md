# Sqills Case Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

## Running the application from Docker Hub:

To install the docker image use the following command: 
docker pull 17693/sqills-case:sqills

To run the docker image on port 8080 us the following command: 
docker run -p 8080:8080 17693/sqills-case:sqills

You can now see that application is running at: http://localhost:8080

You can test the end point by sending a POST request to: http://localhost:8080/v1/parse-str

A sample request is as follows:

{
"inputStr": "com.SQILLS.assignment an.oth8er Sample.1nput-Str"
}

You should expect to see the result on console.



## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

