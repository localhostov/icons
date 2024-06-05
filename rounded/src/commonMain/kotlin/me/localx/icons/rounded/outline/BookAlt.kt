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

public val Icons.Outline.BookAlt: ImageVector
    get() {
        if (_bookAlt != null) {
            return _bookAlt!!
        }
        _bookAlt = Builder(name = "BookAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.2f, 2.163f)
                arcToRelative(4.992f, 4.992f, 0.0f, false, false, -4.1f, -1.081f)
                lineToRelative(-3.822f, 0.694f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 3.065f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 9.716f, 1.776f)
                lineTo(5.9f, 1.082f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 0.0f, 6.0f)
                lineTo(0.0f, 16.793f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.105f, 4.919f)
                lineToRelative(6.286f, 1.143f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 3.218f, 0.0f)
                lineTo(19.9f, 21.712f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 24.0f, 16.793f)
                lineTo(24.0f, 6.0f)
                arcTo(4.983f, 4.983f, 0.0f, false, false, 22.2f, 2.163f)
                close()
                moveTo(11.0f, 20.928f)
                curveToRelative(-0.084f, -0.012f, -0.168f, -0.026f, -0.252f, -0.041f)
                lineTo(4.463f, 19.745f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 2.0f, 16.793f)
                lineTo(2.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 3.0f)
                arcToRelative(3.081f, 3.081f, 0.0f, false, true, 0.54f, 0.049f)
                lineToRelative(3.82f, 0.7f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 5.712f)
                close()
                moveTo(22.0f, 16.793f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.463f, 2.952f)
                lineToRelative(-6.285f, 1.142f)
                curveToRelative(-0.084f, 0.015f, -0.168f, 0.029f, -0.252f, 0.041f)
                lineTo(13.0f, 5.712f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.642f, -1.968f)
                lineToRelative(3.821f, -0.7f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 6.0f)
                close()
            }
        }
        .build()
        return _bookAlt!!
    }

private var _bookAlt: ImageVector? = null
