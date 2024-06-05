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

public val Icons.Outline.FaceWeary: ImageVector
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
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(6.984f, 10.999f)
                curveToRelative(-0.428f, 0.0f, -0.841f, -0.053f, -1.221f, -0.146f)
                curveToRelative(-0.537f, -0.131f, -0.866f, -0.672f, -0.735f, -1.208f)
                curveToRelative(0.131f, -0.537f, 0.671f, -0.863f, 1.209f, -0.735f)
                curveToRelative(0.453f, 0.111f, 2.009f, 0.358f, 2.971f, -1.102f)
                curveToRelative(0.303f, -0.461f, 0.924f, -0.589f, 1.385f, -0.285f)
                curveToRelative(0.461f, 0.304f, 0.588f, 0.924f, 0.285f, 1.385f)
                curveToRelative(-1.018f, 1.544f, -2.526f, 2.09f, -3.894f, 2.09f)
                close()
                moveTo(18.971f, 9.645f)
                curveToRelative(0.131f, 0.536f, -0.198f, 1.077f, -0.735f, 1.208f)
                curveToRelative(-0.38f, 0.093f, -0.794f, 0.146f, -1.221f, 0.146f)
                curveToRelative(-1.367f, 0.0f, -2.876f, -0.545f, -3.894f, -2.09f)
                curveToRelative(-0.304f, -0.461f, -0.176f, -1.082f, 0.285f, -1.385f)
                curveToRelative(0.461f, -0.304f, 1.082f, -0.176f, 1.385f, 0.285f)
                curveToRelative(0.962f, 1.46f, 2.518f, 1.213f, 2.971f, 1.102f)
                curveToRelative(0.54f, -0.128f, 1.078f, 0.198f, 1.209f, 0.735f)
                close()
                moveTo(17.841f, 16.459f)
                curveToRelative(0.475f, 0.746f, -0.188f, 1.706f, -1.052f, 1.517f)
                curveToRelative(-1.117f, -0.244f, -2.352f, -0.975f, -4.793f, -0.976f)
                curveToRelative(-2.44f, 0.0f, -3.676f, 0.732f, -4.793f, 0.976f)
                curveToRelative(-0.864f, 0.189f, -1.527f, -0.771f, -1.052f, -1.517f)
                curveToRelative(1.02f, -1.603f, 2.848f, -3.458f, 5.848f, -3.458f)
                reflectiveCurveToRelative(4.822f, 1.855f, 5.842f, 3.458f)
                close()
            }
        }
        .build()
        return _faceWeary!!
    }

private var _faceWeary: ImageVector? = null
