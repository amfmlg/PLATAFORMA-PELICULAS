<template>
    <h1>Example</h1>
    <ul>
        <li v-for="pelicula in peliculas" :key="pelicula.id">
            <h3>{{ pelicula.titulo }}</h3>
            <p>{{ pelicula.director }}</p>
        </li>
    </ul>
    <button @click=goto>Volver</button>
</template>

<script setup>
    import router from '@/router';
    import { onMounted, ref } from 'vue';
    import MovieService from '@/services/MovieService';

    const peliculas = ref([])

    onMounted(async () => {
        const service = new MovieService()
        const peliculas = await service.getAllMovies()
    })

    const goto = () => {
    router.push('/')
    }
</script>


<style scoped>
</style>