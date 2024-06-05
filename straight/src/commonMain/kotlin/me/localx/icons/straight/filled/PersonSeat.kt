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

public val Icons.Filled.PersonSeat: ImageVector
    get() {
        if (_personSeat != null) {
            return _personSeat!!
        }
        _personSeat = Builder(name = "PersonSeat", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 2.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                close()
                moveTo(19.254f, 22.0f)
                lineToRelative(-2.0f, -7.0f)
                horizontalLineToRelative(-7.254f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.746f)
                lineToRelative(2.0f, 7.0f)
                horizontalLineToRelative(3.254f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.746f)
                close()
                moveTo(10.0f, 19.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.859f, 3.14f, 7.0f, 7.0f, 7.0f)
                horizontalLineToRelative(4.809f)
                lineToRelative(-0.571f, -2.0f)
                horizontalLineToRelative(-4.237f)
                close()
            }
        }
        .build()
        return _personSeat!!
    }

private var _personSeat: ImageVector? = null
