package me.localx.icons.straight.filled

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

public val Icons.Filled.Tape: ImageVector
    get() {
        if (_tape != null) {
            return _tape!!
        }
        _tape = Builder(name = "Tape", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 12.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-13.0f)
                curveTo(4.935f, 23.0f, 0.0f, 18.065f, 0.0f, 12.0f)
                reflectiveCurveTo(4.935f, 1.0f, 11.0f, 1.0f)
                reflectiveCurveToRelative(11.0f, 4.935f, 11.0f, 11.0f)
                curveToRelative(0.0f, 3.716f, -1.853f, 7.008f, -4.683f, 9.0f)
                horizontalLineToRelative(6.683f)
                close()
                moveTo(16.0f, 12.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _tape!!
    }

private var _tape: ImageVector? = null
