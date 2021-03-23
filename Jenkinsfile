pipeline {
    agent any

    stages {
        stage("Build1") {
            tools {
                jdk "jdk15"
                maven "maven3.6"
            }
            steps {
                sh "java -version"
                sh "mvn --version"
                sh "mvn clean deploy"
            }
        }

    }
}
