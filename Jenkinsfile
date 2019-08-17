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
    stage('stop_running_container') {
      steps {
        sh 'docker stop spring-app-container'
      }
    }
    stage('remove_running_container') {
      steps {
        sh 'docker rm spring-app-container'
      }
    }
    stage('docker_run_latest_build') {
      steps {
        sh '''docker run -t --name spring-app-container -p 8070:8070 spring-app:latest 
-d'''
      }
    }
  }
}