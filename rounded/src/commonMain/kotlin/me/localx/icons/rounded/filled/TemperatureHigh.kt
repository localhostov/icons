package me.localx.icons.rounded.filled

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

public val Icons.Filled.TemperatureHigh: ImageVector
    get() {
        if (_temperatureHigh != null) {
            return _temperatureHigh!!
        }
        _temperatureHigh = Builder(name = "TemperatureHigh", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 17.0f)
                arcToRelative(7.009f, 7.009f, 0.0f, false, true, -7.0f, 7.0f)
                curveToRelative(-6.077f, 0.117f, -9.335f, -7.638f, -5.0f, -11.889f)
                lineTo(6.0f, 5.0f)
                curveToRelative(0.211f, -6.609f, 9.791f, -6.6f, 10.0f, 0.0f)
                verticalLineToRelative(7.111f)
                arcTo(7.007f, 7.007f, 0.0f, false, true, 18.0f, 17.0f)
                close()
                moveTo(14.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, -2.828f)
                lineTo(12.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(9.172f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 14.0f, 17.0f)
                close()
                moveTo(24.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                close()
                moveTo(22.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 3.0f)
                close()
            }
        }
        .build()
        return _temperatureHigh!!
    }

private var _temperatureHigh: ImageVector? = null
