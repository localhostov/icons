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

public val Icons.Filled.PhonePlus: ImageVector
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
                moveTo(20.656f, 14.856f)
                curveToRelative(-1.195f, -1.142f, -3.089f, -1.141f, -4.282f, 0.007f)
                lineToRelative(-1.905f, 1.606f)
                curveToRelative(-3.198f, -1.357f, -5.474f, -3.638f, -6.932f, -6.947f)
                lineToRelative(1.601f, -1.897f)
                curveToRelative(1.146f, -1.192f, 1.147f, -3.085f, 0.006f, -4.281f)
                curveToRelative(0.0f, 0.0f, -1.852f, -2.407f, -1.883f, -2.438f)
                curveToRelative(-1.206f, -1.208f, -3.172f, -1.207f, -4.327f, -0.047f)
                lineToRelative(-1.149f, 1.003f)
                curveTo(0.634f, 3.012f, 0.0f, 4.565f, 0.0f, 6.238f)
                curveToRelative(0.0f, 7.636f, 10.126f, 17.762f, 17.762f, 17.762f)
                curveToRelative(1.673f, 0.0f, 3.227f, -0.633f, 4.421f, -1.833f)
                lineToRelative(0.912f, -1.05f)
                curveToRelative(1.205f, -1.207f, 1.205f, -3.17f, 0.0f, -4.376f)
                curveToRelative(-0.03f, -0.031f, -2.438f, -1.883f, -2.438f, -1.883f)
                close()
            }
        }
        .build()
        return _phonePlus!!
    }

private var _phonePlus: ImageVector? = null
