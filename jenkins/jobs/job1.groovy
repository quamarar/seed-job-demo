pipelineJob('seed-job-demo/Pipelines/job1') {

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('quamarar/seed-job-demo')
                    }
                }
            }
            scriptPath('jenkins/pipelines/job1.Jenkinsfile')
        }
    }
}
