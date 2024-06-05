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
                moveTo(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                reflectiveCurveTo(18.62f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 1.94f, -0.62f, 3.73f, -1.67f, 5.21f)
                lineToRelative(-3.34f, -3.34f)
                curveToRelative(0.0f, -0.25f, -0.04f, -0.54f, -0.09f, -0.87f)
                horizontalLineToRelative(1.1f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.09f, -0.37f, -0.17f, -0.72f, -0.25f, -1.03f)
                curveToRelative(1.54f, -0.13f, 2.75f, -1.41f, 2.75f, -2.97f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.32f)
                curveToRelative(-0.52f, -1.33f, -1.33f, -2.0f, -2.68f, -2.0f)
                curveToRelative(-1.15f, 0.0f, -1.9f, 0.49f, -2.42f, 1.45f)
                lineToRelative(-2.78f, -2.78f)
                curveToRelative(1.47f, -1.05f, 3.27f, -1.67f, 5.21f, -1.67f)
                curveToRelative(4.96f, 0.0f, 9.0f, 4.04f, 9.0f, 9.0f)
                close()
                moveTo(3.0f, 12.0f)
                curveToRelative(0.0f, -1.94f, 0.62f, -3.73f, 1.67f, -5.21f)
                lineToRelative(12.53f, 12.53f)
                curveToRelative(-1.47f, 1.05f, -3.27f, 1.67f, -5.21f, 1.67f)
                curveToRelative(-4.96f, 0.0f, -9.0f, -4.04f, -9.0f, -9.0f)
                close()
                moveTo(12.96f, 17.87f)
                curveToRelative(-0.31f, 0.08f, -0.63f, 0.13f, -0.96f, 0.13f)
                curveToRelative(-1.44f, 0.0f, -2.69f, -0.77f, -3.39f, -1.92f)
                curveToRelative(-0.36f, 0.15f, -0.61f, 0.51f, -0.61f, 0.92f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.3f, 0.84f, -2.39f, 2.0f, -2.8f)
                verticalLineToRelative(-0.2f)
                curveToRelative(0.0f, -0.27f, 0.04f, -0.61f, 0.1f, -0.99f)
                lineToRelative(4.86f, 4.86f)
                close()
                moveTo(6.0f, 12.0f)
                curveToRelative(0.0f, -0.29f, 0.13f, -0.55f, 0.32f, -0.73f)
                lineToRelative(1.73f, 1.73f)
                horizontalLineToRelative(-1.05f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _banBug!!
    }

private var _banBug: ImageVector? = null
