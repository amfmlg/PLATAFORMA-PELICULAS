<template>
  <div>
    <h1>PELI-CULONES</h1>
    <div class="grid-container">
      <div class="grid-item">
        <img src="https://image.tmdb.org/t/p/w600_and_h900_bestv2/tXQvtRWfkUUnWJAn2tN3jERIUG.jpg" alt="Inception">
        <h3>Inception</h3>
      </div>
      <div class="grid-item">
        <img src="https://image.tmdb.org/t/p/w600_and_h900_bestv2/lfj709InbmljVqAXgUk2qjnujNN.jpg" alt="Kill Bill Vol.1">
        <h3>Kill Bill Vol.1</h3>
      </div>
      <div class="grid-item">
        <img src="https://upload.wikimedia.org/wikipedia/en/b/bc/Interstellar_film_poster.jpg" alt="Interstellar">
        <h3>Interstellar</h3>
      </div>
      <div class="grid-item">
        <img src="https://upload.wikimedia.org/wikipedia/en/c/c1/The_Matrix_Poster.jpg" alt="The Matrix">
        <h3>The Matrix</h3>
      </div>
      <div class="grid-item">
        <img src="https://image.tmdb.org/t/p/w600_and_h900_bestv2/o2YToge3eBhxC89m87zkWKVEx2O.jpg" alt="Baby Driver">
        <h3>Baby Driver</h3>
      </div>
      <div class="grid-item">
        <img src="https://image.tmdb.org/t/p/w600_and_h900_bestv2/kfwpEsGsME1yVbZsPl6QvZy7Gue.jpg" alt="Mamma Mia!">
        <h3>Mamma Mia!</h3>
      </div>
      <div class="grid-item">
        <img src="https://upload.wikimedia.org/wikipedia/en/6/67/Forrest_Gump_poster.jpg" alt="Forrest Gump">
        <h3>Forrest Gump</h3>
      </div>
      <div class="grid-item">
        <img src="https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg" alt="Fight Club">
        <h3>Fight Club</h3>
      </div>
      <div class="grid-item">
        <img src="https://upload.wikimedia.org/wikipedia/en/8/81/ShawshankRedemptionMoviePoster.jpg" alt="The Shawshank Redemption">
        <h3>The Shawshank Redemption</h3>
      </div>
      
  </div>
    <button class="volver" @click="goto">Volver</button>
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
  console.log(peliculas.value); // Verifica la estructura de los datos aquí
});

const goto = () => {
  router.push('/');
};
</script>

<style scoped>
  body {
      background-color: #f5f5f5;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }
  h1{
    display: flex;
    justify-content: center;
  }
  .grid-container {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 20px;
    padding: 20px;
    background-color: #fff;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    border-radius: 10px;
  }

  .grid-item {
    text-align: center;
  }

  .grid-item img {
    width: 100%;
    border-radius: 10px;
  }

  .grid-item h3 {
    margin-top: 10px;
    font-size: 1.2rem;
    color: #333;
  }
</style>
