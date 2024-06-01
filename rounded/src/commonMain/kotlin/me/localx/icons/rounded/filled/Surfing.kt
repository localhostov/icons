package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Surfing: ImageVector
    get() {
        if (_surfing != null) {
            return _surfing!!
        }
        _surfing = Builder(name = "Surfing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 0.0102f)
                    curveTo(16.188f, 0.0102f, 11.875f, 2.0482f, 8.461f, 5.4612f)
                    curveTo(5.0277f, 8.8651f, 2.2669f, 12.8856f, 0.323f, 17.3122f)
                    curveTo(0.0215f, 18.0129f, -0.0721f, 18.7854f, 0.0535f, 19.5378f)
                    curveTo(0.179f, 20.2901f, 0.5184f, 20.9905f, 1.031f, 21.5552f)
                    lineTo(15.293f, 7.2932f)
                    curveTo(15.3853f, 7.1977f, 15.4956f, 7.1215f, 15.6176f, 7.0691f)
                    curveTo(15.7396f, 7.0167f, 15.8708f, 6.9891f, 16.0036f, 6.988f)
                    curveTo(16.1364f, 6.9868f, 16.2681f, 7.0121f, 16.391f, 7.0624f)
                    curveTo(16.5139f, 7.1127f, 16.6255f, 7.1869f, 16.7194f, 7.2808f)
                    curveTo(16.8133f, 7.3747f, 16.8876f, 7.4864f, 16.9378f, 7.6093f)
                    curveTo(16.9881f, 7.7322f, 17.0134f, 7.8639f, 17.0123f, 7.9966f)
                    curveTo(17.0111f, 8.1294f, 16.9835f, 8.2606f, 16.9311f, 8.3826f)
                    curveTo(16.8787f, 8.5046f, 16.8025f, 8.615f, 16.707f, 8.7072f)
                    lineTo(2.449f, 22.9652f)
                    curveTo(3.0104f, 23.4811f, 3.7095f, 23.823f, 4.4613f, 23.9496f)
                    curveTo(5.2132f, 24.0761f, 5.9857f, 23.9819f, 6.685f, 23.6782f)
                    curveTo(11.1144f, 21.7373f, 15.1365f, 18.9757f, 18.539f, 15.5392f)
                    curveTo(21.952f, 12.1262f, 23.99f, 7.8132f, 23.99f, 4.0002f)
                    curveTo(24.0463f, 3.4624f, 23.9817f, 2.9189f, 23.8011f, 2.4092f)
                    curveTo(23.6204f, 1.8996f, 23.3283f, 1.4367f, 22.9459f, 1.0543f)
                    curveTo(22.5636f, 0.672f, 22.1007f, 0.3798f, 21.591f, 0.1992f)
                    curveTo(21.0814f, 0.0186f, 20.5378f, -0.046f, 20.0f, 0.0102f)
                    close()
                }
            }
        }
        .build()
        return _surfing!!
    }

private var _surfing: ImageVector? = null
