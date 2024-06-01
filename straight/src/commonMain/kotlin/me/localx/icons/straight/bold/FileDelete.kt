package me.localx.icons.straight.bold

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

public val Icons.Bold.FileDelete: ImageVector
    get() {
        if (_fileDelete != null) {
            return _fileDelete!!
        }
        _fileDelete = Builder(name = "FileDelete", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0609f, 12.061f)
                    lineTo(14.1209f, 14.0f)
                    lineTo(16.0609f, 15.939f)
                    lineTo(13.9389f, 18.061f)
                    lineTo(11.9999f, 16.121f)
                    lineTo(10.0609f, 18.061f)
                    lineTo(7.9389f, 15.939f)
                    lineTo(9.8789f, 14.0f)
                    lineTo(7.9389f, 12.061f)
                    lineTo(10.0609f, 9.939f)
                    lineTo(11.9999f, 11.879f)
                    lineTo(13.9389f, 9.939f)
                    lineTo(16.0609f, 12.061f)
                    close()
                    moveTo(21.9999f, 5.879f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(1.9999f)
                    verticalLineTo(3.0f)
                    curveTo(1.9999f, 2.2043f, 2.316f, 1.4413f, 2.8786f, 0.8787f)
                    curveTo(3.4412f, 0.3161f, 4.2043f, 0.0f, 4.9999f, 0.0f)
                    lineTo(16.1209f, 0.0f)
                    lineTo(21.9999f, 5.879f)
                    close()
                    moveTo(18.9999f, 21.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(13.9999f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(4.9999f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(18.9999f)
                    close()
                }
            }
        }
        .build()
        return _fileDelete!!
    }

private var _fileDelete: ImageVector? = null
