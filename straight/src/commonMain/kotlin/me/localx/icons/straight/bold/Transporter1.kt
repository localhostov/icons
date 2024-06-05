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

public val Icons.Bold.Transporter1: ImageVector
    get() {
        if (_transporter1 != null) {
            return _transporter1!!
        }
        _transporter1 = Builder(name = "Transporter1", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(16.829f, 7.506f)
                lineToRelative(3.904f, 5.641f)
                lineToRelative(-2.467f, 1.707f)
                lineToRelative(-2.267f, -3.274f)
                verticalLineToRelative(2.421f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.42f)
                lineToRelative(-2.267f, 3.274f)
                lineToRelative(-2.467f, -1.707f)
                lineToRelative(3.903f, -5.639f)
                curveToRelative(0.655f, -0.944f, 1.73f, -1.508f, 2.878f, -1.508f)
                horizontalLineToRelative(3.904f)
                curveToRelative(1.147f, 0.0f, 2.223f, 0.563f, 2.877f, 1.506f)
                close()
                moveTo(13.0f, 11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(5.167f, 4.667f)
                lineToRelative(2.333f, -1.167f)
                lineToRelative(-2.333f, -1.167f)
                lineToRelative(-1.167f, -2.333f)
                lineToRelative(-1.167f, 2.333f)
                lineTo(0.5f, 3.5f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(1.167f, -2.333f)
                close()
                moveTo(21.5f, 4.5f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(-2.0f, -1.0f)
                close()
                moveTo(4.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _transporter1!!
    }

private var _transporter1: ImageVector? = null
