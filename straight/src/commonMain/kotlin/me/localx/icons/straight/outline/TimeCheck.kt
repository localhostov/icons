package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.TimeCheck: ImageVector
    get() {
        if (_timeCheck != null) {
            return _timeCheck!!
        }
        _timeCheck = Builder(name = "TimeCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.4001f, 24.0007f)
                    horizontalLineTo(16.3671f)
                    curveTo(16.114f, 23.9966f, 15.8644f, 23.9414f, 15.6332f, 23.8382f)
                    curveTo(15.4021f, 23.7351f, 15.1942f, 23.5863f, 15.0221f, 23.4007f)
                    lineTo(11.8541f, 20.1387f)
                    lineTo(13.3001f, 18.7568f)
                    lineTo(16.4051f, 21.9567f)
                    lineTo(22.4861f, 15.8748f)
                    lineTo(23.9001f, 17.2858f)
                    lineTo(17.7391f, 23.4477f)
                    curveTo(17.5638f, 23.6242f, 17.3551f, 23.764f, 17.1252f, 23.8589f)
                    curveTo(16.8953f, 23.9539f, 16.6488f, 24.0021f, 16.4001f, 24.0007f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.9999f, 6.0f)
                    verticalLineTo(10.586f)
                    lineTo(8.2929f, 13.293f)
                    lineTo(9.7069f, 14.707f)
                    lineTo(12.9999f, 11.414f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(10.9999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9999f, 0.0f)
                    curveTo(8.9215f, 0.0258f, 5.9707f, 1.2337f, 3.7579f, 3.374f)
                    curveTo(1.5451f, 5.5142f, 0.2394f, 8.4231f, 0.111f, 11.499f)
                    curveTo(-0.0175f, 14.5748f, 1.0412f, 17.5824f, 3.0679f, 19.8996f)
                    curveTo(5.0946f, 22.2169f, 7.9344f, 23.6666f, 10.9999f, 23.949f)
                    verticalLineTo(21.949f)
                    curveTo(9.0298f, 21.7525f, 7.1623f, 20.9761f, 5.6336f, 19.7179f)
                    curveTo(4.1049f, 18.4598f, 2.9838f, 16.7764f, 2.4121f, 14.8809f)
                    curveTo(1.8405f, 12.9853f, 1.8439f, 10.9628f, 2.422f, 9.0692f)
                    curveTo(3.0002f, 7.1757f, 4.127f, 5.4961f, 5.66f, 4.2432f)
                    curveTo(7.193f, 2.9902f, 9.0632f, 2.2202f, 11.0339f, 2.0304f)
                    curveTo(13.0047f, 1.8407f, 14.9874f, 2.2398f, 16.7313f, 3.1773f)
                    curveTo(18.4751f, 4.1148f, 19.9017f, 5.5485f, 20.8305f, 7.297f)
                    curveTo(21.7592f, 9.0455f, 22.1485f, 11.0302f, 21.9489f, 13.0f)
                    horizontalLineTo(23.9489f)
                    curveTo(23.9769f, 12.669f, 23.9999f, 12.338f, 23.9999f, 12.0f)
                    curveTo(23.9965f, 8.8185f, 22.7311f, 5.7682f, 20.4814f, 3.5185f)
                    curveTo(18.2317f, 1.2688f, 15.1815f, 0.0034f, 11.9999f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _timeCheck!!
    }

private var _timeCheck: ImageVector? = null
