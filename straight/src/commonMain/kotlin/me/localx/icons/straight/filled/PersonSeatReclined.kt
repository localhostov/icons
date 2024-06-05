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

public val Icons.Filled.PersonSeatReclined: ImageVector
    get() {
        if (_personSeatReclined != null) {
            return _personSeatReclined!!
        }
        _personSeatReclined = Builder(name = "PersonSeatReclined", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.646f, 19.0f)
                lineToRelative(1.0f, 2.0f)
                horizontalLineToRelative(-6.795f)
                curveToRelative(-3.279f, 0.0f, -6.158f, -2.327f, -6.845f, -5.533f)
                lineTo(0.191f, 7.0f)
                horizontalLineToRelative(2.046f)
                lineToRelative(1.725f, 8.047f)
                curveToRelative(0.491f, 2.291f, 2.546f, 3.953f, 4.889f, 3.953f)
                horizontalLineToRelative(5.795f)
                close()
                moveTo(20.618f, 22.0f)
                lineToRelative(-3.5f, -7.0f)
                horizontalLineToRelative(-8.171f)
                curveToRelative(-0.475f, 0.0f, -0.887f, -0.338f, -0.98f, -0.804f)
                lineToRelative(-0.439f, -2.196f)
                horizontalLineToRelative(7.473f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.873f)
                lineToRelative(-0.6f, -3.0f)
                horizontalLineToRelative(-2.039f)
                lineToRelative(1.518f, 7.589f)
                curveToRelative(0.279f, 1.397f, 1.517f, 2.411f, 2.941f, 2.411f)
                horizontalLineToRelative(6.935f)
                lineToRelative(3.5f, 7.0f)
                horizontalLineToRelative(3.618f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.382f)
                close()
                moveTo(5.5f, 5.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveTo(6.878f, 0.0f, 5.5f, 0.0f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.121f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _personSeatReclined!!
    }

private var _personSeatReclined: ImageVector? = null
