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

public val Icons.Outline.EnvelopeBulk: ImageVector
    get() {
        if (_envelopeBulk != null) {
            return _envelopeBulk!!
        }
        _envelopeBulk = Builder(name = "EnvelopeBulk", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(6.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineTo(3.0f, 11.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                lineTo(16.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(8.0f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(5.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(5.0f, 3.0f)
                close()
                moveTo(12.587f, 13.0f)
                lineToRelative(-3.591f, 3.591f)
                curveToRelative(-0.527f, 0.527f, -1.446f, 0.527f, -1.975f, 0.0f)
                lineToRelative(-3.591f, -3.591f)
                lineTo(12.587f, 13.0f)
                close()
                moveTo(14.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-7.602f)
                lineToRelative(3.606f, 3.607f)
                curveToRelative(0.642f, 0.642f, 1.495f, 0.995f, 2.402f, 0.995f)
                reflectiveCurveToRelative(1.761f, -0.354f, 2.402f, -0.995f)
                lineToRelative(3.59f, -3.59f)
                verticalLineToRelative(7.585f)
                close()
                moveTo(22.0f, 17.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(18.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _envelopeBulk!!
    }

private var _envelopeBulk: ImageVector? = null
