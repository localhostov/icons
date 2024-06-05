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

public val Icons.Outline.WineGlassCrack: ImageVector
    get() {
        if (_wineGlassCrack != null) {
            return _wineGlassCrack!!
        }
        _wineGlassCrack = Builder(name = "WineGlassCrack", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                lineTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                lineTo(5.0f, 9.0f)
                curveToRelative(0.0f, 3.52f, 2.612f, 6.441f, 6.0f, 6.928f)
                verticalLineToRelative(6.072f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-6.072f)
                curveToRelative(3.388f, -0.487f, 6.0f, -3.408f, 6.0f, -6.928f)
                close()
                moveTo(7.0f, 9.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(3.523f)
                lineToRelative(-2.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-1.452f, 3.629f)
                lineToRelative(1.857f, 0.742f)
                lineToRelative(2.548f, -6.371f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(1.2f, -3.0f)
                horizontalLineToRelative(4.323f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _wineGlassCrack!!
    }

private var _wineGlassCrack: ImageVector? = null
