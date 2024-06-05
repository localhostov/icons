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

public val Icons.Bold.ClipoardWrong: ImageVector
    get() {
        if (_clipoardWrong != null) {
            return _clipoardWrong!!
        }
        _clipoardWrong = Builder(name = "ClipoardWrong", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.561f, 12.061f)
                lineToRelative(-2.439f, 2.439f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-2.439f, -2.439f)
                lineToRelative(-2.439f, 2.439f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(2.439f, -2.439f)
                lineToRelative(-2.439f, -2.439f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(2.439f, -2.439f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(22.0f, 5.665f)
                lineTo(22.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.0f)
                curveTo(2.0f, 1.346f, 3.346f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(11.382f)
                lineToRelative(5.618f, 5.664f)
                close()
                moveTo(19.0f, 21.001f)
                lineTo(19.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(14.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                lineTo(5.0f, 21.0f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _clipoardWrong!!
    }

private var _clipoardWrong: ImageVector? = null
