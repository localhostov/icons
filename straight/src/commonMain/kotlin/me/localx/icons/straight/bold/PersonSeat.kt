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

public val Icons.Bold.PersonSeat: ImageVector
    get() {
        if (_personSeat != null) {
            return _personSeat!!
        }
        _personSeat = Builder(name = "PersonSeat", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 2.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                close()
                moveTo(20.131f, 21.0f)
                lineToRelative(-2.0f, -7.0f)
                horizontalLineToRelative(-6.631f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(4.369f)
                lineToRelative(2.0f, 7.0f)
                horizontalLineToRelative(4.131f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.869f)
                close()
                moveTo(11.5f, 19.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 4.687f, 3.813f, 8.5f, 8.5f, 8.5f)
                horizontalLineToRelative(3.717f)
                lineToRelative(-0.857f, -3.0f)
                horizontalLineToRelative(-2.86f)
                close()
            }
        }
        .build()
        return _personSeat!!
    }

private var _personSeat: ImageVector? = null
