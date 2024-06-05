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

public val Icons.Outline.FaceHeadBandage: ImageVector
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
                moveTo(20.65f, 6.98f)
                curveToRelative(-4.36f, -2.33f, -8.66f, -3.69f, -11.84f, -4.46f)
                curveToRelative(1.0f, -0.34f, 2.08f, -0.52f, 3.2f, -0.52f)
                curveToRelative(3.69f, 0.0f, 6.91f, 2.0f, 8.65f, 4.98f)
                close()
                moveTo(6.04f, 3.97f)
                curveToRelative(3.45f, 0.66f, 9.72f, 2.27f, 15.74f, 5.97f)
                curveToRelative(0.14f, 0.66f, 0.21f, 1.35f, 0.21f, 2.06f)
                curveToRelative(0.0f, 0.15f, 0.0f, 0.3f, -0.01f, 0.45f)
                curveTo(15.0f, 7.76f, 7.25f, 6.17f, 4.24f, 5.7f)
                curveToRelative(0.53f, -0.65f, 1.13f, -1.23f, 1.8f, -1.72f)
                close()
                moveTo(2.02f, 11.37f)
                curveToRelative(0.09f, -1.37f, 0.45f, -2.66f, 1.03f, -3.82f)
                curveToRelative(0.62f, 0.08f, 2.26f, 0.32f, 4.46f, 0.86f)
                curveToRelative(-2.54f, 1.06f, -4.35f, 2.16f, -5.48f, 2.96f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-4.91f, 0.0f, -9.0f, -3.55f, -9.84f, -8.22f)
                curveToRelative(0.58f, -0.48f, 2.24f, -1.75f, 5.06f, -3.05f)
                curveToRelative(-0.14f, 0.23f, -0.22f, 0.49f, -0.22f, 0.78f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.72f, -0.51f, -1.32f, -1.18f, -1.47f)
                curveToRelative(0.6f, -0.24f, 1.24f, -0.48f, 1.92f, -0.71f)
                curveToRelative(1.12f, 0.36f, 2.32f, 0.79f, 3.54f, 1.3f)
                curveToRelative(-0.18f, 0.25f, -0.28f, 0.55f, -0.28f, 0.88f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.71f, 0.0f, 1.31f, -0.49f, 1.46f, -1.16f)
                curveToRelative(1.57f, 0.79f, 3.16f, 1.71f, 4.69f, 2.8f)
                curveToRelative(-1.16f, 4.24f, -5.05f, 7.36f, -9.65f, 7.36f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(3.11f, 0.0f, 5.56f, 2.16f, 5.67f, 2.25f)
                lineToRelative(-1.33f, 1.49f)
                reflectiveCurveToRelative(-2.0f, -1.75f, -4.34f, -1.75f)
                reflectiveCurveToRelative(-4.32f, 1.73f, -4.34f, 1.75f)
                lineToRelative(-1.33f, -1.49f)
                curveToRelative(0.1f, -0.09f, 2.56f, -2.25f, 5.67f, -2.25f)
                close()
            }
        }
        .build()
        return _faceHeadBandage!!
    }

private var _faceHeadBandage: ImageVector? = null
