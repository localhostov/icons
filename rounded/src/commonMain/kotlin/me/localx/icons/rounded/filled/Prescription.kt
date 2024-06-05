package me.localx.icons.rounded.filled

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

public val Icons.Filled.Prescription: ImageVector
    get() {
        if (_prescription != null) {
            return _prescription!!
        }
        _prescription = Builder(name = "Prescription", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.869f, 18.0f)
                lineToRelative(2.964f, -4.445f)
                curveToRelative(0.306f, -0.46f, 0.182f, -1.08f, -0.277f, -1.387f)
                curveToRelative(-0.461f, -0.307f, -1.081f, -0.182f, -1.387f, 0.277f)
                lineToRelative(-2.501f, 3.752f)
                lineToRelative(-2.965f, -4.447f)
                curveToRelative(2.481f, -0.736f, 4.298f, -3.033f, 4.298f, -5.75f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                horizontalLineToRelative(-4.004f)
                curveTo(5.239f, 0.0f, 2.996f, 2.243f, 2.996f, 5.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(6.469f)
                lineToRelative(4.0f, 6.0f)
                lineToRelative(-2.963f, 4.445f)
                curveToRelative(-0.306f, 0.46f, -0.182f, 1.08f, 0.277f, 1.387f)
                curveToRelative(0.17f, 0.113f, 0.363f, 0.168f, 0.554f, 0.168f)
                curveToRelative(0.323f, 0.0f, 0.64f, -0.156f, 0.833f, -0.445f)
                lineToRelative(2.501f, -3.752f)
                lineToRelative(2.501f, 3.752f)
                curveToRelative(0.193f, 0.289f, 0.51f, 0.445f, 0.833f, 0.445f)
                curveToRelative(0.19f, 0.0f, 0.383f, -0.055f, 0.554f, -0.168f)
                curveToRelative(0.459f, -0.307f, 0.583f, -0.927f, 0.277f, -1.387f)
                lineToRelative(-2.964f, -4.445f)
                close()
                moveTo(4.996f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.004f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-7.004f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _prescription!!
    }

private var _prescription: ImageVector? = null
