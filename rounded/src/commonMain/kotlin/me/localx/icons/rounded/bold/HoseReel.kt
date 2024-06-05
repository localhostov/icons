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

public val Icons.Bold.HoseReel: ImageVector
    get() {
        if (_hoseReel != null) {
            return _hoseReel!!
        }
        _hoseReel = Builder(name = "HoseReel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.25f, 5.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(11.25f, 14.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(23.719f, 17.209f)
                lineToRelative(-1.299f, 6.003f)
                curveToRelative(-0.1f, 0.46f, -0.507f, 0.789f, -0.977f, 0.789f)
                horizontalLineToRelative(-1.387f)
                curveToRelative(-0.471f, 0.0f, -0.878f, -0.328f, -0.977f, -0.788f)
                lineToRelative(-1.296f, -5.986f)
                curveToRelative(-0.196f, -1.028f, 0.486f, -1.984f, 1.466f, -2.183f)
                verticalLineToRelative(-4.042f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveTo(3.25f, 6.589f, 3.25f, 11.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                curveToRelative(1.018f, 0.0f, 2.01f, -0.188f, 2.947f, -0.561f)
                curveToRelative(0.772f, -0.303f, 1.642f, 0.072f, 1.947f, 0.842f)
                curveToRelative(0.306f, 0.77f, -0.071f, 1.642f, -0.841f, 1.947f)
                curveToRelative(-1.291f, 0.512f, -2.654f, 0.771f, -4.053f, 0.771f)
                curveTo(5.185f, 22.0f, 0.25f, 17.065f, 0.25f, 11.0f)
                reflectiveCurveTo(5.185f, 0.0f, 11.25f, 0.0f)
                reflectiveCurveToRelative(11.0f, 4.935f, 11.0f, 11.0f)
                verticalLineToRelative(4.042f)
                curveToRelative(0.975f, 0.198f, 1.655f, 1.143f, 1.469f, 2.166f)
                close()
            }
        }
        .build()
        return _hoseReel!!
    }

private var _hoseReel: ImageVector? = null
