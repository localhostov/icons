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

public val Icons.Bold.Highlighter: ImageVector
    get() {
        if (_highlighter != null) {
            return _highlighter!!
        }
        _highlighter = Builder(name = "Highlighter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.004f, 3.523f)
                lineToRelative(-2.526f, -2.527f)
                curveToRelative(-1.273f, -1.274f, -3.323f, -1.333f, -4.669f, -0.132f)
                lineTo(2.0f, 13.178f)
                verticalLineToRelative(6.701f)
                lineTo(-0.061f, 21.939f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.061f, -2.061f)
                horizontalLineToRelative(6.701f)
                lineToRelative(12.314f, -13.809f)
                curveToRelative(1.2f, -1.344f, 1.142f, -3.395f, -0.133f, -4.668f)
                close()
                moveTo(20.899f, 6.194f)
                lineToRelative(-11.117f, 12.466f)
                lineToRelative(-4.442f, -4.442f)
                lineTo(17.806f, 3.103f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.159f, -0.142f, 0.4f, -0.135f, 0.55f, 0.015f)
                lineToRelative(2.526f, 2.527f)
                curveToRelative(0.15f, 0.15f, 0.157f, 0.391f, 0.016f, 0.549f)
                close()
            }
        }
        .build()
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
