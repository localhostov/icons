package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.766f, 4.566f)
                    curveTo(22.4006f, 4.4138f, 21.9981f, 4.3738f, 21.6099f, 4.4511f)
                    curveTo(21.2217f, 4.5284f, 20.8653f, 4.7194f, 20.586f, 5.0f)
                    lineTo(18.0f, 7.586f)
                    lineTo(13.414f, 3.0f)
                    curveTo(13.0389f, 2.6251f, 12.5303f, 2.4144f, 12.0f, 2.4144f)
                    curveTo(11.4697f, 2.4144f, 10.9611f, 2.6251f, 10.586f, 3.0f)
                    lineTo(6.0f, 7.586f)
                    lineTo(3.414f, 5.0f)
                    curveTo(3.1343f, 4.7204f, 2.778f, 4.53f, 2.3901f, 4.4528f)
                    curveTo(2.0022f, 4.3757f, 1.6001f, 4.4153f, 1.2347f, 4.5666f)
                    curveTo(0.8693f, 4.718f, 0.557f, 4.9743f, 0.3372f, 5.3031f)
                    curveTo(0.1174f, 5.6319f, 1.0E-4f, 6.0185f, 0.0f, 6.414f)
                    lineTo(0.0f, 17.0f)
                    curveTo(0.0016f, 18.3256f, 0.5289f, 19.5964f, 1.4662f, 20.5338f)
                    curveTo(2.4036f, 21.4711f, 3.6744f, 21.9984f, 5.0f, 22.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 21.9984f, 21.5964f, 21.4711f, 22.5338f, 20.5338f)
                    curveTo(23.4711f, 19.5964f, 23.9984f, 18.3256f, 24.0f, 17.0f)
                    verticalLineTo(6.414f)
                    curveTo(24.0001f, 6.0185f, 23.8829f, 5.6318f, 23.6633f, 5.3028f)
                    curveTo(23.4436f, 4.9739f, 23.1314f, 4.7175f, 22.766f, 4.566f)
                    close()
                }
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
