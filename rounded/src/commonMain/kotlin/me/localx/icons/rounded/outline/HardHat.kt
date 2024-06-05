package me.localx.icons.rounded.outline

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

public val Icons.Outline.HardHat: ImageVector
    get() {
        if (_hardHat != null) {
            return _hardHat!!
        }
        _hardHat = Builder(name = "HardHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 16.0f)
                verticalLineToRelative(-3.08f)
                curveToRelative(0.0f, -4.734f, -3.183f, -8.918f, -7.78f, -10.293f)
                curveToRelative(-0.729f, -0.986f, -1.901f, -1.627f, -3.22f, -1.627f)
                reflectiveCurveToRelative(-2.491f, 0.641f, -3.22f, 1.627f)
                curveTo(4.182f, 4.002f, 1.0f, 8.186f, 1.0f, 12.92f)
                verticalLineToRelative(3.08f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.475f)
                curveToRelative(1.002f, 1.348f, 4.293f, 5.0f, 10.525f, 5.0f)
                reflectiveCurveToRelative(9.522f, -3.652f, 10.525f, -5.0f)
                horizontalLineToRelative(0.475f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(21.0f, 12.92f)
                verticalLineToRelative(3.08f)
                horizontalLineToRelative(-5.0f)
                lineTo(16.0f, 5.069f)
                curveToRelative(3.011f, 1.457f, 5.0f, 4.484f, 5.0f, 7.851f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.895f, 2.0f, 1.994f)
                verticalLineToRelative(11.006f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 4.994f)
                curveToRelative(0.0f, -1.1f, 0.897f, -1.994f, 2.0f, -1.994f)
                close()
                moveTo(8.0f, 5.069f)
                verticalLineToRelative(10.931f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-3.08f)
                curveToRelative(0.0f, -3.367f, 1.988f, -6.394f, 5.0f, -7.851f)
                close()
                moveTo(4.141f, 18.0f)
                horizontalLineToRelative(15.704f)
                curveToRelative(-1.389f, 1.312f, -3.936f, 3.0f, -7.845f, 3.0f)
                curveToRelative(-3.939f, 0.0f, -6.479f, -1.687f, -7.859f, -3.0f)
                close()
            }
        }
        .build()
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
