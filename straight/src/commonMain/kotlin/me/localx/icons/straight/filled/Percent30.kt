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

public val Icons.Filled.Percent30: ImageVector
    get() {
        if (_percent30 != null) {
            return _percent30!!
        }
        _percent30 = Builder(name = "Percent30", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(8.0f, 13.5f)
                curveToRelative(0.0f, -0.767f, -0.354f, -1.445f, -0.9f, -1.904f)
                curveToRelative(0.252f, -0.369f, 0.4f, -0.814f, 0.4f, -1.293f)
                curveToRelative(0.0f, -1.269f, -1.032f, -2.302f, -2.302f, -2.302f)
                horizontalLineToRelative(-2.198f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(2.198f)
                curveToRelative(0.387f, 0.0f, 0.702f, 0.315f, 0.702f, 0.702f)
                curveToRelative(0.0f, 0.38f, -0.305f, 0.687f, -0.683f, 0.698f)
                horizontalLineToRelative(-1.217f)
                verticalLineToRelative(1.604f)
                lineToRelative(1.499f, -0.004f)
                curveToRelative(0.497f, 0.0f, 0.901f, 0.404f, 0.901f, 0.9f)
                reflectiveCurveToRelative(-0.404f, 0.9f, -0.901f, 0.9f)
                horizontalLineToRelative(-2.499f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(2.499f)
                curveToRelative(1.379f, 0.0f, 2.501f, -1.122f, 2.501f, -2.5f)
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
        return _percent30!!
    }

private var _percent30: ImageVector? = null
