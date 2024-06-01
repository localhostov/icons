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

public val Icons.Outline.AngleLeft: ImageVector
    get() {
        if (_angleLeft != null) {
            return _angleLeft!!
        }
        _angleLeft = Builder(name = "AngleLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.1699f, 24.0f)
                    curveTo(17.0383f, 24.0008f, 16.9078f, 23.9756f, 16.786f, 23.9258f)
                    curveTo(16.6641f, 23.876f, 16.5533f, 23.8027f, 16.4599f, 23.71f)
                    lineTo(8.2899f, 15.54f)
                    curveTo(7.8243f, 15.0756f, 7.4548f, 14.5238f, 7.2028f, 13.9164f)
                    curveTo(6.9507f, 13.3089f, 6.821f, 12.6577f, 6.821f, 12.0f)
                    curveTo(6.821f, 11.3424f, 6.9507f, 10.6912f, 7.2028f, 10.0837f)
                    curveTo(7.4548f, 9.4763f, 7.8243f, 8.9245f, 8.2899f, 8.46f)
                    lineTo(16.4599f, 0.2901f)
                    curveTo(16.5531f, 0.1968f, 16.6638f, 0.1229f, 16.7856f, 0.0724f)
                    curveTo(16.9075f, 0.0219f, 17.038f, -0.004f, 17.1699f, -0.004f)
                    curveTo(17.3018f, -0.004f, 17.4323f, 0.0219f, 17.5541f, 0.0724f)
                    curveTo(17.676f, 0.1229f, 17.7867f, 0.1968f, 17.8799f, 0.2901f)
                    curveTo(17.9731f, 0.3833f, 18.0471f, 0.494f, 18.0976f, 0.6158f)
                    curveTo(18.148f, 0.7376f, 18.174f, 0.8682f, 18.174f, 1.0001f)
                    curveTo(18.174f, 1.1319f, 18.148f, 1.2625f, 18.0976f, 1.3843f)
                    curveTo(18.0471f, 1.5061f, 17.9731f, 1.6168f, 17.8799f, 1.7101f)
                    lineTo(9.7099f, 9.88f)
                    curveTo(9.1481f, 10.4426f, 8.8325f, 11.205f, 8.8325f, 12.0f)
                    curveTo(8.8325f, 12.7951f, 9.1481f, 13.5575f, 9.7099f, 14.12f)
                    lineTo(17.8799f, 22.29f)
                    curveTo(17.9736f, 22.383f, 18.048f, 22.4936f, 18.0988f, 22.6155f)
                    curveTo(18.1496f, 22.7373f, 18.1757f, 22.868f, 18.1757f, 23.0f)
                    curveTo(18.1757f, 23.132f, 18.1496f, 23.2628f, 18.0988f, 23.3846f)
                    curveTo(18.048f, 23.5065f, 17.9736f, 23.6171f, 17.8799f, 23.71f)
                    curveTo(17.7865f, 23.8027f, 17.6756f, 23.876f, 17.5538f, 23.9258f)
                    curveTo(17.432f, 23.9756f, 17.3015f, 24.0008f, 17.1699f, 24.0f)
                    close()
                }
            }
        }
        .build()
        return _angleLeft!!
    }

private var _angleLeft: ImageVector? = null
