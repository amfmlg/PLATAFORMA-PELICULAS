<template>
    <div>
      <h1>PELI-CULONES</h1>
      <ul>
        <li v-for="pelicula in peliculas" :key="pelicula.id">
          <h3>{{ pelicula.title }}</h3>
        </li>
      </ul>
      <button @click="goto">Volver</button>
    </div>
  </template>
  
  <script setup>
  import router from '@/router';
  import { onMounted, ref } from 'vue';
  import MovieService from '@/services/MovieService';
  
  const peliculas = ref([]);
  
  onMounted(async () => {
    const service = new MovieService();
    peliculas.value = await service.getAllMovies();
  });
  
  const goto = () => {
    router.push('/');
  };
  </script>
  
  <style scoped>
  /* Estilos específicos del componente */
  </style>
  