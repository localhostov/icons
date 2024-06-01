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

public val Icons.Filled.PaintBrush: ImageVector
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
                    moveTo(0.0238f, 23.9757f)
                    lineTo(0.0998f, 22.9257f)
                    curveTo(0.1758f, 21.8257f, 0.6448f, 16.2377f, 2.4068f, 14.4747f)
                    curveTo(3.3553f, 13.5488f, 4.6307f, 13.0342f, 5.9562f, 13.0425f)
                    curveTo(7.2817f, 13.0509f, 8.5504f, 13.5815f, 9.4872f, 14.5192f)
                    curveTo(10.4241f, 15.4569f, 10.9534f, 16.7262f, 10.9604f, 18.0517f)
                    curveTo(10.9675f, 19.3772f, 10.4516f, 20.6521f, 9.5248f, 21.5997f)
                    curveTo(7.7628f, 23.3617f, 2.1758f, 23.8297f, 1.0728f, 23.9057f)
                    lineTo(0.0238f, 23.9757f)
                    close()
                    moveTo(23.0998f, 0.8677f)
                    curveTo(22.5162f, 0.3104f, 21.7403f, -6.0E-4f, 20.9333f, -6.0E-4f)
                    curveTo(20.1263f, -6.0E-4f, 19.3504f, 0.3104f, 18.7668f, 0.8677f)
                    lineTo(8.2518f, 11.3867f)
                    curveTo(9.2572f, 11.7288f, 10.1712f, 12.2963f, 10.9237f, 13.0457f)
                    curveTo(11.6763f, 13.7951f, 12.2475f, 14.7067f, 12.5938f, 15.7107f)
                    lineTo(23.0998f, 5.1997f)
                    curveTo(23.6733f, 4.6247f, 23.9954f, 3.8458f, 23.9954f, 3.0337f)
                    curveTo(23.9954f, 2.2216f, 23.6733f, 1.4426f, 23.0998f, 0.8677f)
                    close()
                }
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
