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

public val Icons.Bold.BanBug: ImageVector
    get() {
        if (_banBug != null) {
            return _banBug!!
        }
        _banBug = Builder(name = "BanBug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.09f, 13.0f)
                horizontalLineToRelative(-2.09f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(0.09f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(8.1f, 13.01f)
                curveToRelative(-0.06f, 0.37f, -0.1f, 0.72f, -0.1f, 0.99f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(0.55f)
                curveToRelative(0.69f, 1.19f, 1.97f, 2.0f, 3.45f, 2.0f)
                curveToRelative(0.33f, 0.0f, 0.65f, -0.05f, 0.96f, -0.13f)
                lineToRelative(-4.86f, -4.86f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.62f, -5.38f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.62f, 0.0f, 12.0f)
                reflectiveCurveTo(5.38f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.38f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(-1.94f, 0.0f, -3.73f, 0.62f, -5.21f, 1.67f)
                lineToRelative(2.78f, 2.78f)
                curveToRelative(0.52f, -0.96f, 1.28f, -1.45f, 2.42f, -1.45f)
                curveToRelative(1.35f, 0.0f, 2.15f, 0.67f, 2.68f, 2.0f)
                horizontalLineToRelative(1.32f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-0.74f)
                curveToRelative(0.08f, 0.3f, 0.16f, 0.64f, 0.24f, 1.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.1f)
                curveToRelative(0.05f, 0.33f, 0.08f, 0.62f, 0.09f, 0.87f)
                lineToRelative(0.14f, 0.14f)
                curveToRelative(0.99f, 0.07f, 1.78f, 0.86f, 1.85f, 1.85f)
                lineToRelative(1.34f, 1.34f)
                curveToRelative(1.05f, -1.47f, 1.67f, -3.27f, 1.67f, -5.21f)
                curveToRelative(0.0f, -4.96f, -4.04f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(1.94f, 0.0f, 3.73f, -0.62f, 5.21f, -1.67f)
                lineTo(4.67f, 6.79f)
                curveToRelative(-1.05f, 1.47f, -1.67f, 3.27f, -1.67f, 5.21f)
                curveToRelative(0.0f, 4.96f, 4.04f, 9.0f, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _banBug!!
    }

private var _banBug: ImageVector? = null
