# Java-Servlet

## Description
Basic Java Servlet application using Jakarta EE. It includes servlets for HelloWorld, PersonalInfo, NameAge, and Login functionalities. The project is packaged using Maven and deployed on Heroku. The web interface features animations and an image carousel.

<details>
  <summary>Project Structure</summary>
  <pre>
├── src
│   └── main
│       └── java
│           └── com
│               └── example
│                   ├── HelloWorldServlet.java
│                   ├── PersonalInfoServlet.java
│                   ├── NameAgeServlet.java
│                   └── LoginServlet.java
├── target
│   └── ... (Generated files by Maven)
├── WebContent
│   ├── WEB-INF
│   │   ├── web.xml
│   │   └── info.jsp
│   ├── images
│   │   ├── image1.jpg
│   │   ├── image2.jpg
│   │   ├── image3.jpg
│   │   ├── image4.jpg
│   │   └── image5.jpg
│   ├── index.html
│   ├── success.html
│   └── login.html
├── .gitignore
└── pom.xml
  </pre>
</details>


## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven
- Git
- Heroku CLI

### Installation

1. Clone the repository:

    ```sh
    git clone https://github.com/syedfahad7/Java-Servlet.git
    ```

2. Build the project using Maven:

    ```sh
    mvn clean package
    ```

3. Deploy to Heroku:

    ```sh
    heroku create
    git push heroku main
    ```

### Usage

1. Access the application:

    ```sh
    heroku open
    ```

2. Explore the different servlets:

    - `http://your-heroku-app-url/hello`
    - `http://your-heroku-app-url/personal-info`
    - `http://your-heroku-app-url/name-age`
    - `http://your-heroku-app-url/login`

## License
This project is licensed under the MIT License.

## 🚀 About Me
I'm a full stack Web & App Developer and an undergrad Data Science Student 👨‍💻🙌

## Authors

- [@Fahad](https://github.com/SyedFahad7)
