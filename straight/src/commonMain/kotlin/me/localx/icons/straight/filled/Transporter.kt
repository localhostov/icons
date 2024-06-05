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

public val Icons.Filled.Transporter: ImageVector
    get() {
        if (_transporter != null) {
            return _transporter!!
        }
        _transporter = Builder(name = "Transporter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(15.0f, 22.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-12.522f)
                lineToRelative(-3.178f, 4.591f)
                lineToRelative(-1.645f, -1.139f)
                lineToRelative(3.903f, -5.639f)
                curveToRelative(0.562f, -0.81f, 1.483f, -1.292f, 2.467f, -1.292f)
                horizontalLineToRelative(2.904f)
                curveToRelative(0.983f, 0.0f, 1.905f, 0.482f, 2.466f, 1.291f)
                lineToRelative(3.904f, 5.64f)
                lineToRelative(-1.645f, 1.139f)
                lineToRelative(-3.178f, -4.591f)
                verticalLineToRelative(12.521f)
                close()
                moveTo(11.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(21.667f, 2.333f)
                lineToRelative(-1.167f, -2.333f)
                lineToRelative(-1.167f, 2.333f)
                lineToRelative(-2.333f, 1.167f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(2.333f, -1.167f)
                lineToRelative(-2.333f, -1.167f)
                close()
                moveTo(6.5f, 5.5f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(2.0f, -1.0f)
                close()
            }
        }
        .build()
        return _transporter!!
    }

private var _transporter: ImageVector? = null
