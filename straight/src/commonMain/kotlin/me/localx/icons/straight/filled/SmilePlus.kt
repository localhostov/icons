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

public val Icons.Filled.SmilePlus: ImageVector
    get() {
        if (_smilePlus != null) {
            return _smilePlus!!
        }
        _smilePlus = Builder(name = "SmilePlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(19.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 15.0f)
                curveToRelative(0.0f, 4.962f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(0.0f, 19.962f, 0.0f, 15.0f)
                reflectiveCurveTo(4.038f, 6.0f, 9.0f, 6.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                close()
                moveTo(5.0f, 13.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(12.667f, 18.545f)
                lineToRelative(-1.33f, -1.494f)
                curveToRelative(-0.011f, 0.009f, -1.097f, 0.949f, -2.337f, 0.949f)
                reflectiveCurveToRelative(-2.326f, -0.939f, -2.333f, -0.946f)
                lineToRelative(-1.333f, 1.491f)
                curveToRelative(0.067f, 0.06f, 1.651f, 1.455f, 3.667f, 1.455f)
                reflectiveCurveToRelative(3.6f, -1.395f, 3.667f, -1.455f)
                close()
                moveTo(13.0f, 13.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _smilePlus!!
    }

private var _smilePlus: ImageVector? = null
