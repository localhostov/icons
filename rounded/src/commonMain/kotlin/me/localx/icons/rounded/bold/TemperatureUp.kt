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

public val Icons.Bold.TemperatureUp: ImageVector
    get() {
        if (_temperatureUp != null) {
            return _temperatureUp!!
        }
        _temperatureUp = Builder(name = "TemperatureUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 16.037f)
                arcToRelative(2.995f, 2.995f, 0.0f, true, true, -4.5f, -2.584f)
                lineTo(6.5f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(6.953f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 11.0f, 16.037f)
                close()
                moveTo(14.0f, 10.729f)
                curveToRelative(4.57f, 4.954f, 0.738f, 13.406f, -6.0f, 13.271f)
                curveToRelative(-6.737f, 0.135f, -10.571f, -8.318f, -6.0f, -13.271f)
                lineTo(2.0f, 6.037f)
                curveToRelative(0.253f, -7.932f, 11.75f, -7.926f, 12.0f, 0.0f)
                close()
                moveTo(13.0f, 16.0f)
                arcToRelative(4.952f, 4.952f, 0.0f, false, false, -1.541f, -3.59f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 11.33f)
                lineTo(11.0f, 6.037f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                lineTo(5.0f, 11.33f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.459f, 1.08f)
                arcTo(4.994f, 4.994f, 0.0f, true, false, 13.0f, 16.0f)
                close()
                moveTo(21.0f, 10.5f)
                lineTo(21.0f, 5.163f)
                horizontalLineToRelative(1.663f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, 0.707f, -1.707f)
                lineTo(20.207f, 0.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(15.63f, 3.456f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, 0.707f, 1.707f)
                lineTo(18.0f, 5.163f)
                lineTo(18.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 10.5f)
                close()
            }
        }
        .build()
        return _temperatureUp!!
    }

private var _temperatureUp: ImageVector? = null
