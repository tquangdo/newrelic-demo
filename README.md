# newrelic-demo 🐳

![Stars](https://img.shields.io/github/stars/tquangdo/newrelic-demo?color=f05340)
![Issues](https://img.shields.io/github/issues/tquangdo/newrelic-demo?color=f05340)
![Forks](https://img.shields.io/github/forks/tquangdo/newrelic-demo?color=f05340)
[![Report an issue](https://img.shields.io/badge/Support-Issues-green)](https://github.com/tquangdo/newrelic-demo/issues/new)

## reference
- [youtube1](https://www.youtube.com/watch?v=QX7wMf6wTSU)
- [youtube2](https://www.youtube.com/watch?v=CX8AnwTW2Zs)

## yt1
1. ### create acc
    - create acc with 1 email
    - access `https://one.newrelic.com/` > click `Apps` > `Build your own New Relic apps`
    ![create_acc](screenshots/create_acc.png)
    - install
    ![install](screenshots/install.png)
1. ### create app
    ```shell
    # 1/
    nr1 --version
    #@datanerd/nr1/2.83.5 darwin-x64 node-v16.11.1

    # 2/
    sudo nr1 profiles:add --name account-3847570 --api-key NRAK-XXX --region us
    # Password:
    # ✔  Added profile account-3847570.

    # 3/
    nr1 create                                                                                         
    #✔ What kind of component do you want to create? › nerdpack
    #✔ Name your nerdpack. … cooing-metal
    #✔ Name your nerdlet. … home
    #✔ Name your launcher. … launcher
    #Installing dependencies...
    #added 8 packages, and audited 9 packages in 964ms
    #found 0 vulnerabilities
    # ✔  nerdpack created successfully!
    #    nerdpack cooing-metal is available at "./"
    # ✔  nerdlet created successfully!
    #    nerdlet home is available at "./nerdlets/home"
    # ✔  launcher created successfully!
    #    launcher launcher is available at "./launchers/launcher"
    ```
1. ### run app
    ```bash
    cooing-metal$ npm start
    #✔  Server ready! Test it at: https://one.newrelic.com/?nerdpacks=local
    #↩  Server will reload automatically if you modify any file!
    #ℹ  Additionally, you can test the following artifacts at:
    #Launchers:
    #⁎  launcher https://onenr.io/0Zw0v4brNjv
    ```
    - if err `permission denied` then solve by `sudo chmod -R 777 /Users/do.tranquang/.newrelic`
    - access `https://one.newrelic.com/?nerdpacks=local` on browser
    ![run1](screenshots/run1.png)
    - access `https://onenr.io/0Zw0v4brNjv` on browser
    ![run2](screenshots/run2.png)
    - access `https://one.newrelic.com/catalog/app-directory?nerdpacks=local&account=3847570` on browser
    ![app_local](screenshots/app_local.png)
