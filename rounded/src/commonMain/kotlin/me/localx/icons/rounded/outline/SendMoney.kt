package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.SendMoney: ImageVector
    get() {
        if (_sendMoney != null) {
            return _sendMoney!!
        }
        _sendMoney = Builder(name = "SendMoney", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(22.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.586f)
                lineToRelative(-3.293f, 3.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(3.293f, -3.293f)
                verticalLineToRelative(2.586f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(24.0f, 2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(13.0f, 6.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.359f, 0.974f, 2.51f, 2.315f, 2.733f)
                lineToRelative(3.04f, 0.506f)
                curveToRelative(0.374f, 0.062f, 0.645f, 0.382f, 0.645f, 0.761f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.268f)
                curveToRelative(-0.356f, 0.0f, -0.688f, -0.191f, -0.867f, -0.501f)
                curveToRelative(-0.276f, -0.479f, -0.887f, -0.643f, -1.366f, -0.364f)
                curveToRelative(-0.478f, 0.276f, -0.642f, 0.888f, -0.364f, 1.366f)
                curveToRelative(0.534f, 0.925f, 1.53f, 1.499f, 2.598f, 1.499f)
                horizontalLineToRelative(0.268f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.359f, -0.974f, -2.51f, -2.315f, -2.733f)
                lineToRelative(-3.04f, -0.506f)
                curveToRelative(-0.374f, -0.062f, -0.645f, -0.382f, -0.645f, -0.761f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.268f)
                curveToRelative(0.356f, 0.0f, 0.688f, 0.191f, 0.867f, 0.501f)
                curveToRelative(0.275f, 0.478f, 0.886f, 0.642f, 1.366f, 0.364f)
                curveToRelative(0.478f, -0.276f, 0.642f, -0.888f, 0.364f, -1.366f)
                curveToRelative(-0.534f, -0.925f, -1.53f, -1.499f, -2.598f, -1.499f)
                horizontalLineToRelative(-0.268f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _sendMoney!!
    }

private var _sendMoney: ImageVector? = null
