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

public val Icons.Filled.DrawerAlt: ImageVector
    get() {
        if (_drawerAlt != null) {
            return _drawerAlt!!
        }
        _drawerAlt = Builder(name = "DrawerAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.852f, 13.007f)
                curveToRelative(-1.209f, 0.173f, -2.272f, 0.877f, -2.993f, 1.864f)
                curveToRelative(-0.72f, 0.987f, -1.003f, 2.201f, -0.797f, 3.417f)
                curveToRelative(0.065f, 0.384f, 0.203f, 0.739f, 0.37f, 1.08f)
                lineToRelative(-2.044f, 2.297f)
                curveToRelative(-0.759f, 0.853f, -1.847f, 1.341f, -2.989f, 1.341f)
                horizontalLineToRelative(-0.903f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-1.176f)
                curveToRelative(0.0f, -0.98f, 0.36f, -1.926f, 1.012f, -2.659f)
                lineTo(18.136f, 1.669f)
                curveToRelative(0.883f, -0.883f, 2.315f, -0.883f, 3.198f, 0.0f)
                curveToRelative(0.883f, 0.883f, 0.883f, 2.315f, 0.0f, 3.198f)
                lineToRelative(-0.76f, 0.824f)
                lineToRelative(-6.518f, 7.315f)
                horizontalLineToRelative(-2.204f)
                close()
                moveTo(7.491f, 6.635f)
                curveToRelative(-1.31f, 0.573f, -2.465f, 1.45f, -3.369f, 2.559f)
                lineTo(0.51f, 13.625f)
                curveToRelative(-0.75f, 0.937f, -0.669f, 2.289f, 0.186f, 3.131f)
                curveToRelative(0.296f, 0.292f, 0.965f, 0.575f, 1.492f, 0.049f)
                reflectiveCurveTo(13.497f, 4.007f, 13.497f, 4.007f)
                lineToRelative(-6.006f, 2.628f)
                close()
                moveTo(23.997f, 7.906f)
                curveToRelative(0.0f, -0.391f, -0.228f, -0.745f, -0.582f, -0.908f)
                lineToRelative(-0.929f, -0.427f)
                lineToRelative(-5.938f, 6.441f)
                horizontalLineToRelative(0.452f)
                curveToRelative(0.552f, -0.003f, 1.001f, 0.441f, 1.006f, 0.993f)
                curveToRelative(0.005f, 0.554f, -0.44f, 1.007f, -0.994f, 1.013f)
                lineToRelative(-4.509f, -0.01f)
                curveToRelative(-1.381f, -0.003f, -2.503f, 1.116f, -2.503f, 2.497f)
                reflectiveCurveToRelative(1.118f, 2.497f, 2.497f, 2.497f)
                horizontalLineToRelative(3.003f)
                curveToRelative(0.936f, 0.016f, 1.872f, 0.139f, 2.772f, 0.362f)
                lineToRelative(0.901f, 0.224f)
                curveToRelative(1.137f, 0.282f, 2.305f, 0.423f, 3.477f, 0.419f)
                horizontalLineToRelative(0.353f)
                curveToRelative(0.551f, -0.003f, 0.997f, -0.45f, 0.997f, -1.001f)
                lineToRelative(-0.003f, -12.098f)
                close()
            }
        }
        .build()
        return _drawerAlt!!
    }

private var _drawerAlt: ImageVector? = null
