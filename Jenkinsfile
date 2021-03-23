pipeline {
    agent any


    stages {
        stage('build with jdk-1.8') {
            steps {
                sh "printenv"
            }
        }
        stage('build with jdk-15') {
            tools {
                jdk "jdk15"
            }
            steps {
                sh "printenv"
            }
        }

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
