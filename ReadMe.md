    Ways of making an image available to the local minikube deployment
    1. Using skaffold
    2. eval $(minikube docker-env)
    
    helm install my-cherry-chart buildachart/ --values buildachart/values.yaml 