
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

            steps {
                withCredentials(bindings: [sshUserPrivateKey(credentialsId: 'HEROKU_CREDENTIALS', \
                                                                         keyFileVariable: 'HEROKU_API_KEY')]) {
                     sh 'git remote add heroku git@heroku.com:jenkins-start.git'
                     unstash 'app'
                     sh './gradlew deployHeroku'
                }

            }
       }
    }
}