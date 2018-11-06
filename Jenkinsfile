
pipeline {
    agent any

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
            environment {
                HEROKU_EMAIL = 'lukasz4088@gmail.com'
                HEROKU_API_KEY = credentials('HEROKU_API_KEY')
            }
            steps {
                 unstash 'app'
                 sh './gradlew deployHeroku --stacktrace'
            }
       }
    }
}