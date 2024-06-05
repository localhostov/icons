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

public val Icons.Filled.ArrowSmallDown: ImageVector
    get() {
        if (_arrowSmallDown != null) {
            return _arrowSmallDown!!
        }
        _arrowSmallDown = Builder(name = "ArrowSmallDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.293f, 12.707f)
                lineTo(13.0f, 16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                lineTo(7.707f, 12.707f)
                lineTo(6.293f, 14.121f)
                lineToRelative(4.293f, 4.293f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.828f, 0.0f)
                lineToRelative(4.293f, -4.293f)
                close()
            }
        }
        .build()
        return _arrowSmallDown!!
    }

private var _arrowSmallDown: ImageVector? = null
