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

public val Icons.Filled.HoseReel: ImageVector
    get() {
        if (_hoseReel != null) {
            return _hoseReel!!
        }
        _hoseReel = Builder(name = "HoseReel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 4.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(11.0f, 16.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(13.0f, 11.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(23.987f, 16.135f)
                lineToRelative(-1.461f, 7.865f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-1.461f, -7.865f)
                curveToRelative(-0.099f, -0.594f, 0.359f, -1.135f, 0.961f, -1.135f)
                horizontalLineToRelative(0.975f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -4.963f, -4.038f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(2.0f, 6.037f, 2.0f, 11.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                curveToRelative(2.031f, 0.0f, 3.901f, -0.684f, 5.409f, -1.824f)
                lineToRelative(0.399f, 2.148f)
                curveToRelative(-1.688f, 1.055f, -3.675f, 1.676f, -5.808f, 1.676f)
                curveTo(4.935f, 22.0f, 0.0f, 17.065f, 0.0f, 11.0f)
                reflectiveCurveTo(4.935f, 0.0f, 11.0f, 0.0f)
                reflectiveCurveToRelative(11.0f, 4.935f, 11.0f, 11.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.025f)
                curveToRelative(0.602f, 0.0f, 1.06f, 0.541f, 0.961f, 1.135f)
                close()
            }
        }
        .build()
        return _hoseReel!!
    }

private var _hoseReel: ImageVector? = null
