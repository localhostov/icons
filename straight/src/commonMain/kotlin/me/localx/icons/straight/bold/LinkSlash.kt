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

public val Icons.Bold.LinkSlash: ImageVector
    get() {
        if (_linkSlash != null) {
            return _linkSlash!!
        }
        _linkSlash = Builder(name = "LinkSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.13f, 11.579f)
                lineToRelative(2.229f, -2.223f)
                lineToRelative(2.117f, 2.125f)
                lineToRelative(-2.228f, 2.221f)
                curveToRelative(-0.806f, 0.806f, -1.25f, 1.877f, -1.25f, 3.016f)
                reflectiveCurveToRelative(0.444f, 2.211f, 1.25f, 3.017f)
                curveToRelative(0.81f, 0.81f, 1.884f, 1.259f, 3.024f, 1.266f)
                horizontalLineToRelative(0.024f)
                curveToRelative(1.129f, 0.0f, 2.187f, -0.437f, 2.981f, -1.231f)
                lineToRelative(2.239f, -2.246f)
                lineToRelative(2.125f, 2.118f)
                lineToRelative(-2.241f, 2.248f)
                curveToRelative(-1.362f, 1.363f, -3.174f, 2.112f, -5.104f, 2.112f)
                horizontalLineToRelative(-0.041f)
                curveToRelative(-1.936f, -0.011f, -3.758f, -0.772f, -5.129f, -2.145f)
                curveTo(0.756f, 20.483f, 0.0f, 18.659f, 0.0f, 16.718f)
                reflectiveCurveToRelative(0.757f, -3.765f, 2.131f, -5.139f)
                close()
                moveTo(10.553f, 15.567f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-1.493f, 1.494f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.493f, -1.494f)
                close()
                moveTo(2.123f, 0.002f)
                lineTo(7.92f, 5.798f)
                lineToRelative(3.676f, -3.67f)
                curveToRelative(2.834f, -2.834f, 7.443f, -2.833f, 10.275f, 0.0f)
                curveToRelative(1.372f, 1.372f, 2.128f, 3.197f, 2.128f, 5.138f)
                curveToRelative(0.0f, 1.94f, -0.756f, 3.765f, -2.127f, 5.136f)
                lineToRelative(-3.671f, 3.678f)
                lineToRelative(5.797f, 5.797f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(0.002f, 2.123f)
                lineTo(2.123f, 0.002f)
                close()
                moveTo(19.75f, 10.282f)
                curveToRelative(0.806f, -0.806f, 1.249f, -1.877f, 1.249f, -3.016f)
                curveToRelative(0.0f, -1.14f, -0.443f, -2.211f, -1.249f, -3.017f)
                curveToRelative(-1.664f, -1.663f, -4.37f, -1.663f, -6.034f, 0.0f)
                lineToRelative(-3.675f, 3.669f)
                lineToRelative(1.959f, 1.959f)
                lineToRelative(2.939f, -2.939f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-2.939f, 2.939f)
                lineToRelative(1.96f, 1.96f)
                lineToRelative(3.67f, -3.677f)
                close()
            }
        }
        .build()
        return _linkSlash!!
    }

private var _linkSlash: ImageVector? = null
