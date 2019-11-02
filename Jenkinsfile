pipeline {
  agent any
  stages {
    stage('ssh into the build server') {
      steps {
        sh 'ssh -o StrictHostKeyChecking=no 34.66.169.153 uptime'
      }
    }
    stage('run command inside the build server') {
      steps {
        sh 'ls -ltrh'
      }
    }
  }
}