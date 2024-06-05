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

public val Icons.Outline.FaceSunglasses: ImageVector
    get() {
        if (_faceSunglasses != null) {
            return _faceSunglasses!!
        }
        _faceSunglasses = Builder(name = "FaceSunglasses", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(3.728f, 0.0f, 6.98f, 2.054f, 8.699f, 5.086f)
                curveToRelative(-0.227f, -0.054f, -0.461f, -0.086f, -0.7f, -0.086f)
                horizontalLineToRelative(-4.085f)
                curveToRelative(-1.023f, 0.0f, -1.981f, 0.364f, -2.765f, 1.0f)
                horizontalLineToRelative(-2.298f)
                curveToRelative(-0.784f, -0.636f, -1.742f, -1.0f, -2.765f, -1.0f)
                lineTo(4.001f, 7.0f)
                curveToRelative(-0.239f, 0.0f, -0.473f, 0.032f, -0.7f, 0.086f)
                curveToRelative(1.72f, -3.032f, 4.972f, -5.086f, 8.699f, -5.086f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.294f, 0.0f, -9.629f, -4.139f, -9.967f, -9.349f)
                curveToRelative(0.74f, 0.832f, 1.815f, 1.349f, 2.988f, 1.349f)
                horizontalLineToRelative(2.137f)
                curveToRelative(1.839f, 0.0f, 3.436f, -1.246f, 3.881f, -3.03f)
                lineToRelative(0.242f, -0.97f)
                horizontalLineToRelative(1.439f)
                lineToRelative(0.242f, 0.97f)
                curveToRelative(0.445f, 1.784f, 2.042f, 3.03f, 3.881f, 3.03f)
                horizontalLineToRelative(2.137f)
                curveToRelative(1.173f, 0.0f, 2.247f, -0.517f, 2.987f, -1.349f)
                curveToRelative(-0.338f, 5.21f, -4.673f, 9.349f, -9.967f, 9.349f)
                close()
                moveTo(17.746f, 15.336f)
                curveToRelative(0.366f, 0.412f, 0.331f, 1.042f, -0.08f, 1.409f)
                curveToRelative(-0.103f, 0.092f, -2.559f, 2.254f, -5.666f, 2.254f)
                reflectiveCurveToRelative(-5.563f, -2.162f, -5.666f, -2.254f)
                curveToRelative(-0.412f, -0.368f, -0.447f, -1.0f, -0.08f, -1.412f)
                curveToRelative(0.369f, -0.411f, 0.998f, -0.446f, 1.41f, -0.081f)
                curveToRelative(0.025f, 0.022f, 2.008f, 1.748f, 4.336f, 1.748f)
                reflectiveCurveToRelative(4.316f, -1.73f, 4.336f, -1.748f)
                curveToRelative(0.412f, -0.364f, 1.043f, -0.329f, 1.41f, 0.084f)
                close()
            }
        }
        .build()
        return _faceSunglasses!!
    }

private var _faceSunglasses: ImageVector? = null
