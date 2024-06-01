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

public val Icons.Outline.ArrowFromBottom: ImageVector
    get() {
        if (_arrowFromBottom != null) {
            return _arrowFromBottom!!
        }
        _arrowFromBottom = Builder(name = "ArrowFromBottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.823f)
                lineTo(17.3f, 7.123f)
                curveTo(17.4886f, 7.3051f, 17.7412f, 7.4059f, 18.0034f, 7.4036f)
                curveTo(18.2655f, 7.4014f, 18.5164f, 7.2962f, 18.7018f, 7.1108f)
                curveTo(18.8872f, 6.9254f, 18.9923f, 6.6746f, 18.9946f, 6.4124f)
                curveTo(18.9969f, 6.1502f, 18.8961f, 5.8976f, 18.714f, 5.709f)
                lineTo(13.768f, 0.763f)
                curveTo(13.5358f, 0.5308f, 13.2602f, 0.3466f, 12.9568f, 0.2209f)
                curveTo(12.6535f, 0.0952f, 12.3283f, 0.0305f, 11.9999f, 0.0305f)
                curveTo(11.6716f, 0.0305f, 11.3464f, 0.0952f, 11.0431f, 0.2209f)
                curveTo(10.7397f, 0.3466f, 10.4641f, 0.5308f, 10.2319f, 0.763f)
                lineTo(5.2819f, 5.713f)
                curveTo(5.0944f, 5.901f, 4.9893f, 6.1558f, 4.9897f, 6.4214f)
                curveTo(4.9901f, 6.687f, 5.0959f, 6.9415f, 5.2839f, 7.129f)
                curveTo(5.472f, 7.3165f, 5.7268f, 7.4216f, 5.9924f, 7.4212f)
                curveTo(6.2579f, 7.4209f, 6.5124f, 7.315f, 6.7f, 7.127f)
                lineTo(10.9999f, 2.827f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.9999f)
                curveTo(5.7347f, 22.0f, 5.4804f, 22.1053f, 5.2928f, 22.2929f)
                curveTo(5.1053f, 22.4804f, 4.9999f, 22.7348f, 4.9999f, 23.0f)
                curveTo(4.9999f, 23.2652f, 5.1053f, 23.5195f, 5.2928f, 23.7071f)
                curveTo(5.4804f, 23.8946f, 5.7347f, 24.0f, 5.9999f, 24.0f)
                horizontalLineTo(18.0f)
                curveTo(18.2652f, 24.0f, 18.5195f, 23.8946f, 18.7071f, 23.7071f)
                curveTo(18.8946f, 23.5195f, 19.0f, 23.2652f, 19.0f, 23.0f)
                curveTo(19.0f, 22.7348f, 18.8946f, 22.4804f, 18.7071f, 22.2929f)
                curveTo(18.5195f, 22.1053f, 18.2652f, 22.0f, 18.0f, 22.0f)
                close()
            }
        }
        .build()
        return _arrowFromBottom!!
    }

private var _arrowFromBottom: ImageVector? = null
