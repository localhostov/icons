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

public val Icons.Outline.PhonePlus: ImageVector
    get() {
        if (_phonePlus != null) {
            return _phonePlus!!
        }
        _phonePlus = Builder(name = "PhonePlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 5.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(23.094f, 16.74f)
                curveToRelative(1.206f, 1.207f, 1.206f, 3.17f, 0.0f, 4.376f)
                lineToRelative(-0.912f, 1.05f)
                curveToRelative(-1.194f, 1.2f, -2.748f, 1.833f, -4.421f, 1.833f)
                curveTo(10.126f, 24.0f, 0.0f, 13.874f, 0.0f, 6.238f)
                curveToRelative(0.0f, -1.673f, 0.634f, -3.227f, 1.784f, -4.375f)
                lineToRelative(1.149f, -1.003f)
                curveToRelative(1.155f, -1.16f, 3.121f, -1.161f, 4.327f, 0.047f)
                curveToRelative(0.031f, 0.031f, 1.883f, 2.438f, 1.883f, 2.438f)
                curveToRelative(1.142f, 1.196f, 1.14f, 3.089f, -0.006f, 4.281f)
                lineToRelative(-1.159f, 1.456f)
                curveToRelative(1.458f, 3.309f, 3.733f, 5.589f, 6.932f, 6.947f)
                lineToRelative(1.464f, -1.165f)
                curveToRelative(1.193f, -1.147f, 3.087f, -1.148f, 4.282f, -0.007f)
                curveToRelative(0.0f, 0.0f, 2.407f, 1.853f, 2.438f, 1.883f)
                close()
                moveTo(21.718f, 18.194f)
                reflectiveCurveToRelative(-2.395f, -1.842f, -2.425f, -1.873f)
                curveToRelative(-0.414f, -0.414f, -1.135f, -0.414f, -1.549f, 0.0f)
                curveToRelative(-0.026f, 0.027f, -2.044f, 1.635f, -2.044f, 1.635f)
                curveToRelative(-0.276f, 0.22f, -0.651f, 0.277f, -0.979f, 0.151f)
                curveToRelative(-4.141f, -1.58f, -7.108f, -4.544f, -8.821f, -8.812f)
                curveToRelative(-0.134f, -0.334f, -0.079f, -0.714f, 0.146f, -0.995f)
                curveToRelative(0.0f, 0.0f, 1.607f, -2.018f, 1.635f, -2.044f)
                curveToRelative(0.427f, -0.427f, 0.427f, -1.122f, 0.0f, -1.549f)
                curveToRelative(-0.03f, -0.03f, -1.872f, -2.423f, -1.872f, -2.423f)
                curveToRelative(-0.208f, -0.188f, -0.472f, -0.283f, -0.734f, -0.283f)
                curveToRelative(-0.281f, 0.0f, -0.562f, 0.107f, -0.775f, 0.32f)
                lineToRelative(-1.15f, 1.005f)
                curveToRelative(-0.722f, 0.724f, -1.146f, 1.774f, -1.146f, 2.913f)
                curveToRelative(0.0f, 6.957f, 9.772f, 15.762f, 15.762f, 15.762f)
                curveToRelative(1.138f, 0.0f, 2.188f, -0.425f, 2.959f, -1.197f)
                lineToRelative(0.912f, -1.05f)
                curveToRelative(0.459f, -0.463f, 0.473f, -1.13f, 0.085f, -1.56f)
                close()
            }
        }
        .build()
        return _phonePlus!!
    }

private var _phonePlus: ImageVector? = null
