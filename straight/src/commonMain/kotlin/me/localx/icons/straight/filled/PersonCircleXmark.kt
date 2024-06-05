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

public val Icons.Filled.PersonCircleXmark: ImageVector
    get() {
        if (_personCircleXmark != null) {
            return _personCircleXmark!!
        }
        _personCircleXmark = Builder(name = "PersonCircleXmark", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.709f)
                curveToRelative(-1.037f, 1.175f, -1.796f, 2.656f, -2.0f, 4.291f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.637f, 0.0f, 2.971f, 1.318f, 2.999f, 2.948f)
                curveToRelative(0.0f, 0.017f, 0.001f, 0.034f, 0.001f, 0.052f)
                verticalLineToRelative(3.709f)
                close()
                moveTo(4.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(22.243f, 13.757f)
                curveToRelative(-2.343f, -2.343f, -6.142f, -2.343f, -8.485f, 0.0f)
                reflectiveCurveToRelative(-2.343f, 6.142f, 0.0f, 8.485f)
                reflectiveCurveToRelative(6.142f, 2.343f, 8.485f, 0.0f)
                reflectiveCurveToRelative(2.343f, -6.142f, 0.0f, -8.485f)
                close()
                moveTo(20.122f, 21.535f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _personCircleXmark!!
    }

private var _personCircleXmark: ImageVector? = null
