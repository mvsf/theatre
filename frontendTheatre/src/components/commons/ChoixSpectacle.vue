<template>
<div>
  <h1> Choisissez un spectacle </h1>
  <select v-model="selectedSpectacleTitle" class="browser-default custom-select">
    <option v-for="spectacle in allSpectacle">{{ spectacle.titre }}</option>
  </select>
  <b-button v-if="selectedSpectacleTitle" @click="setSelectedSpectacle()" variant="success">Acheter</b-button>
  
</div>
</template>

<script>
import { mapState } from 'vuex'

export default {
  name: 'ChoixSpectacle',
  data() {
    return {
      selectedSpectacleTitle: null,
    }
  },
  computed: {
    ...mapState([
      'allSpectacle'
    ])
  },
  mounted: function() {
    this.getAllSpectacle()
  },
  methods: {
    getAllSpectacle() {
      return this.$store.dispatch('getAllSpectacle')
    },
    setSelectedSpectacle() {
      return this.$store.dispatch('setSelectedSpectacle', this.$store.getters.getSpectacleByTitle(this.selectedSpectacleTitle))
    }
  }
}
</script>
