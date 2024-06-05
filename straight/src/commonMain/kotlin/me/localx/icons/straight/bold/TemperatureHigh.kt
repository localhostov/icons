package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -4.5f, -2.6f)
                lineTo(9.5f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.439f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 14.0f, 16.037f)
                close()
                moveTo(17.0f, 10.729f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 19.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 3.0f, 16.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 2.0f, -5.271f)
                lineTo(5.0f, 6.037f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(16.0f, 16.0f)
                arcToRelative(4.95f, 4.95f, 0.0f, false, false, -1.541f, -3.59f)
                lineTo(14.0f, 11.968f)
                lineTo(14.0f, 6.037f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                verticalLineToRelative(5.931f)
                lineToRelative(-0.459f, 0.442f)
                arcTo(4.95f, 4.95f, 0.0f, false, false, 6.0f, 16.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                close()
                moveTo(21.5f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 24.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.5f, 0.0f)
                close()
            }
        }
        .build()
        return _temperatureHigh!!
    }

private var _temperatureHigh: ImageVector? = null
