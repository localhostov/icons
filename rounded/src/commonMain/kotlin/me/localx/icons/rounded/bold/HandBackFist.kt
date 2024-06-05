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

public val Icons.Bold.HandBackFist: ImageVector
    get() {
        if (_handBackFist != null) {
            return _handBackFist!!
        }
        _handBackFist = Builder(name = "HandBackFist", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 24.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                verticalLineToRelative(-1.4f)
                lineToRelative(-3.814f, -3.957f)
                curveToRelative(-1.599f, -1.663f, -1.566f, -4.334f, 0.071f, -5.957f)
                lineToRelative(3.743f, -3.711f)
                verticalLineToRelative(-0.216f)
                curveToRelative(0.0f, -1.302f, 0.585f, -2.512f, 1.605f, -3.321f)
                curveTo(8.627f, 0.128f, 9.939f, -0.165f, 11.206f, 0.133f)
                lineToRelative(7.55f, 1.771f)
                curveToRelative(2.499f, 0.586f, 4.244f, 2.789f, 4.244f, 5.355f)
                verticalLineToRelative(2.893f)
                curveToRelative(0.0f, 1.087f, -0.205f, 2.149f, -0.608f, 3.157f)
                lineToRelative(-1.392f, 3.479f)
                verticalLineToRelative(2.711f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(6.0f, 8.7f)
                lineToRelative(-1.632f, 1.618f)
                curveToRelative(-0.479f, 0.476f, -0.489f, 1.258f, -0.021f, 1.745f)
                lineToRelative(4.233f, 4.391f)
                curveToRelative(0.27f, 0.279f, 0.42f, 0.653f, 0.42f, 1.041f)
                verticalLineToRelative(2.005f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.191f, 0.036f, -0.38f, 0.107f, -0.557f)
                lineToRelative(1.499f, -3.749f)
                curveToRelative(0.261f, -0.652f, 0.394f, -1.339f, 0.394f, -2.042f)
                verticalLineToRelative(-2.893f)
                curveToRelative(0.0f, -1.167f, -0.793f, -2.167f, -1.93f, -2.434f)
                lineToRelative(-7.55f, -1.771f)
                curveToRelative(-0.369f, -0.088f, -0.752f, -0.001f, -1.052f, 0.235f)
                curveToRelative(-0.298f, 0.236f, -0.469f, 0.59f, -0.469f, 0.97f)
                verticalLineToRelative(6.241f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-1.8f)
                close()
            }
        }
        .build()
        return _handBackFist!!
    }

private var _handBackFist: ImageVector? = null
