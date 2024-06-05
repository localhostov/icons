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

public val Icons.Outline.ComputerMouse: ImageVector
    get() {
        if (_computerMouse != null) {
            return _computerMouse!!
        }
        _computerMouse = Builder(name = "ComputerMouse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 3.0f)
                lineTo(13.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.589f, 8.0f, -8.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -3.86f, -3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(18.0f, 10.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(11.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _computerMouse!!
    }

private var _computerMouse: ImageVector? = null
