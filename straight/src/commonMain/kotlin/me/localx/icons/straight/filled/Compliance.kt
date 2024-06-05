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

public val Icons.Filled.Compliance: ImageVector
    get() {
        if (_compliance != null) {
            return _compliance!!
        }
        _compliance = Builder(name = "Compliance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-1.5f, 8.0f)
                lineTo(5.0f, 24.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.026f)
                lineToRelative(2.193f, -4.149f)
                curveToRelative(0.18f, -0.352f, 0.428f, -0.614f, 0.682f, -0.719f)
                curveToRelative(0.212f, -0.088f, 0.427f, -0.132f, 0.64f, -0.132f)
                curveToRelative(0.682f, 0.0f, 1.244f, 0.446f, 1.432f, 1.136f)
                curveToRelative(0.022f, 0.08f, 0.05f, 0.265f, -0.007f, 0.599f)
                lineToRelative(-0.58f, 3.265f)
                horizontalLineToRelative(6.613f)
                close()
                moveTo(22.5f, 9.5f)
                curveToRelative(0.0f, -1.131f, -0.252f, -2.204f, -0.702f, -3.167f)
                lineToRelative(1.741f, -1.115f)
                lineToRelative(-1.078f, -1.684f)
                lineToRelative(-1.744f, 1.116f)
                curveToRelative(-1.173f, -1.381f, -2.836f, -2.333f, -4.717f, -2.585f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.066f)
                curveToRelative(-1.845f, 0.245f, -3.522f, 1.163f, -4.724f, 2.586f)
                lineToRelative(-1.735f, -1.116f)
                lineToRelative(-1.082f, 1.682f)
                lineToRelative(2.929f, 1.885f)
                curveToRelative(1.205f, 0.3f, 2.169f, 1.233f, 2.515f, 2.508f)
                curveToRelative(0.026f, 0.093f, 0.074f, 0.21f, 0.132f, 0.343f)
                curveToRelative(-0.022f, -0.148f, -0.034f, -0.299f, -0.034f, -0.454f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.044f, -0.533f, 1.963f, -1.342f, 2.5f)
                curveToRelative(0.0f, 0.0f, 1.342f, 0.5f, 1.342f, 1.5f)
                verticalLineToRelative(2.863f)
                curveToRelative(1.05f, -0.463f, 1.974f, -1.16f, 2.707f, -2.021f)
                lineToRelative(1.754f, 1.123f)
                lineToRelative(1.078f, -1.684f)
                lineToRelative(-1.748f, -1.119f)
                curveToRelative(0.455f, -0.965f, 0.709f, -2.037f, 0.709f, -3.162f)
                close()
            }
        }
        .build()
        return _compliance!!
    }

private var _compliance: ImageVector? = null
