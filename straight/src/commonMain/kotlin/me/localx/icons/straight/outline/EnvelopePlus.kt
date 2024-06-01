package me.localx.icons.straight.outline

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

public val Icons.Outline.EnvelopePlus: ImageVector
    get() {
        if (_envelopePlus != null) {
            return _envelopePlus!!
        }
        _envelopePlus = Builder(name = "EnvelopePlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 10.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.0f)
                    curveTo(0.0f, 5.2043f, 0.3161f, 4.4413f, 0.8787f, 3.8787f)
                    curveTo(1.4413f, 3.3161f, 2.2043f, 3.0f, 3.0f, 3.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 5.0f, 2.4804f, 5.1054f, 2.2929f, 5.2929f)
                    curveTo(2.1054f, 5.4804f, 2.0f, 5.7348f, 2.0f, 6.0f)
                    verticalLineTo(6.242f)
                    lineTo(9.878f, 14.122f)
                    curveTo(10.4498f, 14.6675f, 11.2097f, 14.9719f, 12.0f, 14.9719f)
                    curveTo(12.7903f, 14.9719f, 13.5502f, 14.6675f, 14.122f, 14.122f)
                    lineTo(18.242f, 10.0f)
                    horizontalLineTo(21.071f)
                    lineTo(15.536f, 15.536f)
                    curveTo(15.0717f, 16.0004f, 14.5204f, 16.3688f, 13.9137f, 16.6202f)
                    curveTo(13.307f, 16.8716f, 12.6567f, 17.0009f, 12.0f, 17.0009f)
                    curveTo(11.3433f, 17.0009f, 10.693f, 16.8716f, 10.0863f, 16.6202f)
                    curveTo(9.4796f, 16.3688f, 8.9283f, 16.0004f, 8.464f, 15.536f)
                    lineTo(2.0f, 9.071f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(21.0f, 3.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _envelopePlus!!
    }

private var _envelopePlus: ImageVector? = null
