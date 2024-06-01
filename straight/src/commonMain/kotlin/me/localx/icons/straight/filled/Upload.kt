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

public val Icons.Filled.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(name = "Upload", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 15.9994f)
                    verticalLineTo(20.9994f)
                    curveTo(22.0f, 21.2646f, 21.8946f, 21.519f, 21.7071f, 21.7065f)
                    curveTo(21.5196f, 21.894f, 21.2652f, 21.9994f, 21.0f, 21.9994f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 21.9994f, 2.4804f, 21.894f, 2.2929f, 21.7065f)
                    curveTo(2.1054f, 21.519f, 2.0f, 21.2646f, 2.0f, 20.9994f)
                    verticalLineTo(15.9994f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.9994f)
                    curveTo(0.0f, 21.795f, 0.3161f, 22.5581f, 0.8787f, 23.1207f)
                    curveTo(1.4413f, 23.6833f, 2.2043f, 23.9994f, 3.0f, 23.9994f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 23.9994f, 22.5587f, 23.6833f, 23.1213f, 23.1207f)
                    curveTo(23.6839f, 22.5581f, 24.0f, 21.795f, 24.0f, 20.9994f)
                    verticalLineTo(15.9994f)
                    horizontalLineTo(22.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.967f, -2.0E-4f)
                    curveTo(11.5732f, -0.0013f, 11.183f, 0.0753f, 10.8189f, 0.2253f)
                    curveTo(10.4547f, 0.3753f, 10.1238f, 0.5956f, 9.845f, 0.8738f)
                    lineTo(5.926f, 4.7928f)
                    lineTo(7.34f, 6.2068f)
                    lineTo(10.974f, 2.5738f)
                    lineTo(11.0f, 18.9998f)
                    horizontalLineTo(13.0f)
                    lineTo(12.974f, 2.5878f)
                    lineTo(16.593f, 6.2068f)
                    lineTo(18.007f, 4.7928f)
                    lineTo(14.088f, 0.8738f)
                    curveTo(13.8093f, 0.5957f, 13.4786f, 0.3753f, 13.1146f, 0.2253f)
                    curveTo(12.7506f, 0.0754f, 12.3606f, -0.0013f, 11.967f, -2.0E-4f)
                    close()
                }
            }
        }
        .build()
        return _upload!!
    }

private var _upload: ImageVector? = null
