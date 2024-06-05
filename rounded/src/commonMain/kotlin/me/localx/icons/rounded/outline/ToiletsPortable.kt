package me.localx.icons.rounded.outline

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

public val Icons.Outline.ToiletsPortable: ImageVector
    get() {
        if (_toiletsPortable != null) {
            return _toiletsPortable!!
        }
        _toiletsPortable = Builder(name = "ToiletsPortable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.904f, 0.694f)
                curveToRelative(-2.318f, -0.922f, -4.49f, -0.922f, -6.809f, 0.0f)
                curveToRelative(-0.85f, 0.337f, -1.563f, 0.919f, -2.096f, 1.639f)
                curveToRelative(-0.532f, -0.719f, -1.245f, -1.301f, -2.096f, -1.639f)
                curveTo(7.586f, -0.228f, 5.414f, -0.228f, 3.096f, 0.694f)
                curveTo(1.244f, 1.429f, 0.0f, 3.288f, 0.0f, 5.32f)
                verticalLineToRelative(17.68f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(24.0f, 5.32f)
                curveToRelative(0.0f, -2.032f, -1.244f, -3.891f, -3.096f, -4.625f)
                close()
                moveTo(14.834f, 2.552f)
                curveToRelative(1.848f, -0.733f, 3.484f, -0.733f, 5.332f, 0.0f)
                curveToRelative(1.0f, 0.397f, 1.694f, 1.357f, 1.81f, 2.447f)
                horizontalLineToRelative(-8.952f)
                curveToRelative(0.116f, -1.09f, 0.81f, -2.05f, 1.81f, -2.447f)
                close()
                moveTo(3.834f, 2.552f)
                curveToRelative(1.848f, -0.733f, 3.484f, -0.733f, 5.332f, 0.0f)
                curveToRelative(1.0f, 0.397f, 1.694f, 1.357f, 1.81f, 2.447f)
                lineTo(2.024f, 4.999f)
                curveToRelative(0.116f, -1.09f, 0.81f, -2.05f, 1.81f, -2.447f)
                close()
                moveTo(2.0f, 19.999f)
                lineTo(2.0f, 7.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 20.0f)
                close()
                moveTo(13.0f, 19.999f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _toiletsPortable!!
    }

private var _toiletsPortable: ImageVector? = null
