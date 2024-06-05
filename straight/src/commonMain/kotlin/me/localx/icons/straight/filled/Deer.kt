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

public val Icons.Filled.Deer: ImageVector
    get() {
        if (_deer != null) {
            return _deer!!
        }
        _deer = Builder(name = "Deer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.377f, 7.447f)
                lineToRelative(-0.104f, -0.106f)
                curveToRelative(-0.788f, -0.807f, -1.595f, -1.633f, -2.919f, -2.364f)
                curveToRelative(1.004f, -0.826f, 1.646f, -2.078f, 1.646f, -3.477f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.924f, 0.28f, 1.784f, 0.76f, 2.5f)
                horizontalLineToRelative(-1.26f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(2.074f)
                curveToRelative(-0.464f, 0.942f, -0.574f, 1.988f, -0.574f, 2.586f)
                verticalLineToRelative(1.414f)
                horizontalLineTo(5.894f)
                curveToRelative(-1.273f, 0.0f, -2.438f, 0.596f, -3.21f, 1.511f)
                lineTo(0.003f, 14.547f)
                lineToRelative(2.091f, 1.806f)
                curveToRelative(0.133f, 0.392f, 0.773f, 1.872f, 0.906f, 2.295f)
                verticalLineToRelative(5.352f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.115f)
                curveToRelative(0.627f, -0.746f, 2.0f, -2.695f, 2.0f, -5.485f)
                verticalLineToRelative(-2.017f)
                lineToRelative(2.1f, -0.263f)
                curveToRelative(1.083f, -0.136f, 1.9f, -1.061f, 1.9f, -2.153f)
                curveToRelative(0.0f, -0.568f, -0.221f, -1.107f, -0.623f, -1.521f)
                close()
            }
        }
        .build()
        return _deer!!
    }

private var _deer: ImageVector? = null
