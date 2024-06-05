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

public val Icons.Filled.DraftingCompass: ImageVector
    get() {
        if (_draftingCompass != null) {
            return _draftingCompass!!
        }
        _draftingCompass = Builder(name = "DraftingCompass", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.854f, 22.479f)
                lineToRelative(-4.545f, -7.437f)
                curveToRelative(0.824f, -0.474f, 1.614f, -1.027f, 2.352f, -1.674f)
                curveToRelative(0.415f, -0.364f, 0.456f, -0.996f, 0.092f, -1.411f)
                curveToRelative(-0.366f, -0.416f, -0.996f, -0.455f, -1.412f, -0.092f)
                curveToRelative(-0.65f, 0.57f, -1.347f, 1.055f, -2.075f, 1.47f)
                lineToRelative(-3.045f, -4.983f)
                curveToRelative(0.485f, -0.662f, 0.78f, -1.47f, 0.78f, -2.351f)
                curveToRelative(0.0f, -1.858f, -1.279f, -3.411f, -3.0f, -3.858f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.142f)
                curveToRelative(-1.721f, 0.447f, -3.0f, 2.0f, -3.0f, 3.858f)
                curveToRelative(0.0f, 0.881f, 0.295f, 1.689f, 0.78f, 2.351f)
                lineToRelative(-3.045f, 4.982f)
                curveToRelative(-0.728f, -0.414f, -1.425f, -0.899f, -2.075f, -1.47f)
                curveToRelative(-0.416f, -0.364f, -1.046f, -0.324f, -1.412f, 0.092f)
                curveToRelative(-0.364f, 0.415f, -0.323f, 1.046f, 0.092f, 1.412f)
                curveToRelative(0.737f, 0.647f, 1.527f, 1.201f, 2.352f, 1.674f)
                lineTo(0.146f, 22.479f)
                curveToRelative(-0.288f, 0.472f, -0.14f, 1.087f, 0.332f, 1.375f)
                curveToRelative(0.163f, 0.1f, 0.343f, 0.146f, 0.521f, 0.146f)
                curveToRelative(0.337f, 0.0f, 0.666f, -0.17f, 0.854f, -0.479f)
                lineToRelative(4.648f, -7.606f)
                curveToRelative(1.76f, 0.71f, 3.627f, 1.077f, 5.498f, 1.077f)
                reflectiveCurveToRelative(3.738f, -0.367f, 5.498f, -1.077f)
                lineToRelative(4.648f, 7.606f)
                curveToRelative(0.188f, 0.309f, 0.518f, 0.479f, 0.854f, 0.479f)
                curveToRelative(0.178f, 0.0f, 0.357f, -0.047f, 0.521f, -0.146f)
                curveToRelative(0.472f, -0.288f, 0.62f, -0.903f, 0.332f, -1.375f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(7.555f, 14.191f)
                lineToRelative(2.787f, -4.561f)
                curveToRelative(0.506f, 0.232f, 1.064f, 0.37f, 1.657f, 0.37f)
                reflectiveCurveToRelative(1.151f, -0.138f, 1.657f, -0.37f)
                lineToRelative(2.788f, 4.562f)
                curveToRelative(-2.859f, 1.067f, -6.03f, 1.067f, -8.889f, 0.0f)
                close()
            }
        }
        .build()
        return _draftingCompass!!
    }

private var _draftingCompass: ImageVector? = null
