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

public val Icons.Outline.Overview: ImageVector
    get() {
        if (_overview != null) {
            return _overview!!
        }
        _overview = Builder(name = "Overview", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 11.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(6.5f, 4.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.5f, 14.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(10.321f)
                curveToRelative(-0.712f, -0.788f, -1.172f, -1.538f, -1.421f, -2.0f)
                lineTo(2.0f, 21.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(11.531f)
                curveToRelative(0.831f, 0.572f, 1.495f, 1.228f, 2.0f, 1.842f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 12.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(23.387f, 19.039f)
                lineToRelative(0.24f, 0.461f)
                lineToRelative(-0.24f, 0.461f)
                curveToRelative(-0.492f, 0.947f, -2.407f, 4.039f, -6.387f, 4.039f)
                reflectiveCurveToRelative(-5.896f, -3.092f, -6.388f, -4.039f)
                lineToRelative(-0.239f, -0.461f)
                lineToRelative(0.239f, -0.46f)
                curveToRelative(0.491f, -0.948f, 2.403f, -4.04f, 6.388f, -4.04f)
                reflectiveCurveToRelative(5.896f, 3.092f, 6.387f, 4.039f)
                close()
                moveTo(21.346f, 19.5f)
                curveToRelative(-0.633f, -0.995f, -1.981f, -2.5f, -4.347f, -2.5f)
                reflectiveCurveToRelative(-3.715f, 1.505f, -4.347f, 2.5f)
                curveToRelative(0.632f, 0.995f, 1.98f, 2.5f, 4.347f, 2.5f)
                reflectiveCurveToRelative(3.714f, -1.505f, 4.347f, -2.5f)
                close()
                moveTo(16.999f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _overview!!
    }

private var _overview: ImageVector? = null
