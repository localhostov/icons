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

public val Icons.Bold.Deposit: ImageVector
    get() {
        if (_deposit != null) {
            return _deposit!!
        }
        _deposit = Builder(name = "Deposit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 9.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(8.5f, 13.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 18.509f)
                curveToRelative(-0.005f, 0.826f, -0.676f, 1.491f, -1.5f, 1.491f)
                horizontalLineToRelative(-0.009f)
                lineToRelative(-2.638f, -0.016f)
                curveToRelative(-1.46f, 0.0f, -2.841f, -0.572f, -3.88f, -1.61f)
                lineToRelative(-1.225f, -1.225f)
                curveToRelative(-0.702f, 2.23f, -2.789f, 3.851f, -5.247f, 3.851f)
                horizontalLineToRelative(-1.627f)
                curveToRelative(-0.445f, 1.723f, -2.013f, 3.0f, -3.873f, 3.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                lineTo(0.001f, 4.0f)
                curveTo(0.0f, 1.794f, 1.794f, 0.0f, 4.0f, 0.0f)
                curveToRelative(1.86f, 0.0f, 3.428f, 1.277f, 3.873f, 3.0f)
                horizontalLineToRelative(1.627f)
                curveToRelative(2.133f, 0.0f, 3.986f, 1.221f, 4.898f, 3.0f)
                horizontalLineToRelative(4.481f)
                curveToRelative(1.769f, 0.0f, 3.431f, 0.689f, 4.682f, 1.939f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.684f, -0.684f, -1.593f, -1.061f, -2.561f, -1.061f)
                horizontalLineToRelative(-1.481f)
                lineToRelative(3.167f, 3.191f)
                curveToRelative(0.584f, 0.588f, 0.58f, 1.538f, -0.008f, 2.121f)
                curveToRelative(-0.588f, 0.584f, -1.538f, 0.58f, -2.121f, -0.008f)
                lineToRelative(-3.176f, -3.2f)
                curveToRelative(-0.167f, -0.102f, -0.362f, -0.139f, -0.559f, -0.11f)
                curveToRelative(-0.158f, 0.024f, -0.382f, 0.105f, -0.556f, 0.35f)
                curveToRelative(-0.224f, 0.314f, -0.145f, 0.815f, 0.18f, 1.139f)
                lineToRelative(3.769f, 3.769f)
                curveToRelative(0.472f, 0.472f, 1.101f, 0.732f, 1.768f, 0.732f)
                lineToRelative(2.647f, 0.016f)
                curveToRelative(0.829f, 0.005f, 1.496f, 0.681f, 1.491f, 1.509f)
                close()
                moveTo(12.0f, 15.5f)
                verticalLineToRelative(-1.116f)
                curveToRelative(-1.167f, -1.356f, -1.309f, -3.359f, -0.3f, -4.778f)
                curveToRelative(0.093f, -0.131f, 0.194f, -0.255f, 0.3f, -0.372f)
                verticalLineToRelative(-0.733f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(3.0f, 6.001f)
                verticalLineToRelative(3.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                close()
                moveTo(12.005f, 14.389f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _deposit!!
    }

private var _deposit: ImageVector? = null
