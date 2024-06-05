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

public val Icons.Outline.PlaceOfWorship: ImageVector
    get() {
        if (_placeOfWorship != null) {
            return _placeOfWorship!!
        }
        _placeOfWorship = Builder(name = "PlaceOfWorship", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 8.537f)
                lineTo(17.0f, 3.756f)
                lineTo(12.0f, 0.006f)
                lineToRelative(-5.0f, 3.75f)
                verticalLineToRelative(4.74f)
                lineTo(0.0f, 13.798f)
                verticalLineToRelative(10.202f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-10.463f)
                lineToRelative(-7.0f, -5.0f)
                close()
                moveTo(9.0f, 9.491f)
                verticalLineToRelative(-4.734f)
                lineToRelative(3.0f, -2.25f)
                lineToRelative(3.0f, 2.25f)
                verticalLineToRelative(4.81f)
                lineToRelative(2.0f, 1.429f)
                verticalLineToRelative(11.005f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-10.995f)
                lineToRelative(2.0f, -1.515f)
                close()
                moveTo(13.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(2.0f, 14.792f)
                lineToRelative(3.0f, -2.272f)
                verticalLineToRelative(9.48f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.208f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.577f)
                lineToRelative(3.0f, 2.143f)
                verticalLineToRelative(7.434f)
                close()
                moveTo(10.5f, 11.5f)
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
