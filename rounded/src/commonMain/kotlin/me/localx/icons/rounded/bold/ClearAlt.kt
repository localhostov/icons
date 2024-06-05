package me.localx.icons.rounded.bold

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

public val Icons.Bold.ClearAlt: ImageVector
    get() {
        if (_clearAlt != null) {
            return _clearAlt!!
        }
        _clearAlt = Builder(name = "ClearAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 0.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveTo(21.314f, 0.0f, 18.0f, 0.0f)
                close()
                moveTo(20.707f, 7.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(-1.293f, 1.293f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(-1.293f, -1.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(1.293f, -1.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(1.293f, 1.293f)
                close()
                moveTo(15.0f, 14.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.541f, -0.291f, 1.039f, -0.761f, 1.305f)
                curveToRelative(-0.229f, 0.13f, -0.484f, 0.195f, -0.739f, 0.195f)
                curveToRelative(-0.267f, 0.0f, -0.534f, -0.071f, -0.772f, -0.214f)
                lineToRelative(-5.0f, -3.0f)
                curveToRelative(-0.452f, -0.271f, -0.728f, -0.759f, -0.728f, -1.286f)
                verticalLineToRelative(-5.166f)
                lineTo(1.034f, 7.032f)
                curveToRelative(-0.652f, -0.732f, -1.034f, -1.736f, -1.034f, -2.778f)
                curveTo(0.0f, 1.908f, 1.908f, 0.0f, 4.253f, 0.0f)
                horizontalLineToRelative(5.247f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.247f)
                curveToRelative(-0.691f, 0.0f, -1.253f, 0.562f, -1.253f, 1.253f)
                curveToRelative(0.0f, 0.307f, 0.112f, 0.603f, 0.316f, 0.833f)
                lineToRelative(6.345f, 7.765f)
                curveToRelative(0.219f, 0.268f, 0.338f, 0.604f, 0.338f, 0.949f)
                verticalLineToRelative(4.851f)
                lineToRelative(2.0f, 1.2f)
                verticalLineToRelative(-5.351f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _clearAlt!!
    }

private var _clearAlt: ImageVector? = null
