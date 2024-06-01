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

public val Icons.Outline.FileCheck: ImageVector
    get() {
        if (_fileCheck != null) {
            return _fileCheck!!
        }
        _fileCheck = Builder(name = "FileCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.4142f, 0.0f)
                    horizontalLineTo(5.0002f)
                    curveTo(4.2045f, 0.0f, 3.4414f, 0.3161f, 2.8788f, 0.8787f)
                    curveTo(2.3162f, 1.4413f, 2.0001f, 2.2043f, 2.0001f, 3.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(22.0002f)
                    verticalLineTo(7.586f)
                    lineTo(14.4142f, 0.0f)
                    close()
                    moveTo(15.0002f, 3.414f)
                    lineTo(18.5862f, 7.0f)
                    horizontalLineTo(15.0002f)
                    verticalLineTo(3.414f)
                    close()
                    moveTo(4.0002f, 22.0f)
                    verticalLineTo(3.0f)
                    curveTo(4.0002f, 2.7348f, 4.1055f, 2.4804f, 4.293f, 2.2929f)
                    curveTo(4.4806f, 2.1054f, 4.7349f, 2.0f, 5.0002f, 2.0f)
                    horizontalLineTo(13.0002f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(20.0002f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(4.0002f)
                    close()
                    moveTo(15.2932f, 13.122f)
                    lineTo(16.7072f, 14.536f)
                    lineTo(13.1212f, 18.121f)
                    curveTo(12.8426f, 18.3996f, 12.5118f, 18.6207f, 12.1478f, 18.7715f)
                    curveTo(11.7838f, 18.9222f, 11.3937f, 18.9999f, 10.9997f, 18.9999f)
                    curveTo(10.6056f, 18.9999f, 10.2155f, 18.9222f, 9.8515f, 18.7715f)
                    curveTo(9.4875f, 18.6207f, 9.1567f, 18.3996f, 8.8781f, 18.121f)
                    lineTo(7.2931f, 16.536f)
                    lineTo(8.7072f, 15.122f)
                    lineTo(10.2932f, 16.707f)
                    curveTo(10.4835f, 16.889f, 10.7368f, 16.9906f, 11.0002f, 16.9906f)
                    curveTo(11.2635f, 16.9906f, 11.5168f, 16.889f, 11.7072f, 16.707f)
                    lineTo(15.2932f, 13.122f)
                    close()
                }
            }
        }
        .build()
        return _fileCheck!!
    }

private var _fileCheck: ImageVector? = null
