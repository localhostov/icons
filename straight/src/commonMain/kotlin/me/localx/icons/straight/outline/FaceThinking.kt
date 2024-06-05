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

public val Icons.Outline.FaceThinking: ImageVector
    get() {
        if (_faceThinking != null) {
            return _faceThinking!!
        }
        _faceThinking = Builder(name = "FaceThinking", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 5.337f, -3.506f, 9.861f, -8.334f, 11.414f)
                curveToRelative(0.209f, -0.451f, 0.331f, -0.948f, 0.332f, -1.469f)
                verticalLineToRelative(-0.79f)
                curveToRelative(3.528f, -1.547f, 6.002f, -5.064f, 6.002f, -9.155f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 2.351f, 0.82f, 4.51f, 2.182f, 6.219f)
                curveToRelative(-0.219f, 0.926f, -0.233f, 1.896f, -0.028f, 2.831f)
                curveTo(1.615f, 18.853f, 0.0f, 15.616f, 0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(7.0f, 9.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(17.0f, 10.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(11.988f, 6.55f)
                curveToRelative(-0.047f, -0.104f, -1.177f, -2.55f, -3.488f, -2.55f)
                curveToRelative(-1.744f, 0.0f, -2.612f, 1.186f, -2.705f, 1.321f)
                lineToRelative(1.646f, 1.135f)
                reflectiveCurveToRelative(0.358f, -0.456f, 1.059f, -0.456f)
                curveToRelative(1.0f, 0.0f, 1.661f, 1.364f, 1.668f, 1.377f)
                lineToRelative(1.82f, -0.827f)
                close()
                moveTo(16.305f, 16.193f)
                lineToRelative(-2.302f, 0.721f)
                lineToRelative(-0.005f, 5.029f)
                curveToRelative(0.0f, 0.645f, -0.414f, 1.218f, -1.026f, 1.422f)
                lineToRelative(-1.309f, 0.436f)
                curveToRelative(-0.43f, 0.135f, -0.865f, 0.199f, -1.293f, 0.199f)
                curveToRelative(-0.708f, 0.0f, -1.396f, -0.175f, -2.009f, -0.495f)
                curveToRelative(-1.267f, -0.662f, -2.208f, -1.945f, -2.324f, -3.587f)
                curveToRelative(-0.057f, -0.809f, 0.155f, -1.617f, 0.531f, -2.336f)
                lineToRelative(1.659f, -3.172f)
                curveToRelative(0.179f, -0.341f, 0.527f, -0.537f, 0.887f, -0.537f)
                curveToRelative(0.156f, 0.0f, 0.315f, 0.037f, 0.463f, 0.114f)
                curveToRelative(0.489f, 0.256f, 0.679f, 0.86f, 0.423f, 1.349f)
                lineToRelative(-0.482f, 0.921f)
                lineToRelative(6.196f, -1.955f)
                curveToRelative(0.099f, -0.031f, 0.198f, -0.046f, 0.297f, -0.046f)
                curveToRelative(0.422f, 0.0f, 0.812f, 0.271f, 0.945f, 0.695f)
                curveToRelative(0.164f, 0.522f, -0.127f, 1.078f, -0.649f, 1.242f)
                close()
            }
        }
        .build()
        return _faceThinking!!
    }

private var _faceThinking: ImageVector? = null
