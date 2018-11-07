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
                PORT = 8081
                HEROKU_EMAIL = 'lukasz4088@gmail.com'
                HEROKU_API_KEY = credentials('HEROKU_API_KEY')
            }

            input {
                message "Do you want to deploy app?"
                ok "HELL YEAH!"
            }
            steps {
                 unstash 'app'
                 sh './gradlew deployHeroku --stacktrace'
            }
       }
    }
}