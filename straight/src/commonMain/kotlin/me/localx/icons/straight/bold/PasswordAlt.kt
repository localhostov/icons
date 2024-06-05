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

public val Icons.Bold.PasswordAlt: ImageVector
    get() {
        if (_passwordAlt != null) {
            return _passwordAlt!!
        }
        _passwordAlt = Builder(name = "PasswordAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.5f, 21.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(21.0f, 20.5f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(20.5f, 0.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(-3.5f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(13.443f, 8.435f)
                lineToRelative(-1.439f, 1.44f)
                lineToRelative(-1.439f, -1.44f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(-1.44f, 1.44f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.439f, -1.44f)
                lineToRelative(1.439f, 1.44f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(1.44f, -1.44f)
                lineToRelative(-2.121f, -2.121f)
                close()
                moveTo(18.564f, 15.557f)
                lineToRelative(1.439f, -1.44f)
                lineToRelative(1.439f, 1.44f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(1.44f, -1.44f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-1.439f, 1.44f)
                lineToRelative(-1.439f, -1.44f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(-1.44f, 1.44f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(5.443f, 8.435f)
                lineToRelative(-1.439f, 1.44f)
                lineToRelative(-1.439f, -1.44f)
                lineTo(0.443f, 10.556f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(-1.44f, 1.44f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.439f, -1.44f)
                lineToRelative(1.439f, 1.44f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(1.44f, -1.44f)
                lineToRelative(-2.121f, -2.121f)
                close()
            }
        }
        .build()
        return _passwordAlt!!
    }

private var _passwordAlt: ImageVector? = null
