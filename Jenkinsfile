pipeline {
    agent any
    
    triggers{
    	pollSCM('* * * * *')
    }
    stages {
        stage('Compile') {
            steps {
            	sh "chmod +x ./mvnw"
                sh "./mvnw compile"
            }
        }
        stage('Unit Test') {
            steps {
                sh "./mvnw test"
            }
        }
        stage('Build') {
            steps {
                sh "./mvnw package"
            }
        }
        
    }
}