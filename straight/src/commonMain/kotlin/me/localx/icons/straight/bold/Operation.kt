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

public val Icons.Bold.Operation: ImageVector
    get() {
        if (_operation != null) {
            return _operation!!
        }
        _operation = Builder(name = "Operation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-2.464f, 0.0f, -4.832f, -0.761f, -6.828f, -2.147f)
                lineToRelative(-2.133f, 2.133f)
                verticalLineToRelative(-5.014f)
                curveToRelative(0.0f, -0.544f, 0.441f, -0.986f, 0.986f, -0.986f)
                horizontalLineToRelative(5.014f)
                lineToRelative(-1.706f, 1.706f)
                curveToRelative(1.397f, 0.849f, 3.004f, 1.308f, 4.667f, 1.308f)
                curveToRelative(4.962f, 0.0f, 9.0f, -4.038f, 9.0f, -9.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(17.946f, 10.299f)
                lineToRelative(-1.529f, 0.883f)
                curveToRelative(0.049f, 0.266f, 0.083f, 0.538f, 0.083f, 0.818f)
                reflectiveCurveToRelative(-0.033f, 0.552f, -0.083f, 0.818f)
                lineToRelative(1.529f, 0.883f)
                lineToRelative(-1.5f, 2.598f)
                lineToRelative(-1.542f, -0.89f)
                curveToRelative(-0.413f, 0.352f, -0.884f, 0.629f, -1.404f, 0.815f)
                verticalLineToRelative(1.776f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.776f)
                curveToRelative(-0.521f, -0.186f, -0.992f, -0.463f, -1.404f, -0.815f)
                lineToRelative(-1.542f, 0.89f)
                lineToRelative(-1.5f, -2.598f)
                lineToRelative(1.529f, -0.883f)
                curveToRelative(-0.049f, -0.266f, -0.083f, -0.538f, -0.083f, -0.818f)
                reflectiveCurveToRelative(0.033f, -0.552f, 0.083f, -0.818f)
                lineToRelative(-1.529f, -0.883f)
                lineToRelative(1.5f, -2.598f)
                lineToRelative(1.542f, 0.89f)
                curveToRelative(0.413f, -0.352f, 0.884f, -0.629f, 1.404f, -0.815f)
                verticalLineToRelative(-1.776f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.776f)
                curveToRelative(0.521f, 0.186f, 0.992f, 0.463f, 1.404f, 0.815f)
                lineToRelative(1.542f, -0.89f)
                lineToRelative(1.5f, 2.598f)
                close()
                moveTo(13.5f, 12.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.664f, 0.0f, 3.271f, 0.459f, 4.667f, 1.308f)
                lineToRelative(-1.706f, 1.706f)
                horizontalLineToRelative(5.014f)
                curveToRelative(0.544f, 0.0f, 0.986f, -0.441f, 0.986f, -0.986f)
                lineTo(20.961f, 0.014f)
                lineToRelative(-2.133f, 2.133f)
                curveToRelative(-1.997f, -1.386f, -4.364f, -2.147f, -6.828f, -2.147f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                curveTo(3.0f, 7.038f, 7.038f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _operation!!
    }

private var _operation: ImageVector? = null
