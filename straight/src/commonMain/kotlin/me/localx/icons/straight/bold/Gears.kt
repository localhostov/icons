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

public val Icons.Bold.Gears: ImageVector
    get() {
        if (_gears != null) {
            return _gears!!
        }
        _gears = Builder(name = "Gears", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.37f, 10.67f)
                lineToRelative(1.95f, 1.12f)
                lineToRelative(1.5f, -2.6f)
                lineToRelative(-1.94f, -1.12f)
                curveToRelative(0.08f, -0.35f, 0.12f, -0.71f, 0.12f, -1.08f)
                reflectiveCurveToRelative(-0.05f, -0.73f, -0.12f, -1.08f)
                lineToRelative(1.94f, -1.12f)
                lineToRelative(-1.5f, -2.6f)
                lineToRelative(-1.95f, 1.12f)
                curveToRelative(-0.53f, -0.49f, -1.17f, -0.85f, -1.87f, -1.07f)
                lineTo(8.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(5.5f, 2.26f)
                curveToRelative(-0.7f, 0.22f, -1.34f, 0.59f, -1.87f, 1.07f)
                lineToRelative(-1.95f, -1.12f)
                lineTo(0.19f, 4.81f)
                lineToRelative(1.94f, 1.12f)
                curveToRelative(-0.08f, 0.35f, -0.12f, 0.71f, -0.12f, 1.08f)
                reflectiveCurveToRelative(0.05f, 0.73f, 0.12f, 1.08f)
                lineTo(0.19f, 9.19f)
                lineToRelative(1.5f, 2.6f)
                lineToRelative(1.95f, -1.12f)
                curveToRelative(0.53f, 0.49f, 1.17f, 0.85f, 1.87f, 1.07f)
                verticalLineToRelative(2.26f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.26f)
                curveToRelative(0.7f, -0.22f, 1.34f, -0.59f, 1.87f, -1.07f)
                close()
                moveTo(7.0f, 5.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, -0.37f, -0.05f, -0.73f, -0.12f, -1.08f)
                lineToRelative(1.94f, -1.12f)
                lineToRelative(-1.5f, -2.6f)
                lineToRelative(-1.95f, 1.12f)
                curveToRelative(-0.53f, -0.49f, -1.17f, -0.85f, -1.87f, -1.07f)
                verticalLineToRelative(-2.26f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.26f)
                curveToRelative(-0.7f, 0.22f, -1.34f, 0.59f, -1.87f, 1.07f)
                lineToRelative(-1.95f, -1.12f)
                lineToRelative(-1.5f, 2.6f)
                lineToRelative(1.94f, 1.12f)
                curveToRelative(-0.08f, 0.35f, -0.12f, 0.71f, -0.12f, 1.08f)
                reflectiveCurveToRelative(0.05f, 0.73f, 0.12f, 1.08f)
                lineToRelative(-1.94f, 1.12f)
                lineToRelative(1.5f, 2.6f)
                lineToRelative(1.95f, -1.12f)
                curveToRelative(0.53f, 0.49f, 1.17f, 0.85f, 1.87f, 1.07f)
                verticalLineToRelative(2.26f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.26f)
                curveToRelative(0.7f, -0.22f, 1.34f, -0.59f, 1.87f, -1.07f)
                lineToRelative(1.95f, 1.12f)
                lineToRelative(1.5f, -2.6f)
                lineToRelative(-1.94f, -1.12f)
                curveToRelative(0.08f, -0.35f, 0.12f, -0.71f, 0.12f, -1.08f)
                close()
                moveTo(17.0f, 19.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _gears!!
    }

private var _gears: ImageVector? = null
