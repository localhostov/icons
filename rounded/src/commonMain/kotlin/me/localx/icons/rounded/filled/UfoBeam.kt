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
                moveToRelative(6.919f, 16.394f)
                lineToRelative(-3.0f, 7.0f)
                curveToRelative(-0.162f, 0.38f, -0.531f, 0.606f, -0.919f, 0.606f)
                curveToRelative(-0.131f, 0.0f, -0.265f, -0.025f, -0.394f, -0.081f)
                curveToRelative(-0.507f, -0.218f, -0.743f, -0.806f, -0.525f, -1.312f)
                lineToRelative(3.0f, -7.0f)
                curveToRelative(0.217f, -0.509f, 0.803f, -0.747f, 1.313f, -0.525f)
                curveToRelative(0.507f, 0.218f, 0.743f, 0.806f, 0.525f, 1.312f)
                close()
                moveTo(18.919f, 15.607f)
                curveToRelative(-0.217f, -0.508f, -0.804f, -0.746f, -1.313f, -0.525f)
                curveToRelative(-0.507f, 0.218f, -0.743f, 0.806f, -0.525f, 1.312f)
                lineToRelative(3.0f, 7.0f)
                curveToRelative(0.162f, 0.38f, 0.531f, 0.606f, 0.919f, 0.606f)
                curveToRelative(0.131f, 0.0f, 0.265f, -0.025f, 0.394f, -0.081f)
                curveToRelative(0.507f, -0.218f, 0.743f, -0.806f, 0.525f, -1.312f)
                lineToRelative(-3.0f, -7.0f)
                close()
                moveTo(17.938f, 5.198f)
                curveToRelative(-0.395f, -2.929f, -2.902f, -5.197f, -5.938f, -5.197f)
                reflectiveCurveToRelative(-5.543f, 2.268f, -5.938f, 5.197f)
                curveToRelative(1.248f, 1.071f, 3.465f, 1.803f, 5.938f, 1.803f)
                reflectiveCurveToRelative(4.689f, -0.732f, 5.938f, -1.803f)
                close()
                moveTo(20.086f, 5.802f)
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
