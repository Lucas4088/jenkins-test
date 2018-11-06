
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

                     unstash 'app'
                     sh './gradlew deployHeroku'
                }

            }
       }
    }
}