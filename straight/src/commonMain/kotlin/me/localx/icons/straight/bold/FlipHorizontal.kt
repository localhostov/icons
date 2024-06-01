package me.localx.icons.straight.bold

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

public val Icons.Bold.FlipHorizontal: ImageVector
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
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.9998f, 3.993f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(9.5158f)
                    lineTo(0.7998f, 19.175f)
                    curveTo(0.5633f, 19.6948f, 0.461f, 20.2657f, 0.5024f, 20.8354f)
                    curveTo(0.5439f, 21.405f, 0.7276f, 21.9551f, 1.0368f, 22.4353f)
                    curveTo(1.346f, 22.9154f, 1.7708f, 23.3103f, 2.2722f, 23.5837f)
                    curveTo(2.7736f, 23.8571f, 3.3357f, 24.0002f, 3.9068f, 24.0f)
                    horizontalLineTo(10.9998f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(3.9068f)
                    curveTo(3.8378f, 20.9998f, 3.77f, 20.9825f, 3.7094f, 20.9494f)
                    curveTo(3.6489f, 20.9164f, 3.5975f, 20.8687f, 3.5601f, 20.8108f)
                    curveTo(3.5226f, 20.7529f, 3.5003f, 20.6865f, 3.495f, 20.6177f)
                    curveTo(3.4897f, 20.549f, 3.5016f, 20.48f, 3.5298f, 20.417f)
                    lineTo(10.9998f, 3.993f)
                    close()
                }
            }
        }
        .build()
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
