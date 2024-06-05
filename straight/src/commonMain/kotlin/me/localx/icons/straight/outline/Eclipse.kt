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

public val Icons.Outline.Eclipse: ImageVector
    get() {
        if (_eclipse != null) {
            return _eclipse!!
        }
        _eclipse = Builder(name = "Eclipse", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 6.0f, 6.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 18.0f, 6.0f)
                close()
                moveTo(18.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, -4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 16.0f)
                close()
                moveTo(13.432f, 18.564f)
                arcTo(6.967f, 6.967f, 0.0f, false, true, 12.0f, 18.922f)
                lineTo(12.0f, 23.0f)
                lineTo(10.0f, 23.0f)
                lineTo(10.0f, 18.92f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, true, -1.623f, -0.435f)
                lineTo(6.33f, 22.006f)
                lineTo(4.6f, 21.0f)
                lineToRelative(2.05f, -3.525f)
                arcToRelative(7.057f, 7.057f, 0.0f, false, true, -1.129f, -1.13f)
                lineTo(2.01f, 18.391f)
                lineTo(1.0f, 16.662f)
                lineToRelative(3.509f, -2.043f)
                arcTo(6.952f, 6.952f, 0.0f, false, true, 4.08f, 13.0f)
                lineTo(0.0f, 13.0f)
                lineTo(0.0f, 11.0f)
                lineTo(4.08f, 11.0f)
                arcToRelative(6.916f, 6.916f, 0.0f, false, true, 0.436f, -1.626f)
                lineTo(1.0f, 7.326f)
                lineTo(2.0f, 5.6f)
                lineTo(5.527f, 7.648f)
                arcTo(7.09f, 7.09f, 0.0f, false, true, 6.672f, 6.509f)
                lineTo(4.627f, 2.992f)
                lineTo(6.355f, 1.986f)
                lineTo(8.4f, 5.505f)
                arcTo(6.944f, 6.944f, 0.0f, false, true, 10.0f, 5.08f)
                lineTo(10.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.0f, 5.078f)
                arcToRelative(6.967f, 6.967f, 0.0f, false, true, 1.432f, 0.358f)
                arcToRelative(8.089f, 8.089f, 0.0f, false, false, -1.714f, 1.616f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 0.0f, 9.9f)
                arcTo(8.089f, 8.089f, 0.0f, false, false, 13.432f, 18.564f)
                close()
            }
        }
        .build()
        return _eclipse!!
    }

private var _eclipse: ImageVector? = null
