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

public val Icons.Filled.FaceLying: ImageVector
    get() {
        if (_faceLying != null) {
            return _faceLying!!
        }
        _faceLying = Builder(name = "FaceLying", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.54f, 0.0f, 2.798f, 1.171f, 2.966f, 2.667f)
                curveToRelative(0.012f, -0.222f, 0.034f, -0.442f, 0.034f, -0.667f)
                curveTo(24.0f, 5.373f, 18.627f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(5.954f, 0.0f, 10.881f, -4.341f, 11.824f, -10.027f)
                curveToRelative(-0.406f, 1.175f, -1.512f, 2.027f, -2.824f, 2.027f)
                close()
                moveTo(15.5f, 6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(8.5f, 6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-2.331f, 0.0f, -4.316f, 1.73f, -4.336f, 1.747f)
                lineToRelative(-1.33f, -1.493f)
                curveToRelative(0.103f, -0.092f, 2.559f, -2.254f, 5.666f, -2.254f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _faceLying!!
    }

private var _faceLying: ImageVector? = null
