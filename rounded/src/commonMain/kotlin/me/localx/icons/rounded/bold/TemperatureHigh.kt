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

public val Icons.Bold.TemperatureHigh: ImageVector
    get() {
        if (_temperatureHigh != null) {
            return _temperatureHigh!!
        }
        _temperatureHigh = Builder(name = "TemperatureHigh", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 16.037f)
                arcToRelative(2.995f, 2.995f, 0.0f, true, true, -4.5f, -2.584f)
                lineTo(9.5f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(6.953f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 14.0f, 16.037f)
                close()
                moveTo(17.0f, 10.729f)
                curveToRelative(4.57f, 4.953f, 0.739f, 13.406f, -6.0f, 13.271f)
                curveTo(4.262f, 24.135f, 0.429f, 15.681f, 5.0f, 10.729f)
                lineTo(5.0f, 6.037f)
                curveToRelative(0.253f, -7.931f, 11.75f, -7.926f, 12.0f, 0.0f)
                close()
                moveTo(16.0f, 16.0f)
                arcToRelative(4.95f, 4.95f, 0.0f, false, false, -1.541f, -3.59f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 11.33f)
                lineTo(14.0f, 6.037f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                lineTo(8.0f, 11.33f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.459f, 1.08f)
                arcTo(4.994f, 4.994f, 0.0f, true, false, 16.0f, 16.0f)
                close()
                moveTo(24.0f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 24.0f, 2.5f)
                close()
            }
        }
        .build()
        return _temperatureHigh!!
    }

private var _temperatureHigh: ImageVector? = null
