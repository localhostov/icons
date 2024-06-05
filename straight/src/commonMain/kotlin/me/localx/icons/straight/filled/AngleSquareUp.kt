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

public val Icons.Filled.AngleSquareUp: ImageVector
    get() {
        if (_angleSquareUp != null) {
            return _angleSquareUp!!
        }
        _angleSquareUp = Builder(name = "AngleSquareUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(10.605f, 8.585f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.829f, 0.0f)
                lineToRelative(4.672f, 4.673f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(12.02f, 10.0f)
                lineTo(7.308f, 14.71f)
                lineTo(5.894f, 13.3f)
                close()
            }
        }
        .build()
        return _angleSquareUp!!
    }

private var _angleSquareUp: ImageVector? = null
