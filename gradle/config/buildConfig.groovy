binaryRepository {
    baseUrl = 'http://localhost:8081/artifactory'
    releaseUrl = "$baseUrl/libs-release-local"
    username = 'admin'
    password = 'password'
}

environments {
    test {
        server {
            hostname = 'www.ikain.com'
            sshPort = 22
            port = 8080
            context = 'todo'
            username = 'manager'
            password = 'manager'
        }
    }

    uat {
        server {
            hostname = 'www.ikain.com'
            sshPort = 22
            port = 8081
            context = 'todo'
            username = 'manager'
            password = 'manager'
        }
    }

    production {
        server {
            hostname = 'www.ikain.com'
            sshPort = 22
            port = 8082
            context = 'todo'
            username = 'manager'
            password = 'manager'
        }
    }
}