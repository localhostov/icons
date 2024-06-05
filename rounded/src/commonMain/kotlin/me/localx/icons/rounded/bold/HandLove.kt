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

public val Icons.Bold.HandLove: ImageVector
    get() {
        if (_handLove != null) {
            return _handLove!!
        }
        _handLove = Builder(name = "HandLove", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(13.5f, 15.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(22.5f, 2.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-5.155f)
                curveToRelative(-1.517f, 0.0f, -2.98f, -0.635f, -4.021f, -1.748f)
                lineToRelative(-0.448f, -0.474f)
                curveToRelative(0.059f, -0.021f, 0.118f, -0.043f, 0.176f, -0.067f)
                curveToRelative(1.184f, -0.491f, 1.949f, -1.635f, 1.949f, -2.917f)
                lineTo(10.001f, 1.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                lineTo(7.001f, 15.794f)
                curveToRelative(0.0f, 0.039f, 0.0f, 0.105f, -0.097f, 0.145f)
                curveToRelative(-0.096f, 0.042f, -0.143f, -0.006f, -0.168f, -0.031f)
                lineToRelative(-3.343f, -3.363f)
                curveToRelative(-0.067f, -0.067f, -0.14f, -0.127f, -0.218f, -0.181f)
                curveToRelative(-0.7f, -0.479f, -1.817f, -0.555f, -2.593f, 0.223f)
                curveToRelative(-0.802f, 0.8f, -0.69f, 1.938f, -0.166f, 2.649f)
                curveToRelative(0.036f, 0.049f, 0.075f, 0.096f, 0.117f, 0.14f)
                lineToRelative(5.605f, 5.93f)
                curveToRelative(1.601f, 1.711f, 3.863f, 2.693f, 6.207f, 2.693f)
                horizontalLineToRelative(5.155f)
                curveToRelative(3.584f, 0.0f, 6.5f, -2.916f, 6.5f, -6.5f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _handLove!!
    }

private var _handLove: ImageVector? = null
