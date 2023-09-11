pipeline {
  agent any

    parameters {
    choice(
            choices: ['plan', 'apply', 'show', 'preview-destroy', 'destroy'],
            description: 'Terraform action to apply',
            name: 'action')
    choice(
            choices: ['dev', 'uat', 'prod'],
            description: 'deployment environment',
            name: 'ENVIRONMENT')
  }

      stages {
        stage('job1') {
            steps{
             echo " Hello, I am job1 from master branch"
             }
            }
          }
        }
