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

public val Icons.Outline.TemperatureUp: ImageVector
    get() {
        if (_temperatureUp != null) {
            return _temperatureUp!!
        }
        _temperatureUp = Builder(name = "TemperatureUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 24.0f)
                curveToRelative(-6.079f, 0.117f, -9.334f, -7.638f, -5.0f, -11.89f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.211f, -6.609f, 9.791f, -6.6f, 10.0f, 0.0f)
                verticalLineToRelative(7.11f)
                curveTo(16.335f, 16.363f, 13.077f, 24.117f, 7.0f, 24.0f)
                close()
                moveTo(7.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.0f, 5.0f)
                verticalLineToRelative(7.537f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.332f, 0.744f)
                arcTo(5.018f, 5.018f, 0.0f, false, false, 7.0f, 22.0f)
                arcToRelative(5.018f, 5.018f, 0.0f, false, false, 3.332f, -8.719f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 12.537f)
                lineTo(10.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.0f, 2.0f)
                close()
                moveTo(7.0f, 20.0f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, -1.0f, -5.829f)
                lineTo(6.0f, 4.89f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(9.281f)
                arcTo(3.007f, 3.007f, 0.0f, false, true, 7.0f, 20.0f)
                close()
                moveTo(7.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 16.0f)
                close()
                moveTo(22.7f, 3.293f)
                lineTo(19.7f, 0.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.7f, 4.708f)
                lineTo(18.0f, 3.415f)
                lineTo(18.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(20.0f, 3.415f)
                lineToRelative(1.3f, 1.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.71f, 3.293f)
                horizontalLineToRelative(-0.005f)
                close()
            }
        }
        .build()
        return _temperatureUp!!
    }

private var _temperatureUp: ImageVector? = null
