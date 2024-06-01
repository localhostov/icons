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

public val Icons.Outline.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) {
            return _flipHorizontal!!
        }
        _flipHorizontal = Builder(name = "FlipHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.3559f, 0.0f)
                    lineTo(0.3749f, 19.759f)
                    curveTo(0.1672f, 20.2159f, 0.0776f, 20.7177f, 0.1141f, 21.2183f)
                    curveTo(0.1506f, 21.7188f, 0.3121f, 22.2022f, 0.5839f, 22.6242f)
                    curveTo(0.8556f, 23.0462f, 1.2289f, 23.3933f, 1.6695f, 23.6336f)
                    curveTo(2.1101f, 23.874f, 2.604f, 24.0f, 3.1059f, 24.0f)
                    horizontalLineTo(10.9999f)
                    verticalLineTo(1.046f)
                    lineTo(10.9929f, 0.0f)
                    horizontalLineTo(9.3559f)
                    close()
                    moveTo(8.9999f, 22.0f)
                    horizontalLineTo(3.1059f)
                    curveTo(2.9385f, 22.0001f, 2.7737f, 21.9582f, 2.6267f, 21.8781f)
                    curveTo(2.4797f, 21.798f, 2.3552f, 21.6823f, 2.2645f, 21.5416f)
                    curveTo(2.1738f, 21.4009f, 2.1199f, 21.2396f, 2.1078f, 21.0727f)
                    curveTo(2.0956f, 20.9057f, 2.1256f, 20.7384f, 2.1949f, 20.586f)
                    lineTo(8.9999f, 5.616f)
                    verticalLineTo(22.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.6249f, 19.759f)
                    lineTo(14.9299f, 0.628f)
                    lineTo(14.6259f, 0.0f)
                    horizontalLineTo(12.9999f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(20.8939f)
                    curveTo(21.3958f, 24.0f, 21.8896f, 23.874f, 22.3303f, 23.6336f)
                    curveTo(22.7709f, 23.3933f, 23.1441f, 23.0462f, 23.4159f, 22.6242f)
                    curveTo(23.6876f, 22.2022f, 23.8491f, 21.7188f, 23.8856f, 21.2183f)
                    curveTo(23.9221f, 20.7177f, 23.8325f, 20.2159f, 23.6249f, 19.759f)
                    close()
                }
            }
        }
        .build()
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
