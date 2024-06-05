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

public val Icons.Filled.Kidneys: ImageVector
    get() {
        if (_kidneys != null) {
            return _kidneys!!
        }
        _kidneys = Builder(name = "Kidneys", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.297f, 7.883f)
                curveToRelative(1.689f, -1.324f, 2.216f, -3.738f, 1.126f, -5.665f)
                curveToRelative(-0.583f, -1.029f, -1.526f, -1.764f, -2.657f, -2.069f)
                curveTo(6.647f, -0.153f, 5.476f, 0.004f, 4.471f, 0.591f)
                curveTo(1.175f, 2.52f, 0.0f, 5.683f, 0.0f, 8.0f)
                curveTo(0.0f, 10.128f, 0.141f, 11.457f, 0.905f, 12.81f)
                curveToRelative(0.791f, 1.398f, 2.205f, 2.182f, 3.709f, 2.182f)
                curveToRelative(0.741f, 0.0f, 1.503f, -0.19f, 2.223f, -0.591f)
                curveToRelative(1.249f, -0.731f, 2.003f, -2.0f, 2.143f, -3.362f)
                curveToRelative(0.007f, 0.068f, 0.02f, 0.135f, 0.02f, 0.205f)
                verticalLineToRelative(12.757f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-12.757f)
                curveToRelative(0.0f, -1.068f, -0.416f, -2.073f, -1.172f, -2.829f)
                lineToRelative(-0.531f, -0.531f)
                close()
                moveTo(19.529f, 0.591f)
                curveToRelative(-1.004f, -0.587f, -2.176f, -0.744f, -3.295f, -0.443f)
                curveToRelative(-1.131f, 0.305f, -2.075f, 1.04f, -2.657f, 2.069f)
                curveToRelative(-1.09f, 1.928f, -0.563f, 4.341f, 1.126f, 5.665f)
                lineToRelative(-0.531f, 0.531f)
                curveToRelative(-0.756f, 0.755f, -1.172f, 1.76f, -1.172f, 2.829f)
                verticalLineToRelative(12.757f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-12.757f)
                curveToRelative(0.0f, -0.069f, 0.013f, -0.136f, 0.02f, -0.204f)
                curveToRelative(0.139f, 1.362f, 0.891f, 2.629f, 2.136f, 3.358f)
                curveToRelative(0.0f, 0.0f, 0.844f, 0.609f, 2.214f, 0.609f)
                curveToRelative(1.494f, 0.0f, 2.927f, -0.786f, 3.725f, -2.196f)
                curveToRelative(0.765f, -1.353f, 0.905f, -2.681f, 0.905f, -4.81f)
                curveToRelative(0.0f, -2.317f, -1.174f, -5.48f, -4.471f, -7.409f)
                close()
            }
        }
        .build()
        return _kidneys!!
    }

private var _kidneys: ImageVector? = null
