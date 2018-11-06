
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
                echo "Checking if remote exists..."
                if ! git ls-remote heroku; then
                  echo "Adding heroku remote..."
                  git remote add heroku git@heroku.com:jenkins-start.git
                fi

                # push only origin/master to heroku/master - will do nothing if
                # master doesn't change.
                echo "Updating heroku master branch..."
                git push heroku origin/master:master
            }
       }
    }
}