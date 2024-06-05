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

public val Icons.Filled.RulerTriangle: ImageVector
    get() {
        if (_rulerTriangle != null) {
            return _rulerTriangle!!
        }
        _rulerTriangle = Builder(name = "RulerTriangle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.291f, 19.874f)
                lineToRelative(-3.192f, -3.192f)
                lineToRelative(-2.497f, 2.498f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.497f, -2.498f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.497f, 2.497f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.497f, -2.497f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.497f, 2.497f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.497f, -2.497f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.497f, 2.498f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.497f, -2.498f)
                lineToRelative(-1.466f, -1.466f)
                lineToRelative(-2.497f, 2.497f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.497f, -2.497f)
                lineTo(4.129f, 0.712f)
                curveTo(3.435f, 0.018f, 2.401f, -0.187f, 1.495f, 0.188f)
                curveTo(0.588f, 0.563f, 0.003f, 1.439f, 0.003f, 2.421f)
                lineTo(0.003f, 24.0f)
                lineTo(21.582f, 24.0f)
                curveToRelative(0.981f, 0.0f, 1.857f, -0.586f, 2.233f, -1.492f)
                reflectiveCurveToRelative(0.17f, -1.94f, -0.524f, -2.634f)
                close()
                moveTo(6.003f, 18.0f)
                verticalLineToRelative(-5.414f)
                lineToRelative(5.414f, 5.414f)
                lineTo(6.003f, 18.0f)
                close()
            }
        }
        .build()
        return _rulerTriangle!!
    }

private var _rulerTriangle: ImageVector? = null
