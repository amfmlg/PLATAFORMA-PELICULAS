export default class MovieServie {
    baseUri = "https://api.themoviedb.org/3/movie/top_rated"

    async getAllMovies() {
        const rawResponse = await fetch(this.baseUri, {
            headers: {
                'Authorization': ' Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI4ZTk5NDAyNjY5MmQ1MmNiMjkwM2UyYTQ0NzgyMDQ0NCIsInN1YiI6IjY2NGVmZGE5NTdmMjFmYTc2NWNhZTJkNSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.tv9CdmiDX8BQUzliVL-XNZepsgrBtliVwzobqbAJb5o',
                'Accept' : 'application/json'
            }
        })
        const response = await rawResponse.json()
        return response
    }

    async getMovieById(id) {
        const rawResponse = await fetch(`${this.baseUri}/${id}`)
        const response = await rawResponse.json()
        return response
    }
}