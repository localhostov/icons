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

public val Icons.Filled.RazorBarber: ImageVector
    get() {
        if (_razorBarber != null) {
            return _razorBarber!!
        }
        _razorBarber = Builder(name = "RazorBarber", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                lineTo(4.399f, 2.0f)
                curveTo(2.382f, 2.0f, 0.675f, 3.509f, 0.429f, 5.511f)
                lineToRelative(-0.429f, 2.489f)
                horizontalLineToRelative(11.75f)
                curveToRelative(2.032f, 0.0f, 3.74f, -1.522f, 3.973f, -3.542f)
                lineToRelative(0.168f, -0.458f)
                horizontalLineToRelative(2.089f)
                curveToRelative(-0.205f, 3.696f, -2.628f, 9.671f, -6.971f, 14.042f)
                curveToRelative(-1.355f, 1.373f, -1.34f, 3.594f, 0.033f, 4.95f)
                curveToRelative(0.681f, 0.672f, 1.57f, 1.007f, 2.458f, 1.007f)
                curveToRelative(0.904f, 0.0f, 1.808f, -0.347f, 2.492f, -1.039f)
                curveToRelative(5.705f, -5.781f, 5.578f, -17.362f, 5.518f, -19.259f)
                curveToRelative(1.459f, -0.597f, 2.491f, -2.028f, 2.491f, -3.7f)
                close()
                moveTo(13.5f, 22.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _razorBarber!!
    }

private var _razorBarber: ImageVector? = null
