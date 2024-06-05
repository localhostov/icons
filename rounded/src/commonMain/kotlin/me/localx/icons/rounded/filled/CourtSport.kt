package me.localx.icons.rounded.filled

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

public val Icons.Filled.CourtSport: ImageVector
    get() {
        if (_courtSport != null) {
            return _courtSport!!
        }
        _courtSport = Builder(name = "CourtSport", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 14.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(3.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(21.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(19.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(5.142f)
                curveToRelative(1.72f, 0.447f, 3.0f, 1.999f, 3.0f, 3.858f)
                reflectiveCurveToRelative(-1.28f, 3.411f, -3.0f, 3.858f)
                verticalLineToRelative(5.142f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(11.0f, 15.858f)
                curveToRelative(-1.72f, -0.447f, -3.0f, -1.999f, -3.0f, -3.858f)
                reflectiveCurveToRelative(1.28f, -3.411f, 3.0f, -3.858f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveTo(2.243f, 3.0f, 0.0f, 5.243f, 0.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                lineTo(0.0f, 16.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5.142f)
                close()
            }
        }
        .build()
        return _courtSport!!
    }

private var _courtSport: ImageVector? = null
