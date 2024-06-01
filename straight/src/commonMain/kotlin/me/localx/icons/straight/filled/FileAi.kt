package me.localx.icons.straight.filled

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

public val Icons.Filled.FileAi: ImageVector
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
                    moveTo(18.9998f, 23.4144f)
                    lineTo(23.4138f, 19.0004f)
                    horizontalLineTo(18.9998f)
                    verticalLineTo(23.4144f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.4798f, 8.5737f)
                    horizontalLineTo(7.5768f)
                    lineTo(7.0308f, 7.1267f)
                    lineTo(6.4798f, 8.5737f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.0f)
                    curveTo(24.0f, 2.2043f, 23.6839f, 1.4413f, 23.1213f, 0.8787f)
                    curveTo(22.5587f, 0.3161f, 21.7956f, 0.0f, 21.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(8.563f, 11.187f)
                    lineTo(8.049f, 9.824f)
                    horizontalLineTo(6.0f)
                    lineTo(5.48f, 11.188f)
                    horizontalLineTo(4.146f)
                    lineTo(6.5f, 5.007f)
                    lineTo(7.566f, 5.0f)
                    lineTo(9.9f, 11.188f)
                    lineTo(8.563f, 11.187f)
                    close()
                    moveTo(12.406f, 11.131f)
                    horizontalLineTo(11.156f)
                    verticalLineTo(5.062f)
                    horizontalLineTo(12.406f)
                    verticalLineTo(11.131f)
                    close()
                }
            }
        }
        .build()
        return _fileAi!!
    }

private var _fileAi: ImageVector? = null
