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

public val Icons.Filled.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) {
            return _piggyBank!!
        }
        _piggyBank = Builder(name = "PiggyBank", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.02f, 4.199f)
                curveToRelative(-0.003f, -0.067f, -0.02f, -0.131f, -0.02f, -0.199f)
                curveTo(7.0f, 1.791f, 8.791f, 0.0f, 11.0f, 0.0f)
                reflectiveCurveToRelative(4.0f, 1.791f, 4.0f, 4.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.678f, 0.0f, -1.34f, 0.069f, -1.98f, 0.199f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.587f)
                curveToRelative(-0.665f, 1.634f, -1.868f, 3.013f, -3.413f, 3.908f)
                verticalLineToRelative(3.092f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 24.0f)
                verticalLineToRelative(-3.08f)
                curveToRelative(-2.449f, -1.42f, -4.0f, -4.07f, -4.0f, -6.92f)
                curveToRelative(0.0f, -1.176f, 0.262f, -2.291f, 0.72f, -3.298f)
                curveToRelative(-1.013f, -0.482f, -1.72f, -1.508f, -1.72f, -2.702f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.479f, 0.346f, 0.862f, 0.796f, 0.959f)
                curveToRelative(1.468f, -1.803f, 3.703f, -2.959f, 6.204f, -2.959f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.115f, 0.0f, 0.226f, 0.021f, 0.341f, 0.026f)
                curveToRelative(1.109f, -3.01f, 4.659f, -3.026f, 4.659f, -3.026f)
                lineTo(20.0f, 7.811f)
                curveToRelative(1.043f, 0.839f, 1.896f, 1.915f, 2.414f, 3.189f)
                horizontalLineToRelative(1.586f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
