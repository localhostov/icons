package me.localx.icons.rounded.filled

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

public val Icons.Filled.ArrowSquareRight: ImageVector
    get() {
        if (_arrowSquareRight != null) {
            return _arrowSquareRight!!
        }
        _arrowSquareRight = Builder(name = "ArrowSquareRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.0f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 5.0f)
                close()
                moveTo(14.535f, 6.293f)
                lineToRelative(3.586f, 3.586f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 4.243f)
                lineToRelative(-3.586f, 3.585f)
                lineToRelative(-0.025f, 0.024f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.389f, -1.438f)
                lineTo(16.414f, 13.0f)
                lineTo(6.0f, 13.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                lineTo(16.413f, 11.0f)
                lineTo(13.121f, 7.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _arrowSquareRight!!
    }

private var _arrowSquareRight: ImageVector? = null
