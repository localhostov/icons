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

public val Icons.Outline.FaceRelieved: ImageVector
    get() {
        if (_faceRelieved != null) {
            return _faceRelieved!!
        }
        _faceRelieved = Builder(name = "FaceRelieved", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(5.844f, 9.145f)
                lineToRelative(-1.689f, -1.07f)
                curveToRelative(0.912f, -1.438f, 2.279f, -2.576f, 3.953f, -3.29f)
                lineToRelative(0.784f, 1.84f)
                curveToRelative(-1.282f, 0.546f, -2.364f, 1.441f, -3.048f, 2.521f)
                close()
                moveTo(15.108f, 6.624f)
                lineToRelative(0.784f, -1.84f)
                curveToRelative(1.621f, 0.69f, 2.959f, 1.785f, 3.872f, 3.164f)
                lineToRelative(-1.668f, 1.104f)
                curveToRelative(-0.695f, -1.052f, -1.729f, -1.892f, -2.988f, -2.428f)
                close()
                moveTo(7.673f, 12.992f)
                curveToRelative(-1.038f, -0.069f, -2.058f, -0.53f, -2.799f, -1.265f)
                lineToRelative(1.407f, -1.422f)
                curveToRelative(0.399f, 0.396f, 0.969f, 0.653f, 1.525f, 0.691f)
                curveToRelative(0.652f, 0.039f, 1.23f, -0.195f, 1.737f, -0.707f)
                lineToRelative(1.422f, 1.406f)
                curveToRelative(-0.839f, 0.848f, -1.902f, 1.305f, -3.018f, 1.305f)
                curveToRelative(-0.091f, 0.0f, -0.183f, -0.003f, -0.274f, -0.009f)
                close()
                moveTo(17.797f, 10.289f)
                lineToRelative(1.406f, 1.422f)
                curveToRelative(-0.792f, 0.782f, -1.91f, 1.262f, -3.068f, 1.262f)
                curveToRelative(-1.044f, 0.0f, -2.119f, -0.39f, -3.017f, -1.297f)
                lineToRelative(1.422f, -1.406f)
                curveToRelative(1.187f, 1.202f, 2.598f, 0.668f, 3.256f, 0.02f)
                close()
                moveTo(16.336f, 15.253f)
                lineToRelative(1.33f, 1.493f)
                curveToRelative(-0.103f, 0.092f, -2.559f, 2.254f, -5.666f, 2.254f)
                reflectiveCurveToRelative(-5.563f, -2.162f, -5.666f, -2.254f)
                lineToRelative(1.33f, -1.493f)
                curveToRelative(0.02f, 0.017f, 2.005f, 1.747f, 4.336f, 1.747f)
                reflectiveCurveToRelative(4.316f, -1.73f, 4.336f, -1.747f)
                close()
            }
        }
        .build()
        return _faceRelieved!!
    }

private var _faceRelieved: ImageVector? = null
