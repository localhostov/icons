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

public val Icons.Filled.World: ImageVector
    get() {
        if (_world != null) {
            return _world!!
        }
        _world = Builder(name = "World", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.0f, 16.9991f)
                    horizontalLineTo(6.086f)
                    lineTo(0.045f, 10.9581f)
                    curveTo(0.016f, 11.2991f, 0.0f, 11.6481f, 0.0f, 11.9991f)
                    curveTo(1.0E-4f, 15.0085f, 1.1309f, 17.9081f, 3.1683f, 20.1229f)
                    curveTo(5.2057f, 22.3378f, 8.001f, 23.7063f, 11.0f, 23.9571f)
                    verticalLineTo(16.9991f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.1261f, 19.1245f)
                    curveTo(18.4509f, 18.4531f, 17.9154f, 17.6546f, 17.5505f, 16.7752f)
                    curveTo(17.1856f, 15.8957f, 16.9985f, 14.9526f, 17.0001f, 14.0005f)
                    horizontalLineTo(13.0001f)
                    curveTo(12.2045f, 14.0005f, 11.4414f, 13.6844f, 10.8788f, 13.1218f)
                    curveTo(10.3162f, 12.5592f, 10.0001f, 11.7961f, 10.0001f, 11.0005f)
                    verticalLineTo(8.0005f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(4.0005f)
                    horizontalLineTo(17.0861f)
                    lineTo(18.9001f, 2.1835f)
                    curveTo(17.343f, 1.0896f, 15.548f, 0.3817f, 13.6633f, 0.1182f)
                    curveTo(11.7787f, -0.1452f, 9.8584f, 0.0433f, 8.0609f, 0.6683f)
                    curveTo(6.2635f, 1.2933f, 4.6405f, 2.3368f, 3.3259f, 3.7127f)
                    curveTo(2.0112f, 5.0886f, 1.0427f, 6.7575f, 0.5001f, 8.5815f)
                    lineTo(6.9141f, 15.0005f)
                    horizontalLineTo(10.0001f)
                    curveTo(10.7958f, 15.0005f, 11.5588f, 15.3165f, 12.1214f, 15.8791f)
                    curveTo(12.6841f, 16.4418f, 13.0001f, 17.2048f, 13.0001f, 18.0005f)
                    verticalLineTo(23.9585f)
                    curveTo(15.9281f, 23.7163f, 18.6648f, 22.4058f, 20.6891f, 20.2765f)
                    lineTo(19.1261f, 19.1245f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.489f, 17.6579f)
                    lineTo(21.943f, 18.7199f)
                    curveTo(23.5094f, 16.4021f, 24.2167f, 13.6099f, 23.9429f, 10.8259f)
                    curveTo(23.669f, 8.0419f, 22.431f, 5.4411f, 20.443f, 3.4729f)
                    lineTo(17.914f, 6.0009f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(10.0009f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(12.0009f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(13.9909f)
                    curveTo(19.0042f, 15.3597f, 19.5378f, 16.6737f, 20.489f, 17.6579f)
                    close()
                }
            }
        }
        .build()
        return _world!!
    }

private var _world: ImageVector? = null
