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

public val Icons.Bold.BloodTestTube: ImageVector
    get() {
        if (_bloodTestTube != null) {
            return _bloodTestTube!!
        }
        _bloodTestTube = Builder(name = "BloodTestTube", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.45f, 20.429f)
                curveToRelative(-0.365f, 0.358f, -0.907f, 0.571f, -1.45f, 0.571f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(3.789f)
                curveToRelative(0.438f, 0.0f, 0.854f, -0.192f, 1.14f, -0.525f)
                lineToRelative(1.711f, -2.0f)
                curveToRelative(0.232f, -0.271f, 0.36f, -0.618f, 0.36f, -0.975f)
                lineTo(14.0f, 3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                lineTo(4.0f, 0.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(1.33f, 0.0f, 2.623f, -0.521f, 3.55f, -1.429f)
                curveToRelative(0.592f, -0.58f, 0.602f, -1.529f, 0.021f, -2.121f)
                curveToRelative(-0.58f, -0.591f, -1.529f, -0.601f, -2.121f, -0.021f)
                close()
                moveTo(11.0f, 3.0f)
                verticalLineToRelative(3.946f)
                lineToRelative(-0.902f, 1.054f)
                horizontalLineToRelative(-3.098f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(21.438f, 10.57f)
                lineToRelative(-1.514f, -1.664f)
                curveToRelative(-1.302f, -1.291f, -3.496f, -1.347f, -4.904f, 0.057f)
                lineToRelative(-1.417f, 1.562f)
                curveToRelative(-2.132f, 2.162f, -2.132f, 5.679f, 0.0f, 7.841f)
                curveToRelative(1.04f, 1.054f, 2.423f, 1.634f, 3.896f, 1.634f)
                reflectiveCurveToRelative(2.856f, -0.581f, 3.896f, -1.634f)
                curveToRelative(2.133f, -2.162f, 2.133f, -5.679f, 0.042f, -7.796f)
                close()
                moveTo(19.26f, 16.259f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.942f, 0.956f, -2.578f, 0.956f, -3.521f, 0.0f)
                curveToRelative(-0.986f, -1.0f, -0.986f, -2.627f, 0.042f, -3.672f)
                lineToRelative(1.406f, -1.551f)
                curveToRelative(0.109f, -0.108f, 0.229f, -0.131f, 0.312f, -0.131f)
                reflectiveCurveToRelative(0.204f, 0.023f, 0.259f, 0.074f)
                lineToRelative(1.501f, 1.652f)
                curveToRelative(0.987f, 1.0f, 0.987f, 2.627f, 0.0f, 3.627f)
                close()
            }
        }
        .build()
        return _bloodTestTube!!
    }

private var _bloodTestTube: ImageVector? = null
