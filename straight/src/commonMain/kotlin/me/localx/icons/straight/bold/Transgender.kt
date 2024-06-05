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

public val Icons.Bold.Transgender: ImageVector
    get() {
        if (_transgender != null) {
            return _transgender!!
        }
        _transgender = Builder(name = "Transgender", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.0f)
                lineTo(24.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(1.939f, 1.939f)
                lineToRelative(-4.893f, 4.893f)
                curveToRelative(-0.893f, -0.529f, -1.935f, -0.833f, -3.046f, -0.833f)
                reflectiveCurveToRelative(-2.153f, 0.304f, -3.046f, 0.833f)
                lineToRelative(-1.242f, -1.242f)
                lineToRelative(1.689f, -1.689f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-1.689f, 1.689f)
                lineToRelative(-1.53f, -1.53f)
                lineToRelative(1.939f, -1.939f)
                lineTo(1.0f, -0.0f)
                curveTo(0.448f, 0.0f, 0.0f, 0.448f, 0.0f, 1.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(1.939f, -1.939f)
                lineToRelative(1.53f, 1.53f)
                lineToRelative(-1.846f, 1.846f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.846f, -1.846f)
                lineToRelative(1.242f, 1.242f)
                curveToRelative(-0.529f, 0.893f, -0.833f, 1.935f, -0.833f, 3.046f)
                curveToRelative(0.0f, 2.791f, 1.915f, 5.143f, 4.5f, 5.81f)
                verticalLineToRelative(1.19f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.19f)
                curveToRelative(2.585f, -0.668f, 4.5f, -3.019f, 4.5f, -5.81f)
                curveToRelative(0.0f, -1.111f, -0.304f, -2.153f, -0.833f, -3.046f)
                lineToRelative(4.893f, -4.893f)
                lineToRelative(1.939f, 1.939f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _transgender!!
    }

private var _transgender: ImageVector? = null
