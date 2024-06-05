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

public val Icons.Filled.Select: ImageVector
    get() {
        if (_select != null) {
            return _select!!
        }
        _select = Builder(name = "Select", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.247f, 9.752f)
                lineToRelative(4.187f, -4.186f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-4.186f, 4.187f)
                close()
                moveTo(8.833f, 11.166f)
                lineToRelative(-8.0f, 8.0f)
                arcToRelative(2.829f, 2.829f, 0.0f, false, false, 2.0f, 4.829f)
                arcToRelative(2.806f, 2.806f, 0.0f, false, false, 2.0f, -0.829f)
                lineToRelative(8.0f, -8.0f)
                close()
                moveTo(18.667f, 17.3f)
                lineTo(20.0f, 19.962f)
                lineTo(21.333f, 17.3f)
                lineTo(24.0f, 15.962f)
                lineToRelative(-2.667f, -1.334f)
                lineTo(20.0f, 11.962f)
                lineToRelative(-1.333f, 2.666f)
                lineTo(16.0f, 15.962f)
                close()
                moveTo(6.667f, 5.338f)
                lineTo(8.0f, 8.0f)
                lineTo(9.333f, 5.333f)
                lineTo(12.0f, 4.0f)
                lineTo(9.333f, 2.667f)
                lineTo(8.0f, 0.0f)
                lineTo(6.667f, 2.667f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(19.333f, 4.672f)
                lineTo(20.5f, 7.0f)
                lineToRelative(1.167f, -2.333f)
                lineTo(24.0f, 3.5f)
                lineTo(21.667f, 2.333f)
                lineTo(20.5f, 0.0f)
                lineTo(19.333f, 2.333f)
                lineTo(17.0f, 3.5f)
                close()
            }
        }
        .build()
        return _select!!
    }

private var _select: ImageVector? = null
