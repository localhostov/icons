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

public val Icons.Bold.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 20.0f)
                horizontalLineToRelative(-6.894f)
                lineToRelative(6.782f, -6.782f)
                curveToRelative(1.039f, -1.039f, 1.611f, -2.42f, 1.611f, -3.89f)
                reflectiveCurveToRelative(-0.572f, -2.85f, -1.611f, -3.889f)
                lineToRelative(-2.828f, -2.829f)
                curveToRelative(-2.144f, -2.143f, -5.634f, -2.143f, -7.783f, 0.005f)
                lineTo(1.611f, 12.868f)
                curveToRelative(-2.145f, 2.145f, -2.145f, 5.634f, 0.0f, 7.778f)
                lineToRelative(0.742f, 0.743f)
                curveToRelative(1.039f, 1.039f, 2.42f, 1.611f, 3.889f, 1.611f)
                horizontalLineToRelative(16.258f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(13.903f, 4.732f)
                curveToRelative(0.487f, -0.488f, 1.128f, -0.731f, 1.769f, -0.731f)
                reflectiveCurveToRelative(1.28f, 0.244f, 1.768f, 0.731f)
                lineToRelative(2.828f, 2.829f)
                curveToRelative(0.473f, 0.472f, 0.732f, 1.1f, 0.732f, 1.767f)
                reflectiveCurveToRelative(-0.26f, 1.296f, -0.732f, 1.768f)
                lineToRelative(-4.275f, 4.275f)
                lineToRelative(-6.346f, -6.346f)
                lineToRelative(4.257f, -4.293f)
                close()
                moveTo(6.242f, 20.0f)
                curveToRelative(-0.658f, 0.0f, -1.302f, -0.267f, -1.768f, -0.732f)
                lineToRelative(-0.742f, -0.743f)
                curveToRelative(-0.975f, -0.975f, -0.975f, -2.561f, 0.005f, -3.541f)
                lineToRelative(3.797f, -3.829f)
                lineToRelative(6.337f, 6.337f)
                lineToRelative(-2.507f, 2.507f)
                horizontalLineToRelative(-5.122f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
