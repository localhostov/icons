package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.LowVision: ImageVector
    get() {
        if (_lowVision != null) {
            return _lowVision!!
        }
        _lowVision = Builder(name = "LowVision", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.361f, 13.284f)
                lineToRelative(0.604f, -1.284f)
                lineToRelative(-0.604f, -1.284f)
                curveToRelative(-0.861f, -1.83f, -4.224f, -7.801f, -11.361f, -7.801f)
                curveToRelative(-1.986f, 0.0f, -3.844f, 0.47f, -5.536f, 1.398f)
                lineTo(2.161f, 0.01f)
                lineTo(0.04f, 2.131f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-3.935f, -3.935f)
                curveToRelative(1.865f, -1.74f, 2.927f, -3.721f, 3.336f, -4.591f)
                close()
                moveTo(12.0f, 5.915f)
                curveToRelative(5.371f, 0.0f, 7.976f, 4.652f, 8.646f, 6.078f)
                lineToRelative(0.003f, 0.007f)
                lineToRelative(-0.003f, 0.007f)
                curveToRelative(-0.335f, 0.711f, -1.212f, 2.349f, -2.744f, 3.745f)
                lineToRelative(-2.211f, -2.211f)
                curveToRelative(0.606f, -1.452f, 0.318f, -3.188f, -0.864f, -4.37f)
                reflectiveCurveToRelative(-2.918f, -1.469f, -4.37f, -0.864f)
                lineToRelative(-1.75f, -1.75f)
                curveToRelative(1.028f, -0.427f, 2.129f, -0.643f, 3.291f, -0.643f)
                close()
                moveTo(2.64f, 7.567f)
                lineToRelative(12.959f, 12.959f)
                curveToRelative(-1.142f, 0.371f, -2.344f, 0.559f, -3.599f, 0.559f)
                curveToRelative(-0.026f, 0.0f, -0.05f, -0.004f, -0.076f, -0.004f)
                lineTo(0.948f, 10.105f)
                curveToRelative(0.363f, -0.675f, 0.92f, -1.588f, 1.692f, -2.538f)
                close()
                moveTo(0.053f, 12.038f)
                lineToRelative(8.544f, 8.544f)
                curveToRelative(-4.831f, -1.469f, -7.249f, -5.789f, -7.958f, -7.298f)
                lineTo(0.053f, 12.038f)
                close()
            }
        }
        .build()
        return _lowVision!!
    }

private var _lowVision: ImageVector? = null
