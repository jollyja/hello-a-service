pipeline {
    agent any

    def mvnHome = tool 'maven3.5.3'
    env.PATH = "${mvnHome}/bin:${env.PATH}"

    def jdkHome = tool 'jdk15'
    env.PATH = "${jdkHome}/bin:${env.PATH}"

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
