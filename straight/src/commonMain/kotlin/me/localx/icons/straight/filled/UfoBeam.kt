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

public val Icons.Filled.UfoBeam: ImageVector
    get() {
        if (_ufoBeam != null) {
            return _ufoBeam!!
        }
        _ufoBeam = Builder(name = "UfoBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.893f, 15.606f)
                lineToRelative(-3.393f, 8.394f)
                lineTo(1.286f, 24.0f)
                lineToRelative(3.556f, -8.797f)
                curveToRelative(0.658f, 0.165f, 1.349f, 0.292f, 2.051f, 0.403f)
                close()
                moveTo(17.0f, 15.606f)
                lineToRelative(3.393f, 8.394f)
                horizontalLineToRelative(2.214f)
                reflectiveCurveToRelative(-3.556f, -8.797f, -3.556f, -8.797f)
                curveToRelative(-0.658f, 0.165f, -1.349f, 0.292f, -2.051f, 0.403f)
                close()
                moveTo(17.938f, 5.197f)
                curveToRelative(-0.395f, -2.929f, -2.902f, -5.197f, -5.938f, -5.197f)
                reflectiveCurveToRelative(-5.543f, 2.268f, -5.938f, 5.197f)
                curveToRelative(1.248f, 1.071f, 3.465f, 1.803f, 5.938f, 1.803f)
                reflectiveCurveToRelative(4.689f, -0.732f, 5.938f, -1.803f)
                close()
                moveTo(20.086f, 5.801f)
                curveToRelative(-1.448f, 1.909f, -4.484f, 3.198f, -8.086f, 3.198f)
                reflectiveCurveToRelative(-6.638f, -1.29f, -8.086f, -3.198f)
                curveToRelative(-2.509f, 0.837f, -3.914f, 2.061f, -3.914f, 3.531f)
                curveToRelative(0.0f, 3.063f, 6.037f, 4.667f, 12.0f, 4.667f)
                reflectiveCurveToRelative(12.0f, -1.604f, 12.0f, -4.667f)
                curveToRelative(0.0f, -1.471f, -1.406f, -2.694f, -3.914f, -3.531f)
                close()
            }
        }
        .build()
        return _ufoBeam!!
    }

private var _ufoBeam: ImageVector? = null
