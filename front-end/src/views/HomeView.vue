<script setup>
import router from '@/router';

const goto = () => {
  router.push('/example')
}

</script>

<template>
  <header>
    <h1>Peli-culones</h1>
  </header>
  <main>
    <div class="form">
      <form @submit.prevent="saveUser">
        <label for="usuario">Usuario: </label>
        <input v-model="usuario" type="text" id="usuario" placeholder="userExample">
        <label for="correo">Correo: </label>
        <input v-model="correo" type="email" id="correo" placeholder="example@gmail.com">
        <label for="contraseña">Contraseña: </label>
        <input v-model="contraseña" type="password" id="contraseña" placeholder="contraseña">
        <button type="submit" @click="goto">Iniciar Sesion</button>
      </form>
    </div>
  </main>
</template>

<style>
body {
  background-color: rgb(252, 192, 192);
  font-family: Arial, sans-serif;
  margin: 0;
  padding: 0;
}

header {
  text-align: center;
  margin-bottom: 20px;
}

h1 {
  font-size: 3rem;
  margin-bottom: 20px;
  text-transform: uppercase;
}

.main {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

.form {
  background-color: #fff;
  padding: 40px;
  border-radius: 10px;
  box-shadow: 0px 0px 10px rgba(255, 0, 0, 0.4);
  width: 100%;
  max-width: 400px;
  border: 1px solid black;
}

label {
  font-size: 1.5rem;
  margin-bottom: 10px;
  display: block;
}

input {
  padding: 10px;
  border-radius: 5px;
  border: 1px solid #ccc;
  margin-bottom: 20px;
  width: 100%;
  box-sizing: border-box;
}

input:focus {
  outline: none;
  border-color: rgb(251, 89, 89);
}

button {
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  background-color: rgb(245, 79, 79);
  color: #fff;
  font-size: 1.5rem;
  cursor: pointer;
  width: 100%;
  box-sizing: border-box;
}

button:hover {
  background-color: rgba(186, 58, 58, 0.8);
}
</style>
