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

public val Icons.Outline.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) {
            return _arrowCircleLeft!!
        }
        _arrowCircleLeft = Builder(name = "ArrowCircleLeft", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 12.0f, 22.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 2.0f, 12.0f)
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
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
