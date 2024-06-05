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

public val Icons.Filled.Replay5: ImageVector
    get() {
        if (_replay5 != null) {
            return _replay5!!
        }
        _replay5 = Builder(name = "Replay5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(11.0f, 6.0f)
                close()
                moveTo(2.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.335f, 7.0f)
                curveToRelative(1.766f, -3.079f, 5.026f, -5.0f, 8.665f, -5.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, 4.486f, 10.0f, 10.0f)
                curveToRelative(0.0f, 0.339f, -0.033f, 0.67f, -0.069f, 1.0f)
                horizontalLineToRelative(2.025f)
                curveToRelative(0.028f, -0.33f, 0.044f, -0.663f, 0.044f, -1.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                curveTo(7.891f, 0.0f, 4.189f, 2.044f, 2.0f, 5.362f)
                lineTo(2.0f, 2.0f)
                lineTo(0.0f, 2.0f)
                lineTo(0.0f, 7.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(2.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(1.404f, 0.0f, 2.747f, -0.255f, 4.0f, -0.7f)
                verticalLineToRelative(-2.141f)
                curveToRelative(-1.226f, 0.538f, -2.578f, 0.841f, -4.0f, 0.841f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                close()
                moveTo(21.0f, 18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _replay5!!
    }

private var _replay5: ImageVector? = null
