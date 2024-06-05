package me.localx.icons.straight.filled

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

public val Icons.Filled.Chip: ImageVector
    get() {
        if (_chip != null) {
            return _chip!!
        }
        _chip = Builder(name = "Chip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.251f, 5.029f)
                curveTo(4.248f, 2.246f, 7.397f, 0.35f, 11.0f, 0.051f)
                lineTo(11.0f, 4.069f)
                curveToRelative(-2.146f, 0.269f, -4.027f, 1.39f, -5.298f, 3.015f)
                lineToRelative(-3.45f, -2.055f)
                close()
                moveTo(13.0f, 4.069f)
                curveToRelative(2.146f, 0.269f, 4.027f, 1.39f, 5.298f, 3.015f)
                lineToRelative(3.45f, -2.055f)
                curveTo(19.752f, 2.246f, 16.603f, 0.35f, 13.0f, 0.051f)
                lineTo(13.0f, 4.069f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
                moveTo(22.773f, 17.253f)
                curveToRelative(0.778f, -1.589f, 1.227f, -3.368f, 1.227f, -5.253f)
                reflectiveCurveToRelative(-0.449f, -3.664f, -1.228f, -5.253f)
                lineToRelative(-3.445f, 2.053f)
                curveToRelative(0.43f, 0.981f, 0.673f, 2.063f, 0.673f, 3.201f)
                reflectiveCurveToRelative(-0.243f, 2.219f, -0.673f, 3.201f)
                lineToRelative(3.446f, 2.053f)
                close()
                moveTo(18.298f, 16.916f)
                curveToRelative(-1.271f, 1.625f, -3.152f, 2.745f, -5.298f, 3.015f)
                verticalLineToRelative(4.019f)
                curveToRelative(3.603f, -0.299f, 6.752f, -2.195f, 8.748f, -4.978f)
                lineToRelative(-3.45f, -2.056f)
                close()
                moveTo(4.673f, 15.201f)
                curveToRelative(-0.43f, -0.981f, -0.673f, -2.062f, -0.673f, -3.201f)
                reflectiveCurveToRelative(0.243f, -2.22f, 0.673f, -3.201f)
                lineTo(1.228f, 6.747f)
                curveToRelative(-0.778f, 1.589f, -1.228f, 3.368f, -1.228f, 5.253f)
                reflectiveCurveToRelative(0.449f, 3.664f, 1.227f, 5.253f)
                lineToRelative(3.446f, -2.053f)
                close()
                moveTo(11.0f, 19.931f)
                curveToRelative(-2.146f, -0.269f, -4.027f, -1.39f, -5.298f, -3.015f)
                lineToRelative(-3.45f, 2.056f)
                curveToRelative(1.996f, 2.783f, 5.146f, 4.679f, 8.748f, 4.978f)
                verticalLineToRelative(-4.019f)
                close()
            }
        }
        .build()
        return _chip!!
    }

private var _chip: ImageVector? = null
