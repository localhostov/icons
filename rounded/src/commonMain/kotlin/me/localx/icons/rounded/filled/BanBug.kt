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

public val Icons.Filled.BanBug: ImageVector
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
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.51f, 0.0f, -10.0f, -4.49f, -10.0f, -10.0f)
                curveToRelative(0.0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.32f)
                lineToRelative(14.06f, 14.06f)
                curveToRelative(-1.72f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                close()
                moveTo(19.74f, 18.32f)
                lineToRelative(-0.86f, -0.86f)
                curveToRelative(0.07f, -0.14f, 0.13f, -0.29f, 0.13f, -0.46f)
                curveToRelative(0.0f, -1.31f, -0.85f, -2.41f, -2.01f, -2.82f)
                curveToRelative(0.0f, -0.06f, 0.01f, -0.12f, 0.01f, -0.18f)
                curveToRelative(0.0f, -0.3f, -0.02f, -0.64f, -0.07f, -1.0f)
                horizontalLineToRelative(1.07f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.41f)
                curveToRelative(-0.08f, -0.35f, -0.16f, -0.7f, -0.24f, -1.04f)
                curveToRelative(1.49f, -0.17f, 2.65f, -1.43f, 2.65f, -2.96f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.2f)
                curveToRelative(-0.11f, -0.36f, -0.2f, -0.62f, -0.23f, -0.69f)
                curveToRelative(-0.61f, -1.4f, -2.0f, -2.31f, -3.52f, -2.31f)
                reflectiveCurveToRelative(-2.82f, 0.85f, -3.46f, 2.18f)
                lineToRelative(-2.92f, -2.92f)
                curveToRelative(1.72f, -1.41f, 3.93f, -2.26f, 6.32f, -2.26f)
                curveToRelative(5.51f, 0.0f, 10.0f, 4.49f, 10.0f, 10.0f)
                curveToRelative(0.0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                close()
                moveTo(7.03f, 14.18f)
                curveToRelative(0.0f, -0.12f, -0.03f, -0.24f, -0.03f, -0.36f)
                verticalLineToRelative(-0.82f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.84f, 0.0f, 1.13f, 0.31f, 1.46f, 0.7f)
                lineToRelative(5.82f, 5.82f)
                curveToRelative(0.46f, 0.46f, 0.24f, 1.26f, -0.39f, 1.39f)
                curveToRelative(-0.26f, 0.05f, -0.56f, 0.09f, -0.89f, 0.09f)
                curveToRelative(-0.38f, 0.0f, -0.77f, -0.04f, -1.16f, -0.13f)
                curveToRelative(-1.47f, -0.33f, -2.66f, -1.38f, -3.31f, -2.74f)
                curveToRelative(-0.31f, 0.17f, -0.53f, 0.49f, -0.53f, 0.87f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.31f, 0.85f, -2.42f, 2.03f, -2.82f)
                close()
            }
        }
        .build()
        return _banBug!!
    }

private var _banBug: ImageVector? = null
