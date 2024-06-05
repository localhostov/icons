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

public val Icons.Outline.ToiletPaperSlash: ImageVector
    get() {
        if (_toiletPaperSlash != null) {
            return _toiletPaperSlash!!
        }
        _toiletPaperSlash = Builder(name = "ToiletPaperSlash", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 8.5f)
                curveToRelative(0.0f, -1.381f, 0.448f, -2.5f, 1.0f, -2.5f)
                reflectiveCurveToRelative(1.0f, 1.119f, 1.0f, 2.5f)
                reflectiveCurveToRelative(-0.448f, 2.5f, -1.0f, 2.5f)
                reflectiveCurveToRelative(-1.0f, -1.119f, -1.0f, -2.5f)
                close()
                moveTo(18.414f, 17.0f)
                lineToRelative(5.543f, 5.543f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(2.049f, 2.049f)
                curveToRelative(0.918f, -1.342f, 2.152f, -2.092f, 3.494f, -2.092f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.804f, 0.0f, 5.0f, 3.733f, 5.0f, 8.5f)
                reflectiveCurveToRelative(-2.196f, 8.5f, -5.0f, 8.5f)
                horizontalLineToRelative(-0.586f)
                close()
                moveTo(19.0f, 2.0f)
                curveToRelative(-1.419f, 0.0f, -3.0f, 2.67f, -3.0f, 6.5f)
                reflectiveCurveToRelative(1.581f, 6.5f, 3.0f, 6.5f)
                reflectiveCurveToRelative(3.0f, -2.67f, 3.0f, -6.5f)
                reflectiveCurveToRelative(-1.581f, -6.5f, -3.0f, -6.5f)
                close()
                moveTo(4.956f, 3.542f)
                lineToRelative(9.044f, 9.044f)
                verticalLineToRelative(-4.086f)
                curveToRelative(0.0f, -2.634f, 0.671f, -4.953f, 1.745f, -6.5f)
                lineTo(7.0f, 2.0f)
                curveToRelative(-0.734f, 0.0f, -1.478f, 0.569f, -2.044f, 1.542f)
                close()
                moveTo(14.0f, 20.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                lineTo(3.463f, 22.0f)
                curveToRelative(0.342f, -0.589f, 0.537f, -1.272f, 0.537f, -2.0f)
                verticalLineToRelative(-11.758f)
                lineToRelative(-1.939f, -1.939f)
                curveToRelative(-0.041f, 0.392f, -0.061f, 0.792f, -0.061f, 1.197f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.127f, 0.0f, 3.871f, -1.668f, 3.993f, -3.765f)
                lineToRelative(-1.993f, -1.993f)
                verticalLineToRelative(1.758f)
                close()
            }
        }
        .build()
        return _toiletPaperSlash!!
    }

private var _toiletPaperSlash: ImageVector? = null
