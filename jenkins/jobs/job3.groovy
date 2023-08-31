pipelineJob('seed-job-demo/Pipelines/job3') {

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('quamarar/seed-job-demo')
                    }
                }
            }
            scriptPath('jenkins/pipelines/job3.Jenkinsfile')
        }
    }
}
