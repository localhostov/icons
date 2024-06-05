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

public val Icons.Outline.BanBug: ImageVector
    get() {
        if (_banBug != null) {
            return _banBug!!
        }
        _banBug = Builder(name = "BanBug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                reflectiveCurveTo(18.62f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                lineToRelative(-0.74f, -0.74f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.3f, -0.02f, -0.64f, -0.07f, -1.0f)
                horizontalLineToRelative(2.07f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.41f)
                curveToRelative(-0.07f, -0.34f, -0.15f, -0.68f, -0.23f, -1.0f)
                horizontalLineToRelative(0.64f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.2f)
                curveToRelative(-0.11f, -0.36f, -0.2f, -0.62f, -0.23f, -0.69f)
                curveToRelative(-0.61f, -1.4f, -2.0f, -2.31f, -3.52f, -2.31f)
                reflectiveCurveToRelative(-2.82f, 0.85f, -3.46f, 2.18f)
                lineToRelative(-2.92f, -2.92f)
                curveToRelative(1.72f, -1.41f, 3.93f, -2.26f, 6.32f, -2.26f)
                curveToRelative(5.51f, 0.0f, 10.0f, 4.49f, 10.0f, 10.0f)
                close()
                moveTo(10.2f, 8.79f)
                curveToRelative(0.07f, -0.35f, 0.13f, -0.61f, 0.15f, -0.68f)
                curveToRelative(0.29f, -0.67f, 0.96f, -1.11f, 1.69f, -1.11f)
                reflectiveCurveToRelative(1.4f, 0.43f, 1.69f, 1.1f)
                curveToRelative(0.13f, 0.33f, 1.1f, 3.54f, 1.25f, 5.47f)
                lineToRelative(-4.78f, -4.78f)
                close()
                moveTo(2.0f, 12.0f)
                curveToRelative(0.0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.32f)
                lineToRelative(14.06f, 14.06f)
                curveToRelative(-1.72f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveToRelative(-5.51f, 0.0f, -10.0f, -4.49f, -10.0f, -10.0f)
                close()
                moveTo(14.22f, 18.46f)
                curveToRelative(-0.68f, 0.34f, -1.44f, 0.54f, -2.22f, 0.54f)
                curveToRelative(-2.05f, 0.0f, -3.8f, -1.24f, -4.58f, -3.0f)
                horizontalLineToRelative(-0.42f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.26f, 0.03f, -0.6f, 0.07f, -1.0f)
                horizontalLineToRelative(-2.07f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.76f)
                lineToRelative(2.29f, 2.29f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.03f, 0.29f, -0.05f, 0.54f, -0.05f, 0.71f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.23f, 0.0f, 0.45f, -0.04f, 0.67f, -0.09f)
                lineToRelative(1.55f, 1.55f)
                close()
            }
        }
        .build()
        return _banBug!!
    }

private var _banBug: ImageVector? = null
