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

public val Icons.Filled.MoneyCheckEditAlt: ImageVector
    get() {
        if (_moneyCheckEditAlt != null) {
            return _moneyCheckEditAlt!!
        }
        _moneyCheckEditAlt = Builder(name = "MoneyCheckEditAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.001f, 14.537f)
                curveToRelative(0.0f, 0.678f, -0.264f, 1.316f, -0.744f, 1.795f)
                lineToRelative(-7.667f, 7.667f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-3.59f)
                lineToRelative(7.668f, -7.667f)
                curveToRelative(0.99f, -0.99f, 2.6f, -0.99f, 3.59f, 0.0f)
                curveToRelative(0.479f, 0.479f, 0.744f, 1.117f, 0.744f, 1.795f)
                close()
                moveTo(10.0f, 19.581f)
                verticalLineToRelative(2.419f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(5.773f)
                curveToRelative(-0.743f, -0.503f, -1.619f, -0.773f, -2.537f, -0.773f)
                curveToRelative(-1.048f, 0.0f, -2.041f, 0.352f, -2.843f, 1.0f)
                horizontalLineToRelative(-4.62f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.582f)
                lineToRelative(-6.582f, 6.581f)
                close()
                moveTo(14.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(2.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _moneyCheckEditAlt!!
    }

private var _moneyCheckEditAlt: ImageVector? = null
