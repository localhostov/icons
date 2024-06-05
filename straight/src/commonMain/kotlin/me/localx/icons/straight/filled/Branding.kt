package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Branding: ImageVector
    get() {
        if (_branding != null) {
            return _branding!!
        }
        _branding = Builder(name = "Branding", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.88f, 20.034f)
                curveToRelative(-0.656f, 0.656f, -1.518f, 0.984f, -2.38f, 0.984f)
                reflectiveCurveToRelative(-1.724f, -0.328f, -2.38f, -0.984f)
                lineToRelative(-3.959f, -3.959f)
                curveToRelative(-0.096f, 0.293f, -0.161f, 0.6f, -0.161f, 0.925f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.325f, -0.065f, -0.632f, -0.161f, -0.925f)
                lineToRelative(-3.959f, 3.959f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 0.586f)
                lineToRelative(0.0f, 5.414f)
                lineToRelative(5.414f, 0.0f)
                lineToRelative(-5.414f, -5.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 0.0f)
                curveTo(0.895f, 0.0f, 0.0f, 0.895f, 0.0f, 2.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(2.0f, -2.0f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 8.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(10.026f)
                curveToRelative(0.838f, -0.635f, 1.87f, -1.026f, 3.0f, -1.026f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.466f, 18.62f)
                lineToRelative(4.143f, -4.143f)
                curveToRelative(-0.466f, -0.298f, -1.016f, -0.477f, -1.609f, -0.477f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.593f, 0.0f, -1.143f, 0.178f, -1.609f, 0.477f)
                lineToRelative(4.143f, 4.143f)
                curveToRelative(0.533f, 0.533f, 1.398f, 0.533f, 1.932f, 0.0f)
                close()
            }
        }
        .build()
        return _branding!!
    }

private var _branding: ImageVector? = null
