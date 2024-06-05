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

public val Icons.Filled.ComputerMouse: ImageVector
    get() {
        if (_computerMouse != null) {
            return _computerMouse!!
        }
        _computerMouse = Builder(name = "ComputerMouse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.038f, 10.0f)
                lineTo(13.038f, 2.942f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(2.558f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(4.038f, 12.0f)
                verticalLineToRelative(3.942f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.589f, 8.0f, -8.0f)
                verticalLineToRelative(-3.942f)
                lineTo(4.038f, 12.0f)
                close()
                moveTo(11.038f, 10.0f)
                lineTo(11.038f, 3.0f)
                lineToRelative(2.0f, -0.058f)
                lineTo(13.038f, -0.058f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(2.558f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _computerMouse!!
    }

private var _computerMouse: ImageVector? = null
