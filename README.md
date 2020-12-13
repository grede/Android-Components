# Android-Components

Android-Components is a set of ready-to-use components, useful for Android Development

## Installation

1. Git pull project from GitHub

2. Create a binary_auth.properties file in the root folder with the following content: 

    bintray.user - user name for bintray
    bintray.apikey - Api Key for bintray 
    
## Create a new project (module)

1. Create a new module via File -> New -> New Module...

2. Specify a package name as the following: app.xorium.androidcomponents.xxx, where xxx is the name of the new module

3. Create a module_config.properties file in the root folder of the newly created module with the following content:

    module_name=<name of the module>
    module_version=1.0.0
    module_version_code=1
    module_compile_sdk=29
    module_build_tools=29.0.2
    module_min_sdk=16
    module_target_sdk=29
    module_description=<'Short description of the module'>
    website_url=<'Url to the project's github'>
    
## Publish a new version of the module

1. Make sure module_config.properties file exist in the root folder of the module

2. Run Android-Components:XXX [binaryUpload] gradle command, where XXX is the name of the module