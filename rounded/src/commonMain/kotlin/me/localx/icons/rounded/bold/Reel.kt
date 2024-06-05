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

public val Icons.Bold.Reel: ImageVector
    get() {
        if (_reel != null) {
            return _reel!!
        }
        _reel = Builder(name = "Reel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.458f)
                curveToRelative(2.376f, -0.21f, 4.0f, -1.767f, 4.0f, -3.958f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.629f, -0.504f, 0.869f, -1.0f, 0.955f)
                lineTo(20.0f, 3.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(1.538f, 0.0f)
                curveTo(0.71f, 0.0f, 0.038f, 0.672f, 0.038f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.497f)
                lineToRelative(-0.033f, 18.0f)
                lineTo(1.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                lineTo(22.462f, 24.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.462f)
                verticalLineToRelative(-7.542f)
                close()
                moveTo(17.0f, 10.5f)
                lineTo(7.022f, 10.5f)
                lineToRelative(0.005f, -2.5f)
                horizontalLineToRelative(9.974f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(7.016f, 13.5f)
                horizontalLineToRelative(9.984f)
                verticalLineToRelative(2.5f)
                lineTo(7.012f, 16.0f)
                lineToRelative(0.005f, -2.5f)
                close()
                moveTo(17.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.032f, 5.0f)
                lineToRelative(0.004f, -2.0f)
                horizontalLineToRelative(9.965f)
                close()
                moveTo(7.003f, 21.0f)
                lineToRelative(0.004f, -2.0f)
                horizontalLineToRelative(9.994f)
                verticalLineToRelative(2.0f)
                lineTo(7.003f, 21.0f)
                close()
            }
        }
        .build()
        return _reel!!
    }

private var _reel: ImageVector? = null
