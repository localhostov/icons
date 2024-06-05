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

public val Icons.Bold.Transporter2: ImageVector
    get() {
        if (_transporter2 != null) {
            return _transporter2!!
        }
        _transporter2 = Builder(name = "Transporter2", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(21.167f, 2.333f)
                lineToRelative(-1.167f, -2.333f)
                lineToRelative(-1.167f, 2.333f)
                lineToRelative(-2.333f, 1.167f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(2.333f, -1.167f)
                lineToRelative(-2.333f, -1.167f)
                close()
                moveTo(6.0f, 16.5f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(2.0f, -1.0f)
                close()
                moveTo(4.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(16.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(7.0f, 12.0f)
                horizontalLineToRelative(-2.94f)
                lineToRelative(3.11f, -4.492f)
                curveToRelative(0.655f, -0.944f, 1.73f, -1.508f, 2.878f, -1.508f)
                horizontalLineToRelative(3.904f)
                curveToRelative(1.147f, 0.0f, 2.223f, 0.563f, 2.877f, 1.506f)
                lineToRelative(3.111f, 4.494f)
                horizontalLineToRelative(-2.94f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.998f)
                curveToRelative(-0.016f, -0.002f, -0.032f, -0.002f, -0.048f, -0.002f)
                horizontalLineToRelative(-3.904f)
                curveToRelative(-0.016f, 0.0f, -0.032f, 0.0f, -0.048f, 0.002f)
                verticalLineToRelative(1.998f)
                close()
            }
        }
        .build()
        return _transporter2!!
    }

private var _transporter2: ImageVector? = null
