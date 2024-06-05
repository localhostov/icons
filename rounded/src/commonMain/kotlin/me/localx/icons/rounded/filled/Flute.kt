package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Flute: ImageVector
    get() {
        if (_flute != null) {
            return _flute!!
        }
        _flute = Builder(name = "Flute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.22f, 1.219f)
                lineToRelative(-0.418f, -0.418f)
                curveToRelative(-0.878f, -0.876f, -2.24f, -1.053f, -3.313f, -0.431f)
                curveToRelative(-0.694f, 0.402f, -1.414f, 0.656f, -2.081f, 0.734f)
                curveToRelative(-0.516f, 0.06f, -1.008f, 0.25f, -1.429f, 0.545f)
                lineToRelative(6.394f, 6.394f)
                curveToRelative(0.296f, -0.422f, 0.486f, -0.914f, 0.546f, -1.43f)
                curveToRelative(0.078f, -0.667f, 0.331f, -1.387f, 0.733f, -2.08f)
                curveToRelative(0.623f, -1.073f, 0.446f, -2.436f, -0.431f, -3.313f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.071f, 16.504f)
                curveToRelative(-0.691f, 0.69f, -1.071f, 1.608f, -1.071f, 2.584f)
                reflectiveCurveToRelative(0.38f, 1.894f, 1.071f, 2.584f)
                lineToRelative(1.292f, 1.293f)
                curveToRelative(0.713f, 0.713f, 1.649f, 1.069f, 2.585f, 1.069f)
                reflectiveCurveToRelative(1.871f, -0.356f, 2.584f, -1.069f)
                curveToRelative(0.0f, 0.0f, 0.0f, -0.001f, 0.002f, -0.002f)
                lineToRelative(13.459f, -13.473f)
                lineToRelative(-6.46f, -6.46f)
                curveToRelative(-0.99f, 0.995f, -11.876f, 11.887f, -13.463f, 13.474f)
                close()
                moveTo(7.548f, 17.952f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(11.048f, 14.452f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.0f, 9.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _flute!!
    }

private var _flute: ImageVector? = null
