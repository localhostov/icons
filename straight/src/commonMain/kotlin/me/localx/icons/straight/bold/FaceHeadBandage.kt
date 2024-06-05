package me.localx.icons.straight.bold

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
                curveToRelative(-4.77f, -2.89f, -9.73f, -4.39f, -13.07f, -5.14f)
                curveToRelative(1.32f, -0.76f, 2.84f, -1.2f, 4.47f, -1.2f)
                curveToRelative(4.04f, 0.0f, 7.46f, 2.67f, 8.6f, 6.34f)
                close()
                moveTo(3.35f, 9.57f)
                curveToRelative(0.29f, -1.04f, 0.77f, -2.0f, 1.39f, -2.86f)
                curveToRelative(0.73f, 0.13f, 1.7f, 0.32f, 2.85f, 0.59f)
                curveToRelative(-1.76f, 0.79f, -3.17f, 1.58f, -4.24f, 2.26f)
                close()
                moveTo(12.01f, 21.0f)
                curveToRelative(-4.49f, 0.0f, -8.21f, -3.3f, -8.88f, -7.6f)
                curveToRelative(0.59f, -0.48f, 1.91f, -1.47f, 4.04f, -2.56f)
                curveToRelative(-0.1f, 0.2f, -0.16f, 0.43f, -0.16f, 0.67f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.72f, -0.51f, -1.32f, -1.18f, -1.46f)
                curveToRelative(1.0f, -0.45f, 2.14f, -0.9f, 3.41f, -1.34f)
                curveToRelative(1.04f, 0.37f, 2.12f, 0.81f, 3.21f, 1.31f)
                curveToRelative(-0.8f, 0.03f, -1.44f, 0.69f, -1.44f, 1.49f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.33f, -0.11f, -0.63f, -0.29f, -0.88f)
                curveToRelative(1.42f, 0.71f, 2.84f, 1.55f, 4.21f, 2.51f)
                curveToRelative(-0.56f, 4.43f, -4.34f, 7.87f, -8.92f, 7.87f)
                close()
                moveTo(12.01f, 14.0f)
                curveToRelative(3.02f, 0.0f, 5.4f, 2.09f, 5.5f, 2.18f)
                lineToRelative(-1.99f, 2.24f)
                reflectiveCurveToRelative(-1.64f, -1.42f, -3.51f, -1.42f)
                reflectiveCurveToRelative(-3.49f, 1.41f, -3.51f, 1.42f)
                lineToRelative(-1.99f, -2.24f)
                curveToRelative(0.1f, -0.09f, 2.48f, -2.18f, 5.5f, -2.18f)
                close()
            }
        }
        .build()
        return _faceHeadBandage!!
    }

private var _faceHeadBandage: ImageVector? = null
