package me.localx.icons.rounded.bold

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

public val Icons.Bold.Bucket: ImageVector
    get() {
        if (_bucket != null) {
            return _bucket!!
        }
        _bucket = Builder(name = "Bucket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 9.5f)
                curveToRelative(0.0f, -0.728f, -0.519f, -1.334f, -1.206f, -1.47f)
                curveToRelative(-0.689f, -3.444f, -3.137f, -6.226f, -6.35f, -7.409f)
                curveToRelative(-0.364f, -0.381f, -0.875f, -0.621f, -1.443f, -0.621f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.569f, 0.0f, -1.079f, 0.24f, -1.443f, 0.621f)
                curveToRelative(-3.214f, 1.182f, -5.661f, 3.965f, -6.35f, 7.409f)
                curveToRelative(-0.687f, 0.137f, -1.206f, 0.743f, -1.206f, 1.47f)
                curveToRelative(0.0f, 0.76f, 0.568f, 1.382f, 1.302f, 1.48f)
                lineToRelative(2.11f, 9.144f)
                curveToRelative(0.526f, 2.282f, 2.53f, 3.876f, 4.872f, 3.876f)
                horizontalLineToRelative(5.432f)
                curveToRelative(2.342f, 0.0f, 4.346f, -1.594f, 4.872f, -3.876f)
                lineToRelative(2.11f, -9.144f)
                curveToRelative(0.734f, -0.098f, 1.302f, -0.72f, 1.302f, -1.48f)
                close()
                moveTo(8.309f, 4.058f)
                curveToRelative(0.354f, 0.564f, 0.976f, 0.942f, 1.691f, 0.942f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.715f, 0.0f, 1.338f, -0.378f, 1.691f, -0.942f)
                curveToRelative(1.432f, 0.891f, 2.518f, 2.285f, 3.011f, 3.942f)
                lineTo(5.297f, 8.0f)
                curveToRelative(0.494f, -1.657f, 1.58f, -3.051f, 3.011f, -3.942f)
                close()
                moveTo(16.664f, 19.451f)
                curveToRelative(-0.21f, 0.912f, -1.012f, 1.55f, -1.948f, 1.55f)
                horizontalLineToRelative(-5.432f)
                curveToRelative(-0.937f, 0.0f, -1.738f, -0.638f, -1.948f, -1.55f)
                lineToRelative(-0.796f, -3.45f)
                horizontalLineToRelative(7.96f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(5.847f, 13.001f)
                lineToRelative(-0.462f, -2.0f)
                horizontalLineToRelative(13.228f)
                lineToRelative(-1.95f, 8.45f)
                close()
            }
        }
        .build()
        return _bucket!!
    }

private var _bucket: ImageVector? = null
