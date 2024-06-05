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

public val Icons.Filled.ArrowSquareLeft: ImageVector
    get() {
        if (_arrowSquareLeft != null) {
            return _arrowSquareLeft!!
        }
        _arrowSquareLeft = Builder(name = "ArrowSquareLeft", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(6.585f, 13.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.829f)
                lineToRelative(4.243f, -4.242f)
                lineToRelative(1.414f, 1.414f)
                lineTo(9.0f, 11.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                lineToRelative(3.242f, 3.242f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _arrowSquareLeft!!
    }

private var _arrowSquareLeft: ImageVector? = null
