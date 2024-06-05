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

public val Icons.Outline.Sickle: ImageVector
    get() {
        if (_sickle != null) {
            return _sickle!!
        }
        _sickle = Builder(name = "Sickle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.819f, 2.971f)
                curveTo(17.769f, 0.978f, 15.07f, -0.081f, 12.199f, 0.004f)
                horizontalLineToRelative(0.0f)
                curveTo(6.683f, 0.159f, 2.109f, 4.774f, 2.002f, 10.292f)
                curveToRelative(-0.059f, 3.052f, 1.223f, 5.956f, 3.468f, 7.982f)
                lineToRelative(-4.018f, 4.018f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(5.303f, -5.303f)
                curveToRelative(0.588f, -0.587f, 0.756f, -1.477f, 0.418f, -2.213f)
                curveToRelative(-0.536f, -1.168f, -0.709f, -2.468f, -0.501f, -3.761f)
                curveToRelative(0.468f, -2.91f, 2.95f, -5.186f, 5.901f, -5.411f)
                curveToRelative(3.269f, -0.247f, 6.225f, 1.978f, 6.876f, 5.18f)
                curveToRelative(0.095f, 0.466f, 0.529f, 0.801f, 1.005f, 0.801f)
                curveToRelative(0.491f, 0.0f, 0.909f, -0.356f, 0.987f, -0.84f)
                curveToRelative(0.097f, -0.601f, 0.144f, -1.144f, 0.144f, -1.66f)
                curveToRelative(0.0f, -2.86f, -1.13f, -5.534f, -3.181f, -7.529f)
                close()
                moveTo(13.836f, 5.025f)
                curveToRelative(-3.862f, 0.294f, -7.11f, 3.275f, -7.724f, 7.087f)
                curveToRelative(-0.247f, 1.535f, -0.08f, 3.081f, 0.471f, 4.474f)
                curveToRelative(-1.679f, -1.628f, -2.627f, -3.889f, -2.581f, -6.255f)
                curveToRelative(0.086f, -4.467f, 3.789f, -8.203f, 8.253f, -8.328f)
                curveToRelative(2.323f, -0.063f, 4.51f, 0.788f, 6.17f, 2.402f)
                curveToRelative(0.892f, 0.867f, 1.568f, 1.892f, 2.003f, 3.015f)
                curveToRelative(-1.701f, -1.654f, -4.074f, -2.583f, -6.593f, -2.395f)
                close()
            }
        }
        .build()
        return _sickle!!
    }

private var _sickle: ImageVector? = null
