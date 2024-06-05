package me.localx.icons.rounded.bold

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

public val Icons.Bold.ScrewAlt: ImageVector
    get() {
        if (_screwAlt != null) {
            return _screwAlt!!
        }
        _screwAlt = Builder(name = "ScrewAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.689f, 18.0f)
                lineToRelative(-1.732f, -3.0f)
                curveToRelative(-0.357f, -0.619f, -1.018f, -1.0f, -1.732f, -1.0f)
                horizontalLineToRelative(-3.464f)
                curveToRelative(-0.715f, 0.0f, -1.375f, 0.381f, -1.732f, 1.0f)
                lineToRelative(-1.732f, 3.0f)
                curveToRelative(-0.357f, 0.619f, -0.357f, 1.381f, 0.0f, 2.0f)
                lineToRelative(1.732f, 3.0f)
                curveToRelative(0.357f, 0.619f, 1.018f, 1.0f, 1.732f, 1.0f)
                horizontalLineToRelative(3.464f)
                curveToRelative(0.715f, 0.0f, 1.375f, -0.381f, 1.732f, -1.0f)
                lineToRelative(1.732f, -3.0f)
                curveToRelative(0.357f, -0.619f, 0.357f, -1.381f, 0.0f, -2.0f)
                close()
                moveTo(18.5f, 21.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(9.879f, 0.0f)
                lineTo(2.121f, 0.0f)
                curveTo(0.949f, 0.0f, 0.0f, 0.949f, 0.0f, 2.121f)
                curveToRelative(0.0f, 0.563f, 0.224f, 1.103f, 0.622f, 1.501f)
                lineToRelative(1.378f, 1.375f)
                verticalLineToRelative(13.346f)
                curveToRelative(0.0f, 1.469f, 0.572f, 2.85f, 1.611f, 3.889f)
                lineToRelative(1.329f, 1.329f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(1.329f, -1.329f)
                curveToRelative(1.039f, -1.039f, 1.611f, -2.419f, 1.611f, -3.889f)
                lineTo(10.002f, 5.022f)
                lineToRelative(1.387f, -1.403f)
                curveToRelative(0.393f, -0.397f, 0.613f, -0.933f, 0.613f, -1.491f)
                verticalLineToRelative(-0.008f)
                curveToRelative(0.0f, -1.171f, -0.949f, -2.121f, -2.121f, -2.121f)
                close()
                moveTo(5.0f, 11.914f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(2.819f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(-2.819f)
                close()
                moveTo(7.0f, 7.086f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(-4.076f)
                lineToRelative(2.0f, 0.006f)
                verticalLineToRelative(2.07f)
                close()
                moveTo(6.268f, 20.111f)
                lineToRelative(-0.268f, 0.268f)
                lineToRelative(-0.268f, -0.268f)
                curveToRelative(-0.465f, -0.465f, -0.732f, -1.109f, -0.732f, -1.768f)
                verticalLineToRelative(-0.782f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(2.782f)
                curveToRelative(0.0f, 0.658f, -0.267f, 1.302f, -0.732f, 1.768f)
                close()
            }
        }
        .build()
        return _screwAlt!!
    }

private var _screwAlt: ImageVector? = null
