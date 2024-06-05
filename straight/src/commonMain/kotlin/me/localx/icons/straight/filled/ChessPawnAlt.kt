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

public val Icons.Filled.ChessPawnAlt: ImageVector
    get() {
        if (_chessPawnAlt != null) {
            return _chessPawnAlt!!
        }
        _chessPawnAlt = Builder(name = "ChessPawnAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.556f)
                arcTo(3.959f, 3.959f, 0.0f, false, true, 8.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(3.959f, 3.959f, 0.0f, false, true, -0.556f, 2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(22.0f, 23.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(15.071f, 10.0f)
                horizontalLineTo(8.929f)
                curveTo(8.564f, 15.256f, 6.774f, 18.0f, 5.0f, 18.0f)
                horizontalLineTo(19.0f)
                curveTo(17.226f, 18.0f, 15.436f, 15.256f, 15.071f, 10.0f)
                close()
            }
        }
        .build()
        return _chessPawnAlt!!
    }

private var _chessPawnAlt: ImageVector? = null
