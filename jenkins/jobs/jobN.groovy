pipelineJob('seed-job-demo/Pipelines/jobN') {

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('quamarar/seed-job-demo')
                    }
                }
            }
            scriptPath('jenkins/pipelines/jobN.Jenkinsfile')
        }
    }
}
