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

public val Icons.Outline.Banjo: ImageVector
    get() {
        if (_banjo != null) {
            return _banjo!!
        }
        _banjo = Builder(name = "Banjo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.491f, 1.104f)
                lineToRelative(-0.592f, -0.593f)
                curveToRelative(-0.679f, -0.681f, -1.782f, -0.682f, -2.462f, -0.002f)
                lineToRelative(-0.557f, 0.554f)
                curveToRelative(-0.564f, 0.563f, -0.88f, 1.327f, -0.88f, 2.123f)
                verticalLineToRelative(0.4f)
                lineToRelative(-6.097f, 6.097f)
                curveToRelative(-1.355f, -1.054f, -3.057f, -1.683f, -4.903f, -1.683f)
                curveTo(3.589f, 8.0f, 0.0f, 11.589f, 0.0f, 16.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -1.846f, -0.629f, -3.548f, -1.683f, -4.903f)
                lineToRelative(6.097f, -6.097f)
                horizontalLineToRelative(0.396f)
                curveToRelative(0.795f, 0.0f, 1.557f, -0.315f, 2.12f, -0.877f)
                lineToRelative(0.559f, -0.557f)
                curveToRelative(0.68f, -0.679f, 0.681f, -1.782f, 0.002f, -2.462f)
                close()
                moveTo(8.0f, 22.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(8.707f, 17.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.0f, -2.0f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _banjo!!
    }

private var _banjo: ImageVector? = null
