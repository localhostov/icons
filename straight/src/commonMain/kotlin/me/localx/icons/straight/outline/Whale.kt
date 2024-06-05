package me.localx.icons.straight.outline

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

public val Icons.Outline.Whale: ImageVector
    get() {
        if (_whale != null) {
            return _whale!!
        }
        _whale = Builder(name = "Whale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 17.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 16.501f)
                verticalLineToRelative(2.499f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(6.0f, 24.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-2.727f)
                curveToRelative(0.0f, -3.369f, 0.987f, -6.629f, 2.855f, -9.43f)
                lineToRelative(0.503f, -0.754f)
                curveTo(1.385f, 4.247f, 0.0f, 2.278f, 0.0f, 0.0f)
                curveToRelative(4.122f, 0.0f, 5.5f, 2.776f, 5.5f, 2.776f)
                curveToRelative(0.0f, 0.0f, 1.327f, -2.776f, 5.5f, -2.776f)
                curveToRelative(0.0f, 2.564f, -1.755f, 4.737f, -4.129f, 5.352f)
                lineToRelative(-0.466f, 2.765f)
                curveToRelative(-0.183f, 1.082f, -0.304f, 2.179f, -0.363f, 3.279f)
                curveToRelative(2.332f, -1.741f, 5.363f, -3.396f, 8.458f, -3.396f)
                curveToRelative(0.041f, 0.0f, 1.009f, 0.0f, 1.009f, 0.0f)
                curveToRelative(4.682f, 0.004f, 8.491f, 3.817f, 8.491f, 8.5f)
                close()
                moveTo(22.0f, 16.501f)
                curveToRelative(0.0f, -3.581f, -2.913f, -6.497f, -6.493f, -6.5f)
                curveToRelative(0.0f, 0.0f, -0.967f, 0.0f, -1.007f, 0.0f)
                curveToRelative(-4.307f, 0.0f, -8.774f, 4.093f, -10.5f, 5.857f)
                verticalLineToRelative(-2.917f)
                curveToRelative(0.0f, -1.724f, 0.146f, -3.458f, 0.432f, -5.156f)
                lineToRelative(0.158f, -0.937f)
                curveToRelative(-1.648f, 2.471f, -2.59f, 5.453f, -2.59f, 8.426f)
                verticalLineToRelative(2.727f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-2.499f)
                close()
            }
        }
        .build()
        return _whale!!
    }

private var _whale: ImageVector? = null
