package me.localx.icons.straight.filled

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

public val Icons.Filled.Balloons: ImageVector
    get() {
        if (_balloons != null) {
            return _balloons!!
        }
        _balloons = Builder(name = "Balloons", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 0.0f)
                arcTo(7.008f, 7.008f, 0.0f, false, false, 0.0f, 7.0f)
                curveToRelative(0.0f, 4.257f, 2.875f, 9.0f, 7.0f, 9.0f)
                reflectiveCurveToRelative(7.0f, -4.743f, 7.0f, -9.0f)
                arcTo(7.008f, 7.008f, 0.0f, false, false, 7.0f, 0.0f)
                close()
                moveTo(10.617f, 11.646f)
                lineTo(8.917f, 10.584f)
                arcTo(6.546f, 6.546f, 0.0f, false, false, 9.977f, 8.0f)
                horizontalLineToRelative(2.0f)
                arcTo(8.184f, 8.184f, 0.0f, false, true, 10.617f, 11.646f)
                close()
                moveTo(18.0f, 1.0f)
                arcToRelative(6.151f, 6.151f, 0.0f, false, false, -3.5f, 1.036f)
                arcTo(8.942f, 8.942f, 0.0f, false, true, 16.0f, 7.0f)
                arcToRelative(12.808f, 12.808f, 0.0f, false, true, -1.7f, 6.287f)
                arcTo(5.121f, 5.121f, 0.0f, false, false, 18.0f, 15.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -3.589f, 6.0f, -8.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 18.0f, 1.0f)
                close()
                moveTo(20.312f, 11.752f)
                lineTo(19.0f, 10.248f)
                arcTo(4.038f, 4.038f, 0.0f, false, false, 19.977f, 8.0f)
                horizontalLineToRelative(2.0f)
                arcTo(5.847f, 5.847f, 0.0f, false, true, 20.312f, 11.752f)
                close()
                moveTo(21.412f, 24.062f)
                lineTo(19.65f, 23.117f)
                curveToRelative(0.714f, -1.33f, 0.358f, -1.605f, -1.116f, -2.447f)
                arcToRelative(4.348f, 4.348f, 0.0f, false, true, -2.46f, -2.563f)
                arcToRelative(3.142f, 3.142f, 0.0f, false, true, 0.017f, -1.406f)
                arcTo(6.483f, 6.483f, 0.0f, false, false, 18.0f, 17.0f)
                curveToRelative(0.025f, 0.0f, 0.048f, 0.0f, 0.073f, 0.0f)
                arcToRelative(1.348f, 1.348f, 0.0f, false, false, -0.051f, 0.655f)
                curveToRelative(0.115f, 0.49f, 0.79f, 0.875f, 1.505f, 1.284f)
                curveTo(20.855f, 19.692f, 23.078f, 20.961f, 21.413f, 24.062f)
                close()
                moveTo(11.0f, 22.0f)
                arcToRelative(4.092f, 4.092f, 0.0f, false, true, -0.729f, 2.0f)
                lineTo(8.557f, 22.973f)
                arcTo(2.518f, 2.518f, 0.0f, false, false, 9.0f, 22.0f)
                curveToRelative(0.0f, -0.354f, -0.6f, -0.682f, -1.447f, -1.105f)
                curveTo(6.476f, 20.356f, 5.0f, 19.618f, 5.0f, 18.0f)
                arcToRelative(1.854f, 1.854f, 0.0f, false, true, 0.041f, -0.264f)
                arcTo(7.37f, 7.37f, 0.0f, false, false, 7.0f, 18.0f)
                lineToRelative(0.024f, 0.0f)
                curveToRelative(-0.008f, 0.023f, -0.026f, 0.06f, -0.03f, 0.077f)
                curveToRelative(0.006f, 0.279f, 0.606f, 0.607f, 1.453f, 1.03f)
                curveTo(9.524f, 19.644f, 11.0f, 20.382f, 11.0f, 22.0f)
                close()
            }
        }
        .build()
        return _balloons!!
    }

private var _balloons: ImageVector? = null
