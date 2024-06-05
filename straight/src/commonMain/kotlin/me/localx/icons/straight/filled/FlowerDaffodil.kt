package me.localx.icons.straight.filled

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

public val Icons.Filled.FlowerDaffodil: ImageVector
    get() {
        if (_flowerDaffodil != null) {
            return _flowerDaffodil!!
        }
        _flowerDaffodil = Builder(name = "FlowerDaffodil", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 21.51f)
                verticalLineToRelative(-5.91f)
                curveToRelative(0.534f, -0.492f, 1.441f, -1.473f, 1.823f, -2.737f)
                curveToRelative(1.644f, 0.278f, 3.256f, -0.333f, 3.477f, -0.421f)
                lineToRelative(0.71f, -0.285f)
                lineToRelative(-0.089f, -0.76f)
                curveToRelative(-0.025f, -0.216f, -0.243f, -1.837f, -1.21f, -3.135f)
                curveToRelative(0.967f, -1.298f, 1.185f, -2.919f, 1.21f, -3.135f)
                lineToRelative(0.089f, -0.759f)
                lineToRelative(-0.71f, -0.285f)
                curveToRelative(-0.221f, -0.088f, -1.83f, -0.7f, -3.469f, -0.422f)
                curveToRelative(-0.513f, -1.73f, -2.017f, -2.937f, -2.22f, -3.093f)
                lineToRelative(-0.61f, -0.471f)
                lineToRelative(-0.61f, 0.471f)
                curveToRelative(-0.203f, 0.156f, -1.707f, 1.362f, -2.219f, 3.093f)
                curveToRelative(-1.644f, -0.274f, -3.249f, 0.334f, -3.47f, 0.422f)
                lineToRelative(-0.71f, 0.285f)
                lineToRelative(0.089f, 0.76f)
                curveToRelative(0.025f, 0.214f, 0.243f, 1.828f, 1.204f, 3.124f)
                curveToRelative(-0.961f, 1.296f, -1.178f, 2.91f, -1.204f, 3.124f)
                lineToRelative(-0.089f, 0.76f)
                lineToRelative(0.71f, 0.285f)
                curveToRelative(0.221f, 0.089f, 1.825f, 0.7f, 3.471f, 0.422f)
                curveToRelative(0.378f, 1.272f, 1.292f, 2.26f, 1.828f, 2.756f)
                verticalLineToRelative(5.911f)
                curveToRelative(-1.487f, -2.766f, -4.797f, -6.796f, -11.0f, -5.112f)
                curveToRelative(0.541f, 9.238f, 11.811f, 7.479f, 11.998f, 7.449f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.186f, 0.03f, 11.457f, 1.789f, 11.998f, -7.449f)
                curveToRelative(-6.203f, -1.685f, -9.513f, 2.346f, -11.0f, 5.112f)
                close()
                moveTo(10.5f, 8.25f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _flowerDaffodil!!
    }

private var _flowerDaffodil: ImageVector? = null
