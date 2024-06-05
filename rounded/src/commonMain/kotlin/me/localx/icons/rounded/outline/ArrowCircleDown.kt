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

public val Icons.Outline.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) {
            return _arrowCircleDown!!
        }
        _arrowCircleDown = Builder(name = "ArrowCircleDown", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(17.707f, 13.121f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(13.0f, 16.413f)
                lineTo(12.993f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(11.0f, 16.414f)
                lineTo(7.707f, 13.121f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 6.269f, 14.51f)
                lineToRelative(0.024f, 0.025f)
                lineToRelative(3.585f, 3.586f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.243f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(3.586f, -3.586f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.707f, 13.121f)
                close()
            }
        }
        .build()
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null
