package me.localx.icons.rounded.outline

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

public val Icons.Outline.UniversalAccess: ImageVector
    get() {
        if (_universalAccess != null) {
            return _universalAccess!!
        }
        _universalAccess = Builder(name = "UniversalAccess", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.62f, -5.38f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.62f, 0.0f, 12.0f)
                reflectiveCurveTo(5.38f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.38f, 12.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -5.51f, -4.49f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.49f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.49f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.49f, 10.0f, -10.0f)
                close()
                moveTo(16.55f, 7.11f)
                lineToRelative(-3.79f, 1.89f)
                horizontalLineToRelative(-1.53f)
                lineToRelative(-3.79f, -1.89f)
                curveToRelative(-0.5f, -0.25f, -1.09f, -0.05f, -1.34f, 0.45f)
                curveToRelative(-0.25f, 0.49f, -0.05f, 1.09f, 0.45f, 1.34f)
                lineToRelative(3.45f, 1.72f)
                verticalLineToRelative(3.53f)
                lineToRelative(-1.87f, 3.36f)
                curveToRelative(-0.27f, 0.48f, -0.1f, 1.09f, 0.39f, 1.36f)
                curveToRelative(0.15f, 0.09f, 0.32f, 0.13f, 0.49f, 0.13f)
                curveToRelative(0.35f, 0.0f, 0.69f, -0.19f, 0.87f, -0.51f)
                lineToRelative(1.94f, -3.49f)
                horizontalLineToRelative(0.37f)
                lineToRelative(1.94f, 3.49f)
                curveToRelative(0.18f, 0.33f, 0.52f, 0.51f, 0.87f, 0.51f)
                curveToRelative(0.17f, 0.0f, 0.33f, -0.04f, 0.49f, -0.13f)
                curveToRelative(0.48f, -0.27f, 0.66f, -0.88f, 0.39f, -1.36f)
                lineToRelative(-1.87f, -3.36f)
                verticalLineToRelative(-3.53f)
                lineToRelative(3.45f, -1.72f)
                curveToRelative(0.49f, -0.25f, 0.69f, -0.85f, 0.45f, -1.34f)
                curveToRelative(-0.25f, -0.49f, -0.85f, -0.69f, -1.34f, -0.45f)
                close()
            }
        }
        .build()
        return _universalAccess!!
    }

private var _universalAccess: ImageVector? = null
