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

public val Icons.Outline.AngleUp: ImageVector
    get() {
        if (_angleUp != null) {
            return _angleUp!!
        }
        _angleUp = Builder(name = "AngleUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.7101f, 16.2899f)
                    lineTo(15.5401f, 8.1199f)
                    curveTo(15.0756f, 7.6543f, 14.5239f, 7.2849f, 13.9164f, 7.0328f)
                    curveTo(13.309f, 6.7807f, 12.6578f, 6.651f, 12.0001f, 6.651f)
                    curveTo(11.3424f, 6.651f, 10.6912f, 6.7807f, 10.0838f, 7.0328f)
                    curveTo(9.4763f, 7.2849f, 8.9246f, 7.6543f, 8.4601f, 8.1199f)
                    lineTo(0.2901f, 16.2899f)
                    curveTo(0.1018f, 16.4782f, -0.004f, 16.7336f, -0.004f, 16.9999f)
                    curveTo(-0.004f, 17.2662f, 0.1018f, 17.5216f, 0.2901f, 17.7099f)
                    curveTo(0.4784f, 17.8982f, 0.7338f, 18.004f, 1.0001f, 18.004f)
                    curveTo(1.2664f, 18.004f, 1.5218f, 17.8982f, 1.7101f, 17.7099f)
                    lineTo(9.8801f, 9.5399f)
                    curveTo(10.4426f, 8.9781f, 11.2051f, 8.6626f, 12.0001f, 8.6626f)
                    curveTo(12.7951f, 8.6626f, 13.5576f, 8.9781f, 14.1201f, 9.5399f)
                    lineTo(22.2901f, 17.7099f)
                    curveTo(22.3831f, 17.8037f, 22.4937f, 17.8781f, 22.6155f, 17.9288f)
                    curveTo(22.7374f, 17.9796f, 22.8681f, 18.0057f, 23.0001f, 18.0057f)
                    curveTo(23.1321f, 18.0057f, 23.2628f, 17.9796f, 23.3847f, 17.9288f)
                    curveTo(23.5065f, 17.8781f, 23.6171f, 17.8037f, 23.7101f, 17.7099f)
                    curveTo(23.8038f, 17.617f, 23.8782f, 17.5064f, 23.929f, 17.3845f)
                    curveTo(23.9798f, 17.2627f, 24.0059f, 17.132f, 24.0059f, 16.9999f)
                    curveTo(24.0059f, 16.8679f, 23.9798f, 16.7372f, 23.929f, 16.6154f)
                    curveTo(23.8782f, 16.4935f, 23.8038f, 16.3829f, 23.7101f, 16.2899f)
                    close()
                }
            }
        }
        .build()
        return _angleUp!!
    }

private var _angleUp: ImageVector? = null
