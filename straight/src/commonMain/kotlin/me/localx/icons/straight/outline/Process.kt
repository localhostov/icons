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

public val Icons.Outline.Process: ImageVector
    get() {
        if (_process != null) {
            return _process!!
        }
        _process = Builder(name = "Process", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-2.971f, 0.0f, -5.817f, -1.129f, -8.0f, -3.08f)
                verticalLineToRelative(3.08f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.123f)
                curveToRelative(1.867f, 1.893f, 4.435f, 3.0f, 7.123f, 3.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(2.688f, 0.0f, 5.255f, 1.107f, 7.122f, 3.0f)
                horizontalLineToRelative(-4.122f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.08f)
                curveToRelative(-2.183f, -1.951f, -5.03f, -3.08f, -8.0f, -3.08f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(17.698f, 9.872f)
                lineToRelative(-1.416f, 0.816f)
                curveToRelative(0.129f, 0.418f, 0.218f, 0.853f, 0.218f, 1.313f)
                reflectiveCurveToRelative(-0.089f, 0.895f, -0.218f, 1.313f)
                lineToRelative(1.416f, 0.816f)
                lineToRelative(-0.998f, 1.733f)
                lineToRelative(-1.411f, -0.813f)
                curveToRelative(-0.605f, 0.652f, -1.393f, 1.125f, -2.289f, 1.33f)
                verticalLineToRelative(1.621f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.621f)
                curveToRelative(-0.896f, -0.205f, -1.685f, -0.678f, -2.289f, -1.33f)
                lineToRelative(-1.411f, 0.813f)
                lineToRelative(-0.998f, -1.733f)
                lineToRelative(1.416f, -0.816f)
                curveToRelative(-0.129f, -0.418f, -0.218f, -0.853f, -0.218f, -1.313f)
                reflectiveCurveToRelative(0.089f, -0.895f, 0.218f, -1.313f)
                lineToRelative(-1.416f, -0.816f)
                lineToRelative(0.998f, -1.733f)
                lineToRelative(1.411f, 0.813f)
                curveToRelative(0.605f, -0.652f, 1.393f, -1.125f, 2.289f, -1.33f)
                verticalLineToRelative(-1.621f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.621f)
                curveToRelative(0.896f, 0.205f, 1.685f, 0.678f, 2.289f, 1.33f)
                lineToRelative(1.411f, -0.813f)
                lineToRelative(0.998f, 1.733f)
                close()
                moveTo(14.5f, 12.0f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.122f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.122f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _process!!
    }

private var _process: ImageVector? = null
