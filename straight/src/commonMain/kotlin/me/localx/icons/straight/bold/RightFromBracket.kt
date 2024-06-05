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

public val Icons.Bold.RightFromBracket: ImageVector
    get() {
        if (_rightFromBracket != null) {
            return _rightFromBracket!!
        }
        _rightFromBracket = Builder(name = "RightFromBracket", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 21.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(3.0f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(5.5f)
                lineTo(9.0f, 3.0f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                lineTo(3.0f, 20.5f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(24.0f, 11.99f)
                curveToRelative(0.0f, 0.882f, -0.343f, 1.71f, -0.968f, 2.333f)
                lineToRelative(-10.032f, 9.704f)
                verticalLineToRelative(-7.038f)
                lineTo(6.0f, 16.989f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                lineTo(13.0f, -0.026f)
                lineToRelative(10.029f, 9.683f)
                curveToRelative(0.626f, 0.622f, 0.971f, 1.45f, 0.971f, 2.333f)
                close()
                moveTo(21.0f, 11.991f)
                curveToRelative(0.0f, -0.054f, -0.014f, -0.132f, -0.081f, -0.202f)
                lineToRelative(-4.919f, -4.749f)
                verticalLineToRelative(2.948f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(4.012f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.95f)
                lineToRelative(4.93f, -4.769f)
                curveToRelative(0.055f, -0.055f, 0.07f, -0.135f, 0.07f, -0.19f)
                close()
            }
        }
        .build()
        return _rightFromBracket!!
    }

private var _rightFromBracket: ImageVector? = null
