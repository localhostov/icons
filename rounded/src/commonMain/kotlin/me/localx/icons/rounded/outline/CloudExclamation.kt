package me.localx.icons.rounded.outline

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

public val Icons.Outline.CloudExclamation: ImageVector
    get() {
        if (_cloudExclamation != null) {
            return _cloudExclamation!!
        }
        _cloudExclamation = Builder(name = "CloudExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 17.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23.998f, 14.435f)
                curveToRelative(0.001f, 0.016f, 0.001f, -0.02f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(17.974f, 7.173f)
                curveToRelative(-0.332f, -0.066f, -0.603f, -0.273f, -0.742f, -0.569f)
                curveToRelative(-1.551f, -3.271f, -5.142f, -5.1f, -8.735f, -4.438f)
                curveToRelative(-3.272f, 0.6f, -5.837f, 3.212f, -6.384f, 6.502f)
                curveToRelative(-0.161f, 0.972f, -0.15f, 1.943f, 0.033f, 2.889f)
                curveToRelative(0.06f, 0.309f, -0.073f, 0.653f, -0.346f, 0.901f)
                curveToRelative(-1.161f, 1.057f, -1.801f, 2.492f, -1.801f, 4.043f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -0.98f, 0.407f, -1.891f, 1.146f, -2.562f)
                curveToRelative(0.786f, -0.715f, 1.155f, -1.773f, 0.963f, -2.763f)
                curveToRelative(-0.138f, -0.711f, -0.146f, -1.444f, -0.024f, -2.181f)
                curveToRelative(0.403f, -2.422f, 2.365f, -4.421f, 4.771f, -4.862f)
                curveToRelative(2.75f, -0.499f, 5.385f, 0.835f, 6.567f, 3.329f)
                curveToRelative(0.414f, 0.872f, 1.2f, 1.481f, 2.158f, 1.673f)
                curveToRelative(2.555f, 0.51f, 4.413f, 2.775f, 4.417f, 5.381f)
                curveToRelative(-0.007f, 2.861f, -2.236f, 5.272f, -5.075f, 5.488f)
                curveToRelative(-0.551f, 0.042f, -0.963f, 0.522f, -0.921f, 1.073f)
                curveToRelative(0.04f, 0.524f, 0.478f, 0.924f, 0.996f, 0.924f)
                curveToRelative(0.025f, 0.0f, 0.051f, 0.0f, 0.077f, -0.003f)
                curveToRelative(3.848f, -0.293f, 6.874f, -3.692f, 6.922f, -7.562f)
                curveToRelative(-0.043f, -3.525f, -2.565f, -6.572f, -6.024f, -7.262f)
                close()
            }
        }
        .build()
        return _cloudExclamation!!
    }

private var _cloudExclamation: ImageVector? = null
