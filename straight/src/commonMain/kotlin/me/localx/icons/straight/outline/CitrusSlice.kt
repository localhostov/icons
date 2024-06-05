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

public val Icons.Outline.CitrusSlice: ImageVector
    get() {
        if (_citrusSlice != null) {
            return _citrusSlice!!
        }
        _citrusSlice = Builder(name = "CitrusSlice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.979f, 0.793f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(0.086f, 19.272f)
                lineToRelative(0.707f, 0.707f)
                curveToRelative(2.645f, 2.645f, 6.119f, 3.967f, 9.593f, 3.967f)
                reflectiveCurveToRelative(6.948f, -1.322f, 9.593f, -3.967f)
                curveToRelative(2.562f, -2.562f, 3.974f, -5.969f, 3.974f, -9.593f)
                reflectiveCurveToRelative(-1.411f, -7.03f, -3.974f, -9.593f)
                close()
                moveTo(11.0f, 12.414f)
                lineToRelative(6.823f, 6.824f)
                curveToRelative(-1.977f, 1.664f, -4.383f, 2.559f, -6.823f, 2.687f)
                verticalLineToRelative(-9.511f)
                close()
                moveTo(12.414f, 11.0f)
                horizontalLineToRelative(9.508f)
                curveToRelative(-0.132f, 2.525f, -1.062f, 4.898f, -2.685f, 6.823f)
                lineToRelative(-6.823f, -6.823f)
                close()
                moveTo(21.86f, 9.0f)
                horizontalLineToRelative(-8.675f)
                lineToRelative(6.055f, -6.056f)
                curveToRelative(1.458f, 1.728f, 2.354f, 3.82f, 2.619f, 6.056f)
                close()
                moveTo(9.0f, 13.186f)
                verticalLineToRelative(8.67f)
                curveToRelative(-2.173f, -0.26f, -4.287f, -1.126f, -6.056f, -2.614f)
                lineToRelative(6.056f, -6.056f)
                close()
            }
        }
        .build()
        return _citrusSlice!!
    }

private var _citrusSlice: ImageVector? = null
