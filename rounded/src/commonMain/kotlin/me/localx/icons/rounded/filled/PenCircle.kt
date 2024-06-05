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

public val Icons.Filled.PenCircle: ImageVector
    get() {
        if (_penCircle != null) {
            return _penCircle!!
        }
        _penCircle = Builder(name = "PenCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.75f, 11.664f)
                lineToRelative(-3.457f, 3.457f)
                curveToRelative(-0.559f, 0.559f, -1.332f, 0.879f, -2.121f, 0.879f)
                horizontalLineToRelative(-0.172f)
                verticalLineToRelative(-0.172f)
                curveToRelative(0.0f, -0.789f, 0.32f, -1.562f, 0.879f, -2.121f)
                lineToRelative(3.457f, -3.457f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(14.793f, 7.793f)
                lineToRelative(-1.043f, 1.043f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.043f, -1.043f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(17.621f, 6.379f)
                curveToRelative(-1.17f, -1.17f, -3.072f, -1.17f, -4.242f, 0.0f)
                lineToRelative(-5.914f, 5.914f)
                curveToRelative(-0.944f, 0.944f, -1.465f, 2.2f, -1.465f, 3.535f)
                verticalLineToRelative(1.172f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.172f)
                curveToRelative(1.335f, 0.0f, 2.591f, -0.521f, 3.535f, -1.465f)
                lineToRelative(5.914f, -5.914f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.072f, 0.0f, -4.242f)
                close()
            }
        }
        .build()
        return _penCircle!!
    }

private var _penCircle: ImageVector? = null
