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

public val Icons.Bold.AddressCard: ImageVector
    get() {
        if (_addressCard != null) {
            return _addressCard!!
        }
        _addressCard = Builder(name = "AddressCard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                lineTo(21.0f, 4.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(17.839f, 14.803f)
                lineToRelative(-5.294f, 5.273f)
                curveToRelative(-0.604f, 0.604f, -1.417f, 0.924f, -2.259f, 0.924f)
                curveToRelative(-0.433f, 0.0f, -0.873f, -0.084f, -1.295f, -0.258f)
                curveToRelative(-1.223f, -0.503f, -1.985f, -1.607f, -1.99f, -2.879f)
                verticalLineToRelative(-0.863f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-0.859f)
                curveToRelative(0.006f, -1.278f, 0.769f, -2.38f, 1.992f, -2.883f)
                curveToRelative(1.242f, -0.51f, 2.64f, -0.249f, 3.556f, 0.668f)
                lineToRelative(5.29f, 5.266f)
                reflectiveCurveToRelative(0.001f, 0.002f, 0.002f, 0.003f)
                curveToRelative(1.544f, 1.545f, 1.544f, 4.062f, 0.0f, 5.608f)
                close()
                moveTo(15.719f, 11.316f)
                lineToRelative(-5.291f, -5.268f)
                curveToRelative(-0.078f, -0.079f, -0.228f, -0.045f, -0.295f, -0.017f)
                curveToRelative(-0.001f, 0.0f, -0.132f, 0.055f, -0.133f, 0.116f)
                verticalLineToRelative(2.352f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(3.5f, 9.999f)
                curveToRelative(-0.271f, 0.0f, -0.5f, 0.229f, -0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(2.357f)
                curveToRelative(0.0f, 0.056f, 0.131f, 0.11f, 0.132f, 0.11f)
                curveToRelative(0.069f, 0.029f, 0.218f, 0.062f, 0.292f, -0.014f)
                lineToRelative(5.294f, -5.273f)
                curveToRelative(0.374f, -0.374f, 0.375f, -0.987f, 0.0f, -1.364f)
                close()
            }
        }
        .build()
        return _addressCard!!
    }

private var _addressCard: ImageVector? = null
