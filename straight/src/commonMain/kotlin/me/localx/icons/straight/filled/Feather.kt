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

public val Icons.Filled.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9739f, 2.94f)
                    curveTo(23.5316f, 5.7313f, 22.6935f, 8.4453f, 21.4848f, 11.0f)
                    horizontalLineTo(14.4138f)
                    lineTo(17.9569f, 7.457f)
                    lineTo(16.5428f, 6.043f)
                    lineTo(9.9999f, 12.586f)
                    verticalLineTo(4.168f)
                    curveTo(13.3708f, 2.0738f, 17.1223f, 0.6665f, 21.0388f, 0.027f)
                    curveTo(21.4359f, -0.0318f, 21.8412f, 0.0028f, 22.2226f, 0.1281f)
                    curveTo(22.604f, 0.2533f, 22.9509f, 0.4658f, 23.2358f, 0.7485f)
                    curveTo(23.5207f, 1.0313f, 23.7357f, 1.3766f, 23.8638f, 1.757f)
                    curveTo(23.992f, 2.1374f, 24.0296f, 2.5425f, 23.9739f, 2.94f)
                    close()
                    moveTo(7.9998f, 5.533f)
                    curveTo(7.0296f, 6.2438f, 6.1125f, 7.0246f, 5.2558f, 7.869f)
                    curveTo(4.4967f, 8.6324f, 3.9048f, 9.5456f, 3.5179f, 10.5504f)
                    curveTo(3.1311f, 11.5552f, 2.9577f, 12.6295f, 3.0089f, 13.705f)
                    curveTo(3.0798f, 15.265f, 3.6274f, 16.7658f, 4.5778f, 18.005f)
                    lineTo(7.9998f, 14.586f)
                    verticalLineTo(5.533f)
                    close()
                    moveTo(10.5858f, 20.994f)
                    curveTo(11.6929f, 20.9897f, 12.7876f, 20.7613f, 13.804f, 20.3225f)
                    curveTo(14.8204f, 19.8837f, 15.7375f, 19.2437f, 16.4998f, 18.441f)
                    curveTo(18.0454f, 16.8022f, 19.3767f, 14.974f, 20.4618f, 13.0f)
                    horizontalLineTo(12.4138f)
                    lineTo(5.9908f, 19.423f)
                    curveTo(7.3035f, 20.4461f, 8.9215f, 20.9993f, 10.5858f, 20.994f)
                    close()
                    moveTo(4.5778f, 18.008f)
                    lineTo(0.0428f, 22.543f)
                    lineTo(1.4569f, 23.957f)
                    lineTo(5.9908f, 19.423f)
                    curveTo(5.9369f, 19.381f, 5.8759f, 19.352f, 5.8218f, 19.308f)
                    curveTo(5.3593f, 18.9231f, 4.942f, 18.487f, 4.5778f, 18.008f)
                    close()
                }
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
