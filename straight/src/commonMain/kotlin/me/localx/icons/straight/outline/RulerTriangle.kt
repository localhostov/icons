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

public val Icons.Outline.RulerTriangle: ImageVector
    get() {
        if (_rulerTriangle != null) {
            return _rulerTriangle!!
        }
        _rulerTriangle = Builder(name = "RulerTriangle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.288f, 19.874f)
                lineTo(4.126f, 0.712f)
                curveTo(3.432f, 0.018f, 2.398f, -0.187f, 1.492f, 0.188f)
                curveTo(0.585f, 0.563f, 0.0f, 1.439f, 0.0f, 2.421f)
                lineTo(0.0f, 24.0f)
                lineTo(21.579f, 24.0f)
                curveToRelative(0.981f, 0.0f, 1.857f, -0.586f, 2.233f, -1.492f)
                reflectiveCurveToRelative(0.17f, -1.94f, -0.524f, -2.634f)
                close()
                moveTo(21.964f, 21.743f)
                curveToRelative(-0.04f, 0.096f, -0.143f, 0.257f, -0.385f, 0.257f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 2.421f)
                curveToRelative(0.0f, -0.242f, 0.161f, -0.346f, 0.257f, -0.386f)
                curveToRelative(0.096f, -0.037f, 0.283f, -0.081f, 0.455f, 0.091f)
                lineToRelative(3.191f, 3.191f)
                lineToRelative(-1.871f, 1.871f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.871f, -1.871f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.872f, 1.871f)
                lineToRelative(0.052f, 0.052f)
                horizontalLineToRelative(0.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.871f, -1.872f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.871f, 1.871f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.871f, -1.871f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.872f, 1.871f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.872f, -1.871f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.871f, 1.872f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.871f, -1.872f)
                lineToRelative(3.191f, 3.191f)
                curveToRelative(0.171f, 0.172f, 0.13f, 0.358f, 0.09f, 0.455f)
                close()
                moveTo(6.0f, 12.586f)
                lineToRelative(5.414f, 5.414f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-5.414f)
                close()
            }
        }
        .build()
        return _rulerTriangle!!
    }

private var _rulerTriangle: ImageVector? = null
