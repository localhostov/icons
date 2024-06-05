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

public val Icons.Bold.TemperatureLow: ImageVector
    get() {
        if (_temperatureLow != null) {
            return _temperatureLow!!
        }
        _temperatureLow = Builder(name = "TemperatureLow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.5f, 0.0f)
                close()
                moveTo(14.0f, 16.037f)
                arcToRelative(2.995f, 2.995f, 0.0f, true, true, -4.5f, -2.584f)
                lineTo(9.5f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(1.953f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 14.0f, 16.037f)
                close()
                moveTo(17.0f, 6.037f)
                curveToRelative(-0.253f, -7.932f, -11.75f, -7.926f, -12.0f, 0.0f)
                verticalLineToRelative(4.692f)
                curveTo(0.43f, 15.683f, 4.262f, 24.135f, 11.0f, 24.0f)
                curveToRelative(6.737f, 0.135f, 10.571f, -8.318f, 6.0f, -13.271f)
                close()
                moveTo(11.0f, 21.0f)
                arcToRelative(5.011f, 5.011f, 0.0f, false, true, -3.459f, -8.59f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 11.33f)
                lineTo(8.0f, 6.037f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                lineTo(14.0f, 11.33f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.459f, 1.08f)
                arcTo(5.011f, 5.011f, 0.0f, false, true, 11.0f, 21.0f)
                close()
            }
        }
        .build()
        return _temperatureLow!!
    }

private var _temperatureLow: ImageVector? = null
