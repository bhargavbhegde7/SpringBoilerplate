pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean package'
        sh 'docker build -t spring-app -f Dockerfile .'
      }
    }
  }
}