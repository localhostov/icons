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

public val Icons.Outline.Pi: ImageVector
    get() {
        if (_pi != null) {
            return _pi!!
        }
        _pi = Builder(name = "Pi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 2.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(13.869f)
                curveToRelative(0.0f, 4.981f, -3.184f, 7.995f, -3.32f, 8.121f)
                lineToRelative(-1.36f, -1.466f)
                curveToRelative(0.024f, -0.023f, 2.68f, -2.572f, 2.68f, -6.655f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.302f, 0.0f, -2.299f, 0.366f, -3.049f, 1.118f)
                curveToRelative(-1.441f, 1.445f, -1.451f, 3.852f, -1.451f, 3.876f)
                lineToRelative(-2.0f, 0.016f)
                curveToRelative(0.0f, -0.131f, -0.006f, -3.244f, 2.022f, -5.291f)
                curveTo(3.152f, 0.578f, 4.658f, 0.0f, 6.5f, 0.0f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _pi!!
    }

private var _pi: ImageVector? = null
