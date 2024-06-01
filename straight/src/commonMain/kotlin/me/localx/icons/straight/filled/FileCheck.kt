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

public val Icons.Filled.FileCheck: ImageVector
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
                    moveTo(16.6112f, 13.536f)
                    lineTo(15.2002f, 12.122f)
                    lineTo(11.6102f, 15.707f)
                    curveTo(11.42f, 15.889f, 11.1669f, 15.9905f, 10.9037f, 15.9905f)
                    curveTo(10.6404f, 15.9905f, 10.3874f, 15.889f, 10.1972f, 15.707f)
                    lineTo(8.6111f, 14.122f)
                    lineTo(7.2002f, 15.536f)
                    lineTo(8.7851f, 17.121f)
                    curveTo(9.0637f, 17.3996f, 9.3945f, 17.6207f, 9.7585f, 17.7715f)
                    curveTo(10.1225f, 17.9222f, 10.5126f, 17.9999f, 10.9067f, 17.9999f)
                    curveTo(11.3007f, 17.9999f, 11.6908f, 17.9222f, 12.0548f, 17.7715f)
                    curveTo(12.4188f, 17.6207f, 12.7496f, 17.3996f, 13.0282f, 17.121f)
                    lineTo(16.6112f, 13.536f)
                    close()
                }
            }
        }
        .build()
        return _fileCheck!!
    }

private var _fileCheck: ImageVector? = null
