package me.localx.icons.rounded.outline

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

public val Icons.Outline.TemperatureHigh: ImageVector
    get() {
        if (_temperatureHigh != null) {
            return _temperatureHigh!!
        }
        _temperatureHigh = Builder(name = "TemperatureHigh", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 24.0f)
                curveToRelative(-6.078f, 0.117f, -9.334f, -7.638f, -5.0f, -11.889f)
                lineTo(6.0f, 5.0f)
                curveToRelative(0.211f, -6.609f, 9.791f, -6.6f, 10.0f, 0.0f)
                verticalLineToRelative(7.111f)
                curveTo(20.335f, 16.363f, 17.077f, 24.117f, 11.0f, 24.0f)
                close()
                moveTo(11.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 5.0f)
                verticalLineToRelative(7.537f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.332f, 0.744f)
                arcTo(5.018f, 5.018f, 0.0f, false, false, 11.0f, 22.0f)
                arcToRelative(5.018f, 5.018f, 0.0f, false, false, 3.332f, -8.719f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 12.537f)
                lineTo(14.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 2.0f)
                close()
                moveTo(11.0f, 20.0f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, -1.0f, -5.829f)
                lineTo(10.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(9.171f)
                arcTo(3.007f, 3.007f, 0.0f, false, true, 11.0f, 20.0f)
                close()
                moveTo(11.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 16.0f)
                close()
                moveTo(21.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 6.0f)
                close()
                moveTo(21.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 2.0f)
                close()
            }
        }
        .build()
        return _temperatureHigh!!
    }

private var _temperatureHigh: ImageVector? = null
