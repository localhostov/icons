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

public val Icons.Filled.PreviousSquare: ImageVector
    get() {
        if (_previousSquare != null) {
            return _previousSquare!!
        }
        _previousSquare = Builder(name = "PreviousSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.77f, 12.0f)
                lineToRelative(4.23f, -2.897f)
                verticalLineToRelative(5.793f)
                lineToRelative(-4.23f, -2.896f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.243f, 2.243f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(17.0f, 8.871f)
                curveToRelative(0.0f, -0.693f, -0.383f, -1.326f, -1.0f, -1.651f)
                curveToRelative(-0.624f, -0.328f, -1.373f, -0.286f, -1.954f, 0.112f)
                lineToRelative(-4.569f, 3.128f)
                curveToRelative(-0.195f, 0.133f, -0.348f, 0.307f, -0.478f, 0.496f)
                verticalLineToRelative(-2.957f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.957f)
                curveToRelative(0.129f, 0.189f, 0.283f, 0.363f, 0.478f, 0.497f)
                lineToRelative(4.569f, 3.129f)
                curveToRelative(0.321f, 0.22f, 0.694f, 0.332f, 1.069f, 0.332f)
                curveToRelative(0.302f, 0.0f, 0.606f, -0.073f, 0.885f, -0.22f)
                curveToRelative(0.617f, -0.325f, 1.0f, -0.958f, 1.0f, -1.651f)
                verticalLineToRelative(-6.258f)
                close()
            }
        }
        .build()
        return _previousSquare!!
    }

private var _previousSquare: ImageVector? = null
