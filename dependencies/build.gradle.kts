plugins {
    id("java-platform")
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:3.2.3"))

    constraints {
        // api("com.h2database:h2:2.1.214")

        api("com.h2database:h2") {
            version { strictly("2.1.214") }
        }

        api("org.apache.commons:commons-text:1.11.0")
    }
}