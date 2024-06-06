<script setup>
import router from '@/router';
import { ref } from 'vue';


const usuario = ref('');
const correo = ref('');
const contraseña = ref('');

const saveUser = async () => {
  try {
    const response = await axios.post('http://localhost:3306/saveUser', {
      usuario: usuario.value,
      correo: correo.value,
      contraseña: contraseña.value
    });
    console.log(response.data.message);
    router.push('/example');
  } catch (error) {
    console.error('Error al guardar el usuario:', error);
  }
};
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
        <button type="submit">Iniciar Sesion</button>
      </form>
    </div>
  </main>
</template>

<style>
body{
  background-color: rgb(252, 192, 192);
}
form {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    padding: 40px;
    border-radius: 10px;
    box-shadow: 0px 0px 10px rgba(255, 0, 0, 0.4);
    width: 100%;
    border: 1px black solid;
}
h1 {
    font-size: 3rem;
    margin-bottom: 20px;
    text-transform: uppercase;
}
label {
    font-size: 1.5rem;
    margin-bottom: 10px;
}

input {
    padding: 10px;
    border-radius: 5px;
    border: 1px solid #ccc;
    margin-bottom: 20px;
    width: 80%;
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
    background-color: rgba(231, 140, 140, 0.8);
}
button:hover {
    background-color: rgba(186, 58, 58, 0.8);
}

</style>