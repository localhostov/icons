package me.localx.icons.rounded.bold

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
                moveTo(17.735f, 21.015f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(4.069f, -4.068f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, -2.121f)
                lineTo(13.5f, 18.01f)
                verticalLineTo(1.515f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(16.5f)
                lineTo(7.315f, 14.826f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, 2.121f)
                lineToRelative(4.068f, 4.068f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(11.47f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _arrowToBottom!!
    }

private var _arrowToBottom: ImageVector? = null
