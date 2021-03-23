pipeline {
    agent any

    stages {
        stage('jdk-version') {
            steps {
                sh 'java -version'
            }
        }
        stage('mvn-version') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean deploy'
            }
        }
    }
}
