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

public val Icons.Bold.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.5001f, 5.9994f)
                    horizontalLineTo(11.1691f)
                    verticalLineTo(0.2104f)
                    lineTo(1.1001f, 8.9524f)
                    lineTo(1.0221f, 9.0244f)
                    curveTo(0.3673f, 9.6817f, -3.0E-4f, 10.5716f, -3.0E-4f, 11.4994f)
                    curveTo(-3.0E-4f, 12.4271f, 0.3673f, 13.3171f, 1.0221f, 13.9744f)
                    lineTo(11.1691f, 22.7884f)
                    verticalLineTo(16.9994f)
                    horizontalLineTo(14.5001f)
                    curveTo(16.2192f, 17.0012f, 17.8679f, 17.6833f, 19.0858f, 18.8967f)
                    curveTo(20.3037f, 20.1101f, 20.9919f, 21.7562f, 21.0001f, 23.4754f)
                    verticalLineTo(23.9994f)
                    horizontalLineTo(24.0001f)
                    verticalLineTo(15.4994f)
                    curveTo(23.9971f, 12.9807f, 22.9953f, 10.5661f, 21.2144f, 8.7851f)
                    curveTo(19.4334f, 7.0041f, 17.0187f, 6.0023f, 14.5001f, 5.9994f)
                    close()
                    moveTo(14.5001f, 13.9994f)
                    horizontalLineTo(8.1691f)
                    verticalLineTo(16.2104f)
                    lineTo(3.1201f, 11.8274f)
                    curveTo(3.041f, 11.7364f, 2.9974f, 11.6199f, 2.9974f, 11.4994f)
                    curveTo(2.9974f, 11.3788f, 3.041f, 11.2624f, 3.1201f, 11.1714f)
                    lineTo(8.1691f, 6.7884f)
                    verticalLineTo(8.9994f)
                    horizontalLineTo(14.5001f)
                    curveTo(16.2233f, 9.0015f, 17.8754f, 9.687f, 19.0939f, 10.9055f)
                    curveTo(20.3124f, 12.1241f, 20.9979f, 13.7761f, 21.0001f, 15.4994f)
                    verticalLineTo(16.5774f)
                    curveTo(19.2418f, 14.92f, 16.9163f, 13.9976f, 14.5001f, 13.9994f)
                    close()
                }
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
