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

public val Icons.Filled.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0322f, 19.0f)
                    curveTo(12.4263f, 19.0007f, 12.8166f, 18.9234f, 13.1808f, 18.7728f)
                    curveTo(13.545f, 18.6221f, 13.8758f, 18.4009f, 14.1542f, 18.122f)
                    lineTo(18.0732f, 14.2f)
                    lineTo(16.6592f, 12.79f)
                    lineTo(13.0262f, 16.424f)
                    lineTo(13.0002f, 0.0f)
                    horizontalLineTo(11.0002f)
                    lineTo(11.0262f, 16.408f)
                    lineTo(7.4062f, 12.788f)
                    lineTo(5.9922f, 14.2f)
                    lineTo(9.9112f, 18.119f)
                    curveTo(10.1893f, 18.3983f, 10.5198f, 18.6199f, 10.8838f, 18.7711f)
                    curveTo(11.2478f, 18.9223f, 11.638f, 19.0001f, 12.0322f, 19.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 15.9999f)
                    verticalLineTo(20.9999f)
                    curveTo(22.0f, 21.2651f, 21.8946f, 21.5194f, 21.7071f, 21.707f)
                    curveTo(21.5196f, 21.8945f, 21.2652f, 21.9999f, 21.0f, 21.9999f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 21.9999f, 2.4804f, 21.8945f, 2.2929f, 21.707f)
                    curveTo(2.1054f, 21.5194f, 2.0f, 21.2651f, 2.0f, 20.9999f)
                    verticalLineTo(15.9999f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.9999f)
                    curveTo(0.0f, 21.7955f, 0.3161f, 22.5586f, 0.8787f, 23.1212f)
                    curveTo(1.4413f, 23.6838f, 2.2043f, 23.9999f, 3.0f, 23.9999f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 23.9999f, 22.5587f, 23.6838f, 23.1213f, 23.1212f)
                    curveTo(23.6839f, 22.5586f, 24.0f, 21.7955f, 24.0f, 20.9999f)
                    verticalLineTo(15.9999f)
                    horizontalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
