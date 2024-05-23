
<template>
  <RouterView />
</template>

<script setup>
  import router from '@/router';
  import { RouterLink, RouterView } from 'vue-router'
  import HelloWorld from './components/HelloWorld.vue'
  import HomeView from './views/HomeView.vue';

  const goto = () => {
  router.push('/')
  }
</script>

<style scoped>

</style>