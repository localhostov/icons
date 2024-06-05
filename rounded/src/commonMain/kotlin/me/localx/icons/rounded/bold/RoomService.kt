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

public val Icons.Bold.RoomService: ImageVector
    get() {
        if (_roomService != null) {
            return _roomService!!
        }
        _roomService = Builder(name = "RoomService", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 19.092f)
                verticalLineTo(16.0f)
                arcTo(11.007f, 11.007f, 0.0f, false, false, 13.5f, 5.115f)
                verticalLineTo(4.31f)
                arcToRelative(1.995f, 1.995f, 0.0f, true, false, -3.0f, 0.0f)
                verticalLineToRelative(0.805f)
                arcTo(11.007f, 11.007f, 0.0f, false, false, 1.0f, 16.0f)
                verticalLineToRelative(3.092f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 22.0f)
                horizontalLineToRelative(21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 23.0f, 19.092f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                arcTo(8.009f, 8.009f, 0.0f, false, true, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _roomService!!
    }

private var _roomService: ImageVector? = null
