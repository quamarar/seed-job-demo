pipelineJob('seed-job-demo/Pipelines/job1') {

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('quamarar/seed-job')
                    }
                }
            }
            scriptPath('jenkins/pipelines/job1.Jenkinsfile')
        }
    }
}
