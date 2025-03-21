# Azure DevOps E-Shop Implementation Project

## Project Overview
This project demonstrates the implementation of a complete e-commerce application using Azure DevOps for CI/CD pipelines and Azure cloud services for hosting. The project consisted of two main assignments and an integration task.

## Technologies Used
- **Azure DevOps** - CI/CD pipeline orchestration
- **Azure App Service** - Hosting both frontend and backend
- **Azure Container Registry** - Storage for Docker container images
- **React** - Frontend e-shop application
- **Java** - Backend REST API
- **Docker** - Containerization of the backend service
- **Maven** - Build tool for Java application
- **Node.js/npm** - Build environment for React application

## Assignment 1: React E-Shop Frontend Deployment
- Set up an Azure DevOps project and imported the e-shop-company-com React application
- Created a build pipeline to compile the React application and produce deployment artifacts
- Implemented a release pipeline triggered by successful builds
- Deployed the application to Azure App Service
- Verified the frontend user interface was accessible through the App Service URL

## Assignment 2: Java Backend API Deployment
- Created a new Azure DevOps project for the Java REST API
- Configured a build pipeline that:
  - Built the Java application using Maven
  - Created a Docker container with the application
  - Pushed the container image to Azure Container Registry with the 'latest' tag
- Set up a release pipeline to deploy the containerized application to Azure App Service
- Verified the backend API was accessible and returning product data

## Integration: Connecting Frontend and Backend
- Updated the frontend configuration (settings.json) to point to the deployed backend API
- Changed the API port to 443 for HTTPS communication
- Verified the complete e-shop application functionality with products displaying correctly
- Managed the automated deployment of changes through the CI/CD pipeline

## Challenges and Solutions
- Configured Docker builds within the Azure DevOps pipeline
- Managed inter-service communication between separately deployed frontend and backend
- Troubleshot deployment issues with container-based applications in App Service

## Project Status
While the live deployment is no longer available due to Azure subscription expiration, this repository contains the configuration files and documentation demonstrating the implementation process.

## Original Assignment
The original instructions in Swedish can be found in two PDF files: "Assignment 1" and "Assignment 2" located in the docs folder. These documents detail the specific requirements for each part of the implementation.

