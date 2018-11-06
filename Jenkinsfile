
pipeline {
    agent any

    stages {

       stage('Build'){
            steps{
                sh './gradlew clean assemble'
            }
       }

       stage('Test'){
            steps{
                echo 'Testing ...'
            }
       }

       stage('Deploy'){
            steps{
                echo 'Deploying ...'
            }
       }
    }
}