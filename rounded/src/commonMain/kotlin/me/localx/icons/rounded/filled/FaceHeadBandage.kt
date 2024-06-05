package me.localx.icons.rounded.filled

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
                moveTo(7.66f, 8.36f)
                curveTo(3.96f, 9.9f, 1.45f, 11.68f, 0.02f, 12.89f)
                curveToRelative(-0.02f, -0.29f, -0.04f, -0.59f, -0.04f, -0.89f)
                curveTo(-0.03f, 10.18f, 0.42f, 8.45f, 1.15f, 6.91f)
                curveToRelative(1.47f, 0.24f, 3.76f, 0.69f, 6.51f, 1.45f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(-1.96f, 0.0f, -3.8f, 0.48f, -5.43f, 1.31f)
                curveToRelative(4.36f, 1.02f, 10.51f, 2.94f, 16.63f, 6.41f)
                curveTo(21.47f, 3.21f, 17.11f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(16.98f, 11.74f)
                curveToRelative(2.18f, 1.0f, 4.39f, 2.18f, 6.54f, 3.59f)
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
                close()
                moveTo(16.49f, 17.13f)
                curveToRelative(-0.08f, -0.05f, -2.05f, -1.13f, -4.49f, -1.13f)
                reflectiveCurveToRelative(-4.41f, 1.08f, -4.49f, 1.13f)
                curveToRelative(-0.48f, 0.27f, -0.65f, 0.88f, -0.39f, 1.36f)
                curveToRelative(0.27f, 0.48f, 0.88f, 0.66f, 1.36f, 0.39f)
                curveToRelative(0.02f, 0.0f, 1.61f, -0.88f, 3.52f, -0.88f)
                reflectiveCurveToRelative(3.5f, 0.87f, 3.51f, 0.88f)
                curveToRelative(0.15f, 0.08f, 0.32f, 0.12f, 0.48f, 0.12f)
                curveToRelative(0.35f, 0.0f, 0.69f, -0.18f, 0.87f, -0.51f)
                curveToRelative(0.27f, -0.48f, 0.1f, -1.09f, -0.39f, -1.36f)
                close()
                moveTo(23.89f, 10.46f)
                curveTo(16.5f, 5.88f, 8.8f, 3.77f, 4.25f, 2.85f)
                curveToRelative(-0.76f, 0.64f, -1.43f, 1.38f, -2.01f, 2.2f)
                curveToRelative(4.36f, 0.76f, 13.32f, 2.87f, 21.7f, 8.17f)
                curveToRelative(0.04f, -0.4f, 0.06f, -0.81f, 0.06f, -1.22f)
                curveToRelative(0.0f, -0.52f, -0.05f, -1.04f, -0.11f, -1.54f)
                close()
            }
        }
        .build()
        return _faceHeadBandage!!
    }

private var _faceHeadBandage: ImageVector? = null
