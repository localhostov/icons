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

public val Icons.Bold.ArrowToBottom: ImageVector
    get() {
        if (_arrowToBottom != null) {
            return _arrowToBottom!!
        }
        _arrowToBottom = Builder(name = "ArrowToBottom", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.071f, 16.668f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-3.45f, 3.45f)
                lineToRelative(0.0f, -17.997f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 17.997f)
                lineToRelative(-3.45f, -3.45f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(4.332f, 4.332f)
                lineToRelative(-4.261f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(14.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(-4.261f, 0.0f)
                lineToRelative(4.332f, -4.332f)
                close()
            }
        }
        .build()
        return _arrowToBottom!!
    }

private var _arrowToBottom: ImageVector? = null
