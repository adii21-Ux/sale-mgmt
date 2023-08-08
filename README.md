# Sale Campaign Management System

## Setup Project

### 1. Git clone:
Clone the git project using:
git clone https://github.com/adii21-Ux/sale-mgmt.git

### 2. Import Project into IDE:
Open your chosen IDE and import the project:
For IntelliJ IDEA: File -> Open -> Select the project folder.
For Eclipse: File -> Import -> Existing Maven project -> Select the project folder.

### 3. Install Dependencies:
Your IDE should automatically detect the dependencies defined in the pom.xml,It may prompt you to download and install them. 
If not, you can manually trigger the build process to fetch the dependencies using **mvn install**

### 4. Run the Application:
Find the main class with the public static void main method (usually annotated with @SpringBootApplication) and run it from your IDE. 
This will start the Spring Boot application.

### 5. Access the Application:
Once the application is running, you can access API at default port 8080 (http://localhost:8080)


## API Endpoints

### 1. Paginated Product API:
Url : http://localhost:8080/products?page=1&pageSize=10 
Allows clients to retrieve a paginated list of products. Clients can specify the desired page number and the number of products per page using query parameters. The endpoint returns information about the requested page of products, including details about the products themselves.

### 2. Creating a Sale Campaign:
Url : http://localhost:8080/create-campaigns
Used to create campaigns with associated discounts. It receives campaign details and discount information in the request body as JSON data.
