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

public val Icons.Bold.Telescope: ImageVector
    get() {
        if (_telescope != null) {
            return _telescope!!
        }
        _telescope = Builder(name = "Telescope", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.247f, 11.251f)
                lineToRelative(2.765f, -1.166f)
                lineTo(19.794f, 0.085f)
                lineToRelative(-2.765f, 1.166f)
                lineToRelative(0.557f, 1.32f)
                lineTo(2.763f, 8.897f)
                lineToRelative(0.969f, 2.298f)
                lineTo(0.046f, 12.749f)
                lineToRelative(1.165f, 2.764f)
                lineToRelative(3.686f, -1.554f)
                lineToRelative(0.974f, 2.31f)
                lineToRelative(5.065f, -2.161f)
                lineToRelative(-4.344f, 9.893f)
                horizontalLineToRelative(3.277f)
                lineToRelative(3.631f, -8.269f)
                lineToRelative(3.631f, 8.269f)
                horizontalLineToRelative(3.277f)
                lineToRelative(-5.154f, -11.736f)
                lineToRelative(5.44f, -2.322f)
                lineToRelative(0.552f, 1.308f)
                close()
                moveTo(7.465f, 12.327f)
                lineToRelative(-0.777f, -1.844f)
                lineToRelative(12.064f, -5.148f)
                lineToRelative(0.777f, 1.843f)
                lineToRelative(-12.064f, 5.149f)
                close()
            }
        }
        .build()
        return _telescope!!
    }

private var _telescope: ImageVector? = null
