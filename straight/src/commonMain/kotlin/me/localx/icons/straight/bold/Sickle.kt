package me.localx.icons.straight.bold

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

public val Icons.Bold.Sickle: ImageVector
    get() {
        if (_sickle != null) {
            return _sickle!!
        }
        _sickle = Builder(name = "Sickle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.5f, 0.0f)
                curveTo(6.71f, 0.0f, 2.0f, 4.71f, 2.0f, 10.5f)
                curveToRelative(0.0f, 2.763f, 1.119f, 5.398f, 3.033f, 7.346f)
                lineToRelative(-4.025f, 4.025f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(6.996f, -6.995f)
                reflectiveCurveToRelative(-1.125f, -1.497f, -1.125f, -3.497f)
                curveToRelative(0.0f, -3.033f, 2.467f, -5.5f, 5.5f, -5.5f)
                curveToRelative(2.434f, 0.0f, 4.542f, 1.58f, 5.245f, 3.93f)
                lineToRelative(0.32f, 1.07f)
                horizontalLineToRelative(2.727f)
                reflectiveCurveToRelative(0.208f, -1.5f, 0.208f, -2.5f)
                curveToRelative(0.0f, -5.79f, -4.71f, -10.5f, -10.5f, -10.5f)
                close()
                moveTo(14.5f, 5.0f)
                curveToRelative(-4.687f, 0.0f, -8.5f, 3.813f, -8.5f, 8.5f)
                curveToRelative(0.0f, 0.266f, 0.012f, 0.529f, 0.036f, 0.79f)
                curveToRelative(-0.668f, -1.137f, -1.036f, -2.444f, -1.036f, -3.79f)
                curveToRelative(0.0f, -4.136f, 3.364f, -7.5f, 7.5f, -7.5f)
                curveToRelative(2.444f, 0.0f, 4.618f, 1.175f, 5.988f, 2.989f)
                curveToRelative(-1.195f, -0.637f, -2.555f, -0.989f, -3.988f, -0.989f)
                close()
            }
        }
        .build()
        return _sickle!!
    }

private var _sickle: ImageVector? = null
