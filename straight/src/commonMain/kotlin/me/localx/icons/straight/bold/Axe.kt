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

public val Icons.Bold.Axe: ImageVector
    get() {
        if (_axe != null) {
            return _axe!!
        }
        _axe = Builder(name = "Axe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.996f, 6.411f)
                lineToRelative(-1.587f, 0.092f)
                curveToRelative(-0.442f, 0.027f, -1.569f, -0.005f, -2.475f, -0.315f)
                lineToRelative(1.622f, -1.622f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-1.822f, 1.822f)
                lineToRelative(-3.707f, -3.721f)
                lineToRelative(-6.351f, 6.351f)
                lineToRelative(3.706f, 3.721f)
                lineTo(-0.012f, 21.891f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(11.063f, -11.063f)
                curveToRelative(0.289f, 0.853f, 0.357f, 1.922f, 0.33f, 2.47f)
                lineToRelative(-0.086f, 1.582f)
                horizontalLineToRelative(1.584f)
                curveToRelative(5.215f, 0.0f, 9.0f, -3.785f, 9.0f, -9.0f)
                lineToRelative(-0.004f, -1.589f)
                close()
                moveTo(16.43f, 13.863f)
                curveToRelative(-0.148f, -1.242f, -0.561f, -2.876f, -1.664f, -3.979f)
                lineToRelative(-2.972f, -2.983f)
                lineToRelative(2.108f, -2.108f)
                lineToRelative(2.97f, 2.981f)
                curveToRelative(1.114f, 1.114f, 2.746f, 1.523f, 3.989f, 1.666f)
                curveToRelative(-0.47f, 2.329f, -2.101f, 3.957f, -4.432f, 4.424f)
                close()
            }
        }
        .build()
        return _axe!!
    }

private var _axe: ImageVector? = null
