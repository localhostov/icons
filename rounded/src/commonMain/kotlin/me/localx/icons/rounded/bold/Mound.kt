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

public val Icons.Bold.Mound: ImageVector
    get() {
        if (_mound != null) {
            return _mound!!
        }
        _mound = Builder(name = "Mound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.579f, 18.686f)
                lineToRelative(-3.509f, -6.782f)
                curveToRelative(-1.565f, -3.025f, -4.658f, -4.904f, -8.07f, -4.904f)
                reflectiveCurveToRelative(-6.505f, 1.879f, -8.07f, 4.904f)
                lineTo(0.425f, 18.678f)
                curveToRelative(-0.6f, 1.13f, -0.564f, 2.46f, 0.094f, 3.558f)
                curveToRelative(0.662f, 1.104f, 1.828f, 1.764f, 3.117f, 1.764f)
                horizontalLineToRelative(16.728f)
                curveToRelative(1.29f, 0.0f, 2.455f, -0.659f, 3.117f, -1.764f)
                curveToRelative(0.661f, -1.102f, 0.694f, -2.435f, 0.098f, -3.551f)
                close()
                moveTo(20.908f, 20.693f)
                curveToRelative(-0.068f, 0.115f, -0.231f, 0.307f, -0.544f, 0.307f)
                lineTo(3.636f, 21.0f)
                curveToRelative(-0.313f, 0.0f, -0.476f, -0.192f, -0.544f, -0.307f)
                curveToRelative(-0.068f, -0.112f, -0.16f, -0.342f, -0.016f, -0.611f)
                curveToRelative(0.003f, -0.006f, 0.006f, -0.012f, 0.009f, -0.017f)
                lineToRelative(3.509f, -6.782f)
                curveToRelative(1.064f, -2.056f, 3.085f, -3.283f, 5.406f, -3.283f)
                reflectiveCurveToRelative(4.342f, 1.227f, 5.406f, 3.283f)
                lineToRelative(3.518f, 6.799f)
                curveToRelative(0.144f, 0.27f, 0.052f, 0.499f, -0.016f, 0.611f)
                close()
            }
        }
        .build()
        return _mound!!
    }

private var _mound: ImageVector? = null
