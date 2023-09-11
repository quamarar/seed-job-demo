pipelineJob('seed-job-demo/Pipelines/job1') {

multibranchPipelineJob('seed-job-demo/Pipelines/job1') {

    branchSources {
        branchSource {
            source {
                git {
                     id('job1')
                    remote ('https://github.com/quamarar/seed-job-demo.git')
                    
                    }
                }
                         strategy {
                            defaultBranchPropertyStrategy {
                               props {
                                noTriggerBranchProperty()
                               }
                            }
                         }
                     }

                  }
configure {
    it / factory(class: 'org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory') {
        owner(class: 'org.jenkinsci.plugins.workflow.multibranch.WorkflowMultiBranchProject', reference: '../..')
        scriptPath('jenkins/pipelines/job1.Jenkinsfile')
    }
}
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
