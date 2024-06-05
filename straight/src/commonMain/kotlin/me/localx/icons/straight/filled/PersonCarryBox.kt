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

public val Icons.Filled.PersonCarryBox: ImageVector
    get() {
        if (_personCarryBox != null) {
            return _personCarryBox!!
        }
        _personCarryBox = Builder(name = "PersonCarryBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 5.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1.767f)
                lineToRelative(-1.671f, -3.341f)
                curveToRelative(-0.511f, -1.023f, -1.539f, -1.659f, -2.683f, -1.659f)
                horizontalLineToRelative(-1.379f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(5.661f)
                curveToRelative(0.0f, 0.875f, 0.445f, 1.671f, 1.202f, 2.137f)
                lineToRelative(3.798f, 2.27f)
                verticalLineToRelative(5.433f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.567f)
                lineToRelative(-2.0f, -1.195f)
                verticalLineToRelative(-7.232f)
                lineToRelative(1.997f, 3.994f)
                horizontalLineToRelative(8.503f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(4.0f, 18.507f)
                lineToRelative(2.0f, 1.195f)
                verticalLineToRelative(4.298f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.493f)
                close()
            }
        }
        .build()
        return _personCarryBox!!
    }

private var _personCarryBox: ImageVector? = null
