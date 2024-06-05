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

public val Icons.Outline.GrinStars: ImageVector
    get() {
        if (_grinStars != null) {
            return _grinStars!!
        }
        _grinStars = Builder(name = "GrinStars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(11.993f, 15.0f)
                arcTo(21.923f, 21.923f, 0.0f, false, false, 18.0f, 14.0f)
                curveToRelative(-0.615f, 2.28f, -2.664f, 5.0f, -6.0f, 5.0f)
                reflectiveCurveToRelative(-5.392f, -2.72f, -6.007f, -5.0f)
                arcTo(21.841f, 21.841f, 0.0f, false, false, 11.993f, 15.0f)
                close()
                moveTo(16.386f, 6.0f)
                lineTo(17.038f, 8.005f)
                horizontalLineToRelative(2.109f)
                lineToRelative(0.3f, 0.918f)
                lineToRelative(-1.706f, 1.24f)
                lineToRelative(0.652f, 2.006f)
                lineToRelative(-0.781f, 0.567f)
                lineTo(15.9f, 11.5f)
                lineTo(14.2f, 12.737f)
                lineToRelative(-0.781f, -0.567f)
                lineToRelative(0.652f, -2.006f)
                lineToRelative(-1.706f, -1.24f)
                lineToRelative(0.3f, -0.918f)
                horizontalLineToRelative(2.109f)
                lineToRelative(0.652f, -2.0f)
                close()
                moveTo(8.579f, 6.0f)
                lineToRelative(0.652f, 2.005f)
                lineTo(11.34f, 8.005f)
                lineToRelative(0.3f, 0.918f)
                lineToRelative(-1.706f, 1.24f)
                lineToRelative(0.652f, 2.006f)
                lineToRelative(-0.781f, 0.567f)
                lineTo(8.1f, 11.5f)
                lineTo(6.39f, 12.737f)
                lineToRelative(-0.781f, -0.567f)
                lineToRelative(0.652f, -2.006f)
                lineTo(4.555f, 8.924f)
                lineToRelative(0.3f, -0.918f)
                lineTo(6.962f, 8.006f)
                lineToRelative(0.652f, -2.0f)
                close()
            }
        }
        .build()
        return _grinStars!!
    }

private var _grinStars: ImageVector? = null
