package me.localx.icons.straight.outline

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

public val Icons.Outline.CursorPlus: ImageVector
    get() {
        if (_cursorPlus != null) {
            return _cursorPlus!!
        }
        _cursorPlus = Builder(name = "CursorPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.9998f, 8.0002f)
                    curveTo(14.4176f, 8.0002f, 12.8708f, 8.4694f, 11.5552f, 9.3484f)
                    curveTo(10.2396f, 10.2275f, 9.2143f, 11.4769f, 8.6088f, 12.9387f)
                    curveTo(8.0033f, 14.4005f, 7.8448f, 16.009f, 8.1535f, 17.5609f)
                    curveTo(8.4622f, 19.1127f, 9.2241f, 20.5382f, 10.3429f, 21.657f)
                    curveTo(11.4618f, 22.7758f, 12.8872f, 23.5378f, 14.4391f, 23.8464f)
                    curveTo(15.9909f, 24.1551f, 17.5995f, 23.9967f, 19.0613f, 23.3912f)
                    curveTo(20.5231f, 22.7857f, 21.7725f, 21.7603f, 22.6516f, 20.4447f)
                    curveTo(23.5306f, 19.1291f, 23.9998f, 17.5824f, 23.9998f, 16.0002f)
                    curveTo(23.9974f, 13.8792f, 23.1538f, 11.8457f, 21.654f, 10.3459f)
                    curveTo(20.1542f, 8.8462f, 18.1208f, 8.0026f, 15.9998f, 8.0002f)
                    close()
                    moveTo(15.9998f, 22.0002f)
                    curveTo(14.8131f, 22.0002f, 13.6531f, 21.6483f, 12.6664f, 20.989f)
                    curveTo(11.6797f, 20.3297f, 10.9106f, 19.3926f, 10.4565f, 18.2963f)
                    curveTo(10.0024f, 17.1999f, 9.8836f, 15.9935f, 10.1151f, 14.8296f)
                    curveTo(10.3466f, 13.6657f, 10.918f, 12.5966f, 11.7572f, 11.7575f)
                    curveTo(12.5963f, 10.9184f, 13.6654f, 10.347f, 14.8293f, 10.1155f)
                    curveTo(15.9931f, 9.8839f, 17.1995f, 10.0028f, 18.2959f, 10.4569f)
                    curveTo(19.3923f, 10.911f, 20.3293f, 11.68f, 20.9886f, 12.6667f)
                    curveTo(21.6479f, 13.6534f, 21.9998f, 14.8135f, 21.9998f, 16.0002f)
                    curveTo(21.9982f, 17.591f, 21.3656f, 19.1162f, 20.2407f, 20.2411f)
                    curveTo(19.1158f, 21.3659f, 17.5906f, 21.9986f, 15.9998f, 22.0002f)
                    close()
                    moveTo(16.9998f, 15.0002f)
                    horizontalLineTo(18.9998f)
                    verticalLineTo(17.0002f)
                    horizontalLineTo(16.9998f)
                    verticalLineTo(19.0002f)
                    horizontalLineTo(14.9998f)
                    verticalLineTo(17.0002f)
                    horizontalLineTo(12.9998f)
                    verticalLineTo(15.0002f)
                    horizontalLineTo(14.9998f)
                    verticalLineTo(13.0002f)
                    horizontalLineTo(16.9998f)
                    verticalLineTo(15.0002f)
                    close()
                    moveTo(0.1438f, 0.1442f)
                    lineTo(4.8538f, 13.9102f)
                    lineTo(7.7538f, 7.7522f)
                    lineTo(13.9118f, 4.8522f)
                    lineTo(0.1438f, 0.1442f)
                    close()
                    moveTo(6.2438f, 6.2442f)
                    lineTo(5.1458f, 8.5902f)
                    lineTo(3.3558f, 3.3562f)
                    lineTo(8.5898f, 5.1462f)
                    lineTo(6.2438f, 6.2442f)
                    close()
                }
            }
        }
        .build()
        return _cursorPlus!!
    }

private var _cursorPlus: ImageVector? = null
