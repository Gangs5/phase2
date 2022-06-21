pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                script {
                        checkout([$class: 'GitSCM', branches: [[name: '*/phase2_05_BugZapper']], extensions: [], userRemoteConfigs: [[credentialsId: '9bdbdb10-b9c9-4788-8447-187b76790749', url: 'https://github.com/Gangs5/phase2.git']]])
                }
    
        stage ('Build Stage') {

            steps {
             echo "Build is in progress..."
                    bat 'mvn clean'
            }
        }
        stage ('Testing Stage') {

            steps {
			  echo "Testing in progress"
                    bat 'mvn test'
            }
        }
        stage ('Cucumber reports') {
        	      		  steps {
                           cucumber buildStatus: "UNSTABLE", 
                           fileIncludePattern: "**/cucumber.json",
                           jsonReportDirectory: 'target/reports'
                           }
        }	
    }
}