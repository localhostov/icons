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

public val Icons.Bold.PlaceOfWorship: ImageVector
    get() {
        if (_placeOfWorship != null) {
            return _placeOfWorship!!
        }
        _placeOfWorship = Builder(name = "PlaceOfWorship", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 8.679f)
                lineTo(17.0f, 3.679f)
                lineTo(12.0f, 0.042f)
                lineToRelative(-5.0f, 3.636f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 13.736f)
                verticalLineToRelative(10.264f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-10.264f)
                lineToRelative(-7.0f, -5.058f)
                close()
                moveTo(10.0f, 10.206f)
                verticalLineToRelative(-5.0f)
                lineToRelative(2.0f, -1.455f)
                lineToRelative(2.0f, 1.455f)
                verticalLineToRelative(5.0f)
                lineToRelative(2.0f, 1.455f)
                verticalLineToRelative(9.339f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.339f)
                lineToRelative(2.0f, -1.455f)
                close()
                moveTo(3.0f, 15.264f)
                lineToRelative(2.0f, -1.455f)
                verticalLineToRelative(7.191f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.736f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.191f)
                lineToRelative(2.0f, 1.455f)
                verticalLineToRelative(5.736f)
                close()
                moveTo(10.5f, 12.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _placeOfWorship!!
    }

private var _placeOfWorship: ImageVector? = null
