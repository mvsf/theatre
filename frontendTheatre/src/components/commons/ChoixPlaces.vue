<template>
  <h1> Choix places {{selectedSpectacle.titre}}</h1>
</template>

<script>
import { mapState } from 'vuex'

export default {
  name: 'ChoixPlaces',
  computed: {
    ...mapState([ 'selectedSpectacle'])
  }
}
</script>
