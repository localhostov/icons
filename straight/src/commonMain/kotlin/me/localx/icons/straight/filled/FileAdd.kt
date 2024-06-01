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

public val Icons.Filled.FileAdd: ImageVector
    get() {
        if (_fileAdd != null) {
            return _fileAdd!!
        }
        _fileAdd = Builder(name = "FileAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.4136f, 5.0f)
                    horizontalLineTo(16.9996f)
                    verticalLineTo(0.586f)
                    lineTo(21.4136f, 5.0f)
                    close()
                    moveTo(21.9996f, 7.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(1.9996f)
                    verticalLineTo(3.0f)
                    curveTo(1.9996f, 2.2043f, 2.3157f, 1.4413f, 2.8783f, 0.8787f)
                    curveTo(3.4409f, 0.3161f, 4.204f, 0.0f, 4.9996f, 0.0f)
                    lineTo(14.9996f, 0.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(21.9996f)
                    close()
                    moveTo(15.9996f, 14.0f)
                    horizontalLineTo(12.9996f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(10.9996f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(7.9996f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(10.9996f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(12.9996f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(15.9996f)
                    verticalLineTo(14.0f)
                    close()
                }
            }
        }
        .build()
        return _fileAdd!!
    }

private var _fileAdd: ImageVector? = null
