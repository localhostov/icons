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

public val Icons.Filled.Sushi: ImageVector
    get() {
        if (_sushi != null) {
            return _sushi!!
        }
        _sushi = Builder(name = "Sushi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 6.0f)
                curveTo(3.733f, 6.0f, 0.0f, 8.2f, 0.0f, 11.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.8f, 3.733f, 5.0f, 8.5f, 5.0f)
                reflectiveCurveTo(17.0f, 21.8f, 17.0f, 19.0f)
                lineTo(17.0f, 11.0f)
                curveTo(17.0f, 8.2f, 13.267f, 6.0f, 8.5f, 6.0f)
                close()
                moveTo(8.5f, 8.0f)
                curveTo(12.33f, 8.0f, 15.0f, 9.581f, 15.0f, 11.0f)
                reflectiveCurveToRelative(-2.67f, 3.0f, -6.5f, 3.0f)
                reflectiveCurveTo(2.0f, 12.419f, 2.0f, 11.0f)
                reflectiveCurveTo(4.67f, 8.0f, 8.5f, 8.0f)
                close()
                moveTo(4.3f, 11.0f)
                arcToRelative(7.863f, 7.863f, 0.0f, false, false, 4.2f, 1.0f)
                arcToRelative(7.863f, 7.863f, 0.0f, false, false, 4.2f, -1.0f)
                arcToRelative(7.863f, 7.863f, 0.0f, false, false, -4.2f, -1.0f)
                arcTo(7.863f, 7.863f, 0.0f, false, false, 4.3f, 11.0f)
                close()
                moveTo(11.3f, 5.0f)
                arcToRelative(7.863f, 7.863f, 0.0f, false, false, 4.2f, 1.0f)
                arcToRelative(7.863f, 7.863f, 0.0f, false, false, 4.2f, -1.0f)
                arcToRelative(7.863f, 7.863f, 0.0f, false, false, -4.2f, -1.0f)
                arcTo(7.863f, 7.863f, 0.0f, false, false, 11.3f, 5.0f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.059f, -2.015f, 3.8f, -5.0f, 4.569f)
                lineTo(19.0f, 11.0f)
                arcToRelative(5.351f, 5.351f, 0.0f, false, false, -1.112f, -3.224f)
                curveTo(20.392f, 7.293f, 22.0f, 6.1f, 22.0f, 5.0f)
                curveToRelative(0.0f, -1.419f, -2.67f, -3.0f, -6.5f, -3.0f)
                curveToRelative(-2.96f, 0.0f, -5.22f, 0.945f, -6.1f, 2.028f)
                curveToRelative(-0.3f, -0.015f, -0.6f, -0.028f, -0.9f, -0.028f)
                curveToRelative(-0.46f, 0.0f, -0.908f, 0.024f, -1.35f, 0.058f)
                curveTo(7.88f, 1.72f, 11.283f, 0.0f, 15.5f, 0.0f)
                curveTo(20.267f, 0.0f, 24.0f, 2.2f, 24.0f, 5.0f)
                close()
            }
        }
        .build()
        return _sushi!!
    }

private var _sushi: ImageVector? = null
