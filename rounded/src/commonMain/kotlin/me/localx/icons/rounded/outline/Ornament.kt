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

public val Icons.Outline.Ornament: ImageVector
    get() {
        if (_ornament != null) {
            return _ornament!!
        }
        _ornament = Builder(name = "Ornament", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 4.836f)
                verticalLineToRelative(-0.336f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.771f)
                curveToRelative(0.17f, -0.294f, 0.268f, -0.636f, 0.268f, -1.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.364f, 0.098f, 0.706f, 0.268f, 1.0f)
                horizontalLineToRelative(-0.766f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(0.336f)
                curveToRelative(-3.529f, 1.546f, -6.0f, 5.072f, -6.0f, 9.164f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                curveToRelative(0.0f, -4.093f, -2.471f, -7.618f, -6.0f, -9.164f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(4.173f, 0.0f, 7.609f, 3.212f, 7.968f, 7.293f)
                lineToRelative(-1.519f, -1.519f)
                curveToRelative(-1.029f, -1.029f, -2.704f, -1.03f, -3.692f, -0.039f)
                lineToRelative(-2.325f, 2.078f)
                curveToRelative(-0.119f, 0.119f, -0.276f, 0.185f, -0.445f, 0.187f)
                curveToRelative(-0.19f, 0.006f, -0.341f, -0.065f, -0.504f, -0.23f)
                lineToRelative(-2.188f, -1.979f)
                curveToRelative(-0.497f, -0.503f, -1.159f, -0.783f, -1.866f, -0.787f)
                horizontalLineToRelative(-0.015f)
                curveToRelative(-0.702f, 0.0f, -1.361f, 0.272f, -1.859f, 0.767f)
                lineToRelative(-1.522f, 1.511f)
                curveToRelative(0.364f, -4.076f, 3.798f, -7.282f, 7.967f, -7.282f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-3.755f, 0.0f, -6.913f, -2.601f, -7.77f, -6.095f)
                lineToRelative(2.734f, -2.715f)
                curveToRelative(0.121f, -0.12f, 0.28f, -0.186f, 0.451f, -0.186f)
                horizontalLineToRelative(0.003f)
                curveToRelative(0.171f, 0.0f, 0.332f, 0.069f, 0.493f, 0.23f)
                lineToRelative(2.188f, 1.979f)
                curveToRelative(0.501f, 0.509f, 1.18f, 0.768f, 1.913f, 0.787f)
                curveToRelative(0.693f, -0.008f, 1.344f, -0.283f, 1.793f, -0.734f)
                lineToRelative(2.325f, -2.079f)
                curveToRelative(0.242f, -0.242f, 0.663f, -0.242f, 0.905f, 0.0f)
                lineToRelative(2.732f, 2.732f)
                curveToRelative(-0.862f, 3.487f, -4.017f, 6.081f, -7.767f, 6.081f)
                close()
            }
        }
        .build()
        return _ornament!!
    }

private var _ornament: ImageVector? = null
