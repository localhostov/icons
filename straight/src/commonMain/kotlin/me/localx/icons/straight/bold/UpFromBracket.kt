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

public val Icons.Bold.UpFromBracket: ImageVector
    get() {
        if (_upFromBracket != null) {
            return _upFromBracket!!
        }
        _upFromBracket = Builder(name = "UpFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-5.5f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                lineTo(20.5f, 21.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(7.0f, 11.0f)
                lineTo(-0.026f, 11.0f)
                lineTo(9.657f, 0.971f)
                curveTo(10.279f, 0.345f, 11.107f, 0.0f, 11.99f, 0.0f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.881f, 0.0f, 1.709f, 0.344f, 2.331f, 0.968f)
                lineToRelative(9.704f, 10.032f)
                horizontalLineToRelative(-7.038f)
                verticalLineToRelative(7.0f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(7.041f, 8.0f)
                horizontalLineToRelative(2.948f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.012f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.95f)
                lineTo(12.182f, 3.07f)
                curveToRelative(-0.055f, -0.055f, -0.135f, -0.07f, -0.19f, -0.07f)
                curveToRelative(-0.054f, 0.0f, -0.132f, 0.014f, -0.202f, 0.081f)
                lineToRelative(-4.749f, 4.919f)
                close()
            }
        }
        .build()
        return _upFromBracket!!
    }

private var _upFromBracket: ImageVector? = null
