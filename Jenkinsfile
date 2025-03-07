pipeline {
    agent any

    parameters {
        booleanParam(name: 'RUN_TESTS', defaultValue: false, description: 'Run JUnit tests')
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/errachidy10/VideoExplicatio.git', branch: 'master'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn -Dmaven.test.failure.ignore=true clean package'
            }
        }
    }

    post {
        success {
            script {
                if (params.RUN_TESTS) {
                    junit 'target/surefire-reports/*.xml'
                } else {
                    echo 'Tests skipped.'
                }
            }
            echo 'Build succeeded!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}