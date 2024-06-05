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

public val Icons.Filled.Comet: ImageVector
    get() {
        if (_comet != null) {
            return _comet!!
        }
        _comet = Builder(name = "Comet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.406f, 1.824f)
                lineToRelative(0.469f, -1.699f)
                lineToRelative(-1.699f, 0.469f)
                curveToRelative(-0.195f, 0.054f, -4.433f, 1.239f, -9.176f, 3.72f)
                lineTo(13.0f, 0.191f)
                lineToRelative(-1.749f, 1.129f)
                curveTo(5.978f, 4.723f, 0.0f, 8.579f, 0.0f, 15.5f)
                curveToRelative(0.0f, 2.27f, 0.884f, 4.404f, 2.489f, 6.011f)
                curveToRelative(1.606f, 1.605f, 3.741f, 2.489f, 6.011f, 2.489f)
                curveToRelative(6.921f, 0.0f, 10.777f, -5.978f, 14.18f, -11.251f)
                lineToRelative(1.129f, -1.749f)
                horizontalLineToRelative(-4.122f)
                curveToRelative(2.48f, -4.743f, 3.666f, -8.98f, 3.72f, -9.176f)
                close()
                moveTo(9.0f, 20.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _comet!!
    }

private var _comet: ImageVector? = null
