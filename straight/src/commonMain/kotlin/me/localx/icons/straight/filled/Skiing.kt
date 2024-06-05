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

public val Icons.Filled.Skiing: ImageVector
    get() {
        if (_skiing != null) {
            return _skiing!!
        }
        _skiing = Builder(name = "Skiing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.179f, 20.864f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.672f, 0.937f)
                lineToRelative(-7.09f, -3.364f)
                lineTo(15.0f, 13.8f)
                lineToRelative(-1.964f, -1.478f)
                lineToRelative(1.4f, -1.556f)
                lineTo(9.79f, 8.564f)
                arcToRelative(2.763f, 2.763f, 0.0f, false, false, 0.092f, 3.909f)
                lineToRelative(2.541f, 1.912f)
                lineToRelative(-1.816f, 3.194f)
                lineTo(0.875f, 12.962f)
                lineTo(0.018f, 14.769f)
                lineToRelative(18.628f, 8.836f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, false, 1.727f, 0.4f)
                arcToRelative(4.021f, 4.021f, 0.0f, false, false, 1.33f, -0.228f)
                arcToRelative(3.973f, 3.973f, 0.0f, false, false, 2.279f, -2.044f)
                close()
                moveTo(15.961f, 9.071f)
                verticalLineToRelative(2.457f)
                lineToRelative(4.493f, 2.064f)
                lineToRelative(0.835f, -1.818f)
                lineToRelative(-3.328f, -1.528f)
                verticalLineToRelative(-3.6f)
                lineToRelative(-1.3f, -0.986f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, false, -1.849f, -0.747f)
                arcToRelative(3.015f, 3.015f, 0.0f, false, false, -2.256f, 0.916f)
                lineTo(11.292f, 7.064f)
                lineTo(15.83f, 9.217f)
                close()
                moveTo(5.955f, 4.521f)
                lineToRelative(0.758f, -1.6f)
                lineTo(4.907f, 2.066f)
                lineToRelative(-0.757f, 1.6f)
                lineToRelative(-1.406f, -0.67f)
                lineTo(1.886f, 4.8f)
                lineToRelative(1.407f, 0.67f)
                lineToRelative(-0.758f, 1.6f)
                lineToRelative(1.806f, 0.858f)
                lineToRelative(0.757f, -1.6f)
                lineTo(9.79f, 8.564f)
                lineToRelative(1.5f, -1.5f)
                close()
                moveTo(19.077f, -0.019f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -2.5f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.077f, -0.019f)
                close()
            }
        }
        .build()
        return _skiing!!
    }

private var _skiing: ImageVector? = null
