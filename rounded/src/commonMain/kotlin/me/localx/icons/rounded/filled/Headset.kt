package me.localx.icons.rounded.filled

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

public val Icons.Filled.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = Builder(name = "Headset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 21.9996f)
                curveTo(5.5304f, 21.9996f, 6.0392f, 21.7889f, 6.4142f, 21.4138f)
                curveTo(6.7893f, 21.0388f, 7.0f, 20.5301f, 7.0f, 19.9996f)
                verticalLineTo(13.9996f)
                curveTo(7.0f, 13.4692f, 6.7893f, 12.9605f, 6.4142f, 12.5854f)
                curveTo(6.0392f, 12.2103f, 5.5304f, 11.9996f, 5.0f, 11.9996f)
                verticalLineTo(10.9996f)
                curveTo(5.0f, 9.1431f, 5.7375f, 7.3626f, 7.0503f, 6.0499f)
                curveTo(8.363f, 4.7371f, 10.1435f, 3.9996f, 12.0f, 3.9996f)
                curveTo(13.8565f, 3.9996f, 15.637f, 4.7371f, 16.9498f, 6.0499f)
                curveTo(18.2625f, 7.3626f, 19.0f, 9.1431f, 19.0f, 10.9996f)
                verticalLineTo(11.9996f)
                curveTo(18.4696f, 11.9996f, 17.9609f, 12.2103f, 17.5858f, 12.5854f)
                curveTo(17.2107f, 12.9605f, 17.0f, 13.4692f, 17.0f, 13.9996f)
                verticalLineTo(19.9996f)
                horizontalLineTo(14.0f)
                curveTo(13.7348f, 19.9996f, 13.4804f, 20.105f, 13.2929f, 20.2925f)
                curveTo(13.1054f, 20.4801f, 13.0f, 20.7344f, 13.0f, 20.9996f)
                curveTo(13.0f, 21.2649f, 13.1054f, 21.5192f, 13.2929f, 21.7067f)
                curveTo(13.4804f, 21.8943f, 13.7348f, 21.9996f, 14.0f, 21.9996f)
                horizontalLineTo(19.0f)
                curveTo(20.146f, 21.9962f, 21.2561f, 21.5992f, 22.1443f, 20.8751f)
                curveTo(23.0326f, 20.151f, 23.6452f, 19.1437f, 23.8795f, 18.0219f)
                curveTo(24.1138f, 16.9001f, 23.9556f, 15.7318f, 23.4314f, 14.7127f)
                curveTo(22.9072f, 13.6936f, 22.0489f, 12.8855f, 21.0f, 12.4236f)
                verticalLineTo(10.9996f)
                curveTo(21.0f, 8.6127f, 20.0518f, 6.3235f, 18.364f, 4.6357f)
                curveTo(16.6761f, 2.9478f, 14.387f, 1.9996f, 12.0f, 1.9996f)
                curveTo(9.6131f, 1.9996f, 7.3239f, 2.9478f, 5.6361f, 4.6357f)
                curveTo(3.9482f, 6.3235f, 3.0f, 8.6127f, 3.0f, 10.9996f)
                verticalLineTo(12.4236f)
                curveTo(1.9512f, 12.8855f, 1.0928f, 13.6936f, 0.5686f, 14.7127f)
                curveTo(0.0445f, 15.7318f, -0.1137f, 16.9001f, 0.1206f, 18.0219f)
                curveTo(0.3549f, 19.1437f, 0.9674f, 20.151f, 1.8557f, 20.8751f)
                curveTo(2.7439f, 21.5992f, 3.854f, 21.9962f, 5.0f, 21.9996f)
                close()
            }
        }
        .build()
        return _headset!!
    }

private var _headset: ImageVector? = null
