pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/errachidy10/VideoExplicatio.git',
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install' // Si vous utilisez Maven
                // sh './gradlew build' // Si vous utilisez Gradle (remplacez 'build' par la tâche appropriée)
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'  // Si vous utilisez Maven et avez des tests
            }
        }
    }
}