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

public val Icons.Filled.Ship: ImageVector
    get() {
        if (_ship != null) {
            return _ship!!
        }
        _ship = Builder(name = "Ship", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 7.838f)
                    lineTo(4.0f, 10.505f)
                    verticalLineTo(8.0f)
                    curveTo(4.0f, 7.2043f, 4.3161f, 6.4413f, 4.8787f, 5.8787f)
                    curveTo(5.4413f, 5.3161f, 6.2043f, 5.0f, 7.0f, 5.0f)
                    horizontalLineTo(17.0f)
                    curveTo(17.7956f, 5.0f, 18.5587f, 5.3161f, 19.1213f, 5.8787f)
                    curveTo(19.6839f, 6.4413f, 20.0f, 7.2043f, 20.0f, 8.0f)
                    verticalLineTo(10.505f)
                    lineTo(12.0f, 7.838f)
                    close()
                    moveTo(22.0f, 21.0f)
                    curveTo(22.0f, 21.344f, 21.318f, 22.0f, 20.25f, 22.0f)
                    curveTo(19.945f, 22.0116f, 19.6413f, 21.9548f, 19.3611f, 21.8336f)
                    curveTo(19.0809f, 21.7125f, 18.8315f, 21.5302f, 18.631f, 21.3f)
                    curveTo(19.6958f, 20.264f, 20.5424f, 19.0254f, 21.1211f, 17.6571f)
                    curveTo(21.6997f, 16.2889f, 21.9985f, 14.8186f, 22.0f, 13.333f)
                    verticalLineTo(13.279f)
                    lineTo(13.0f, 10.279f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(10.28f)
                    lineTo(2.0f, 13.28f)
                    verticalLineTo(13.334f)
                    curveTo(2.0024f, 14.8199f, 2.3023f, 16.2902f, 2.8819f, 17.6583f)
                    curveTo(3.4615f, 19.0264f, 4.3092f, 20.2647f, 5.375f, 21.3f)
                    curveTo(5.1738f, 21.5308f, 4.9233f, 21.7136f, 4.6421f, 21.8347f)
                    curveTo(4.3608f, 21.9559f, 4.056f, 22.0124f, 3.75f, 22.0f)
                    curveTo(2.661f, 22.0f, 2.0f, 21.306f, 2.0f, 21.0f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0f, 22.626f, 1.718f, 24.0f, 3.75f, 24.0f)
                    curveTo(4.757f, 24.0076f, 5.7331f, 23.6527f, 6.5f, 23.0f)
                    curveTo(7.2718f, 23.6421f, 8.2435f, 23.9949f, 9.2475f, 23.9974f)
                    curveTo(10.2515f, 24.0f, 11.2249f, 23.6522f, 12.0f, 23.014f)
                    curveTo(12.7751f, 23.6522f, 13.7485f, 24.0f, 14.7525f, 23.9974f)
                    curveTo(15.7565f, 23.9949f, 16.7282f, 23.6421f, 17.5f, 23.0f)
                    curveTo(18.2666f, 23.6525f, 19.2423f, 24.0074f, 20.249f, 24.0f)
                    curveTo(22.282f, 24.0f, 24.0f, 22.626f, 24.0f, 21.0f)
                    horizontalLineTo(22.0f)
                    close()
                    moveTo(16.0f, 2.0f)
                    curveTo(16.0f, 1.4696f, 15.7893f, 0.9609f, 15.4142f, 0.5858f)
                    curveTo(15.0391f, 0.2107f, 14.5304f, 0.0f, 14.0f, 0.0f)
                    lineTo(10.0f, 0.0f)
                    curveTo(9.4696f, 0.0f, 8.9609f, 0.2107f, 8.5858f, 0.5858f)
                    curveTo(8.2107f, 0.9609f, 8.0f, 1.4696f, 8.0f, 2.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(2.0f)
                    close()
                }
            }
        }
        .build()
        return _ship!!
    }

private var _ship: ImageVector? = null
