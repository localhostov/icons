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
                moveTo(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                reflectiveCurveTo(18.62f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.51f, 0.0f, -10.0f, -4.49f, -10.0f, -10.0f)
                reflectiveCurveTo(6.49f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.49f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.49f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(10.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                close()
                moveTo(14.0f, 10.68f)
                verticalLineToRelative(3.53f)
                lineToRelative(1.92f, 4.4f)
                lineToRelative(-1.83f, 0.8f)
                lineToRelative(-1.92f, -4.4f)
                horizontalLineToRelative(-0.33f)
                lineToRelative(-1.92f, 4.4f)
                lineToRelative(-1.83f, -0.8f)
                lineToRelative(1.92f, -4.4f)
                verticalLineToRelative(-3.53f)
                lineToRelative(-4.37f, -1.75f)
                lineToRelative(0.74f, -1.86f)
                lineToRelative(4.82f, 1.93f)
                horizontalLineToRelative(1.62f)
                lineToRelative(4.82f, -1.93f)
                lineToRelative(0.74f, 1.86f)
                lineToRelative(-4.37f, 1.75f)
                close()
            }
        }
        .build()
        return _universalAccess!!
    }

private var _universalAccess: ImageVector? = null
