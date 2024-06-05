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

public val Icons.Filled.FaceHeadBandage: ImageVector
    get() {
        if (_faceHeadBandage != null) {
            return _faceHeadBandage!!
        }
        _faceHeadBandage = Builder(name = "FaceHeadBandage", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.94f, 13.22f)
                curveTo(15.56f, 7.92f, 6.6f, 5.81f, 2.24f, 5.05f)
                curveToRelative(0.58f, -0.81f, 1.25f, -1.55f, 2.01f, -2.2f)
                curveToRelative(4.55f, 0.92f, 12.25f, 3.03f, 19.64f, 7.6f)
                curveToRelative(0.07f, 0.51f, 0.11f, 1.02f, 0.11f, 1.54f)
                curveToRelative(0.0f, 0.41f, -0.02f, 0.82f, -0.06f, 1.22f)
                close()
                moveTo(0.0f, 12.0f)
                curveToRelative(0.0f, 0.3f, 0.02f, 0.59f, 0.04f, 0.89f)
                curveToRelative(1.43f, -1.21f, 3.92f, -2.98f, 7.61f, -4.53f)
                curveToRelative(-2.75f, -0.76f, -5.03f, -1.21f, -6.51f, -1.45f)
                curveToRelative(-0.73f, 1.55f, -1.15f, 3.27f, -1.15f, 5.09f)
                close()
                moveTo(23.52f, 15.33f)
                curveToRelative(-1.45f, 5.0f, -6.06f, 8.67f, -11.52f, 8.67f)
                reflectiveCurveTo(1.86f, 20.27f, 0.45f, 15.22f)
                curveToRelative(0.83f, -0.81f, 3.02f, -2.72f, 6.77f, -4.48f)
                curveToRelative(-0.13f, 0.22f, -0.22f, 0.48f, -0.22f, 0.76f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.71f, -0.5f, -1.31f, -1.17f, -1.46f)
                curveToRelative(0.62f, -0.25f, 1.27f, -0.5f, 1.96f, -0.73f)
                curveToRelative(1.13f, 0.38f, 2.31f, 0.8f, 3.52f, 1.28f)
                curveToRelative(-0.19f, 0.25f, -0.31f, 0.56f, -0.31f, 0.91f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.75f, 0.0f, 1.36f, -0.55f, 1.48f, -1.26f)
                curveToRelative(2.18f, 1.0f, 4.39f, 2.18f, 6.54f, 3.59f)
                close()
                moveTo(17.66f, 17.26f)
                curveToRelative(-0.1f, -0.09f, -2.56f, -2.25f, -5.67f, -2.25f)
                reflectiveCurveToRelative(-5.56f, 2.16f, -5.67f, 2.25f)
                lineToRelative(1.33f, 1.49f)
                reflectiveCurveToRelative(2.0f, -1.75f, 4.34f, -1.75f)
                reflectiveCurveToRelative(4.32f, 1.73f, 4.34f, 1.75f)
                lineToRelative(1.33f, -1.49f)
                close()
                moveTo(23.19f, 7.73f)
                curveTo(21.47f, 3.21f, 17.11f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-1.96f, 0.0f, -3.8f, 0.48f, -5.43f, 1.31f)
                curveToRelative(4.36f, 1.02f, 10.51f, 2.94f, 16.63f, 6.41f)
                close()
            }
        }
        .build()
        return _faceHeadBandage!!
    }

private var _faceHeadBandage: ImageVector? = null
