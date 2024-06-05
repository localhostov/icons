package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) {
            return _waveTriangle!!
        }
        _waveTriangle = Builder(name = "WaveTriangle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 22.0f)
                curveToRelative(-0.013f, 0.0f, -0.027f, 0.0f, -0.04f, 0.0f)
                curveToRelative(-0.541f, -0.015f, -1.032f, -0.319f, -1.286f, -0.798f)
                lineTo(7.418f, 6.552f)
                lineToRelative(-4.632f, 7.72f)
                curveToRelative(-0.426f, 0.709f, -1.347f, 0.941f, -2.058f, 0.514f)
                curveToRelative(-0.71f, -0.426f, -0.94f, -1.348f, -0.514f, -2.058f)
                lineTo(6.214f, 2.728f)
                curveToRelative(0.278f, -0.464f, 0.787f, -0.758f, 1.326f, -0.728f)
                curveToRelative(0.541f, 0.015f, 1.032f, 0.319f, 1.286f, 0.798f)
                lineToRelative(7.756f, 14.65f)
                lineToRelative(4.632f, -7.72f)
                curveToRelative(0.426f, -0.709f, 1.348f, -0.94f, 2.058f, -0.514f)
                curveToRelative(0.71f, 0.426f, 0.94f, 1.348f, 0.514f, 2.058f)
                lineToRelative(-6.0f, 10.0f)
                curveToRelative(-0.271f, 0.452f, -0.76f, 0.728f, -1.286f, 0.728f)
                close()
            }
        }
        .build()
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
