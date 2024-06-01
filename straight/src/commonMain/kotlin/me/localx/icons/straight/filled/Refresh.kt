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

public val Icons.Filled.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 2.0f)
                    curveTo(13.3295f, 2.0025f, 14.6452f, 2.269f, 15.8708f, 2.784f)
                    curveTo(17.0965f, 3.299f, 18.2077f, 4.0522f, 19.14f, 5.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(20.143f)
                    curveTo(20.6353f, 6.9995f, 21.1074f, 6.8036f, 21.4555f, 6.4555f)
                    curveTo(21.8037f, 6.1074f, 21.9995f, 5.6353f, 22.0f, 5.143f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(3.06f)
                    curveTo(18.2736f, 1.5159f, 16.1373f, 0.5044f, 13.8488f, 0.1476f)
                    curveTo(11.5603f, -0.2093f, 9.2175f, 0.1038f, 7.103f, 1.0489f)
                    curveTo(4.9885f, 1.9941f, 3.1927f, 3.5311f, 1.9323f, 5.4742f)
                    curveTo(0.6719f, 7.4174f, 8.0E-4f, 9.6839f, 0.0f, 12.0f)
                    horizontalLineTo(2.0f)
                    curveTo(2.0029f, 9.3487f, 3.0574f, 6.8069f, 4.9321f, 4.9321f)
                    curveTo(6.8069f, 3.0574f, 9.3487f, 2.0029f, 12.0f, 2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0001f, 12.0f)
                    curveTo(21.9998f, 13.986f, 21.4082f, 15.927f, 20.3006f, 17.5755f)
                    curveTo(19.193f, 19.224f, 17.6196f, 20.5054f, 15.781f, 21.2562f)
                    curveTo(13.9424f, 22.0071f, 11.9218f, 22.1936f, 9.9768f, 21.7917f)
                    curveTo(8.0319f, 21.3899f, 6.2506f, 20.418f, 4.8601f, 19.0f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(3.8571f)
                    curveTo(3.3648f, 17.0005f, 2.8928f, 17.1963f, 2.5446f, 17.5445f)
                    curveTo(2.1965f, 17.8926f, 2.0006f, 18.3647f, 2.0001f, 18.857f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(4.0001f)
                    verticalLineTo(20.94f)
                    curveTo(5.7265f, 22.4841f, 7.8628f, 23.4956f, 10.1513f, 23.8524f)
                    curveTo(12.4398f, 24.2093f, 14.7826f, 23.8962f, 16.8972f, 22.9511f)
                    curveTo(19.0117f, 22.0059f, 20.8075f, 20.4689f, 22.0678f, 18.5258f)
                    curveTo(23.3282f, 16.5826f, 23.9993f, 14.3161f, 24.0001f, 12.0f)
                    horizontalLineTo(22.0001f)
                    close()
                }
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
