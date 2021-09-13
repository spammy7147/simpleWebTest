<template>
  <div class="relative flex justify-center min-h-screen bg-blue-100 sm:items-center">
    <div class="max-w-4xl mx-auto bg-yellow-100">
        <h2 class="text-2xl">
            {{hello}}
        </h2>
        <h2 class="text-2xl">
            {{user.name}}
        </h2>
        <h2 class="text-2xl">
            {{user}}
        </h2>
    </div>
  </div>
</template>


<script>
import axios from 'axios'

export default {

  async asyncData(){
    const hello_api = 'http://localhost:8080/api/hello'
    const user_api = 'http://localhost:8080/api/user'
    const hello  = await axios.get(hello_api).then((response) => {
      return response.data
    })
    const user  = await axios.get(user_api).then((response) => {
      return response.data
    })
    return {
      hello,
      user
    }
  } 
}



</script>
