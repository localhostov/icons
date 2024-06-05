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

public val Icons.Outline.ArrowSquareLeft: ImageVector
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
                lineTo(24.0f, 5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                lineTo(5.0f, 0.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 5.0f)
                lineTo(0.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(19.0f, 24.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 24.0f, 19.0f)
                close()
                moveTo(5.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 2.0f)
                lineTo(19.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                lineTo(22.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                close()
                moveTo(10.879f, 17.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                lineTo(7.587f, 13.0f)
                lineTo(18.0f, 12.993f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(7.586f, 11.0f)
                lineToRelative(3.293f, -3.293f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 9.49f, 6.269f)
                lineToRelative(-0.025f, 0.024f)
                lineTo(5.879f, 9.878f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.243f)
                horizontalLineToRelative(0.0f)
                lineToRelative(3.586f, 3.586f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.879f, 17.707f)
                close()
            }
        }
        .build()
        return _arrowSquareLeft!!
    }

private var _arrowSquareLeft: ImageVector? = null
