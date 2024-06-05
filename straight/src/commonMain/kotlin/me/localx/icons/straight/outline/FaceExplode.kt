package me.localx.icons.straight.outline

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

public val Icons.Outline.FaceExplode: ImageVector
    get() {
        if (_faceExplode != null) {
            return _faceExplode!!
        }
        _faceExplode = Builder(name = "FaceExplode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 16.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.5f, 13.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(3.635f)
                curveToRelative(0.0f, 6.698f, -5.283f, 12.245f, -11.776f, 12.363f)
                curveToRelative(-0.076f, 0.0f, -0.152f, 0.002f, -0.227f, 0.002f)
                curveToRelative(-3.165f, 0.0f, -6.141f, -1.215f, -8.403f, -3.437f)
                curveTo(1.276f, 18.288f, 0.0f, 15.247f, 0.0f, 12.0f)
                verticalLineToRelative(-4.0f)
                lineTo(2.0f, 8.0f)
                curveToRelative(0.0f, 1.826f, 1.537f, 1.992f, 2.007f, 2.0f)
                horizontalLineToRelative(4.493f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.336f, -0.064f, -0.588f, -0.177f, -0.692f)
                curveToRelative(-0.034f, -0.03f, -0.076f, -0.053f, -0.121f, -0.067f)
                curveToRelative(-0.813f, 0.622f, -1.63f, 0.76f, -2.202f, 0.76f)
                curveToRelative(-1.064f, 0.0f, -2.059f, -0.476f, -2.727f, -1.306f)
                curveToRelative(-0.668f, -0.829f, -0.919f, -1.912f, -0.689f, -2.97f)
                curveToRelative(0.247f, -1.132f, 1.088f, -2.091f, 2.197f, -2.502f)
                curveToRelative(0.658f, -0.245f, 1.332f, -0.287f, 1.987f, -0.135f)
                curveTo(8.515f, -0.08f, 10.517f, -0.322f, 12.0f, 0.546f)
                curveToRelative(1.485f, -0.869f, 3.486f, -0.627f, 4.732f, 0.543f)
                curveToRelative(1.321f, -0.312f, 2.711f, 0.203f, 3.538f, 1.271f)
                curveToRelative(0.669f, 0.865f, 0.892f, 1.981f, 0.611f, 3.062f)
                curveToRelative(-0.295f, 1.132f, -1.171f, 2.055f, -2.287f, 2.406f)
                curveToRelative(-1.162f, 0.365f, -2.348f, 0.144f, -3.264f, -0.593f)
                curveToRelative(-0.056f, 0.018f, -0.109f, 0.043f, -0.15f, 0.08f)
                curveToRelative(-0.114f, 0.105f, -0.18f, 0.354f, -0.18f, 0.685f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.463f, -0.008f, 2.0f, -0.174f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 11.493f)
                curveToRelative(-0.664f, 0.353f, -1.389f, 0.507f, -2.0f, 0.507f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.167f, 0.458f, -1.825f, 0.843f, -2.172f)
                curveToRelative(0.753f, -0.679f, 1.683f, -0.64f, 1.948f, -0.612f)
                lineToRelative(0.366f, 0.038f)
                lineToRelative(0.256f, 0.267f)
                curveToRelative(0.198f, 0.209f, 0.751f, 0.666f, 1.579f, 0.4f)
                curveToRelative(0.458f, -0.145f, 0.832f, -0.538f, 0.953f, -1.003f)
                curveToRelative(0.125f, -0.483f, 0.034f, -0.957f, -0.257f, -1.334f)
                curveToRelative(-0.418f, -0.539f, -1.149f, -0.754f, -1.831f, -0.431f)
                lineToRelative(-0.752f, 0.357f)
                lineToRelative(-0.488f, -0.675f)
                curveToRelative(-0.384f, -0.531f, -0.973f, -0.836f, -1.617f, -0.836f)
                curveToRelative(-0.621f, 0.0f, -1.066f, 0.283f, -1.331f, 0.521f)
                lineToRelative(-0.669f, 0.603f)
                lineToRelative(-0.669f, -0.603f)
                curveToRelative(-0.265f, -0.238f, -0.71f, -0.521f, -1.331f, -0.521f)
                curveToRelative(-0.644f, 0.0f, -1.233f, 0.305f, -1.617f, 0.836f)
                lineToRelative(-0.489f, 0.676f)
                lineToRelative(-0.753f, -0.359f)
                curveToRelative(-0.385f, -0.183f, -0.767f, -0.202f, -1.166f, -0.054f)
                curveToRelative(-0.467f, 0.173f, -0.835f, 0.586f, -0.937f, 1.052f)
                curveToRelative(-0.103f, 0.471f, 0.001f, 0.929f, 0.292f, 1.289f)
                curveToRelative(0.287f, 0.356f, 0.713f, 0.561f, 1.169f, 0.561f)
                curveToRelative(0.629f, 0.0f, 1.012f, -0.357f, 1.138f, -0.476f)
                lineToRelative(0.366f, -0.27f)
                lineToRelative(0.23f, -0.03f)
                curveToRelative(0.111f, -0.016f, 1.105f, -0.123f, 1.902f, 0.575f)
                curveToRelative(0.394f, 0.345f, 0.864f, 1.008f, 0.864f, 2.2f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(4.0f, 11.999f)
                curveToRelative(-0.611f, 0.0f, -1.336f, -0.154f, -2.0f, -0.507f)
                verticalLineToRelative(0.507f)
                curveToRelative(0.0f, 2.706f, 1.063f, 5.24f, 2.995f, 7.137f)
                curveToRelative(1.93f, 1.895f, 4.487f, 2.903f, 7.193f, 2.861f)
                curveToRelative(5.411f, -0.099f, 9.812f, -4.747f, 9.812f, -10.363f)
                verticalLineToRelative(-0.142f)
                close()
            }
        }
        .build()
        return _faceExplode!!
    }

private var _faceExplode: ImageVector? = null
