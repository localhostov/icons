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

public val Icons.Outline.LassoSparkles: ImageVector
    get() {
        if (_lassoSparkles != null) {
            return _lassoSparkles!!
        }
        _lassoSparkles = Builder(name = "LassoSparkles", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.07f, 17.35f)
                lineToRelative(1.42f, -2.82f)
                curveToRelative(-1.52f, 0.92f, -3.42f, 1.47f, -5.49f, 1.47f)
                curveToRelative(-1.35f, 0.0f, -2.69f, -0.24f, -3.9f, -0.69f)
                curveToRelative(-0.35f, -0.79f, -1.24f, -2.68f, -2.0f, -3.43f)
                curveToRelative(-0.71f, -0.71f, -1.74f, -0.97f, -2.69f, -0.79f)
                curveToRelative(-0.27f, -0.67f, -0.41f, -1.37f, -0.41f, -2.08f)
                curveToRelative(0.0f, -3.86f, 4.04f, -7.0f, 9.0f, -7.0f)
                reflectiveCurveToRelative(9.0f, 3.14f, 9.0f, 7.0f)
                curveToRelative(0.0f, 1.37f, -0.52f, 2.65f, -1.4f, 3.73f)
                lineToRelative(0.96f, 1.91f)
                curveToRelative(1.52f, -1.54f, 2.44f, -3.51f, 2.44f, -5.64f)
                curveTo(24.0f, 4.04f, 19.07f, 0.0f, 13.0f, 0.0f)
                reflectiveCurveTo(2.0f, 4.04f, 2.0f, 9.0f)
                curveToRelative(0.0f, 1.06f, 0.23f, 2.12f, 0.67f, 3.1f)
                curveToRelative(-0.43f, 0.53f, -0.67f, 1.19f, -0.67f, 1.89f)
                curveToRelative(0.0f, 0.42f, 0.09f, 0.82f, 0.25f, 1.19f)
                curveToRelative(-1.0f, 0.99f, -2.25f, 2.67f, -2.25f, 4.82f)
                curveToRelative(0.0f, 2.93f, 2.39f, 4.0f, 4.0f, 4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-0.46f, 0.0f, -2.0f, -0.17f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.47f, 0.94f, -2.69f, 1.68f, -3.42f)
                curveToRelative(0.92f, 0.34f, 2.27f, 0.43f, 3.43f, 0.43f)
                curveToRelative(0.29f, 0.0f, 0.56f, 0.0f, 0.82f, -0.01f)
                curveToRelative(1.55f, 0.66f, 3.3f, 1.01f, 5.07f, 1.01f)
                curveToRelative(1.44f, 0.0f, 2.81f, -0.23f, 4.07f, -0.65f)
                close()
                moveTo(4.29f, 14.69f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.7f)
                reflectiveCurveToRelative(0.1f, -0.51f, 0.29f, -0.7f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.29f, 0.7f, -0.29f)
                reflectiveCurveToRelative(0.51f, 0.1f, 0.7f, 0.29f)
                curveToRelative(0.27f, 0.27f, 0.67f, 0.97f, 1.05f, 1.71f)
                curveToRelative(-1.19f, -0.03f, -2.2f, -0.15f, -2.45f, -0.31f)
                close()
                moveTo(21.33f, 18.67f)
                lineToRelative(2.67f, 1.33f)
                lineToRelative(-2.67f, 1.33f)
                lineToRelative(-1.33f, 2.67f)
                lineToRelative(-1.33f, -2.67f)
                lineToRelative(-2.67f, -1.33f)
                lineToRelative(2.67f, -1.33f)
                lineToRelative(1.33f, -2.67f)
                lineToRelative(1.33f, 2.67f)
                close()
                moveTo(14.5f, 6.0f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(-2.33f, 1.17f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-1.17f, -2.33f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(2.33f, -1.17f)
                lineToRelative(1.17f, -2.33f)
                close()
            }
        }
        .build()
        return _lassoSparkles!!
    }

private var _lassoSparkles: ImageVector? = null
