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

public val Icons.Outline.Snake: ImageVector
    get() {
        if (_snake != null) {
            return _snake!!
        }
        _snake = Builder(name = "Snake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 17.0f)
                horizontalLineToRelative(-0.213f)
                curveToRelative(-1.137f, -0.708f, -2.569f, -2.046f, -4.167f, -3.903f)
                curveToRelative(-2.041f, -2.375f, -2.117f, -3.61f, -2.12f, -4.504f)
                curveToRelative(0.123f, -0.035f, 0.289f, -0.069f, 0.48f, -0.092f)
                curveToRelative(0.878f, 0.877f, 2.049f, 1.407f, 3.287f, 1.472f)
                curveToRelative(1.393f, 0.079f, 2.775f, -0.453f, 3.769f, -1.447f)
                curveToRelative(0.436f, -0.435f, 1.21f, -1.258f, 1.821f, -1.912f)
                curveToRelative(0.85f, -0.911f, 0.85f, -2.337f, 0.0f, -3.248f)
                curveToRelative(-0.61f, -0.653f, -1.385f, -1.477f, -1.821f, -1.912f)
                curveTo(20.55f, 0.468f, 19.188f, -0.057f, 17.796f, 0.005f)
                curveToRelative(-1.248f, 0.058f, -2.434f, 0.59f, -3.319f, 1.476f)
                curveToRelative(-1.414f, 0.066f, -3.642f, 0.439f, -5.34f, 1.976f)
                curveToRelative(-0.975f, 0.882f, -2.137f, 2.471f, -2.137f, 5.033f)
                curveToRelative(0.0f, 0.859f, 0.145f, 1.762f, 0.393f, 2.669f)
                curveToRelative(-1.386f, -0.546f, -3.062f, -0.862f, -3.73f, -0.973f)
                lineToRelative(-1.224f, -0.202f)
                lineToRelative(0.062f, 1.239f)
                curveToRelative(0.049f, 0.985f, 0.291f, 4.293f, 1.308f, 5.515f)
                lineToRelative(0.218f, 0.262f)
                horizontalLineToRelative(-0.527f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(10.479f, 4.939f)
                curveToRelative(1.397f, -1.264f, 3.392f, -1.464f, 4.456f, -1.47f)
                lineToRelative(0.466f, -0.003f)
                lineToRelative(0.298f, -0.359f)
                curveToRelative(0.557f, -0.672f, 1.335f, -1.064f, 2.191f, -1.104f)
                curveToRelative(0.841f, -0.049f, 1.635f, 0.268f, 2.231f, 0.864f)
                curveToRelative(0.424f, 0.424f, 1.179f, 1.227f, 1.773f, 1.863f)
                curveToRelative(0.138f, 0.147f, 0.138f, 0.371f, 0.0f, 0.518f)
                curveToRelative(-0.594f, 0.636f, -1.35f, 1.438f, -1.773f, 1.863f)
                curveToRelative(-0.602f, 0.601f, -1.403f, 0.911f, -2.25f, 0.864f)
                curveToRelative(-0.863f, -0.045f, -1.643f, -0.448f, -2.198f, -1.134f)
                lineToRelative(-0.307f, -0.379f)
                lineToRelative(-0.487f, 0.008f)
                curveToRelative(-0.5f, 0.008f, -1.735f, 0.093f, -2.394f, 0.699f)
                curveToRelative(-0.327f, 0.298f, -0.486f, 0.73f, -0.486f, 1.32f)
                curveToRelative(0.0f, 1.078f, 0.0f, 2.881f, 2.604f, 5.911f)
                curveToRelative(0.875f, 1.016f, 1.699f, 1.88f, 2.472f, 2.6f)
                horizontalLineToRelative(-4.125f)
                curveToRelative(-1.984f, -2.075f, -3.95f, -5.702f, -3.95f, -8.511f)
                curveToRelative(0.0f, -1.828f, 0.804f, -2.939f, 1.479f, -3.55f)
                close()
                moveTo(5.347f, 15.459f)
                curveToRelative(-0.303f, -0.363f, -0.583f, -1.685f, -0.74f, -3.046f)
                curveToRelative(1.399f, 0.323f, 2.755f, 0.778f, 3.046f, 1.128f)
                lineToRelative(1.606f, 1.873f)
                curveToRelative(0.338f, 0.561f, 0.699f, 1.091f, 1.071f, 1.586f)
                horizontalLineToRelative(-3.701f)
                lineToRelative(-1.282f, -1.541f)
                close()
                moveTo(20.5f, 22.0f)
                lineTo(3.5f, 22.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 4.989f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _snake!!
    }

private var _snake: ImageVector? = null
