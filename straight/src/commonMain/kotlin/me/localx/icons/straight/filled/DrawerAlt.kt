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
                moveToRelative(13.5f, 4.0f)
                lineTo(1.723f, 17.327f)
                curveToRelative(-0.372f, -0.102f, -0.728f, -0.286f, -1.024f, -0.578f)
                curveToRelative(-0.855f, -0.842f, -0.935f, -2.194f, -0.186f, -3.131f)
                lineToRelative(4.987f, -6.118f)
                lineToRelative(8.0f, -3.5f)
                close()
                moveTo(14.059f, 13.0f)
                lineToRelative(6.518f, -7.315f)
                lineToRelative(0.76f, -0.824f)
                curveToRelative(0.883f, -0.883f, 0.883f, -2.315f, 0.0f, -3.198f)
                curveToRelative(-0.883f, -0.883f, -2.315f, -0.883f, -3.198f, 0.0f)
                lineTo(2.0f, 19.802f)
                verticalLineToRelative(3.198f)
                horizontalLineToRelative(3.198f)
                lineToRelative(3.237f, -3.639f)
                curveToRelative(-0.167f, -0.341f, -0.305f, -0.696f, -0.37f, -1.08f)
                curveToRelative(-0.207f, -1.216f, 0.077f, -2.43f, 0.797f, -3.417f)
                curveToRelative(0.721f, -0.987f, 1.783f, -1.691f, 2.993f, -1.864f)
                horizontalLineToRelative(2.204f)
                close()
                moveTo(24.0f, 7.258f)
                lineToRelative(-1.512f, -0.695f)
                lineToRelative(-5.938f, 6.441f)
                lineToRelative(1.449f, -0.004f)
                lineToRelative(0.019f, 2.0f)
                horizontalLineToRelative(-5.519f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.936f, 0.016f, 1.875f, 0.133f, 2.775f, 0.355f)
                lineToRelative(0.901f, 0.224f)
                curveToRelative(1.138f, 0.282f, 2.306f, 0.423f, 3.478f, 0.419f)
                lineToRelative(1.348f, -0.005f)
                lineToRelative(-0.003f, -13.735f)
                close()
            }
        }
        .build()
        return _drawerAlt!!
    }

private var _drawerAlt: ImageVector? = null
