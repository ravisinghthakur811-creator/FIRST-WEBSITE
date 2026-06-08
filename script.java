/**
   * playVideo(mediaEl)
   * Called when a thumbnail or "Watch Now" button is clicked.
   * - Pauses any other playing video first.
   * - Shows the HTML5 <video> player and starts playback.
   */
  function playVideo(mediaEl) {
    // Pause all other videos first
    document.querySelectorAll('.card-media.playing').forEach(el => {
      if (el !== mediaEl) stopMedia(el);
    });

    mediaEl.classList.add('playing');

    // Auto-play the <video> element
    const video = mediaEl.querySelector('video');
    if (video) {
      video.play();
    }
  }

  /**
   * closeVideo(event, closeBtn)
   * Stops propagation so clicking ✕ doesn't re-trigger playVideo.
   */
  function closeVideo(event, closeBtn) {
    event.stopPropagation();
    const mediaEl = closeBtn.closest('.card-media');
    stopMedia(mediaEl);
  }

  /**
   * stopMedia(mediaEl)
   * Hides the player, pauses playback, and resets to the beginning.
   */
  function stopMedia(mediaEl) {
    mediaEl.classList.remove('playing');
    const video = mediaEl.querySelector('video');
    if (video) {
      video.pause();
      video.currentTime = 0;
    }
  }

  /* ── Filter tab toggle (cosmetic) ── */
  document.querySelectorAll('.filter-btn').forEach(btn => {
    btn.addEventListener('click', () => {
      document.querySelectorAll('.filter-btn').forEach(b => b.classList.remove('active'));
      btn.classList.add('active');
    });
  });

/**
   * playVideo(mediaEl)
   * Called when a thumbnail or "Watch Now" button is clicked.
   * - Pauses any other playing video first.
   * - Shows the HTML5 <video> player and starts playback.
   */
  function playVideo(mediaEl) {
    // Pause all other videos first
    document.querySelectorAll('.card-media.playing').forEach(el => {
      if (el !== mediaEl) stopMedia(el);
    });

    mediaEl.classList.add('playing');

    // Auto-play the <video> element
    const video = mediaEl.querySelector('video');
    if (video) {
      video.play();
    }
  }

  /**
   * closeVideo(event, closeBtn)
   * Stops propagation so clicking ✕ doesn't re-trigger playVideo.
   */
  function closeVideo(event, closeBtn) {
    event.stopPropagation();
    const mediaEl = closeBtn.closest('.card-media');
    stopMedia(mediaEl);
  }

  /**
   * stopMedia(mediaEl)
   * Hides the player, pauses playback, and resets to the beginning.
   */
  function stopMedia(mediaEl) {
    mediaEl.classList.remove('playing');
    const video = mediaEl.querySelector('video');
    if (video) {
      video.pause();
      video.currentTime = 0;
    }
  }

  /* ── Filter tab toggle (cosmetic) ── */
  document.querySelectorAll('.filter-btn').forEach(btn => {
    btn.addEventListener('click', () => {
      document.querySelectorAll('.filter-btn').forEach(b => b.classList.remove('active'));
      btn.classList.add('active');
    });
  });