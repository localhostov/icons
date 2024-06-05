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

public val Icons.Outline.ArrowsH: ImageVector
    get() {
        if (_arrowsH != null) {
            return _arrowsH!!
        }
        _arrowsH = Builder(name = "ArrowsH", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.414f, 10.586f)
                lineTo(20.172f, 7.343f)
                lineTo(18.758f, 8.757f)
                lineTo(21.0f, 11.0f)
                horizontalLineTo(3.0f)
                lineTo(5.243f, 8.757f)
                lineTo(3.829f, 7.343f)
                lineTo(0.586f, 10.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.828f)
                lineToRelative(3.243f, 3.243f)
                lineToRelative(1.414f, -1.414f)
                lineTo(3.0f, 13.0f)
                horizontalLineTo(21.0f)
                lineToRelative(-2.242f, 2.243f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.242f, -3.243f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.414f, 10.586f)
                close()
            }
        }
        .build()
        return _arrowsH!!
    }

private var _arrowsH: ImageVector? = null
