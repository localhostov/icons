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

public val Icons.Outline.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay = Builder(name = "Airplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-3.08f)
                lineToRelative(-1.638f, -2.0f)
                horizontalLineToRelative(2.718f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(2.717f)
                lineToRelative(-1.638f, 2.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 4.0f)
                curveTo(0.0f, 2.346f, 1.346f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(14.305f, 14.08f)
                lineToRelative(7.308f, 8.92f)
                lineTo(2.388f, 23.0f)
                lineToRelative(7.302f, -8.914f)
                curveToRelative(0.577f, -0.692f, 1.417f, -1.086f, 2.31f, -1.086f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.893f, 0.0f, 1.733f, 0.394f, 2.304f, 1.08f)
                close()
                moveTo(17.388f, 21.0f)
                lineToRelative(-4.625f, -5.646f)
                curveToRelative(-0.256f, -0.307f, -0.588f, -0.354f, -0.763f, -0.354f)
                reflectiveCurveToRelative(-0.507f, 0.047f, -0.769f, 0.359f)
                lineToRelative(-4.62f, 5.641f)
                horizontalLineToRelative(10.776f)
                close()
            }
        }
        .build()
        return _airplay!!
    }

private var _airplay: ImageVector? = null
