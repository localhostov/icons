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

public val Icons.Bold.Hippo: ImageVector
    get() {
        if (_hippo != null) {
            return _hippo!!
        }
        _hippo = Builder(name = "Hippo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.999f, 15.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                curveToRelative(0.0f, -1.076f, -0.351f, -2.111f, -1.0f, -2.972f)
                verticalLineToRelative(-0.528f)
                curveToRelative(0.0f, -1.339f, -0.482f, -2.567f, -1.281f, -3.522f)
                curveToRelative(0.724f, -0.107f, 1.281f, -0.725f, 1.281f, -1.478f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.107f)
                curveToRelative(-0.751f, -0.385f, -1.599f, -0.607f, -2.5f, -0.607f)
                reflectiveCurveToRelative(-1.749f, 0.222f, -2.5f, 0.607f)
                verticalLineToRelative(-0.107f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.753f, 0.557f, 1.371f, 1.281f, 1.478f)
                curveToRelative(-0.488f, 0.584f, -0.854f, 1.271f, -1.068f, 2.022f)
                horizontalLineToRelative(-2.805f)
                curveTo(4.771f, 5.0f, 0.999f, 8.589f, 0.999f, 13.0f)
                curveToRelative(0.0f, 0.927f, 0.175f, 1.814f, 0.481f, 2.643f)
                lineToRelative(-1.48f, 2.619f)
                lineToRelative(2.612f, 1.476f)
                lineToRelative(0.701f, -1.241f)
                curveToRelative(0.499f, 0.501f, 1.065f, 0.938f, 1.685f, 1.303f)
                verticalLineToRelative(4.201f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.098f)
                curveToRelative(1.482f, -0.863f, 2.675f, -2.172f, 3.356f, -3.761f)
                curveToRelative(-0.997f, 0.547f, -2.141f, 0.86f, -3.356f, 0.86f)
                horizontalLineToRelative(-1.031f)
                curveToRelative(-0.833f, 0.62f, -1.854f, 1.0f, -2.969f, 1.0f)
                horizontalLineToRelative(-5.592f)
                curveToRelative(-2.982f, 0.0f, -5.408f, -2.243f, -5.408f, -5.0f)
                reflectiveCurveToRelative(2.426f, -5.0f, 5.408f, -5.0f)
                horizontalLineToRelative(2.035f)
                curveToRelative(-0.281f, 0.627f, -0.443f, 1.302f, -0.443f, 2.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                close()
                moveTo(17.499f, 4.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(1.688f)
                lineToRelative(0.425f, 0.437f)
                curveToRelative(0.371f, 0.381f, 0.575f, 0.87f, 0.575f, 1.376f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.506f, 0.204f, -0.995f, 0.575f, -1.376f)
                lineToRelative(0.425f, -0.437f)
                verticalLineToRelative(-1.688f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _hippo!!
    }

private var _hippo: ImageVector? = null
