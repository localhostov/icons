package me.localx.icons.rounded.bold

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

public val Icons.Bold.Scalpel: ImageVector
    get() {
        if (_scalpel != null) {
            return _scalpel!!
        }
        _scalpel = Builder(name = "Scalpel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.128f, 2.46f)
                curveToRelative(-0.718f, -0.876f, -1.775f, -1.41f, -2.902f, -1.467f)
                curveToRelative(-1.127f, -0.052f, -2.232f, 0.368f, -3.03f, 1.165f)
                lineTo(0.762f, 18.553f)
                curveToRelative(-0.491f, 0.491f, -0.762f, 1.144f, -0.762f, 1.837f)
                reflectiveCurveToRelative(0.271f, 1.349f, 0.766f, 1.84f)
                curveToRelative(0.491f, 0.49f, 1.144f, 0.759f, 1.835f, 0.759f)
                horizontalLineToRelative(0.013f)
                curveToRelative(0.341f, 0.0f, 0.689f, -0.007f, 0.949f, -0.016f)
                curveToRelative(1.957f, -0.078f, 3.799f, -0.46f, 5.475f, -1.135f)
                curveToRelative(2.366f, -0.954f, 4.18f, -2.873f, 5.056f, -5.28f)
                lineToRelative(8.661f, -8.643f)
                curveToRelative(1.494f, -1.491f, 1.658f, -3.887f, 0.374f, -5.455f)
                close()
                moveTo(7.916f, 19.055f)
                curveToRelative(-1.315f, 0.53f, -2.772f, 0.838f, -4.326f, 0.914f)
                lineToRelative(6.18f, -6.165f)
                lineToRelative(1.586f, 1.479f)
                curveToRelative(-0.554f, 1.713f, -1.82f, 3.121f, -3.439f, 3.772f)
                close()
                moveTo(20.635f, 5.792f)
                lineToRelative(-7.274f, 7.258f)
                lineToRelative(-1.466f, -1.366f)
                lineToRelative(7.42f, -7.402f)
                curveToRelative(0.202f, -0.202f, 0.442f, -0.303f, 0.762f, -0.292f)
                curveToRelative(0.166f, 0.009f, 0.481f, 0.068f, 0.731f, 0.373f)
                curveToRelative(0.312f, 0.381f, 0.235f, 1.022f, -0.173f, 1.43f)
                close()
            }
        }
        .build()
        return _scalpel!!
    }

private var _scalpel: ImageVector? = null
