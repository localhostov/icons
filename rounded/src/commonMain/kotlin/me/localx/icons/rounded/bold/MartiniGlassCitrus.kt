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

public val Icons.Bold.MartiniGlassCitrus: ImageVector
    get() {
        if (_martiniGlassCitrus != null) {
            return _martiniGlassCitrus!!
        }
        _martiniGlassCitrus = Builder(name = "MartiniGlassCitrus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                curveToRelative(-2.137f, 0.0f, -3.986f, 1.22f, -4.896f, 3.0f)
                lineTo(3.265f, 3.0f)
                curveTo(1.915f, 3.0f, 0.723f, 3.82f, 0.226f, 5.089f)
                curveToRelative(-0.479f, 1.222f, -0.174f, 2.581f, 0.803f, 3.483f)
                lineToRelative(6.67f, 6.163f)
                curveToRelative(0.393f, 0.357f, 0.835f, 0.627f, 1.302f, 0.808f)
                verticalLineToRelative(5.457f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-5.459f)
                curveToRelative(0.469f, -0.183f, 0.914f, -0.454f, 1.31f, -0.814f)
                lineToRelative(4.142f, -3.828f)
                curveToRelative(0.339f, 0.066f, 0.689f, 0.101f, 1.048f, 0.101f)
                curveToRelative(3.038f, 0.0f, 5.5f, -2.462f, 5.5f, -5.5f)
                reflectiveCurveTo(21.538f, 0.0f, 18.5f, 0.0f)
                close()
                moveTo(11.282f, 12.516f)
                curveToRelative(-0.444f, 0.407f, -1.118f, 0.407f, -1.557f, 0.008f)
                lineTo(3.039f, 6.347f)
                curveToRelative(-0.027f, -0.025f, -0.062f, -0.057f, -0.021f, -0.164f)
                curveToRelative(0.021f, -0.055f, 0.089f, -0.183f, 0.246f, -0.183f)
                horizontalLineToRelative(14.471f)
                curveToRelative(0.157f, 0.0f, 0.225f, 0.128f, 0.246f, 0.183f)
                curveToRelative(0.041f, 0.106f, 0.007f, 0.138f, -0.045f, 0.186f)
                lineToRelative(-6.654f, 6.146f)
                close()
            }
        }
        .build()
        return _martiniGlassCitrus!!
    }

private var _martiniGlassCitrus: ImageVector? = null
