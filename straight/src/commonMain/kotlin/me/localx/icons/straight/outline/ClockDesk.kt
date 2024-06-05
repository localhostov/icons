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

public val Icons.Outline.ClockDesk: ImageVector
    get() {
        if (_clockDesk != null) {
            return _clockDesk!!
        }
        _clockDesk = Builder(name = "ClockDesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.53f, 13.348f)
                lineToRelative(-1.061f, -1.696f)
                lineToRelative(3.53f, -2.206f)
                verticalLineToRelative(-4.446f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.554f)
                lineToRelative(-4.47f, 2.794f)
                close()
                moveTo(22.0f, 9.5f)
                verticalLineToRelative(14.5f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-14.5f)
                horizontalLineToRelative(0.013f)
                curveTo(2.274f, 4.217f, 6.654f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(9.726f, 4.217f, 9.987f, 9.5f)
                horizontalLineToRelative(0.013f)
                close()
                moveTo(4.0f, 10.0f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.589f, 8.0f, -8.0f)
                reflectiveCurveTo(16.411f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(4.0f, 5.589f, 4.0f, 10.0f)
                close()
                moveTo(20.0f, 15.993f)
                curveToRelative(-1.826f, 2.431f, -4.733f, 4.007f, -8.0f, 4.007f)
                reflectiveCurveToRelative(-6.174f, -1.576f, -8.0f, -4.007f)
                verticalLineToRelative(6.007f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-6.007f)
                close()
            }
        }
        .build()
        return _clockDesk!!
    }

private var _clockDesk: ImageVector? = null
