package me.localx.icons.straight.outline

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

public val Icons.Outline.RazorBarber: ImageVector
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
                lineTo(4.5f, 2.0f)
                curveToRelative(-2.017f, 0.0f, -3.724f, 1.509f, -3.97f, 3.511f)
                lineToRelative(-0.429f, 3.489f)
                horizontalLineToRelative(11.648f)
                curveToRelative(2.032f, 0.0f, 3.74f, -1.522f, 3.973f, -3.542f)
                lineToRelative(0.168f, -1.458f)
                horizontalLineToRelative(2.089f)
                curveToRelative(-0.205f, 3.696f, -2.628f, 9.671f, -6.971f, 14.042f)
                curveToRelative(-1.355f, 1.373f, -1.34f, 3.594f, 0.033f, 4.95f)
                curveToRelative(0.681f, 0.672f, 1.57f, 1.007f, 2.458f, 1.007f)
                curveToRelative(0.904f, 0.0f, 1.808f, -0.347f, 2.492f, -1.039f)
                curveToRelative(5.705f, -5.781f, 5.578f, -17.362f, 5.518f, -19.259f)
                curveToRelative(1.459f, -0.597f, 2.491f, -2.028f, 2.491f, -3.7f)
                close()
                moveTo(13.736f, 5.229f)
                curveToRelative(-0.117f, 1.01f, -0.971f, 1.771f, -1.987f, 1.771f)
                lineTo(2.362f, 7.0f)
                lineToRelative(0.153f, -1.245f)
                curveToRelative(0.123f, -1.0f, 0.977f, -1.755f, 1.985f, -1.755f)
                horizontalLineToRelative(9.378f)
                lineToRelative(-0.142f, 1.229f)
                close()
                moveTo(14.568f, 21.554f)
                curveToRelative(-0.582f, 0.589f, -1.534f, 0.595f, -2.122f, 0.014f)
                curveToRelative(-0.588f, -0.581f, -0.595f, -1.533f, -0.016f, -2.12f)
                curveToRelative(3.605f, -3.628f, 5.964f, -8.208f, 6.987f, -12.029f)
                curveToRelative(-0.283f, 4.126f, -1.31f, 10.549f, -4.849f, 14.134f)
                close()
            }
        }
        .build()
        return _razorBarber!!
    }

private var _razorBarber: ImageVector? = null
