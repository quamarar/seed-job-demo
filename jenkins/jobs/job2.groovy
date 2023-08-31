pipelineJob('seed-job-demo/Pipelines/job2') {

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('quamarar/seed-job-demo')
                    }
                }
            }
            scriptPath('jenkins/pipelines/job2.Jenkinsfile')
        }
    }
}
