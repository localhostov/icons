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

public val Icons.Outline.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = Builder(name = "ArrowDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.05f, 17.79f)
                    curveTo(17.9571f, 17.6963f, 17.8465f, 17.6219f, 17.7246f, 17.5711f)
                    curveTo(17.6028f, 17.5203f, 17.472f, 17.4942f, 17.34f, 17.4942f)
                    curveTo(17.208f, 17.4942f, 17.0773f, 17.5203f, 16.9555f, 17.5711f)
                    curveTo(16.8336f, 17.6219f, 16.723f, 17.6963f, 16.63f, 17.79f)
                    lineTo(13.0f, 21.42f)
                    verticalLineTo(1.0f)
                    curveTo(13.0f, 0.7348f, 12.8947f, 0.4804f, 12.7071f, 0.2929f)
                    curveTo(12.5196f, 0.1054f, 12.2653f, 0.0f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    curveTo(11.7348f, 0.0f, 11.4805f, 0.1054f, 11.2929f, 0.2929f)
                    curveTo(11.1054f, 0.4804f, 11.0f, 0.7348f, 11.0f, 1.0f)
                    verticalLineTo(21.41f)
                    lineTo(7.38f, 17.79f)
                    curveTo(7.2943f, 17.6728f, 7.1841f, 17.5757f, 7.0571f, 17.5054f)
                    curveTo(6.93f, 17.4351f, 6.7892f, 17.3933f, 6.6444f, 17.3829f)
                    curveTo(6.4996f, 17.3725f, 6.3542f, 17.3938f, 6.2185f, 17.4452f)
                    curveTo(6.0827f, 17.4967f, 5.9598f, 17.5771f, 5.8582f, 17.6809f)
                    curveTo(5.7566f, 17.7846f, 5.6789f, 17.9093f, 5.6304f, 18.0461f)
                    curveTo(5.5819f, 18.183f, 5.5637f, 18.3287f, 5.5772f, 18.4733f)
                    curveTo(5.5907f, 18.6178f, 5.6355f, 18.7577f, 5.7085f, 18.8832f)
                    curveTo(5.7816f, 19.0087f, 5.881f, 19.1168f, 6.0f, 19.2f)
                    lineTo(9.92f, 23.12f)
                    curveTo(10.4825f, 23.6818f, 11.245f, 23.9974f, 12.04f, 23.9974f)
                    curveTo(12.835f, 23.9974f, 13.5975f, 23.6818f, 14.16f, 23.12f)
                    lineTo(18.08f, 19.2f)
                    curveTo(18.2624f, 19.0087f, 18.3615f, 18.753f, 18.3559f, 18.4888f)
                    curveTo(18.3503f, 18.2246f, 18.2403f, 17.9734f, 18.05f, 17.79f)
                    close()
                }
            }
        }
        .build()
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
