package me.localx.icons.straight.bold

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

public val Icons.Bold.MapMarkerMinus: ImageVector
    get() {
        if (_mapMarkerMinus != null) {
            return _mapMarkerMinus!!
        }
        _mapMarkerMinus = Builder(name = "MapMarkerMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 23.9869f)
                    lineTo(19.071f, 17.0709f)
                    curveTo(20.9441f, 15.1944f, 21.9961f, 12.6513f, 21.9961f, 9.9999f)
                    curveTo(21.9961f, 7.3485f, 20.9441f, 4.8055f, 19.071f, 2.9289f)
                    curveTo(18.1431f, 1.9946f, 17.0397f, 1.2527f, 15.8243f, 0.7459f)
                    curveTo(14.6089f, 0.2391f, 13.3054f, -0.0227f, 11.9886f, -0.0244f)
                    curveTo(10.6718f, -0.0261f, 9.3675f, 0.2323f, 8.1508f, 0.7359f)
                    curveTo(6.9341f, 1.2396f, 5.8289f, 1.9786f, 4.8985f, 2.9105f)
                    curveTo(3.9682f, 3.8424f, 3.231f, 4.949f, 2.7294f, 6.1665f)
                    curveTo(2.2279f, 7.3841f, 1.9717f, 8.6887f, 1.9756f, 10.0056f)
                    curveTo(1.9796f, 11.3224f, 2.2436f, 12.6255f, 2.7524f, 13.84f)
                    curveTo(3.2613f, 15.0545f, 4.0051f, 16.1566f, 4.941f, 17.0829f)
                    lineTo(12.0f, 23.9869f)
                    close()
                    moveTo(7.051f, 5.0499f)
                    curveTo(8.3622f, 3.7357f, 10.1418f, 2.9961f, 11.9984f, 2.9939f)
                    curveTo(13.8549f, 2.9918f, 15.6362f, 3.7272f, 16.9505f, 5.0384f)
                    curveTo(18.2648f, 6.3497f, 19.0043f, 8.1293f, 19.0065f, 9.9858f)
                    curveTo(19.0087f, 11.8423f, 18.2732f, 13.6237f, 16.962f, 14.9379f)
                    lineTo(12.0f, 19.7909f)
                    lineTo(7.05f, 14.9499f)
                    curveTo(6.3999f, 14.2999f, 5.8842f, 13.5282f, 5.5324f, 12.6789f)
                    curveTo(5.1806f, 11.8296f, 4.9995f, 10.9193f, 4.9995f, 9.9999f)
                    curveTo(4.9995f, 9.0806f, 5.1806f, 8.1703f, 5.5324f, 7.321f)
                    curveTo(5.8842f, 6.4717f, 6.3999f, 5.7f, 7.05f, 5.0499f)
                    horizontalLineTo(7.051f)
                    close()
                    moveTo(16.0f, 11.4999f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(8.4999f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(11.4999f)
                    close()
                }
            }
        }
        .build()
        return _mapMarkerMinus!!
    }

private var _mapMarkerMinus: ImageVector? = null
