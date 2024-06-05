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

public val Icons.Outline.RoomService: ImageVector
    get() {
        if (_roomService != null) {
            return _roomService!!
        }
        _roomService = Builder(name = "RoomService", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 19.0f)
                verticalLineTo(17.0f)
                arcTo(11.01f, 11.01f, 0.0f, false, false, 13.0f, 6.051f)
                verticalLineTo(4.723f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineTo(6.051f)
                arcTo(11.01f, 11.01f, 0.0f, false, false, 1.0f, 17.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 19.0f)
                close()
                moveTo(3.0f, 17.0f)
                curveTo(3.473f, 5.066f, 20.531f, 5.075f, 21.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _roomService!!
    }

private var _roomService: ImageVector? = null
