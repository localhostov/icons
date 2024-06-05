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

public val Icons.Bold.Moped: ImageVector
    get() {
        if (_moped != null) {
            return _moped!!
        }
        _moped = Builder(name = "Moped", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.828f)
                curveToRelative(-1.273f, 0.0f, -2.492f, 0.543f, -3.344f, 1.49f)
                lineToRelative(-3.16f, 3.51f)
                horizontalLineToRelative(-6.668f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(3.539f)
                lineToRelative(3.0f, 8.0f)
                horizontalLineToRelative(2.293f)
                lineToRelative(2.266f, -2.517f)
                curveToRelative(0.338f, -0.375f, 0.712f, -0.709f, 1.112f, -1.005f)
                lineToRelative(-2.755f, -7.478f)
                horizontalLineToRelative(-2.954f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.046f)
                lineToRelative(1.156f, 3.139f)
                curveToRelative(0.323f, -0.672f, 1.003f, -1.139f, 1.798f, -1.139f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.288f, 0.0f, -0.56f, -0.063f, -0.807f, -0.173f)
                lineToRelative(1.247f, 3.384f)
                curveToRelative(0.564f, -0.134f, 1.144f, -0.211f, 1.733f, -0.211f)
                horizontalLineToRelative(2.828f)
                close()
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(4.836f)
                lineToRelative(-1.875f, -5.0f)
                horizontalLineToRelative(-1.461f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                close()
            }
        }
        .build()
        return _moped!!
    }

private var _moped: ImageVector? = null
