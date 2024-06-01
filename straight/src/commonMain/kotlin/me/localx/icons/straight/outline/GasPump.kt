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

public val Icons.Outline.GasPump: ImageVector
    get() {
        if (_gasPump != null) {
            return _gasPump!!
        }
        _gasPump = Builder(name = "GasPump", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.293f, 2.293f)
                    lineTo(19.0f, 5.586f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(3.0f)
                    curveTo(16.0f, 2.2043f, 15.6839f, 1.4413f, 15.1213f, 0.8787f)
                    curveTo(14.5587f, 0.3161f, 13.7956f, 0.0f, 13.0f, 0.0f)
                    lineTo(3.0f, 0.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(6.414f)
                    lineTo(23.707f, 3.707f)
                    lineTo(22.293f, 2.293f)
                    close()
                    moveTo(3.0f, 2.0f)
                    horizontalLineTo(13.0f)
                    curveTo(13.2652f, 2.0f, 13.5196f, 2.1054f, 13.7071f, 2.2929f)
                    curveTo(13.8946f, 2.4804f, 14.0f, 2.7348f, 14.0f, 3.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(12.0f)
                    curveTo(11.9961f, 8.0429f, 11.6462f, 7.1195f, 11.015f, 6.4f)
                    lineTo(12.707f, 4.707f)
                    lineTo(11.293f, 3.293f)
                    lineTo(9.339f, 5.247f)
                    curveTo(8.7369f, 5.0238f, 8.0896f, 4.9503f, 7.4528f, 5.0328f)
                    curveTo(6.8159f, 5.1153f, 6.2087f, 5.3513f, 5.6834f, 5.7206f)
                    curveTo(5.158f, 6.0899f, 4.7303f, 6.5813f, 4.4371f, 7.1526f)
                    curveTo(4.1438f, 7.7239f, 3.9938f, 8.3579f, 4.0f, 9.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(3.0f)
                    curveTo(2.0f, 2.7348f, 2.1054f, 2.4804f, 2.2929f, 2.2929f)
                    curveTo(2.4804f, 2.1054f, 2.7348f, 2.0f, 3.0f, 2.0f)
                    close()
                    moveTo(10.0f, 9.0f)
                    horizontalLineTo(6.0f)
                    curveTo(6.0f, 8.4696f, 6.2107f, 7.9609f, 6.5858f, 7.5858f)
                    curveTo(6.9609f, 7.2107f, 7.4696f, 7.0f, 8.0f, 7.0f)
                    curveTo(8.5304f, 7.0f, 9.0391f, 7.2107f, 9.4142f, 7.5858f)
                    curveTo(9.7893f, 7.9609f, 10.0f, 8.4696f, 10.0f, 9.0f)
                    close()
                    moveTo(2.0f, 22.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(2.0f)
                    close()
                }
            }
        }
        .build()
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
