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

public val Icons.Filled.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(name = "Flashlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.272f, 14.0f)
                horizontalLineToRelative(-1.272f)
                curveToRelative(-0.265f, 0.0f, -0.52f, -0.105f, -0.707f, -0.293f)
                lineToRelative(-4.0f, -4.0f)
                curveToRelative(-0.188f, -0.188f, -0.293f, -0.441f, -0.293f, -0.707f)
                verticalLineToRelative(-1.272f)
                curveToRelative(0.0f, -2.554f, 1.204f, -5.345f, 3.142f, -7.284f)
                curveToRelative(0.592f, -0.589f, 1.551f, -0.589f, 2.141f, -0.002f)
                lineToRelative(8.273f, 8.274f)
                curveToRelative(0.287f, 0.286f, 0.444f, 0.668f, 0.444f, 1.073f)
                curveToRelative(0.0f, 0.404f, -0.159f, 0.785f, -0.445f, 1.07f)
                curveToRelative(-1.936f, 1.937f, -4.727f, 3.141f, -7.283f, 3.141f)
                close()
                moveTo(22.142f, 9.443f)
                verticalLineToRelative(0.002f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, -0.002f)
                close()
                moveTo(8.161f, 11.48f)
                lineTo(0.903f, 18.739f)
                curveToRelative(-1.204f, 1.204f, -1.204f, 3.155f, 0.0f, 4.359f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.204f, 1.204f, 3.155f, 1.204f, 4.359f, 0.0f)
                lineToRelative(7.258f, -7.258f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.024f, 0.0f, -1.414f)
                lineToRelative(-2.944f, -2.944f)
                curveToRelative(-0.391f, -0.391f, -1.024f, -0.391f, -1.414f, 0.0f)
                close()
                moveTo(7.293f, 15.293f)
                lineToRelative(0.828f, -0.828f)
                curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                lineToRelative(-0.828f, 0.828f)
                curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
