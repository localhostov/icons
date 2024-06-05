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
                moveTo(24.0f, 19.0f)
                verticalLineTo(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 5.0f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(19.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 24.0f, 19.0f)
                close()
                moveTo(9.465f, 17.707f)
                lineTo(5.879f, 14.121f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -4.243f)
                lineTo(9.465f, 6.293f)
                lineToRelative(0.025f, -0.024f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.389f, 1.438f)
                lineTo(7.586f, 11.0f)
                lineTo(18.0f, 10.993f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(7.587f, 13.0f)
                lineToRelative(3.292f, 3.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _arrowSquareLeft!!
    }

private var _arrowSquareLeft: ImageVector? = null
