package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.1222f, 13.293f)
                    lineTo(18.7082f, 14.707f)
                    lineTo(21.0002f, 17.0f)
                    horizontalLineTo(20.6182f)
                    curveTo(17.2342f, 17.0f, 15.0822f, 15.468f, 13.1722f, 13.492f)
                    lineTo(12.8722f, 13.84f)
                    curveTo(12.5442f, 14.22f, 12.2062f, 14.611f, 11.8542f, 15.004f)
                    curveTo(14.0543f, 17.5514f, 17.2563f, 19.0122f, 20.6223f, 19.004f)
                    horizontalLineTo(21.0002f)
                    lineTo(18.7072f, 21.297f)
                    lineTo(20.1212f, 22.711f)
                    lineTo(23.4142f, 19.4179f)
                    curveTo(24.195f, 18.637f, 24.195f, 17.371f, 23.4142f, 16.5899f)
                    lineTo(20.1222f, 13.293f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.619f, 6.9999f)
                    horizontalLineTo(21.0f)
                    lineTo(18.708f, 9.2929f)
                    lineTo(20.122f, 10.7069f)
                    lineTo(23.415f, 7.4139f)
                    curveTo(24.1958f, 6.6329f, 24.1958f, 5.3669f, 23.415f, 4.5859f)
                    lineTo(20.122f, 1.2929f)
                    lineTo(18.708f, 2.7068f)
                    lineTo(21.0f, 5.0f)
                    horizontalLineTo(20.618f)
                    curveTo(15.661f, 5.0f, 12.951f, 7.67f, 10.492f, 10.478f)
                    curveTo(8.063f, 7.7349f, 5.143f, 5.0f, -0.04f, 5.0f)
                    verticalLineTo(7.0f)
                    curveTo(4.424f, 7.0f, 6.833f, 9.336f, 9.169f, 12.0f)
                    curveTo(6.833f, 14.6639f, 4.424f, 17.0f, -0.04f, 17.0f)
                    verticalLineTo(19.0f)
                    curveTo(5.768f, 19.0f, 8.736f, 15.564f, 11.36f, 12.534f)
                    curveTo(13.814f, 9.6879f, 16.137f, 6.9999f, 20.619f, 6.9999f)
                    close()
                }
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
