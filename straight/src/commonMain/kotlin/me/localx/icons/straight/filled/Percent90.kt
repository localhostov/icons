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

public val Icons.Filled.Percent90: ImageVector
    get() {
        if (_percent90 != null) {
            return _percent90!!
        }
        _percent90 = Builder(name = "Percent90", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.4f, 10.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.496f, -0.404f, 0.9f, -0.9f, 0.9f)
                reflectiveCurveToRelative(-0.9f, -0.404f, -0.9f, -0.9f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.496f, 0.404f, -0.9f, 0.9f, -0.9f)
                reflectiveCurveToRelative(0.9f, 0.404f, 0.9f, 0.9f)
                close()
                moveTo(5.5f, 9.6f)
                curveToRelative(-0.496f, 0.0f, -0.9f, 0.404f, -0.9f, 0.9f)
                reflectiveCurveToRelative(0.404f, 0.9f, 0.9f, 0.9f)
                reflectiveCurveToRelative(0.9f, -0.404f, 0.9f, -0.9f)
                reflectiveCurveToRelative(-0.404f, -0.9f, -0.9f, -0.9f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                close()
                moveTo(15.0f, 9.231f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
                close()
                moveTo(8.0f, 10.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.318f, 0.0f, 0.62f, -0.065f, 0.9f, -0.174f)
                verticalLineToRelative(0.674f)
                curveToRelative(0.0f, 0.496f, -0.404f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(14.0f, 10.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(16.778f, 15.981f)
                lineToRelative(5.222f, -8.0f)
                horizontalLineToRelative(-1.911f)
                lineToRelative(-5.222f, 8.0f)
                horizontalLineToRelative(1.911f)
                close()
                moveTo(22.0f, 14.731f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
                close()
            }
        }
        .build()
        return _percent90!!
    }

private var _percent90: ImageVector? = null
