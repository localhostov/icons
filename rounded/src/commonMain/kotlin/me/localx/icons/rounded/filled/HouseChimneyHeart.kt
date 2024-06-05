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

public val Icons.Filled.HouseChimneyHeart: ImageVector
    get() {
        if (_houseChimneyHeart != null) {
            return _houseChimneyHeart!!
        }
        _houseChimneyHeart = Builder(name = "HouseChimneyHeart", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.462f, 12.398f)
                curveToRelative(0.0f, 1.054f, -1.313f, 2.764f, -3.428f, 4.461f)
                curveToRelative(-0.041f, 0.033f, -0.103f, 0.032f, -0.144f, 0.0f)
                curveToRelative(-2.115f, -1.698f, -3.428f, -3.408f, -3.428f, -4.462f)
                curveToRelative(0.0f, -0.813f, 0.561f, -1.476f, 1.25f, -1.476f)
                curveToRelative(0.57f, 0.0f, 1.25f, 0.187f, 1.25f, 1.077f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.891f, 0.68f, -1.077f, 1.25f, -1.077f)
                curveToRelative(0.689f, 0.0f, 1.25f, 0.662f, 1.25f, 1.476f)
                close()
                moveTo(24.0f, 9.723f)
                verticalLineToRelative(9.276f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 23.999f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-9.276f)
                curveToRelative(0.0f, -1.665f, 0.824f, -3.214f, 2.204f, -4.145f)
                lineTo(9.203f, 0.855f)
                curveToRelative(1.699f, -1.146f, 3.895f, -1.146f, 5.594f, 0.0f)
                lineToRelative(5.203f, 3.511f)
                verticalLineToRelative(-2.367f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(3.735f)
                curveToRelative(1.252f, 0.941f, 2.0f, 2.41f, 2.0f, 3.989f)
                close()
                moveTo(17.462f, 12.398f)
                curveToRelative(0.0f, -1.916f, -1.458f, -3.476f, -3.25f, -3.476f)
                curveToRelative(-0.906f, 0.0f, -1.684f, 0.284f, -2.25f, 0.775f)
                curveToRelative(-0.567f, -0.491f, -1.344f, -0.775f, -2.25f, -0.775f)
                curveToRelative(-1.792f, 0.0f, -3.25f, 1.56f, -3.25f, 3.476f)
                curveToRelative(0.0f, 2.205f, 2.271f, 4.491f, 4.177f, 6.021f)
                curveToRelative(0.383f, 0.308f, 0.853f, 0.461f, 1.323f, 0.461f)
                reflectiveCurveToRelative(0.94f, -0.153f, 1.324f, -0.462f)
                curveToRelative(1.905f, -1.529f, 4.177f, -3.815f, 4.177f, -6.021f)
                close()
            }
        }
        .build()
        return _houseChimneyHeart!!
    }

private var _houseChimneyHeart: ImageVector? = null
