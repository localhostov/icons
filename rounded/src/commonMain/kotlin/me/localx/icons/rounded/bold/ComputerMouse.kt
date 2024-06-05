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

public val Icons.Bold.ComputerMouse: ImageVector
    get() {
        if (_computerMouse != null) {
            return _computerMouse!!
        }
        _computerMouse = Builder(name = "ComputerMouse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(-4.136f, 0.0f, -7.5f, 3.364f, -7.5f, 7.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 4.962f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -4.136f, -3.364f, -7.5f, -7.5f, -7.5f)
                close()
                moveTo(17.972f, 10.0f)
                horizontalLineToRelative(-4.472f)
                verticalLineToRelative(-4.0f)
                curveToRelative(2.312f, 0.0f, 4.223f, 1.753f, 4.472f, 4.0f)
                close()
                moveTo(10.5f, 6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.472f)
                curveToRelative(0.25f, -2.247f, 2.16f, -4.0f, 4.472f, -4.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _computerMouse!!
    }

private var _computerMouse: ImageVector? = null
