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
                moveTo(14.0f, 11.7f)
                verticalLineToRelative(1.45f)
                lineToRelative(2.34f, 4.68f)
                lineToRelative(-2.68f, 1.34f)
                lineToRelative(-1.59f, -3.17f)
                horizontalLineToRelative(-0.15f)
                lineToRelative(-1.59f, 3.17f)
                lineToRelative(-2.68f, -1.34f)
                lineToRelative(2.34f, -4.68f)
                verticalLineToRelative(-1.45f)
                lineToRelative(-4.11f, -1.83f)
                lineToRelative(1.22f, -2.74f)
                lineToRelative(4.21f, 1.87f)
                horizontalLineToRelative(1.36f)
                lineToRelative(4.21f, -1.87f)
                lineToRelative(1.22f, 2.74f)
                lineToRelative(-4.11f, 1.83f)
                close()
            }
        }
        .build()
        return _universalAccess!!
    }

private var _universalAccess: ImageVector? = null
