import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)

// ---------------------------------------------------------------------------------------------
// STATE
// ---------------------------------------------------------------------------------------------

const state = {
  url_serveur: 'http://localhost:8080/backendTheatre',
  allSpectacle: [],
  selectedSpectacle: null
}

// ---------------------------------------------------------------------------------------------
// GETTERS
// ---------------------------------------------------------------------------------------------

const getters = {
  getSpectacleByTitle: state => (title) => { return state.selectedSpectacle = state.allSpectacle.find(spectacle => spectacle.titre === title)}
}

// ---------------------------------------------------------------------------------------------
// MUTATIONS
// ---------------------------------------------------------------------------------------------

const mutations = {
  SET_ALL_SPECTACLE(state, data) { state.allSpectacle = data },
  SET_SELECTED_SPECTACLE(state, selectedSpectacle) { state.selectedSpectacle = selectedSpectacle }
}

const actions = {
  getAllSpectacle(context) {
    return axios.get(state.url_serveur + '/getAllSpectacle')
        .then(response => (context.commit('SET_ALL_SPECTACLE', response.data)))
  },
  setSelectedSpectacle(context, selectedSpectacle) {
    return context.commit('SET_SELECTED_SPECTACLE', selectedSpectacle)
  }
}

// ---------------------------------------------------------------------------------------------
// INITIALISATION DU STORE ET EXPORT
// ---------------------------------------------------------------------------------------------

// Création du store 
let store = new Vuex.Store({
  state: state,
  getters: getters,
  mutations: mutations,
  actions: actions
})

// Export du store
export default store