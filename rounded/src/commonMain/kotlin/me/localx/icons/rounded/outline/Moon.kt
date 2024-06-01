package me.localx.icons.rounded.outline

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

public val Icons.Outline.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.9999f, 23.9998f)
                    curveTo(13.3194f, 23.9985f, 11.6579f, 23.6449f, 10.1225f, 22.9618f)
                    curveTo(8.5871f, 22.2787f, 7.212f, 21.2812f, 6.0859f, 20.0338f)
                    curveTo(4.9513f, 18.7849f, 4.0953f, 17.309f, 3.5747f, 15.7041f)
                    curveTo(3.054f, 14.0992f, 2.8806f, 12.4019f, 3.0659f, 10.7248f)
                    curveTo(3.3647f, 8.1148f, 4.5033f, 5.6725f, 6.3103f, 3.7656f)
                    curveTo(8.1172f, 1.8587f, 10.4948f, 0.5905f, 13.0849f, 0.1518f)
                    curveTo(14.7593f, -0.1068f, 16.4681f, -0.0372f, 18.1159f, 0.3568f)
                    curveTo(18.5474f, 0.4676f, 18.9414f, 0.6918f, 19.2572f, 1.006f)
                    curveTo(19.573f, 1.3203f, 19.7991f, 1.7132f, 19.9121f, 2.1441f)
                    curveTo(20.0251f, 2.575f, 20.0208f, 3.0283f, 19.8998f, 3.4571f)
                    curveTo(19.7789f, 3.8858f, 19.5455f, 4.2745f, 19.2239f, 4.5828f)
                    curveTo(14.6639f, 8.7488f, 15.0599f, 15.2268f, 20.0309f, 18.9928f)
                    curveTo(20.3824f, 19.2686f, 20.6535f, 19.6337f, 20.8161f, 20.0499f)
                    curveTo(20.9786f, 20.4661f, 21.0267f, 20.9182f, 20.9552f, 21.3593f)
                    curveTo(20.8837f, 21.8003f, 20.6954f, 22.2142f, 20.4097f, 22.5577f)
                    curveTo(20.124f, 22.9013f, 19.7515f, 23.162f, 19.3309f, 23.3128f)
                    curveTo(17.9327f, 23.7696f, 16.4708f, 24.0015f, 14.9999f, 23.9998f)
                    close()
                    moveTo(15.0759f, 1.9998f)
                    curveTo(14.5145f, 1.9984f, 13.9538f, 2.0409f, 13.3989f, 2.1268f)
                    curveTo(11.2424f, 2.4915f, 9.2628f, 3.5468f, 7.7579f, 5.1339f)
                    curveTo(6.2531f, 6.721f, 5.3045f, 8.754f, 5.0549f, 10.9268f)
                    curveTo(4.8989f, 12.3268f, 5.0427f, 13.744f, 5.4767f, 15.0842f)
                    curveTo(5.9106f, 16.4244f, 6.6249f, 17.6569f, 7.5719f, 18.6998f)
                    curveTo(8.9582f, 20.1795f, 10.7442f, 21.225f, 12.7131f, 21.7096f)
                    curveTo(14.682f, 22.1942f, 16.7492f, 22.097f, 18.6639f, 21.4298f)
                    curveTo(18.7464f, 21.3989f, 18.8193f, 21.3467f, 18.8752f, 21.2785f)
                    curveTo(18.9311f, 21.2103f, 18.9679f, 21.1286f, 18.9821f, 21.0416f)
                    curveTo(18.9962f, 20.9546f, 18.987f, 20.8654f, 18.9556f, 20.7831f)
                    curveTo(18.9241f, 20.7008f, 18.8714f, 20.6282f, 18.8029f, 20.5728f)
                    curveTo(12.8739f, 16.0948f, 12.4029f, 8.0868f, 17.8549f, 3.1238f)
                    curveTo(17.9175f, 3.0657f, 17.9626f, 2.9913f, 17.9852f, 2.909f)
                    curveTo(18.0078f, 2.8267f, 18.007f, 2.7397f, 17.9829f, 2.6578f)
                    curveTo(17.9621f, 2.5709f, 17.918f, 2.4913f, 17.8552f, 2.4277f)
                    curveTo(17.7925f, 2.364f, 17.7135f, 2.3188f, 17.6269f, 2.2968f)
                    curveTo(16.7917f, 2.0953f, 15.9351f, 1.9956f, 15.0759f, 1.9998f)
                    close()
                }
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
