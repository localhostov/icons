package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Diploma: ImageVector
    get() {
        if (_diploma != null) {
            return _diploma!!
        }
        _diploma = Builder(name = "Diploma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 20.444f)
                    verticalLineTo(24.0f)
                    lineTo(18.0f, 22.0f)
                    lineTo(16.0f, 24.0f)
                    verticalLineTo(20.444f)
                    curveTo(15.2374f, 20.0037f, 14.6414f, 19.3241f, 14.3045f, 18.5106f)
                    curveTo(13.9675f, 17.6971f, 13.9084f, 16.7952f, 14.1363f, 15.9446f)
                    curveTo(14.3642f, 15.0941f, 14.8664f, 14.3425f, 15.565f, 13.8065f)
                    curveTo(16.2635f, 13.2704f, 17.1195f, 12.9799f, 18.0f, 12.9799f)
                    curveTo(18.8805f, 12.9799f, 19.7365f, 13.2704f, 20.435f, 13.8065f)
                    curveTo(21.1336f, 14.3425f, 21.6358f, 15.0941f, 21.8637f, 15.9446f)
                    curveTo(22.0916f, 16.7952f, 22.0325f, 17.6971f, 21.6955f, 18.5106f)
                    curveTo(21.3586f, 19.3241f, 20.7626f, 20.0037f, 20.0f, 20.444f)
                    close()
                    moveTo(14.0f, 21.463f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.0f)
                    curveTo(3.0f, 2.2043f, 3.3161f, 1.4413f, 3.8787f, 0.8787f)
                    curveTo(4.4413f, 0.3161f, 5.2043f, 0.0f, 6.0f, 0.0f)
                    lineTo(18.0f, 0.0f)
                    curveTo(18.7956f, 0.0f, 19.5587f, 0.3161f, 20.1213f, 0.8787f)
                    curveTo(20.6839f, 1.4413f, 21.0f, 2.2043f, 21.0f, 3.0f)
                    verticalLineTo(11.809f)
                    curveTo(19.7162f, 11.0633f, 18.2013f, 10.8206f, 16.7488f, 11.1281f)
                    curveTo(15.2963f, 11.4356f, 14.0096f, 12.2712f, 13.1381f, 13.4732f)
                    curveTo(12.2665f, 14.6752f, 11.8722f, 16.1579f, 12.0314f, 17.634f)
                    curveTo(12.1907f, 19.1101f, 12.8922f, 20.4746f, 14.0f, 21.463f)
                    close()
                    moveTo(7.0f, 6.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(6.0f)
                    close()
                    moveTo(7.0f, 10.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(7.0f, 14.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(14.0f)
                    close()
                }
            }
        }
        .build()
        return _diploma!!
    }

private var _diploma: ImageVector? = null
