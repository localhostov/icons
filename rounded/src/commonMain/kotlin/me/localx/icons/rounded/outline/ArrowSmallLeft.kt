package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.ArrowSmallLeft: ImageVector
    get() {
        if (_arrowSmallLeft != null) {
            return _arrowSmallLeft!!
        }
        _arrowSmallLeft = Builder(name = "ArrowSmallLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.9999f)
                horizontalLineTo(9.0f)
                lineTo(12.29f, 7.7099f)
                curveTo(12.3837f, 7.617f, 12.4581f, 7.5064f, 12.5089f, 7.3845f)
                curveTo(12.5597f, 7.2627f, 12.5858f, 7.1319f, 12.5858f, 6.9999f)
                curveTo(12.5858f, 6.8679f, 12.5597f, 6.7372f, 12.5089f, 6.6154f)
                curveTo(12.4581f, 6.4935f, 12.3837f, 6.3829f, 12.29f, 6.2899f)
                curveTo(12.1026f, 6.1037f, 11.8492f, 5.9991f, 11.585f, 5.9991f)
                curveTo(11.3208f, 5.9991f, 11.0674f, 6.1037f, 10.88f, 6.2899f)
                lineTo(6.59f, 10.5899f)
                curveTo(6.2144f, 10.9633f, 6.0022f, 11.4704f, 6.0f, 11.9999f)
                curveTo(6.0049f, 12.526f, 6.2168f, 13.029f, 6.59f, 13.3999f)
                lineTo(10.88f, 17.6999f)
                curveTo(10.9732f, 17.7925f, 11.0838f, 17.8658f, 11.2054f, 17.9157f)
                curveTo(11.3269f, 17.9655f, 11.4571f, 17.9909f, 11.5885f, 17.9905f)
                curveTo(11.7199f, 17.99f, 11.8499f, 17.9637f, 11.9712f, 17.913f)
                curveTo(12.0924f, 17.8623f, 12.2024f, 17.7882f, 12.295f, 17.6949f)
                curveTo(12.3876f, 17.6017f, 12.4609f, 17.4911f, 12.5107f, 17.3696f)
                curveTo(12.5606f, 17.248f, 12.586f, 17.1178f, 12.5856f, 16.9864f)
                curveTo(12.5851f, 16.855f, 12.5588f, 16.725f, 12.508f, 16.6038f)
                curveTo(12.4573f, 16.4825f, 12.3832f, 16.3725f, 12.29f, 16.2799f)
                lineTo(9.0f, 12.9999f)
                horizontalLineTo(19.0f)
                curveTo(19.2652f, 12.9999f, 19.5196f, 12.8946f, 19.7071f, 12.707f)
                curveTo(19.8946f, 12.5195f, 20.0f, 12.2651f, 20.0f, 11.9999f)
                curveTo(20.0f, 11.7347f, 19.8946f, 11.4804f, 19.7071f, 11.2928f)
                curveTo(19.5196f, 11.1053f, 19.2652f, 10.9999f, 19.0f, 10.9999f)
                close()
            }
        }
        .build()
        return _arrowSmallLeft!!
    }

private var _arrowSmallLeft: ImageVector? = null
