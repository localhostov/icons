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

public val Icons.Outline.ArrowCircleRight: ImageVector
    get() {
        if (_arrowCircleRight != null) {
            return _arrowCircleRight!!
        }
        _arrowCircleRight = Builder(name = "ArrowCircleRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 12.0f, 2.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 22.0f, 12.0f)
                close()
                moveTo(13.121f, 6.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                lineTo(16.413f, 11.0f)
                lineTo(6.0f, 11.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                lineTo(16.414f, 13.0f)
                lineToRelative(-3.293f, 3.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.389f, 1.438f)
                lineToRelative(0.025f, -0.024f)
                lineToRelative(3.586f, -3.585f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -4.243f)
                horizontalLineToRelative(0.0f)
                lineTo(14.535f, 6.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.121f, 6.293f)
                close()
            }
        }
        .build()
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null
