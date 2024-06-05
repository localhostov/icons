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

public val Icons.Filled.FaceWeary: ImageVector
    get() {
        if (_faceWeary != null) {
            return _faceWeary!!
        }
        _faceWeary = Builder(name = "FaceWeary", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(5.897f, 8.636f)
                curveToRelative(0.497f, 0.303f, 1.134f, 0.424f, 1.706f, 0.332f)
                curveToRelative(0.663f, -0.111f, 1.196f, -0.491f, 1.585f, -1.13f)
                lineToRelative(1.708f, 1.041f)
                curveToRelative(-0.685f, 1.124f, -1.737f, 1.855f, -2.963f, 2.061f)
                curveToRelative(-0.237f, 0.04f, -0.479f, 0.06f, -0.721f, 0.06f)
                curveToRelative(-0.824f, 0.0f, -1.653f, -0.227f, -2.356f, -0.655f)
                lineToRelative(1.041f, -1.708f)
                close()
                moveTo(11.993f, 17.0f)
                curveToRelative(-3.0f, 0.0f, -6.0f, 1.001f, -6.0f, 1.0f)
                curveToRelative(0.615f, -2.28f, 2.671f, -4.996f, 6.007f, -5.0f)
                curveToRelative(3.336f, 0.004f, 5.385f, 2.72f, 6.0f, 5.0f)
                curveToRelative(0.0f, 0.001f, -3.007f, -1.0f, -6.007f, -1.0f)
                close()
                moveTo(16.802f, 11.0f)
                curveToRelative(-0.241f, 0.0f, -0.48f, -0.02f, -0.717f, -0.059f)
                curveToRelative(-1.218f, -0.204f, -2.264f, -0.932f, -2.944f, -2.048f)
                lineToRelative(1.708f, -1.041f)
                curveToRelative(0.385f, 0.631f, 0.912f, 1.007f, 1.567f, 1.117f)
                curveToRelative(0.564f, 0.096f, 1.194f, -0.027f, 1.686f, -0.328f)
                lineToRelative(1.041f, 1.708f)
                curveToRelative(-0.699f, 0.426f, -1.523f, 0.651f, -2.341f, 0.651f)
                close()
            }
        }
        .build()
        return _faceWeary!!
    }

private var _faceWeary: ImageVector? = null
