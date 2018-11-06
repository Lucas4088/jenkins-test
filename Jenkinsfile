
pipeline {
    agent any

    stages {

       stage('Build'){
            steps{
                ./gradlew clean build
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