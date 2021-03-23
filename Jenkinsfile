pipeline {
    agent any

    stages {
        stage('Build') {
            tools {
                jdk "jdk15"
                maven "maven3.6"
            }
            steps {
                sh "printenv"
            }
            steps {
                sh 'java -version'
            }
            steps {
                sh 'mvn --version'
            }
            steps {
                sh 'mvn clean deploy'
            }
        }
    }
}
