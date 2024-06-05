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

public val Icons.Bold.FaceHeadBandage: ImageVector
    get() {
        if (_faceHeadBandage != null) {
            return _faceHeadBandage!!
        }
        _faceHeadBandage = Builder(name = "FaceHeadBandage", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                reflectiveCurveTo(18.62f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(20.6f, 9.34f)
                curveToRelative(-4.76f, -2.88f, -9.72f, -4.38f, -13.08f, -5.14f)
                curveToRelative(1.32f, -0.76f, 2.85f, -1.2f, 4.49f, -1.2f)
                curveToRelative(4.04f, 0.0f, 7.46f, 2.67f, 8.6f, 6.34f)
                close()
                moveTo(3.34f, 9.58f)
                curveToRelative(0.29f, -1.04f, 0.77f, -2.01f, 1.39f, -2.87f)
                curveToRelative(0.76f, 0.13f, 1.73f, 0.32f, 2.86f, 0.59f)
                curveToRelative(-1.77f, 0.8f, -3.18f, 1.59f, -4.26f, 2.28f)
                close()
                moveTo(12.01f, 21.01f)
                curveToRelative(-4.48f, 0.0f, -8.21f, -3.3f, -8.89f, -7.59f)
                curveToRelative(0.58f, -0.48f, 1.91f, -1.47f, 4.05f, -2.57f)
                curveToRelative(-0.1f, 0.2f, -0.16f, 0.43f, -0.16f, 0.66f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.72f, -0.51f, -1.32f, -1.18f, -1.47f)
                curveToRelative(1.01f, -0.45f, 2.15f, -0.91f, 3.43f, -1.34f)
                curveToRelative(1.04f, 0.37f, 2.11f, 0.81f, 3.21f, 1.31f)
                curveToRelative(-0.8f, 0.03f, -1.45f, 0.69f, -1.45f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.33f, -0.11f, -0.64f, -0.29f, -0.89f)
                curveToRelative(1.42f, 0.72f, 2.84f, 1.55f, 4.22f, 2.53f)
                curveToRelative(-0.56f, 4.43f, -4.35f, 7.86f, -8.93f, 7.86f)
                close()
                moveTo(16.77f, 17.32f)
                curveToRelative(-0.29f, 0.45f, -0.77f, 0.69f, -1.27f, 0.69f)
                curveToRelative(-0.27f, 0.0f, -0.55f, -0.07f, -0.8f, -0.23f)
                curveToRelative(-0.04f, -0.02f, -1.27f, -0.77f, -2.7f, -0.77f)
                reflectiveCurveToRelative(-2.69f, 0.76f, -2.7f, 0.77f)
                curveToRelative(-0.7f, 0.44f, -1.63f, 0.23f, -2.06f, -0.47f)
                curveToRelative(-0.44f, -0.7f, -0.24f, -1.62f, 0.46f, -2.06f)
                curveToRelative(0.2f, -0.13f, 2.0f, -1.24f, 4.31f, -1.24f)
                reflectiveCurveToRelative(4.11f, 1.11f, 4.31f, 1.24f)
                curveToRelative(0.7f, 0.45f, 0.9f, 1.37f, 0.46f, 2.07f)
                close()
            }
        }
        .build()
        return _faceHeadBandage!!
    }

private var _faceHeadBandage: ImageVector? = null
