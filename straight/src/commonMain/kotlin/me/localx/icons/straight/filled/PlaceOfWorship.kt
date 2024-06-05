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

public val Icons.Filled.PlaceOfWorship: ImageVector
    get() {
        if (_placeOfWorship != null) {
            return _placeOfWorship!!
        }
        _placeOfWorship = Builder(name = "PlaceOfWorship", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 3.756f)
                lineTo(12.0f, 0.006f)
                lineToRelative(-5.0f, 3.75f)
                verticalLineToRelative(20.244f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(13.0f, 19.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                close()
                moveTo(5.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-10.202f)
                lineToRelative(5.0f, -3.787f)
                verticalLineToRelative(13.989f)
                close()
                moveTo(24.0f, 13.537f)
                verticalLineToRelative(10.463f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-14.035f)
                lineToRelative(5.0f, 3.571f)
                close()
            }
        }
        .build()
        return _placeOfWorship!!
    }

private var _placeOfWorship: ImageVector? = null
