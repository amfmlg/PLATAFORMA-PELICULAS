<script setup>
import router from '@/router';

const goto = () => {
  router.push('/example')
}
</script>

<template>
<h1>Hola mundo</h1>
<button @click="goto">example</button>
</template>
