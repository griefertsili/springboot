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
            sh "docker build -t 192.168.1.2:5000/calculator ."
          }
        }
        stage("Docker push") {
          steps {
            sh "docker push 192.168.1.2:5000/calculator"
          }
        }
        stage("Docker run") {
          steps {
            sh "docker run -d -p 8765:8080 --name calculator 192.168.1.2:5000/calculator"
          }
        }
       
        
    }
}
