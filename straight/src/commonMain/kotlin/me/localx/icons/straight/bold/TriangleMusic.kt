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

public val Icons.Bold.TriangleMusic: ImageVector
    get() {
        if (_triangleMusic != null) {
            return _triangleMusic!!
        }
        _triangleMusic = Builder(name = "TriangleMusic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.469f, 21.776f)
                curveToRelative(-0.774f, 1.393f, -2.187f, 2.224f, -3.78f, 2.224f)
                lineTo(4.346f, 24.0f)
                curveToRelative(-1.592f, 0.0f, -3.005f, -0.831f, -3.779f, -2.223f)
                curveToRelative(-0.774f, -1.393f, -0.734f, -3.03f, 0.106f, -4.384f)
                lineToRelative(7.671f, -12.348f)
                curveToRelative(0.515f, -0.828f, 1.274f, -1.441f, 2.155f, -1.769f)
                lineTo(10.499f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.277f)
                curveToRelative(0.889f, 0.324f, 1.667f, 0.929f, 2.188f, 1.764f)
                lineToRelative(-1.766f, 2.842f)
                lineToRelative(-0.779f, -1.254f)
                curveToRelative(-0.35f, -0.562f, -0.898f, -0.626f, -1.125f, -0.626f)
                horizontalLineToRelative(-0.007f)
                curveToRelative(-0.22f, 0.0f, -0.769f, 0.065f, -1.117f, 0.626f)
                lineToRelative(-7.671f, 12.348f)
                curveToRelative(-0.371f, 0.597f, -0.146f, 1.137f, -0.032f, 1.342f)
                reflectiveCurveToRelative(0.455f, 0.681f, 1.157f, 0.681f)
                horizontalLineToRelative(15.343f)
                curveToRelative(0.703f, 0.0f, 1.043f, -0.477f, 1.157f, -0.681f)
                curveToRelative(0.114f, -0.205f, 0.338f, -0.745f, -0.032f, -1.342f)
                lineToRelative(-2.772f, -4.461f)
                lineToRelative(1.766f, -2.842f)
                lineToRelative(3.553f, 5.72f)
                curveToRelative(0.841f, 1.353f, 0.88f, 2.991f, 0.107f, 4.383f)
                close()
                moveTo(13.0f, 13.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.512f, -0.129f, -0.994f, -0.355f, -1.415f)
                lineToRelative(6.3f, -10.14f)
                lineToRelative(-2.548f, -1.584f)
                lineToRelative(-6.301f, 10.142f)
                curveToRelative(-0.032f, -0.001f, -0.064f, -0.002f, -0.096f, -0.002f)
                close()
            }
        }
        .build()
        return _triangleMusic!!
    }

private var _triangleMusic: ImageVector? = null
