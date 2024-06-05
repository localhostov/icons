package me.localx.icons.straight.outline

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

public val Icons.Outline.ArrowToBottom: ImageVector
    get() {
        if (_arrowToBottom != null) {
            return _arrowToBottom!!
        }
        _arrowToBottom = Builder(name = "ArrowToBottom", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.447f, 22.0f)
                arcToRelative(2.578f, 2.578f, 0.0f, false, false, 0.321f, -0.263f)
                lineToRelative(4.95f, -4.95f)
                lineTo(17.3f, 15.373f)
                lineToRelative(-4.3f, 4.3f)
                verticalLineTo(0.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.676f)
                lineToRelative(-4.3f, -4.3f)
                lineTo(5.282f, 16.787f)
                lineToRelative(4.95f, 4.95f)
                arcToRelative(2.578f, 2.578f, 0.0f, false, false, 0.321f, 0.263f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _arrowToBottom!!
    }

private var _arrowToBottom: ImageVector? = null
