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

public val Icons.Outline.FileAi: ImageVector
    get() {
        if (_fileAi != null) {
            return _fileAi!!
        }
        _fileAi = Builder(name = "FileAi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(18.35f)
                    curveTo(20.556f, 21.793f, 21.793f, 20.556f, 24.0f, 18.35f)
                    verticalLineTo(3.0f)
                    curveTo(24.0f, 2.2043f, 23.6839f, 1.4413f, 23.1213f, 0.8787f)
                    curveTo(22.5587f, 0.3161f, 21.7956f, 0.0f, 21.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(2.0f, 3.0f)
                    curveTo(2.0f, 2.7348f, 2.1054f, 2.4804f, 2.2929f, 2.2929f)
                    curveTo(2.4804f, 2.1054f, 2.7348f, 2.0f, 3.0f, 2.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 2.0f, 21.5196f, 2.1054f, 21.7071f, 2.2929f)
                    curveTo(21.8946f, 2.4804f, 22.0f, 2.7348f, 22.0f, 3.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(18.0f, 21.521f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(21.521f)
                    lineTo(18.0f, 21.521f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.5002f, 5.0066f)
                    lineTo(4.1462f, 11.1876f)
                    horizontalLineTo(5.4842f)
                    lineTo(6.0002f, 9.8236f)
                    horizontalLineTo(8.0492f)
                    lineTo(8.5632f, 11.1866f)
                    horizontalLineTo(9.9002f)
                    lineTo(7.5662f, 4.9996f)
                    lineTo(6.5002f, 5.0066f)
                    close()
                    moveTo(6.4802f, 8.5736f)
                    lineTo(7.0312f, 7.1266f)
                    lineTo(7.5772f, 8.5736f)
                    horizontalLineTo(6.4802f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.406f, 5.062f)
                    horizontalLineTo(11.156f)
                    verticalLineTo(11.131f)
                    horizontalLineTo(12.406f)
                    verticalLineTo(5.062f)
                    close()
                }
            }
        }
        .build()
        return _fileAi!!
    }

private var _fileAi: ImageVector? = null
