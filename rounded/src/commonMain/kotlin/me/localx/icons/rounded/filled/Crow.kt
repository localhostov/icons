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

public val Icons.Filled.Crow: ImageVector
    get() {
        if (_crow != null) {
            return _crow!!
        }
        _crow = Builder(name = "Crow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.659f, 15.0f)
                reflectiveCurveToRelative(7.112f, -8.87f, 7.341f, -9.309f)
                verticalLineToRelative(3.871f)
                curveToRelative(0.0f, 2.998f, -2.376f, 5.438f, -5.298f, 5.438f)
                horizontalLineToRelative(-2.043f)
                close()
                moveTo(22.0f, 3.524f)
                verticalLineToRelative(-0.024f)
                curveToRelative(0.017f, -1.342f, -0.717f, -2.628f, -1.947f, -3.165f)
                curveToRelative(-2.57f, -1.121f, -5.052f, 0.732f, -5.052f, 3.165f)
                verticalLineToRelative(6.062f)
                curveToRelative(0.0f, 4.101f, -3.274f, 7.438f, -7.298f, 7.438f)
                horizontalLineToRelative(-3.641f)
                lineTo(0.219f, 21.851f)
                curveToRelative(-0.345f, 0.431f, -0.274f, 1.061f, 0.157f, 1.405f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.431f, 0.345f, 1.06f, 0.274f, 1.405f, -0.157f)
                lineToRelative(1.643f, -2.099f)
                horizontalLineToRelative(5.438f)
                lineToRelative(1.224f, 2.447f)
                curveToRelative(0.169f, 0.339f, 0.516f, 0.553f, 0.895f, 0.553f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.743f, 0.0f, 1.227f, -0.782f, 0.895f, -1.447f)
                lineToRelative(-0.808f, -1.615f)
                curveToRelative(0.855f, -0.093f, 1.684f, -0.29f, 2.476f, -0.576f)
                lineToRelative(1.543f, 3.085f)
                curveToRelative(0.169f, 0.339f, 0.516f, 0.553f, 0.895f, 0.553f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.743f, 0.0f, 1.227f, -0.782f, 0.895f, -1.447f)
                lineToRelative(-1.52f, -3.039f)
                curveToRelative(3.341f, -1.949f, 5.645f, -5.604f, 5.645f, -9.685f)
                curveToRelative(0.0f, 0.0f, 0.002f, -2.795f, 0.005f, -2.828f)
                horizontalLineToRelative(2.297f)
                curveToRelative(0.422f, 0.0f, 0.762f, -0.38f, 0.687f, -0.796f)
                curveToRelative(-0.253f, -1.398f, -1.212f, -2.219f, -1.99f, -2.68f)
                close()
            }
        }
        .build()
        return _crow!!
    }

private var _crow: ImageVector? = null
