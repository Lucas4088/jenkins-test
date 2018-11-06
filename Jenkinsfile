
pipeline {
    agent any
    environment {
                HEROKU_API_KEY = credentials('HEROKU_CREDENTIALS')
    }
    stages {

       stage('Build'){
            steps{
                sh './gradlew clean assemble'
                stash includes: '**/build/libs/*.war', name: 'app'
            }
       }

       stage('Test'){
            steps {
                sh './gradlew test'
            }
       }

       stage('Deploy'){

            steps {
                unstash 'app'
                sh './gradlew deployHeroku'
            }
       }
    }
}