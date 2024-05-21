<template>
    <h1>Example</h1>
    <button @click=goto>Volver</button>
</template>

<script setup>
    import router from '@/router';

    const goto = () => {
    router.push('/')
    }
</script>


<style scoped>
</style>