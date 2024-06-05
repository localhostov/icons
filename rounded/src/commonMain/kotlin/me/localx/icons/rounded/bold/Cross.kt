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

public val Icons.Bold.Cross: ImageVector
    get() {
        if (_cross != null) {
            return _cross!!
        }
        _cross = Builder(name = "Cross", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.021f, viewportHeight = 512.021f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(301.258f, 256.01f)
                lineTo(502.645f, 54.645f)
                curveToRelative(12.501f, -12.501f, 12.501f, -32.769f, 0.0f, -45.269f)
                curveToRelative(-12.501f, -12.501f, -32.769f, -12.501f, -45.269f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineTo(256.01f, 210.762f)
                lineTo(54.645f, 9.376f)
                curveToRelative(-12.501f, -12.501f, -32.769f, -12.501f, -45.269f, 0.0f)
                reflectiveCurveToRelative(-12.501f, 32.769f, 0.0f, 45.269f)
                lineTo(210.762f, 256.01f)
                lineTo(9.376f, 457.376f)
                curveToRelative(-12.501f, 12.501f, -12.501f, 32.769f, 0.0f, 45.269f)
                reflectiveCurveToRelative(32.769f, 12.501f, 45.269f, 0.0f)
                lineTo(256.01f, 301.258f)
                lineToRelative(201.365f, 201.387f)
                curveToRelative(12.501f, 12.501f, 32.769f, 12.501f, 45.269f, 0.0f)
                curveToRelative(12.501f, -12.501f, 12.501f, -32.769f, 0.0f, -45.269f)
                lineTo(301.258f, 256.01f)
                close()
            }
        }
        .build()
        return _cross!!
    }

private var _cross: ImageVector? = null
