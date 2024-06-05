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

public val Icons.Bold.UniversalAccess: ImageVector
    get() {
        if (_universalAccess != null) {
            return _universalAccess!!
        }
        _universalAccess = Builder(name = "UniversalAccess", defaultWidth = 512.0.dp, defaultHeight
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
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.96f, 0.0f, -9.0f, -4.04f, -9.0f, -9.0f)
                reflectiveCurveTo(7.04f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.04f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.04f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(10.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                close()
                moveTo(17.88f, 8.41f)
                curveToRelative(0.33f, 0.76f, -0.03f, 1.64f, -0.79f, 1.97f)
                lineToRelative(-3.09f, 1.32f)
                verticalLineToRelative(1.9f)
                lineToRelative(1.8f, 3.15f)
                curveToRelative(0.41f, 0.72f, 0.16f, 1.64f, -0.56f, 2.05f)
                curveToRelative(-0.23f, 0.13f, -0.49f, 0.2f, -0.74f, 0.2f)
                curveToRelative(-0.52f, 0.0f, -1.03f, -0.27f, -1.3f, -0.76f)
                lineToRelative(-1.2f, -2.1f)
                lineToRelative(-1.2f, 2.1f)
                curveToRelative(-0.28f, 0.48f, -0.78f, 0.76f, -1.3f, 0.76f)
                curveToRelative(-0.25f, 0.0f, -0.51f, -0.06f, -0.74f, -0.2f)
                curveToRelative(-0.72f, -0.41f, -0.97f, -1.33f, -0.56f, -2.05f)
                lineToRelative(1.8f, -3.15f)
                verticalLineToRelative(-1.9f)
                lineToRelative(-3.09f, -1.32f)
                curveToRelative(-0.76f, -0.33f, -1.11f, -1.21f, -0.79f, -1.97f)
                curveToRelative(0.33f, -0.76f, 1.21f, -1.12f, 1.97f, -0.79f)
                lineToRelative(3.22f, 1.38f)
                horizontalLineToRelative(1.38f)
                lineToRelative(3.22f, -1.38f)
                curveToRelative(0.76f, -0.33f, 1.64f, 0.03f, 1.97f, 0.79f)
                close()
            }
        }
        .build()
        return _universalAccess!!
    }

private var _universalAccess: ImageVector? = null
