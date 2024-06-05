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

public val Icons.Bold.CircleStar: ImageVector
    get() {
        if (_circleStar != null) {
            return _circleStar!!
        }
        _circleStar = Builder(name = "CircleStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.44f, 10.6f)
                curveToRelative(0.13f, 0.36f, 0.02f, 0.77f, -0.27f, 1.02f)
                lineToRelative(-2.17f, 1.77f)
                lineToRelative(0.9f, 2.73f)
                curveToRelative(0.12f, 0.37f, 0.0f, 0.78f, -0.31f, 1.01f)
                curveToRelative(-0.31f, 0.24f, -0.73f, 0.25f, -1.06f, 0.04f)
                lineToRelative(-2.52f, -1.64f)
                lineToRelative(-2.48f, 1.66f)
                curveToRelative(-0.15f, 0.1f, -0.33f, 0.15f, -0.51f, 0.15f)
                curveToRelative(-0.19f, 0.0f, -0.39f, -0.06f, -0.55f, -0.18f)
                curveToRelative(-0.31f, -0.23f, -0.44f, -0.64f, -0.32f, -1.01f)
                lineToRelative(0.86f, -2.76f)
                lineToRelative(-2.18f, -1.77f)
                curveToRelative(-0.29f, -0.25f, -0.4f, -0.65f, -0.27f, -1.01f)
                curveToRelative(0.13f, -0.36f, 0.48f, -0.6f, 0.86f, -0.6f)
                horizontalLineToRelative(2.75f)
                lineToRelative(0.97f, -2.61f)
                curveToRelative(0.13f, -0.36f, 0.48f, -0.6f, 0.86f, -0.6f)
                reflectiveCurveToRelative(0.73f, 0.24f, 0.86f, 0.6f)
                lineToRelative(0.97f, 2.61f)
                horizontalLineToRelative(2.75f)
                curveToRelative(0.38f, 0.0f, 0.73f, 0.24f, 0.86f, 0.6f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.62f, -5.38f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.62f, 0.0f, 12.0f)
                reflectiveCurveTo(5.38f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.38f, 12.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -4.96f, -4.04f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.04f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.04f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.04f, 9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _circleStar!!
    }

private var _circleStar: ImageVector? = null
