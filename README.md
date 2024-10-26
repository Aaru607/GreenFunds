
# Centralized Renewable Energy Marketplace

The **Centralized Renewable Energy Marketplace** enables communities to invest in shared solar projects, allowing users to buy shares and track their energy savings. Built with a combination of front-end, back-end, and cloud technologies, this platform provides a secure and user-friendly experience.

## Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Setup Instructions](#setup-instructions)
  - [Pre-requisites](#pre-requisites)
  - [Environment Variables](#environment-variables)
  - [Database Setup](#database-setup)
- [Running the Application](#running-the-application)
  - [Running Locally](#running-locally)
  - [Running with Docker](#running-with-docker)
- [API Documentation](#api-documentation)
- [Contact](#contact)

---

### Features
- Marketplace for investing in solar projects
- Real-time project tracking and status updates
- Personalized dashboards for user investments
- Community features: forums, educational resources, project voting

---

## Tech Stack
- **Frontend**: React.js (or Angular for larger teams)
- **Backend**: Spring Boot
- **Database**: MySQL (main database), MongoDB (for NoSQL storage)
- **Cloud**: AWS (for hosting, data storage, and scaling)
- **Mobile App Prototype**: Flutter (for Android and iOS apps)

---

## Setup Instructions

### Pre-requisites
1. **Java**: Ensure Java 11+ is installed.
2. **Node.js**: Required for frontend; version 14+ is recommended.
3. **MySQL and MongoDB**: Install and set up MySQL and MongoDB on your local environment.
4. **Docker**: Ensure Docker is installed if you plan to use Docker instead of running locally.

### Environment Variables
Create a `.env` file in both backend and frontend directories, or set environment variables directly. Here’s an example:

#### For Backend
```
DB_HOST=localhost
DB_PORT=3306
DB_USERNAME=root
DB_PASSWORD=your_password
MONGO_URI=mongodb://localhost:27017/your_database
AWS_ACCESS_KEY=your_aws_access_key
AWS_SECRET_KEY=your_aws_secret_key
```

#### For Frontend
```
REACT_APP_API_URL=http://localhost:8080
```

### Database Setup
1. **MySQL**: 
   - Start the MySQL server.
   - Create the necessary database and user tables.
   - Example:
     ```sql
     CREATE DATABASE solar_marketplace;
     USE solar_marketplace;
     ```
2. **MongoDB**:
   - Ensure MongoDB is running.
   - Create a database for storing NoSQL data, if necessary.

---

## Running the Application

### Running Locally

#### Step 1: Backend (Spring Boot)
1. Navigate to the backend directory:
   ```bash
   cd backend
   ```
2. Install dependencies:
   ```bash
   mvn clean install
   ```
3. Start the backend server:
   ```bash
   mvn spring-boot:run
   ```
4. The server should now be running on `http://localhost:8080`.

#### Step 2: Frontend (React.js)
1. Navigate to the frontend directory:
   ```bash
   cd frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the frontend server:
   ```bash
   npm start
   ```
4. The frontend should be running on `http://localhost:3000`.

### Running with Docker
1. **Build Docker images**:
   - Backend:
     ```bash
     docker build -t renewable-marketplace-backend ./backend
     ```
   - Frontend:
     ```bash
     docker build -t renewable-marketplace-frontend ./frontend
     ```
2. **Run Docker containers**:
   ```bash
   docker-compose up
   ```
3. The application should now be running, with the backend at `http://localhost:8080` and the frontend at `http://localhost:3000`.

---

## API Documentation
- You can view the API documentation for the backend by accessing `http://localhost:8080/swagger-ui.html` after starting the server.
- The Swagger UI provides an interactive interface for testing API endpoints.

---

## Contact
If you have any questions or need further assistance, please contact us at [email@example.com].

---

This README gives an overview of the project setup, instructions for running locally or with Docker, and links to API documentation.
