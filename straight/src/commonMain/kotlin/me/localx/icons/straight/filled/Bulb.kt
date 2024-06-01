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

public val Icons.Filled.Bulb: ImageVector
    get() {
        if (_bulb != null) {
            return _bulb!!
        }
        _bulb = Builder(name = "Bulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.8682f, 15.5829f)
                    curveTo(4.8136f, 14.6087f, 4.0091f, 13.3948f, 3.5229f, 12.0439f)
                    curveTo(3.0368f, 10.6929f, 2.8832f, 9.2448f, 3.0752f, 7.8219f)
                    curveTo(3.2651f, 6.3792f, 3.802f, 5.004f, 4.6398f, 3.8142f)
                    curveTo(5.4777f, 2.6245f, 6.5915f, 1.6556f, 7.8859f, 0.9907f)
                    curveTo(9.1803f, 0.3258f, 10.6166f, -0.0154f, 12.0717f, -0.0035f)
                    curveTo(13.5269f, 0.0084f, 14.9574f, 0.3729f, 16.2408f, 1.0589f)
                    curveTo(17.5241f, 1.7448f, 18.622f, 2.7317f, 19.4404f, 3.935f)
                    curveTo(20.2587f, 5.1383f, 20.773f, 6.522f, 20.9393f, 7.9677f)
                    curveTo(21.1056f, 9.4133f, 20.9189f, 10.8777f, 20.3952f, 12.2354f)
                    curveTo(19.8714f, 13.5931f, 19.0263f, 14.8035f, 17.9322f, 15.7629f)
                    curveTo(16.99f, 16.6132f, 16.3557f, 17.7514f, 16.1282f, 18.9999f)
                    horizontalLineTo(13.0002f)
                    verticalLineTo(10.8159f)
                    curveTo(13.5831f, 10.6098f, 14.0881f, 10.2287f, 14.4461f, 9.7246f)
                    curveTo(14.8041f, 9.2206f, 14.9977f, 8.6182f, 15.0002f, 7.9999f)
                    horizontalLineTo(13.0002f)
                    curveTo(13.0002f, 8.2652f, 12.8949f, 8.5195f, 12.7073f, 8.707f)
                    curveTo(12.5198f, 8.8946f, 12.2655f, 8.9999f, 12.0002f, 8.9999f)
                    curveTo(11.735f, 8.9999f, 11.4807f, 8.8946f, 11.2931f, 8.707f)
                    curveTo(11.1056f, 8.5195f, 11.0002f, 8.2652f, 11.0002f, 7.9999f)
                    horizontalLineTo(9.0002f)
                    curveTo(9.0028f, 8.6182f, 9.1963f, 9.2206f, 9.5543f, 9.7246f)
                    curveTo(9.9123f, 10.2287f, 10.4173f, 10.6098f, 11.0002f, 10.8159f)
                    verticalLineTo(18.9999f)
                    horizontalLineTo(7.8752f)
                    curveTo(7.5758f, 17.6807f, 6.8746f, 16.4869f, 5.8682f, 15.5829f)
                    close()
                    moveTo(8.0002f, 20.9999f)
                    verticalLineTo(23.9999f)
                    horizontalLineTo(16.0002f)
                    verticalLineTo(20.9999f)
                    horizontalLineTo(8.0002f)
                    close()
                }
            }
        }
        .build()
        return _bulb!!
    }

private var _bulb: ImageVector? = null
