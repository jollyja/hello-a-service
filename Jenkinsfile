pipeline {
    agent any

    tools {
        maven 'maven3.6'
        jdk   'jdk15'
    }

    stages {
        stage('mvn-version') {
            steps {
                sh 'mvn --version'
                sh 'java -version'
            }
        }
        stage('jdk-version') {
            steps {
                sh 'java -version'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean deploy'
            }
        }
    }
}
