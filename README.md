# LabourConnect

A microservices-based platform connecting workers with job opportunities.

## Architecture

This is a microservices architecture with the following services:

### Services

| Service | Port | Status | Description |
|---------|------|--------|-------------|
| user-service | 8081 |  Active | User management and authentication |
| worker-service | 8082 | Planned | Worker profiles and skills management |
| job-service | 8083 |  Planned | Job postings and applications |
| api-gateway | 8080 |  Planned | API Gateway and routing |

## Tech Stack

- **Backend**: Java 17, Spring Boot 3.x
- **Database**: PostgreSQL
- **Build Tool**: Maven
- **Version Control**: Git

## Project Structure
```
LabourConnect/
├── user-service/          # User management service
├── worker-service/        # Worker profiles (coming soon)
├── job-service/           # Job management (coming soon)
└── api-gateway/           # API Gateway (coming soon)
```

## Getting Started

### Prerequisites

- JDK 17 or higher
- Maven 3.6+
- PostgreSQL 12+

### Database Setup
```sql
-- Create database
CREATE DATABASE labourconnect_db;

-- Create user
CREATE USER lc_user WITH PASSWORD 'test';
GRANT ALL PRIVILEGES ON DATABASE labourconnect_db TO lc_user;

-- Connect and grant schema permissions
\c labourconnect_db
ALTER SCHEMA public OWNER TO lc_user;
GRANT ALL ON SCHEMA public TO lc_user;
```

### Running User Service
```bash
cd user-service
mvn spring-boot:run
```

The service will start on `http://localhost:8081`

## Development

Each service is an independent Spring Boot application with its own:
- Database
- Configuration
- Dependencies
- Port

### Adding a New Service

1. Create service directory in root
2. Initialize Spring Boot project
3. Configure port and database
4. Update this README

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License.
