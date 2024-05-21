
<template>
  <RouterView />
  <h1>Example</h1>
  <button @click=goto>Volver</button>
</template>

<script setup>
  import router from '@/router';
  import { RouterLink, RouterView } from 'vue-router'
  import HelloWorld from './components/HelloWorld.vue'

  const goto = () => {
  router.push('/')
  }
</script>

<style scoped>
</style>