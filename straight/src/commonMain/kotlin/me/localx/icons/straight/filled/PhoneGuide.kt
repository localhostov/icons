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

public val Icons.Filled.PhoneGuide: ImageVector
    get() {
        if (_phoneGuide != null) {
            return _phoneGuide!!
        }
        _phoneGuide = Builder(name = "PhoneGuide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.287f, 19.114f)
                lineToRelative(-1.775f, 1.775f)
                curveToRelative(-2.027f, -0.773f, -3.521f, -2.208f, -4.403f, -4.403f)
                lineToRelative(1.775f, -1.775f)
                lineToRelative(-2.712f, -2.712f)
                lineToRelative(-1.378f, 1.378f)
                curveToRelative(-0.54f, 0.539f, -0.795f, 1.249f, -0.795f, 1.957f)
                curveToRelative(0.0f, 3.914f, 5.032f, 8.665f, 8.665f, 8.665f)
                curveToRelative(0.708f, 0.0f, 1.418f, -0.256f, 1.957f, -0.795f)
                lineToRelative(1.378f, -1.378f)
                lineToRelative(-2.712f, -2.712f)
                horizontalLineToRelative(-0.001f)
                close()
                moveTo(10.522f, 17.999f)
                horizontalLineToRelative(-4.522f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(12.999f)
                lineToRelative(-5.827f, -5.827f)
                lineToRelative(-2.791f, 2.791f)
                curveToRelative(-0.891f, 0.89f, -1.382f, 2.087f, -1.382f, 3.373f)
                curveToRelative(0.0f, 0.872f, 0.191f, 1.773f, 0.522f, 2.665f)
                close()
                moveTo(15.273f, 23.999f)
                lineTo(2.0f, 23.999f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(9.508f)
                curveToRelative(0.951f, 1.53f, 2.279f, 2.934f, 3.764f, 4.0f)
                close()
                moveTo(2.0f, 17.999f)
                curveToRelative(-0.738f, -0.001f, -1.451f, 0.271f, -2.0f, 0.765f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.343f, 1.343f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _phoneGuide!!
    }

private var _phoneGuide: ImageVector? = null
