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

public val Icons.Outline.Tape: ImageVector
    get() {
        if (_tape != null) {
            return _tape!!
        }
        _tape = Builder(name = "Tape", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 7.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(11.0f, 15.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(17.317f, 21.0f)
                curveToRelative(2.83f, -1.992f, 4.683f, -5.284f, 4.683f, -9.0f)
                curveToRelative(0.0f, -6.065f, -4.935f, -11.0f, -11.0f, -11.0f)
                reflectiveCurveTo(0.0f, 5.935f, 0.0f, 12.0f)
                reflectiveCurveToRelative(4.935f, 11.0f, 11.0f, 11.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.683f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.037f, 6.038f, 3.0f, 11.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(2.0f, 16.963f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _tape!!
    }

private var _tape: ImageVector? = null
