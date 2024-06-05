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

public val Icons.Bold.CircleBolt: ImageVector
    get() {
        if (_circleBolt != null) {
            return _circleBolt!!
        }
        _circleBolt = Builder(name = "CircleBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                reflectiveCurveTo(18.62f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.96f, 0.0f, -9.0f, -4.04f, -9.0f, -9.0f)
                reflectiveCurveTo(7.04f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.04f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.04f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(15.75f, 11.61f)
                curveToRelative(0.37f, 0.68f, 0.33f, 1.51f, -0.1f, 2.16f)
                lineToRelative(-2.88f, 4.54f)
                curveToRelative(-0.29f, 0.45f, -0.77f, 0.7f, -1.27f, 0.7f)
                curveToRelative(-0.27f, 0.0f, -0.55f, -0.08f, -0.8f, -0.23f)
                curveToRelative(-0.7f, -0.44f, -0.91f, -1.37f, -0.46f, -2.07f)
                lineToRelative(2.03f, -3.2f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(-0.67f, 0.0f, -1.3f, -0.32f, -1.7f, -0.85f)
                curveToRelative(-0.4f, -0.54f, -0.52f, -1.24f, -0.33f, -1.87f)
                curveToRelative(0.04f, -0.13f, 0.1f, -0.25f, 0.17f, -0.37f)
                lineToRelative(2.97f, -4.71f)
                curveToRelative(0.44f, -0.7f, 1.37f, -0.91f, 2.07f, -0.47f)
                curveToRelative(0.7f, 0.44f, 0.91f, 1.37f, 0.47f, 2.07f)
                lineToRelative(-2.02f, 3.2f)
                horizontalLineToRelative(2.15f)
                curveToRelative(0.78f, 0.0f, 1.49f, 0.42f, 1.85f, 1.11f)
                close()
            }
        }
        .build()
        return _circleBolt!!
    }

private var _circleBolt: ImageVector? = null
