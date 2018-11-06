
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
            }
            steps {
                withCredentials(bindings: [sshUserPrivateKey(credentialsId: 'HEROKU_API_KEY', \
                                                                         keyFileVariable: 'HEROKU_API_KEY')]) {

                     sh 'echo $HEROKU_API_KEY'
                     unstash 'app'
                     sh './gradlew deployHeroku --stacktrace'
                }

            }
       }
    }
}