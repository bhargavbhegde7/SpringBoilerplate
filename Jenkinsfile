pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean package'
      }
    }
    stage('create_docker_image') {
      steps {
        sh 'docker build -t spring-app -f Dockerfile .'
      }
    }
  }
}