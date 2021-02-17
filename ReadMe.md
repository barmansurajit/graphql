    Ways of making an image available to the local minikube deployment
    1. Using skaffold
    2. eval $(minikube docker-env)
    
    helm install my-cherry-chart buildachart/ --values buildachart/values.yaml 
    
    query {
      bankAccount(id: "8ccf49f5-04ea-45ba-a8e1-27cae46f472b"){
        id
        customer {
          firstName
          middleName
          lastName
        }
        currency
        assets{
          id
        }
      }
    }
    
    mutation {
      createBankAccount(input : {
        firstName: "Andy"
        lastName: "Jassy"
      }) {
        id
        currency
      }
    }