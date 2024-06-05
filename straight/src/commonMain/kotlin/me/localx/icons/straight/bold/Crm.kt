package me.localx.icons.straight.bold

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

public val Icons.Bold.Crm: ImageVector
    get() {
        if (_crm != null) {
            return _crm!!
        }
        _crm = Builder(name = "Crm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.25f, 10.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(0.5f)
                lineToRelative(1.0f, 4.0f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-1.217f, -4.867f)
                curveToRelative(0.739f, -0.642f, 1.217f, -1.577f, 1.217f, -2.633f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(3.5f, 15.5f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.567f, -3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(17.763f, 18.0f)
                lineToRelative(0.325f, -4.789f)
                lineToRelative(1.558f, 3.101f)
                lineToRelative(1.523f, -3.067f)
                lineToRelative(0.327f, 4.755f)
                horizontalLineToRelative(2.506f)
                lineToRelative(-0.668f, -9.703f)
                curveToRelative(-0.053f, -0.914f, -0.586f, -1.297f, -1.225f, -1.297f)
                curveToRelative(-0.424f, 0.0f, -0.818f, 0.314f, -1.043f, 0.831f)
                lineToRelative(-1.434f, 2.887f)
                lineToRelative(-1.451f, -2.887f)
                curveToRelative(-0.224f, -0.517f, -0.619f, -0.831f, -1.043f, -0.831f)
                curveToRelative(-0.639f, 0.0f, -1.172f, 0.383f, -1.224f, 1.297f)
                lineToRelative(-0.658f, 9.703f)
                horizontalLineToRelative(2.506f)
                close()
            }
        }
        .build()
        return _crm!!
    }

private var _crm: ImageVector? = null
