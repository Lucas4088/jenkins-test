
pipeline {
    agent any

    stages {

       stage('Build'){
            steps{
                sh './gradlew clean assemble'
                stash includes: '**/build/libs/*.war', name 'app'
            }
       }

       stage('Test'){
            steps {
                sh './gradlew test'
            }
       }

       stage('Deploy'){
            environment{
                HEROKU_CREDENTIALS = credentials('HEROKU_CREDENTIALS')
            }
            steps{
                unstash 'app'
                sh './gradlew deployHeroku'
            }
       }
    }
}