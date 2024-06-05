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
                moveToRelative(16.207f, 7.793f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                lineToRelative(-1.043f, 1.043f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.043f, -1.043f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                close()
                moveTo(12.336f, 10.25f)
                lineToRelative(-4.336f, 4.336f)
                verticalLineToRelative(1.414f)
                horizontalLineToRelative(1.414f)
                lineToRelative(4.336f, -4.336f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(17.621f, 6.379f)
                curveToRelative(-1.17f, -1.17f, -3.072f, -1.17f, -4.242f, 0.0f)
                lineToRelative(-7.379f, 7.379f)
                verticalLineToRelative(4.242f)
                horizontalLineToRelative(4.242f)
                lineToRelative(7.379f, -7.379f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.072f, 0.0f, -4.242f)
                close()
            }
        }
        .build()
        return _penCircle!!
    }

private var _penCircle: ImageVector? = null
