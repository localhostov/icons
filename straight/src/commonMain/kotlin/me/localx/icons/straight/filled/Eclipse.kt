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

public val Icons.Filled.Eclipse: ImageVector
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
                curveToRelative(-7.929f, 0.252f, -7.928f, 11.749f, 0.0f, 12.0f)
                curveTo(25.929f, 17.748f, 25.928f, 6.251f, 18.0f, 6.0f)
                close()
                moveTo(13.425f, 18.553f)
                lineToRelative(0.007f, 0.011f)
                arcTo(6.967f, 6.967f, 0.0f, false, true, 12.0f, 18.922f)
                verticalLineTo(23.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.92f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, true, -1.623f, -0.435f)
                lineTo(6.33f, 22.006f)
                lineTo(4.6f, 21.0f)
                lineToRelative(2.05f, -3.525f)
                arcToRelative(7.057f, 7.057f, 0.0f, false, true, -1.129f, -1.13f)
                lineTo(2.01f, 18.391f)
                lineTo(1.0f, 16.662f)
                lineToRelative(3.509f, -2.043f)
                arcTo(6.952f, 6.952f, 0.0f, false, true, 4.08f, 13.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.08f)
                arcToRelative(6.916f, 6.916f, 0.0f, false, true, 0.436f, -1.626f)
                lineTo(1.0f, 7.326f)
                lineTo(2.0f, 5.6f)
                lineTo(5.527f, 7.648f)
                arcTo(7.09f, 7.09f, 0.0f, false, true, 6.672f, 6.509f)
                lineTo(4.627f, 2.992f)
                lineTo(6.355f, 1.986f)
                lineTo(8.4f, 5.505f)
                arcTo(6.944f, 6.944f, 0.0f, false, true, 10.0f, 5.08f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.078f)
                arcToRelative(6.967f, 6.967f, 0.0f, false, true, 1.432f, 0.358f)
                lineToRelative(0.0f, 0.007f)
                curveTo(8.927f, 8.337f, 8.925f, 15.657f, 13.425f, 18.553f)
                close()
            }
        }
        .build()
        return _eclipse!!
    }

private var _eclipse: ImageVector? = null
