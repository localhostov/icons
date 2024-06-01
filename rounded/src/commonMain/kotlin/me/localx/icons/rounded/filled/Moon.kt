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

public val Icons.Filled.Moon: ImageVector
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
                    moveTo(15.0f, 23.9998f)
                    curveTo(13.3195f, 23.9985f, 11.658f, 23.6449f, 10.1226f, 22.9618f)
                    curveTo(8.5872f, 22.2787f, 7.2121f, 21.2812f, 6.086f, 20.0338f)
                    curveTo(4.9515f, 18.7849f, 4.0954f, 17.309f, 3.5748f, 15.7041f)
                    curveTo(3.0541f, 14.0992f, 2.8807f, 12.4019f, 3.066f, 10.7248f)
                    curveTo(3.3648f, 8.1148f, 4.5034f, 5.6725f, 6.3104f, 3.7656f)
                    curveTo(8.1174f, 1.8587f, 10.4949f, 0.5905f, 13.085f, 0.1518f)
                    curveTo(14.7595f, -0.1068f, 16.4682f, -0.0372f, 18.116f, 0.3568f)
                    curveTo(18.5475f, 0.4676f, 18.9415f, 0.6918f, 19.2573f, 1.006f)
                    curveTo(19.5731f, 1.3203f, 19.7992f, 1.7132f, 19.9122f, 2.1441f)
                    curveTo(20.0252f, 2.575f, 20.021f, 3.0283f, 19.9f, 3.4571f)
                    curveTo(19.779f, 3.8858f, 19.5456f, 4.2745f, 19.224f, 4.5828f)
                    curveTo(14.664f, 8.7488f, 15.06f, 15.2268f, 20.031f, 18.9928f)
                    curveTo(20.3825f, 19.2686f, 20.6536f, 19.6337f, 20.8162f, 20.0499f)
                    curveTo(20.9787f, 20.4661f, 21.0268f, 20.9182f, 20.9553f, 21.3593f)
                    curveTo(20.8839f, 21.8003f, 20.6955f, 22.2142f, 20.4098f, 22.5577f)
                    curveTo(20.1242f, 22.9013f, 19.7516f, 23.162f, 19.331f, 23.3128f)
                    curveTo(17.9328f, 23.7696f, 16.471f, 24.0015f, 15.0f, 23.9998f)
                    close()
                }
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
