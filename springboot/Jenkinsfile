pipeline {
    agent any
    stages {
        stage('Compile') {
            steps {
            	sh "chmod +x ./springboot/mvnw"
                sh "./springboot/mvnw compile"
            }
        }
        stage('Unit Test') {
            steps {
                sh "./springboot/mvnw test"
            }
        }
        stage('Build') {
            steps {
                sh "./springboot/mvnw package"
            }
        }
        
    }
}