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

public val Icons.Outline.ArrowCircleUp: ImageVector
    get() {
        if (_arrowCircleUp != null) {
            return _arrowCircleUp!!
        }
        _arrowCircleUp = Builder(name = "ArrowCircleUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 0.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 2.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(6.293f, 10.879f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineTo(11.0f, 7.587f)
                lineTo(11.007f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(13.0f, 7.586f)
                lineToRelative(3.293f, 3.293f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 17.731f, 9.49f)
                lineToRelative(-0.024f, -0.025f)
                lineTo(14.122f, 5.879f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.243f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(6.293f, 9.465f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.293f, 10.879f)
                close()
            }
        }
        .build()
        return _arrowCircleUp!!
    }

private var _arrowCircleUp: ImageVector? = null
