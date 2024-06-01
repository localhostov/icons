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

public val Icons.Outline.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0998f, 0.8997f)
                    curveTo(22.5161f, 0.3437f, 21.7409f, 0.0336f, 20.9348f, 0.0336f)
                    curveTo(20.1287f, 0.0336f, 19.3535f, 0.3437f, 18.7698f, 0.8997f)
                    lineTo(7.5628f, 12.0997f)
                    curveTo(7.2141f, 12.0326f, 6.8599f, 11.9991f, 6.5048f, 11.9997f)
                    curveTo(5.783f, 11.9976f, 5.068f, 12.1387f, 4.4011f, 12.4149f)
                    curveTo(3.7342f, 12.6911f, 3.1288f, 13.0969f, 2.6198f, 13.6087f)
                    curveTo(0.6998f, 15.5327f, 0.1858f, 21.6277f, 0.0998f, 22.8297f)
                    lineTo(0.0238f, 23.9757f)
                    lineTo(1.1688f, 23.8957f)
                    curveTo(2.3688f, 23.8137f, 8.4688f, 23.3027f, 10.3908f, 21.3797f)
                    curveTo(11.0266f, 20.7421f, 11.4959f, 19.958f, 11.7575f, 19.0964f)
                    curveTo(12.019f, 18.2348f, 12.0648f, 17.3221f, 11.8908f, 16.4387f)
                    lineTo(23.0998f, 5.2297f)
                    curveTo(23.6725f, 4.6547f, 23.994f, 3.8762f, 23.994f, 3.0647f)
                    curveTo(23.994f, 2.2531f, 23.6725f, 1.4747f, 23.0998f, 0.8997f)
                    close()
                    moveTo(8.9768f, 19.9657f)
                    curveTo(8.0468f, 20.8947f, 4.7098f, 21.5257f, 2.2028f, 21.7957f)
                    curveTo(2.4858f, 19.1957f, 3.1458f, 15.9117f, 4.0338f, 15.0227f)
                    curveTo(4.7f, 14.4226f, 5.5712f, 14.1011f, 6.4675f, 14.1245f)
                    curveTo(7.3638f, 14.1479f, 8.217f, 14.5145f, 8.851f, 15.1485f)
                    curveTo(9.485f, 15.7825f, 9.8515f, 16.6356f, 9.8749f, 17.532f)
                    curveTo(9.8983f, 18.4283f, 9.5769f, 19.2994f, 8.9768f, 19.9657f)
                    close()
                    moveTo(21.6878f, 3.8157f)
                    lineTo(11.0668f, 14.4377f)
                    curveTo(10.6722f, 13.8402f, 10.1622f, 13.3275f, 9.5668f, 12.9297f)
                    lineTo(20.1838f, 2.3117f)
                    curveTo(20.3858f, 2.1187f, 20.6545f, 2.0111f, 20.9338f, 2.0111f)
                    curveTo(21.2132f, 2.0111f, 21.4818f, 2.1187f, 21.6838f, 2.3117f)
                    curveTo(21.783f, 2.4101f, 21.8618f, 2.5271f, 21.9157f, 2.656f)
                    curveTo(21.9696f, 2.7848f, 21.9975f, 2.9231f, 21.9979f, 3.0628f)
                    curveTo(21.9983f, 3.2025f, 21.9711f, 3.341f, 21.9179f, 3.4701f)
                    curveTo(21.8647f, 3.5993f, 21.7865f, 3.7167f, 21.6878f, 3.8157f)
                    close()
                }
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
