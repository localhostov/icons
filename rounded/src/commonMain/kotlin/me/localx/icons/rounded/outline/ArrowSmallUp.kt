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

public val Icons.Outline.ArrowSmallUp: ImageVector
    get() {
        if (_arrowSmallUp != null) {
            return _arrowSmallUp!!
        }
        _arrowSmallUp = Builder(name = "ArrowSmallUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7102f, 9.88f)
                lineTo(13.4102f, 5.59f)
                curveTo(13.0355f, 5.2175f, 12.5286f, 5.0084f, 12.0002f, 5.0084f)
                curveTo(11.4718f, 5.0084f, 10.9649f, 5.2175f, 10.5902f, 5.59f)
                lineTo(6.2902f, 9.88f)
                curveTo(6.1039f, 10.0674f, 5.9994f, 10.3208f, 5.9994f, 10.585f)
                curveTo(5.9994f, 10.8492f, 6.1039f, 11.1026f, 6.2902f, 11.29f)
                curveTo(6.3832f, 11.3837f, 6.4938f, 11.4581f, 6.6156f, 11.5089f)
                curveTo(6.7375f, 11.5597f, 6.8682f, 11.5858f, 7.0002f, 11.5858f)
                curveTo(7.1322f, 11.5858f, 7.2629f, 11.5597f, 7.3848f, 11.5089f)
                curveTo(7.5066f, 11.4581f, 7.6172f, 11.3837f, 7.7102f, 11.29f)
                lineTo(11.0002f, 8.0f)
                verticalLineTo(19.0f)
                curveTo(11.0002f, 19.2652f, 11.1055f, 19.5196f, 11.2931f, 19.7071f)
                curveTo(11.4806f, 19.8947f, 11.735f, 20.0f, 12.0002f, 20.0f)
                curveTo(12.2654f, 20.0f, 12.5198f, 19.8947f, 12.7073f, 19.7071f)
                curveTo(12.8948f, 19.5196f, 13.0002f, 19.2652f, 13.0002f, 19.0f)
                verticalLineTo(8.0f)
                lineTo(16.2902f, 11.29f)
                curveTo(16.4772f, 11.4783f, 16.7313f, 11.5846f, 16.9966f, 11.5856f)
                curveTo(17.262f, 11.5865f, 17.5169f, 11.482f, 17.7052f, 11.295f)
                curveTo(17.8935f, 11.108f, 17.9998f, 10.8539f, 18.0007f, 10.5885f)
                curveTo(18.0017f, 10.3232f, 17.8972f, 10.0683f, 17.7102f, 9.88f)
                close()
            }
        }
        .build()
        return _arrowSmallUp!!
    }

private var _arrowSmallUp: ImageVector? = null
