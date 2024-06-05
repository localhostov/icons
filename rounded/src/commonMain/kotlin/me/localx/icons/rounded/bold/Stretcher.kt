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

public val Icons.Bold.Stretcher: ImageVector
    get() {
        if (_stretcher != null) {
            return _stretcher!!
        }
        _stretcher = Builder(name = "Stretcher", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 18.0f)
                curveToRelative(-0.367f, 0.0f, -0.719f, 0.066f, -1.044f, 0.187f)
                lineToRelative(-2.755f, -2.565f)
                lineToRelative(3.889f, -3.622f)
                horizontalLineToRelative(1.41f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-12.696f)
                curveToRelative(-1.21f, 0.0f, -2.354f, -0.642f, -2.985f, -1.675f)
                lineTo(2.78f, 0.718f)
                curveTo(2.347f, 0.011f, 1.425f, -0.21f, 0.718f, 0.22f)
                curveTo(0.011f, 0.652f, -0.212f, 1.575f, 0.22f, 2.282f)
                lineToRelative(4.038f, 6.607f)
                curveToRelative(1.001f, 1.638f, 2.697f, 2.746f, 4.57f, 3.035f)
                lineToRelative(3.97f, 3.697f)
                lineToRelative(-2.755f, 2.566f)
                curveToRelative(-0.325f, -0.121f, -0.677f, -0.188f, -1.044f, -0.188f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.169f, -0.015f, -0.334f, -0.042f, -0.496f)
                lineToRelative(3.042f, -2.833f)
                lineToRelative(3.042f, 2.832f)
                curveToRelative(-0.027f, 0.161f, -0.042f, 0.327f, -0.042f, 0.496f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(13.312f, 12.0f)
                horizontalLineToRelative(3.376f)
                lineToRelative(-1.688f, 1.572f)
                lineToRelative(-1.688f, -1.572f)
                close()
            }
        }
        .build()
        return _stretcher!!
    }

private var _stretcher: ImageVector? = null
