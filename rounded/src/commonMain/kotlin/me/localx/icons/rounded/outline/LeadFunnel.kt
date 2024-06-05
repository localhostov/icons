package me.localx.icons.rounded.outline

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

public val Icons.Outline.LeadFunnel: ImageVector
    get() {
        if (_leadFunnel != null) {
            return _leadFunnel!!
        }
        _leadFunnel = Builder(name = "LeadFunnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveTo(4.105f, 0.0f, 3.0f, 0.0f)
                reflectiveCurveTo(1.0f, 0.895f, 1.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(10.0f, 4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(17.0f, 4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(20.0f, 8.155f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -1.586f, -1.163f, -3.012f, -2.743f, -3.144f)
                curveToRelative(-1.415f, -0.118f, -2.633f, 0.751f, -3.073f, 1.989f)
                horizontalLineToRelative(-1.367f)
                curveToRelative(-0.413f, -1.163f, -1.512f, -2.0f, -2.816f, -2.0f)
                reflectiveCurveToRelative(-2.403f, 0.837f, -2.816f, 2.0f)
                horizontalLineToRelative(-1.367f)
                curveToRelative(-0.44f, -1.238f, -1.658f, -2.107f, -3.073f, -1.989f)
                curveTo(1.163f, 5.143f, 0.0f, 6.569f, 0.0f, 8.155f)
                verticalLineToRelative(0.903f)
                curveToRelative(0.0f, 1.215f, 0.552f, 2.365f, 1.501f, 3.124f)
                lineToRelative(5.499f, 4.398f)
                verticalLineToRelative(4.066f)
                curveToRelative(0.0f, 0.876f, 0.495f, 1.676f, 1.278f, 2.068f)
                lineToRelative(2.203f, 1.101f)
                curveToRelative(0.248f, 0.124f, 0.514f, 0.186f, 0.779f, 0.186f)
                curveToRelative(0.317f, 0.0f, 0.633f, -0.088f, 0.915f, -0.263f)
                curveToRelative(0.517f, -0.319f, 0.825f, -0.873f, 0.825f, -1.48f)
                verticalLineToRelative(-5.678f)
                lineToRelative(1.625f, -1.299f)
                curveToRelative(0.432f, -0.346f, 0.501f, -0.975f, 0.156f, -1.406f)
                curveToRelative(-0.345f, -0.43f, -0.975f, -0.502f, -1.405f, -0.156f)
                lineToRelative(-2.0f, 1.6f)
                curveToRelative(-0.237f, 0.19f, -0.375f, 0.477f, -0.375f, 0.781f)
                verticalLineToRelative(5.739f)
                lineToRelative(-1.828f, -0.914f)
                curveToRelative(-0.106f, -0.053f, -0.172f, -0.161f, -0.172f, -0.279f)
                verticalLineToRelative(-4.547f)
                curveToRelative(0.0f, -0.304f, -0.138f, -0.591f, -0.375f, -0.781f)
                lineToRelative(-5.874f, -4.699f)
                curveToRelative(-0.477f, -0.381f, -0.75f, -0.95f, -0.75f, -1.561f)
                verticalLineToRelative(-0.059f)
                horizontalLineToRelative(17.155f)
                curveToRelative(0.467f, 0.0f, 0.845f, -0.378f, 0.845f, -0.845f)
                close()
                moveTo(21.685f, 16.267f)
                lineToRelative(-3.041f, -0.506f)
                curveToRelative(-0.373f, -0.062f, -0.644f, -0.382f, -0.644f, -0.761f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.268f)
                curveToRelative(0.356f, 0.0f, 0.688f, 0.191f, 0.867f, 0.501f)
                curveToRelative(0.277f, 0.479f, 0.89f, 0.644f, 1.366f, 0.364f)
                curveToRelative(0.479f, -0.276f, 0.642f, -0.888f, 0.365f, -1.366f)
                curveToRelative(-0.535f, -0.925f, -1.531f, -1.499f, -2.598f, -1.499f)
                horizontalLineToRelative(-0.268f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.359f, 0.974f, 2.51f, 2.315f, 2.733f)
                lineToRelative(3.041f, 0.506f)
                curveToRelative(0.373f, 0.062f, 0.644f, 0.382f, 0.644f, 0.761f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.268f)
                curveToRelative(-0.356f, 0.0f, -0.688f, -0.191f, -0.867f, -0.501f)
                curveToRelative(-0.277f, -0.478f, -0.89f, -0.643f, -1.366f, -0.364f)
                curveToRelative(-0.479f, 0.276f, -0.642f, 0.888f, -0.365f, 1.366f)
                curveToRelative(0.535f, 0.925f, 1.531f, 1.499f, 2.598f, 1.499f)
                horizontalLineToRelative(0.268f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.359f, -0.974f, -2.51f, -2.315f, -2.733f)
                close()
            }
        }
        .build()
        return _leadFunnel!!
    }

private var _leadFunnel: ImageVector? = null
