# Desafio API - Forum Musique

![Java](https://img.shields.io/badge/Java-8%2B-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Security-6-green) [![LinkedIn](https://img.shields.io/badge/Connect%20on-LinkedIn-blue)](https://www.linkedin.com/in/oihenriquegomes/)

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contact](#contact)

## Introduction

The 'Tasklater' project is a to-do list API created for educational purposes. It provides endpoints for user creation, authorization, and authentication, as well as task management.


## Features

- Task CRUD operations.
- Basic Authentication.
- Secure password hashing and salting using BCrypt.
- Integration with MySQL database for storing information.

## Technologies Used

- ![Java](https://img.shields.io/badge/Java-8%2B-orange): Programming language for building the application.
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green): Framework for creating production-ready Spring applications.
- ![Spring Boot](https://img.shields.io/badge/Spring%20Data-2023.0.4-green): Framework for simplify database access and provide higher-level programming model for data repositories.
- ![MySQL](https://img.shields.io/badge/MySQL-Database-blue): Database for storing user-related data.
- ![Lombok](https://img.shields.io/badge/Lombok-red): Library that simplifies code by automating repetitive tasks like getters, setters, and constructors.
- ![Flyway](https://img.shields.io/badge/Flyway-Migrations-red): Database migration tool that simplifies version control and management of database schemas.

## Usage

1. **Register a new user** by making a `POST` request to the `/user` endpoint.
3. **Include the login credentials** with Basic Authorization type in the header parameter "Authorization".
4. Feel free to utilize the other available API endpoints.

## Endpoints

- `POST /user`: Register a new user.
---
- `POST /task`: Create a new task.
- `PUT /task/{id}`: Update a task.
- `GET /task`: List all task from the logged user.


## Contact

Connect with me on [LinkedIn](https://www.linkedin.com/in/oihenriquegomes/).