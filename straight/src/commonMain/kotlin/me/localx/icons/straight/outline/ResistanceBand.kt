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

public val Icons.Outline.ResistanceBand: ImageVector
    get() {
        if (_resistanceBand != null) {
            return _resistanceBand!!
        }
        _resistanceBand = Builder(name = "ResistanceBand", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 16.142f)
                verticalLineToRelative(-7.142f)
                curveTo(21.0f, 4.037f, 16.962f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(2.086f, 0.0f, 3.924f, -1.071f, 5.0f, -2.69f)
                verticalLineToRelative(-0.31f)
                curveToRelative(0.0f, -1.117f, -0.381f, -2.139f, -1.003f, -2.972f)
                curveToRelative(-0.015f, 2.193f, -1.801f, 3.972f, -3.997f, 3.972f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.141f, 7.0f, 7.0f)
                verticalLineToRelative(7.142f)
                curveToRelative(-1.72f, 0.447f, -3.0f, 1.999f, -3.0f, 3.858f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.859f, -1.28f, -3.411f, -3.0f, -3.858f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(5.0f, 16.142f)
                verticalLineToRelative(-6.278f)
                curveToRelative(-0.636f, -1.147f, -1.0f, -2.463f, -1.0f, -3.864f)
                curveToRelative(0.0f, -0.458f, 0.047f, -0.905f, 0.122f, -1.342f)
                curveToRelative(-0.713f, 1.289f, -1.122f, 2.768f, -1.122f, 4.342f)
                verticalLineToRelative(7.142f)
                curveToRelative(-1.72f, 0.447f, -3.0f, 1.999f, -3.0f, 3.858f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.859f, -1.28f, -3.411f, -3.0f, -3.858f)
                close()
                moveTo(6.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _resistanceBand!!
    }

private var _resistanceBand: ImageVector? = null
