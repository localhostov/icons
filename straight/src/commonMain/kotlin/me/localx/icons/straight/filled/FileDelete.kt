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

public val Icons.Filled.FileDelete: ImageVector
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
                    moveTo(21.4142f, 5.0f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(0.586f)
                    lineTo(21.4142f, 5.0f)
                    close()
                    moveTo(22.0002f, 7.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(3.0f)
                    curveTo(2.0001f, 2.2043f, 2.3162f, 1.4413f, 2.8788f, 0.8787f)
                    curveTo(3.4414f, 0.3161f, 4.2045f, 0.0f, 5.0002f, 0.0f)
                    lineTo(15.0002f, 0.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(22.0002f)
                    close()
                    moveTo(13.4142f, 15.0f)
                    lineTo(15.9572f, 12.457f)
                    lineTo(14.5432f, 11.043f)
                    lineTo(12.0002f, 13.586f)
                    lineTo(9.4572f, 11.043f)
                    lineTo(8.0431f, 12.457f)
                    lineTo(10.5862f, 15.0f)
                    lineTo(8.0431f, 17.543f)
                    lineTo(9.4572f, 18.957f)
                    lineTo(12.0002f, 16.414f)
                    lineTo(14.5432f, 18.957f)
                    lineTo(15.9572f, 17.543f)
                    lineTo(13.4142f, 15.0f)
                    close()
                }
            }
        }
        .build()
        return _fileDelete!!
    }

private var _fileDelete: ImageVector? = null
