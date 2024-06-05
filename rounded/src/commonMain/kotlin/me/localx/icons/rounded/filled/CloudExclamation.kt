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

public val Icons.Filled.CloudExclamation: ImageVector
    get() {
        if (_cloudExclamation != null) {
            return _cloudExclamation!!
        }
        _cloudExclamation = Builder(name = "CloudExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.974f, 7.173f)
                curveToRelative(-0.332f, -0.066f, -0.603f, -0.273f, -0.742f, -0.569f)
                curveToRelative(-1.551f, -3.271f, -5.142f, -5.1f, -8.735f, -4.438f)
                curveToRelative(-3.272f, 0.6f, -5.837f, 3.212f, -6.384f, 6.502f)
                curveToRelative(-0.161f, 0.972f, -0.15f, 1.943f, 0.033f, 2.889f)
                curveToRelative(0.06f, 0.309f, -0.073f, 0.653f, -0.346f, 0.901f)
                curveToRelative(-1.161f, 1.057f, -1.801f, 2.492f, -1.801f, 4.043f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.025f, 0.0f, 0.051f, 0.0f, 0.076f, -0.003f)
                curveToRelative(3.872f, -0.295f, 6.913f, -3.579f, 6.923f, -7.481f)
                curveToRelative(-0.005f, -3.559f, -2.54f, -6.647f, -6.025f, -7.343f)
                close()
                moveTo(11.0f, 8.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _cloudExclamation!!
    }

private var _cloudExclamation: ImageVector? = null
