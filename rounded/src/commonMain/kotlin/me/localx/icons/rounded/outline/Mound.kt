package me.localx.icons.rounded.outline

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

public val Icons.Outline.Mound: ImageVector
    get() {
        if (_mound != null) {
            return _mound!!
        }
        _mound = Builder(name = "Mound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.628f, 19.296f)
                lineToRelative(-3.738f, -7.398f)
                curveToRelative(-1.513f, -2.994f, -4.536f, -4.853f, -7.89f, -4.853f)
                reflectiveCurveToRelative(-6.377f, 1.859f, -7.89f, 4.853f)
                lineTo(0.376f, 19.289f)
                curveToRelative(-0.533f, 1.015f, -0.499f, 2.206f, 0.093f, 3.189f)
                curveToRelative(0.591f, 0.981f, 1.626f, 1.567f, 2.769f, 1.567f)
                horizontalLineToRelative(17.524f)
                curveToRelative(1.143f, 0.0f, 2.178f, -0.586f, 2.769f, -1.567f)
                curveToRelative(0.594f, -0.986f, 0.626f, -2.182f, 0.097f, -3.182f)
                close()
                moveTo(21.818f, 21.446f)
                curveToRelative(-0.229f, 0.38f, -0.614f, 0.599f, -1.056f, 0.599f)
                lineTo(3.238f, 22.045f)
                curveToRelative(-0.442f, 0.0f, -0.827f, -0.218f, -1.056f, -0.599f)
                curveToRelative(-0.232f, -0.385f, -0.244f, -0.834f, -0.034f, -1.231f)
                curveToRelative(0.003f, -0.005f, 0.006f, -0.011f, 0.009f, -0.017f)
                lineToRelative(3.738f, -7.398f)
                curveToRelative(1.188f, -2.352f, 3.47f, -3.755f, 6.105f, -3.755f)
                reflectiveCurveToRelative(4.917f, 1.404f, 6.105f, 3.755f)
                lineToRelative(3.747f, 7.415f)
                curveToRelative(0.21f, 0.397f, 0.198f, 0.846f, -0.034f, 1.231f)
                close()
            }
        }
        .build()
        return _mound!!
    }

private var _mound: ImageVector? = null
