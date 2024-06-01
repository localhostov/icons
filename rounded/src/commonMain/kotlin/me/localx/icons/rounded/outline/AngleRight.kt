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

public val Icons.Outline.AngleRight: ImageVector
    get() {
        if (_angleRight != null) {
            return _angleRight!!
        }
        _angleRight = Builder(name = "AngleRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.9998f, 24.0f)
                    curveTo(6.8682f, 24.0008f, 6.7378f, 23.9756f, 6.6159f, 23.9258f)
                    curveTo(6.4941f, 23.876f, 6.3833f, 23.8027f, 6.2899f, 23.71f)
                    curveTo(6.1961f, 23.6171f, 6.1217f, 23.5065f, 6.071f, 23.3846f)
                    curveTo(6.0202f, 23.2628f, 5.9941f, 23.132f, 5.9941f, 23.0f)
                    curveTo(5.9941f, 22.868f, 6.0202f, 22.7373f, 6.071f, 22.6155f)
                    curveTo(6.1217f, 22.4936f, 6.1961f, 22.383f, 6.2899f, 22.29f)
                    lineTo(14.4598f, 14.12f)
                    curveTo(15.0216f, 13.5575f, 15.3372f, 12.7951f, 15.3372f, 12.0f)
                    curveTo(15.3372f, 11.205f, 15.0216f, 10.4426f, 14.4598f, 9.88f)
                    lineTo(6.2899f, 1.7101f)
                    curveTo(6.1015f, 1.5218f, 5.9958f, 1.2664f, 5.9958f, 1.0001f)
                    curveTo(5.9958f, 0.7338f, 6.1015f, 0.4784f, 6.2899f, 0.2901f)
                    curveTo(6.4781f, 0.1018f, 6.7336f, -0.004f, 6.9998f, -0.004f)
                    curveTo(7.2661f, -0.004f, 7.5215f, 0.1018f, 7.7098f, 0.2901f)
                    lineTo(15.8798f, 8.46f)
                    curveTo(16.3455f, 8.9245f, 16.7149f, 9.4763f, 16.967f, 10.0837f)
                    curveTo(17.219f, 10.6912f, 17.3488f, 11.3424f, 17.3488f, 12.0f)
                    curveTo(17.3488f, 12.6577f, 17.219f, 13.3089f, 16.967f, 13.9164f)
                    curveTo(16.7149f, 14.5238f, 16.3455f, 15.0756f, 15.8798f, 15.54f)
                    lineTo(7.7098f, 23.71f)
                    curveTo(7.6164f, 23.8027f, 7.5056f, 23.876f, 7.3837f, 23.9258f)
                    curveTo(7.2619f, 23.9756f, 7.1315f, 24.0008f, 6.9998f, 24.0f)
                    close()
                }
            }
        }
        .build()
        return _angleRight!!
    }

private var _angleRight: ImageVector? = null
