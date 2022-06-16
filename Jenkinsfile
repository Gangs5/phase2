pipeline {
    agent any
    stages {
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