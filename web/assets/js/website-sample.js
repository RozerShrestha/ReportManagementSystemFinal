particlesJS('particles', {
  particles: {
    color: '#EF9A9A',
    color_random: false,
    shape: 'circle', // "circle", "edge" or "triangle"
    opacity: {
      opacity: 1,
      anim: {
        enable: false,
        speed: 1.5,
        opacity_min: 0,
        sync: false
      }
    },
    size: 2.5,
    size_random: true,
    nb: 100,
    line_linked: {
      enable_auto: true,
      distance: 1,
      color: '#CBCBCB',
      opacity: 0.1,
      width: 1,
      condensed_mode: {
        enable: false,
        rotateX: 100,
        rotateY: 100
      }
    },
    anim: {
      enable: true,
      speed: 1
    }
  },
  interactivity: {
    enable: true,
    mouse: {
      distance: 1
    },
    detect_on: 'canvas', // "canvas" or "window"
    mode: 'grab', // "grab" of false
    line_linked: {
      opacity: .5
    },
    events: {
      onclick: {
        enable: false,
        mode: 'push', // "push" or "remove"
        nb: 4
      },
      onresize: {
        enable: true,
        mode: 'bounce', // "out" or "bounce"
        density_auto: false,
        density_area: 10 
      }
    }
  },
  /* Retina Display Support */
  retina_detect: true
});