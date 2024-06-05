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

public val Icons.Outline.BonusStar: ImageVector
    get() {
        if (_bonusStar != null) {
            return _bonusStar!!
        }
        _bonusStar = Builder(name = "BonusStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 6.065f, -4.935f, 11.0f, -11.0f, 11.0f)
                reflectiveCurveTo(1.0f, 19.065f, 1.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                close()
                moveTo(9.509f, 6.033f)
                lineToRelative(0.795f, 0.55f)
                lineToRelative(1.696f, -1.185f)
                lineToRelative(1.695f, 1.181f)
                lineToRelative(0.81f, -0.549f)
                lineToRelative(-0.638f, -1.937f)
                lineToRelative(1.607f, -1.123f)
                lineToRelative(-0.244f, -0.974f)
                horizontalLineToRelative(-2.119f)
                lineToRelative(-0.521f, -1.995f)
                horizontalLineToRelative(-1.173f)
                lineToRelative(-0.522f, 1.995f)
                horizontalLineToRelative(-2.13f)
                lineToRelative(-0.242f, 0.982f)
                lineToRelative(1.605f, 1.118f)
                lineToRelative(-0.62f, 1.938f)
                close()
                moveTo(24.0f, 6.969f)
                lineToRelative(-0.244f, -0.974f)
                horizontalLineToRelative(-2.119f)
                lineToRelative(-0.521f, -1.995f)
                horizontalLineToRelative(-1.173f)
                lineToRelative(-0.522f, 1.995f)
                horizontalLineToRelative(-2.13f)
                lineToRelative(-0.242f, 0.982f)
                lineToRelative(1.605f, 1.118f)
                lineToRelative(-0.62f, 1.938f)
                lineToRelative(0.795f, 0.55f)
                lineToRelative(1.696f, -1.185f)
                lineToRelative(1.695f, 1.181f)
                lineToRelative(0.81f, -0.549f)
                lineToRelative(-0.638f, -1.937f)
                lineToRelative(1.607f, -1.123f)
                close()
                moveTo(1.781f, 10.583f)
                lineToRelative(1.696f, -1.185f)
                lineToRelative(1.695f, 1.181f)
                lineToRelative(0.81f, -0.549f)
                lineToRelative(-0.638f, -1.937f)
                lineToRelative(1.607f, -1.123f)
                lineToRelative(-0.244f, -0.974f)
                horizontalLineToRelative(-2.119f)
                lineToRelative(-0.521f, -1.995f)
                horizontalLineToRelative(-1.173f)
                lineToRelative(-0.522f, 1.995f)
                lineTo(0.242f, 5.996f)
                lineToRelative(-0.242f, 0.982f)
                lineToRelative(1.605f, 1.118f)
                lineToRelative(-0.62f, 1.938f)
                lineToRelative(0.795f, 0.55f)
                close()
                moveTo(15.0f, 12.0f)
                curveToRelative(0.0f, 0.535f, -0.141f, 1.037f, -0.386f, 1.472f)
                curveToRelative(0.833f, 0.534f, 1.386f, 1.468f, 1.386f, 2.528f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.0f, 16.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _bonusStar!!
    }

private var _bonusStar: ImageVector? = null
