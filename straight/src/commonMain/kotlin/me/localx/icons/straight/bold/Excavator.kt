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

public val Icons.Bold.Excavator: ImageVector
    get() {
        if (_excavator != null) {
            return _excavator!!
        }
        _excavator = Builder(name = "Excavator", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.405f, 2.0f)
                lineToRelative(-7.082f, 6.666f)
                lineToRelative(-2.501f, -5.594f)
                curveToRelative(-0.562f, -1.259f, -1.816f, -2.072f, -3.195f, -2.072f)
                horizontalLineToRelative(-1.626f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.764f, 0.296f, 1.455f, 0.768f, 1.985f)
                curveToRelative(-0.485f, 0.718f, -0.768f, 1.583f, -0.768f, 2.515f)
                curveToRelative(0.0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.485f, 0.0f, 4.5f, -2.015f, 4.5f, -4.5f)
                curveToRelative(0.0f, -0.932f, -0.283f, -1.797f, -0.768f, -2.515f)
                curveToRelative(0.472f, -0.53f, 0.768f, -1.221f, 0.768f, -1.985f)
                verticalLineToRelative(-1.852f)
                lineToRelative(6.0f, -5.647f)
                verticalLineToRelative(4.878f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineToRelative(2.621f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(24.0f, 2.0f)
                horizontalLineToRelative(-2.595f)
                close()
                moveTo(7.0f, 4.0f)
                horizontalLineToRelative(1.626f)
                curveToRelative(0.197f, 0.0f, 0.376f, 0.116f, 0.457f, 0.296f)
                lineToRelative(2.103f, 4.704f)
                horizontalLineToRelative(-4.186f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(3.0f, 12.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.5f, 20.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(10.5f, 20.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _excavator!!
    }

private var _excavator: ImageVector? = null
