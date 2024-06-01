package me.localx.icons.straight.outline

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

public val Icons.Outline.Drumstick: ImageVector
    get() {
        if (_drumstick != null) {
            return _drumstick!!
        }
        _drumstick = Builder(name = "Drumstick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.511f, 2.4902f)
                    curveTo(19.9159f, 0.898f, 17.7542f, 0.0038f, 15.5005f, 0.0038f)
                    curveTo(13.2468f, 0.0038f, 11.0851f, 0.898f, 9.49f, 2.4902f)
                    curveTo(6.318f, 5.6612f, 6.012f, 13.6282f, 6.0f, 13.9662f)
                    lineTo(5.986f, 14.4002f)
                    lineTo(7.086f, 15.5002f)
                    lineTo(2.807f, 19.7792f)
                    curveTo(2.6659f, 19.5211f, 2.452f, 19.3101f, 2.192f, 19.1726f)
                    curveTo(1.9319f, 19.0351f, 1.6372f, 18.9771f, 1.3444f, 19.0059f)
                    curveTo(1.0517f, 19.0346f, 0.7738f, 19.1487f, 0.5455f, 19.3341f)
                    curveTo(0.3171f, 19.5195f, 0.1483f, 19.768f, 0.06f, 20.0486f)
                    curveTo(-0.0283f, 20.3292f, -0.0321f, 20.6295f, 0.049f, 20.9123f)
                    curveTo(0.1301f, 21.195f, 0.2925f, 21.4477f, 0.5161f, 21.6388f)
                    curveTo(0.7397f, 21.83f, 1.0146f, 21.9512f, 1.3065f, 21.9873f)
                    curveTo(1.5984f, 22.0235f, 1.8945f, 21.973f, 2.158f, 21.8422f)
                    curveTo(2.0272f, 22.1056f, 1.9767f, 22.4017f, 2.0128f, 22.6937f)
                    curveTo(2.049f, 22.9856f, 2.1702f, 23.2604f, 2.3613f, 23.484f)
                    curveTo(2.5525f, 23.7076f, 2.8051f, 23.8701f, 3.0879f, 23.9512f)
                    curveTo(3.3707f, 24.0323f, 3.671f, 24.0285f, 3.9516f, 23.9402f)
                    curveTo(4.2322f, 23.8519f, 4.4807f, 23.6831f, 4.666f, 23.4547f)
                    curveTo(4.8514f, 23.2263f, 4.9656f, 22.9485f, 4.9943f, 22.6557f)
                    curveTo(5.023f, 22.363f, 4.965f, 22.0682f, 4.8275f, 21.8082f)
                    curveTo(4.69f, 21.5481f, 4.4791f, 21.3343f, 4.221f, 21.1932f)
                    lineTo(8.5f, 16.9142f)
                    lineTo(9.6f, 18.0142f)
                    lineTo(10.034f, 18.0002f)
                    curveTo(10.372f, 17.9882f, 18.334f, 17.6822f, 21.511f, 14.5102f)
                    curveTo(23.1026f, 12.915f, 23.9965f, 10.7536f, 23.9965f, 8.5002f)
                    curveTo(23.9965f, 6.2467f, 23.1026f, 4.0854f, 21.511f, 2.4902f)
                    close()
                    moveTo(20.1f, 13.1002f)
                    curveTo(18.064f, 15.1352f, 12.765f, 15.8442f, 10.4f, 15.9842f)
                    lineTo(8.02f, 13.6052f)
                    curveTo(8.16f, 11.2382f, 8.869f, 5.9392f, 10.904f, 3.9052f)
                    curveTo(12.1233f, 2.6857f, 13.7772f, 2.0006f, 15.5016f, 2.0005f)
                    curveTo(17.2261f, 2.0004f, 18.88f, 2.6853f, 20.0995f, 3.9047f)
                    curveTo(21.319f, 5.124f, 22.0041f, 6.7778f, 22.0042f, 8.5023f)
                    curveTo(22.0043f, 10.2268f, 21.3193f, 11.8807f, 20.1f, 13.1002f)
                    close()
                }
            }
        }
        .build()
        return _drumstick!!
    }

private var _drumstick: ImageVector? = null
