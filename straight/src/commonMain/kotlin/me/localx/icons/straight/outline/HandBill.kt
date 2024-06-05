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

public val Icons.Outline.HandBill: ImageVector
    get() {
        if (_handBill != null) {
            return _handBill!!
        }
        _handBill = Builder(name = "HandBill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(15.5f, 8.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15.5f, 13.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(10.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.231f)
                curveToRelative(-0.742f, 0.0f, -1.455f, 0.273f, -2.01f, 0.772f)
                lineToRelative(-3.759f, 3.265f)
                verticalLineToRelative(2.693f)
                lineToRelative(5.098f, -4.473f)
                curveToRelative(0.185f, -0.166f, 0.423f, -0.258f, 0.671f, -0.258f)
                horizontalLineToRelative(4.231f)
                verticalLineToRelative(2.015f)
                curveToRelative(-0.693f, 0.005f, -1.393f, 0.244f, -1.972f, 0.731f)
                lineToRelative(-2.721f, 2.616f)
                lineToRelative(1.386f, 1.441f)
                lineToRelative(2.671f, -2.57f)
                curveToRelative(0.377f, -0.316f, 0.939f, -0.307f, 1.305f, 0.021f)
                curveToRelative(0.409f, 0.367f, 0.444f, 0.998f, 0.086f, 1.397f)
                lineToRelative(-3.705f, 4.026f)
                curveToRelative(-0.188f, 0.205f, -0.457f, 0.323f, -0.735f, 0.323f)
                lineTo(0.0f, 17.999f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.314f)
                curveToRelative(0.837f, 0.0f, 1.642f, -0.353f, 2.208f, -0.969f)
                lineToRelative(1.478f, -1.606f)
                verticalLineToRelative(2.575f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-2.749f)
                lineToRelative(0.235f, -0.256f)
                curveToRelative(1.103f, -1.23f, 0.999f, -3.129f, -0.232f, -4.231f)
                curveToRelative(0.0f, 0.0f, -0.002f, -0.001f, -0.003f, -0.002f)
                verticalLineToRelative(-4.762f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-14.0f)
                close()
            }
        }
        .build()
        return _handBill!!
    }

private var _handBill: ImageVector? = null
