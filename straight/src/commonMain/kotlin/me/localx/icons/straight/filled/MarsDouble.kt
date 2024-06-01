package me.localx.icons.straight.filled

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

public val Icons.Filled.MarsDouble: ImageVector
    get() {
        if (_marsDouble != null) {
            return _marsDouble!!
        }
        _marsDouble = Builder(name = "MarsDouble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0024f, 2.0375f)
                    verticalLineTo(6.0219f)
                    horizontalLineTo(16.0103f)
                    verticalLineTo(3.446f)
                    lineTo(12.6235f, 6.8328f)
                    curveTo(14.9425f, 9.9264f, 14.3145f, 14.3143f, 11.2209f, 16.6333f)
                    curveTo(8.1273f, 18.9523f, 3.7394f, 18.3243f, 1.4204f, 15.2307f)
                    curveTo(-0.8985f, 12.137f, -0.2707f, 7.7492f, 2.823f, 5.4302f)
                    curveTo(5.3086f, 3.567f, 8.7248f, 3.5645f, 11.213f, 5.4242f)
                    lineTo(14.5998f, 2.0375f)
                    horizontalLineTo(12.0259f)
                    verticalLineTo(0.0453f)
                    horizontalLineTo(16.0103f)
                    curveTo(17.1105f, 0.0453f, 18.0024f, 0.9373f, 18.0024f, 2.0375f)
                    close()
                    moveTo(21.9869f, 6.0219f)
                    horizontalLineTo(18.0024f)
                    verticalLineTo(8.0141f)
                    horizontalLineTo(20.5784f)
                    lineTo(17.1787f, 11.4138f)
                    curveTo(16.8094f, 11.1304f, 16.4126f, 10.8848f, 15.9943f, 10.6807f)
                    curveTo(15.9943f, 10.7883f, 16.0103f, 10.8939f, 16.0103f, 11.0025f)
                    curveTo(16.0048f, 15.9514f, 11.9942f, 19.9619f, 7.0453f, 19.9674f)
                    curveTo(6.9367f, 19.9674f, 6.8311f, 19.9545f, 6.7236f, 19.9515f)
                    curveTo(8.361f, 23.4332f, 12.511f, 24.9284f, 15.9928f, 23.2909f)
                    curveTo(18.4379f, 22.141f, 19.9975f, 19.681f, 19.9946f, 16.9791f)
                    curveTo(19.9916f, 15.4768f, 19.4981f, 14.0165f, 18.5891f, 12.8204f)
                    lineTo(21.9868f, 9.4227f)
                    verticalLineTo(11.9986f)
                    horizontalLineTo(23.979f)
                    verticalLineTo(8.0142f)
                    curveTo(23.979f, 6.9139f, 23.0871f, 6.0219f, 21.9869f, 6.0219f)
                    close()
                }
            }
        }
        .build()
        return _marsDouble!!
    }

private var _marsDouble: ImageVector? = null
