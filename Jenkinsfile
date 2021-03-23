pipeline {
    agent any

    stages {
        stage("Build1") {
            tools {
                jdk "jdk15"
                maven "maven3.6"
            }
            steps {
                sh "printenv"
            }
        }
        stage("Build2") {
            steps {
                sh "printenv"
            }
        }

    }
}
