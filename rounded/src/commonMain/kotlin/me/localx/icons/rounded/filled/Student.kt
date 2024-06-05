package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Student: ImageVector
    get() {
        if (_student != null) {
            return _student!!
        }
        _student = Builder(name = "Student", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.004f, 4.498f)
                curveToRelative(0.001f, -0.865f, -0.525f, -1.61f, -1.34f, -1.898f)
                lineTo(14.199f, 0.319f)
                curveToRelative(-1.388f, -0.491f, -2.916f, -0.492f, -4.303f, -0.006f)
                lineTo(3.353f, 2.603f)
                curveToRelative(-0.818f, 0.286f, -1.346f, 1.03f, -1.346f, 1.896f)
                curveToRelative(0.0f, 0.867f, 0.529f, 1.611f, 1.347f, 1.896f)
                lineToRelative(6.507f, 2.27f)
                curveToRelative(0.689f, 0.24f, 1.414f, 0.361f, 2.138f, 0.361f)
                reflectiveCurveToRelative(1.448f, -0.121f, 2.137f, -0.361f)
                lineToRelative(5.864f, -2.045f)
                verticalLineToRelative(4.379f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, 0.0f, 0.004f, -6.493f, 0.004f, -6.502f)
                close()
                moveTo(14.795f, 10.554f)
                lineToRelative(3.205f, -1.118f)
                verticalLineToRelative(0.564f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-0.563f)
                lineToRelative(3.203f, 1.118f)
                curveToRelative(1.799f, 0.627f, 3.794f, 0.627f, 5.592f, 0.0f)
                close()
                moveTo(19.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-0.318f, 0.0f, -0.617f, -0.151f, -0.805f, -0.407f)
                reflectiveCurveToRelative(-0.244f, -0.586f, -0.15f, -0.89f)
                curveToRelative(1.044f, -3.358f, 4.315f, -5.703f, 7.955f, -5.703f)
                reflectiveCurveToRelative(6.911f, 2.345f, 7.955f, 5.703f)
                curveToRelative(0.094f, 0.303f, 0.039f, 0.634f, -0.15f, 0.89f)
                reflectiveCurveToRelative(-0.487f, 0.407f, -0.805f, 0.407f)
                close()
            }
        }
        .build()
        return _student!!
    }

private var _student: ImageVector? = null
