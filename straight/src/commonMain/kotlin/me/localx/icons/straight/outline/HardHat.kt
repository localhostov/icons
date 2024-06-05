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
                moveToRelative(24.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.448f)
                curveToRelative(0.0f, -4.461f, -2.828f, -8.427f, -7.0f, -10.021f)
                verticalLineToRelative(-1.531f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(1.531f)
                curveTo(3.828f, 4.125f, 1.0f, 8.091f, 1.0f, 12.552f)
                verticalLineToRelative(3.448f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.477f)
                curveToRelative(0.995f, 1.341f, 4.278f, 5.0f, 10.523f, 5.0f)
                reflectiveCurveToRelative(9.528f, -3.659f, 10.523f, -5.0f)
                horizontalLineToRelative(1.477f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 12.552f)
                verticalLineToRelative(3.448f)
                horizontalLineToRelative(-5.0f)
                lineTo(16.0f, 4.707f)
                curveToRelative(3.009f, 1.457f, 5.0f, 4.479f, 5.0f, 7.845f)
                close()
                moveTo(14.0f, 3.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(3.0f, 12.552f)
                curveToRelative(0.0f, -3.366f, 1.99f, -6.387f, 5.0f, -7.845f)
                verticalLineToRelative(11.293f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-3.448f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-3.939f, 0.0f, -6.478f, -1.687f, -7.858f, -3.0f)
                horizontalLineToRelative(15.7f)
                curveToRelative(-1.389f, 1.312f, -3.931f, 3.0f, -7.842f, 3.0f)
                close()
            }
        }
        .build()
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
