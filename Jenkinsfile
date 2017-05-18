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
        stage("Docker build") {
          steps {
            sh "docker build -t localhost:5000/calculator ."
          }
        }
        stage("Docker push") {
          steps {
            sh "docker push localhost:5000/calculator"
          }
        }
        stage("Docker run") {
          steps {
            sh "docker run -d -p 8765:8080 --name calculator localhost:5000/calculator"
          }
        }
       
        
    }
}
