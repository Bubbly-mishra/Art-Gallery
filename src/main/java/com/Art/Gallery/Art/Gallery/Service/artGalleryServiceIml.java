package com.Art.Gallery.Art.Gallery.Service;

import org.springframework.stereotype.Service;

@Service
public class artGalleryServiceIml {


    public String getArtworkDetails(String name) {

        switch (name) {
            case "Mona Lisa":
                return "Title: Mona Lisa\n" +
                        "Creator: Leonardo da Vinci\n" +
                        "Date of Creation: 1503-1517\n" +
                        "Subject: Lisa Gherardini\n" +
                        "Location: Louvre Museum, Paris, France\n" +
                        "Style and Technique: Sfumato, Chiaroscuro\n" +
                        "Popularity and Legacy: Iconic masterpiece, subject of numerous interpretations and analyses.";
            case "The Starry Night":
                return "Title: The Starry Night\n" +
                        "Creator: Vincent van Gogh\n" +
                        "Date of Creation: 1889\n" +
                        "Subject: View from van Gogh's asylum room window\n" +
                        "Location: Museum of Modern Art (MoMA), New York City\n" +
                        "Style and Technique: Expressive brushwork, vibrant colors\n" +
                        "Popularity and Legacy: Iconic image of Western art, widely recognized for emotional intensity.";
            case "The Scream":
                return "Title: The Scream\n" +
                        "Creator: Edvard Munch\n" +
                        "Date of Creation: 1893\n" +
                        "Subject: Expression of anxiety and existential dread\n" +
                        "Location: National Gallery, Oslo, Norway\n" +
                        "Style and Technique: Symbolism, vivid colors, bold brushstrokes\n" +
                        "Popularity and Legacy: Symbol of modern angst, widely reproduced and parodied.";
            case "Girl With a Pearl Earring":
                return "Title: Girl With a Pearl Earring\n" +
                        "Creator: Johannes Vermeer\n" +
                        "Date of Creation: c. 1665\n" +
                        "Subject: Unknown girl wearing a pearl earring\n" +
                        "Location: Mauritshuis museum, The Hague, Netherlands\n" +
                        "Style and Technique: Dutch Golden Age painting, chiaroscuro\n" +
                        "Popularity and Legacy: Iconic portrayal of innocence and beauty.";
            case "The Kiss":
                return "Title: The Kiss\n" +
                        "Creator: Gustav Klimt\n" +
                        "Date of Creation: 1907-1908\n" +
                        "Subject: Embrace between man and woman\n" +
                        "Location: Österreichische Galerie Belvedere, Vienna, Austria\n" +
                        "Style and Technique: Symbolism, decorative arts\n" +
                        "Popularity and Legacy: Iconic symbol of love and romance.";
            case "Whistler's Mother":
                return "Title: Arrangement in Grey and Black No. 1 (commonly known as Whistler's Mother)\n" +
                        "Creator: James McNeill Whistler\n" +
                        "Date of Creation: 1871\n" +
                        "Subject: Anna McNeill Whistler, the artist's mother\n" +
                        "Location: Musée d'Orsay, Paris, France\n" +
                        "Style and Technique: Realism, tonal harmony\n" +
                        "Popularity and Legacy: Iconic portrayal of motherhood, often parodied and referenced in popular culture.";
            default:
                return "Details for the given key are not available.";
        }
    }
}
