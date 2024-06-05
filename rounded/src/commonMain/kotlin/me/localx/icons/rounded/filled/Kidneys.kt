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
                moveToRelative(9.536f, 8.122f)
                curveToRelative(0.944f, 0.944f, 1.464f, 2.2f, 1.464f, 3.535f)
                verticalLineToRelative(11.343f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-11.343f)
                curveToRelative(0.0f, -0.153f, -0.013f, -0.306f, -0.036f, -0.457f)
                curveToRelative(-0.181f, 1.301f, -0.927f, 2.498f, -2.127f, 3.201f)
                curveToRelative(-0.72f, 0.401f, -1.482f, 0.591f, -2.223f, 0.591f)
                curveToRelative(-1.504f, 0.0f, -2.918f, -0.784f, -3.709f, -2.182f)
                curveTo(0.141f, 11.457f, 0.0f, 10.128f, 0.0f, 8.0f)
                curveTo(0.0f, 5.683f, 1.175f, 2.52f, 4.471f, 0.591f)
                curveTo(5.476f, 0.004f, 6.647f, -0.153f, 7.766f, 0.148f)
                curveToRelative(1.131f, 0.305f, 2.075f, 1.04f, 2.657f, 2.069f)
                curveToRelative(1.09f, 1.928f, 0.577f, 4.355f, -1.112f, 5.679f)
                lineToRelative(0.225f, 0.225f)
                close()
                moveTo(19.529f, 0.591f)
                curveToRelative(-1.004f, -0.587f, -2.176f, -0.744f, -3.295f, -0.443f)
                curveToRelative(-1.131f, 0.305f, -2.075f, 1.04f, -2.657f, 2.069f)
                curveToRelative(-1.09f, 1.928f, -0.577f, 4.355f, 1.112f, 5.679f)
                lineToRelative(-0.225f, 0.225f)
                curveToRelative(-0.944f, 0.944f, -1.464f, 2.2f, -1.464f, 3.535f)
                verticalLineToRelative(11.343f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-11.343f)
                curveToRelative(0.0f, -0.153f, 0.012f, -0.306f, 0.036f, -0.456f)
                curveToRelative(0.18f, 1.3f, 0.924f, 2.496f, 2.12f, 3.196f)
                curveToRelative(0.009f, 0.005f, 0.08f, 0.045f, 0.088f, 0.05f)
                curveToRelative(0.681f, 0.378f, 1.41f, 0.559f, 2.126f, 0.559f)
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
