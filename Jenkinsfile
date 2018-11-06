
pipeline {
    agent any

    stages {

       stage('Build'){
            steps{
                sh './gradlew clean assemble'
            }
       }

       stage('Test'){
            steps {
                sh './gradlew test'
            }
       }

       stage('Deploy'){
            steps{
                sh 'git push heroku master'
            }
       }
    }
}