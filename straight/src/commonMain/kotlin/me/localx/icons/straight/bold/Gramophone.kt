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

public val Icons.Bold.Gramophone: ImageVector
    get() {
        if (_gramophone != null) {
            return _gramophone!!
        }
        _gramophone = Builder(name = "Gramophone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 19.5f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.25f)
                curveToRelative(2.347f, 0.0f, 4.25f, -1.903f, 4.25f, -4.25f)
                reflectiveCurveToRelative(-1.903f, -4.25f, -4.25f, -4.25f)
                horizontalLineToRelative(-2.57f)
                curveToRelative(-2.144f, -0.283f, -7.913f, -1.669f, -10.281f, -4.889f)
                lineToRelative(-0.45f, -0.611f)
                horizontalLineToRelative(-2.449f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(2.449f)
                lineToRelative(0.45f, -0.611f)
                curveToRelative(2.715f, -3.692f, 9.455f, -4.769f, 10.286f, -4.889f)
                horizontalLineToRelative(2.566f)
                curveToRelative(0.689f, 0.0f, 1.25f, 0.561f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.561f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-3.25f)
                curveToRelative(-1.933f, 0.0f, -3.5f, 1.567f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.933f, 0.0f, -3.5f, 1.567f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(7.0f, 9.175f)
                verticalLineToRelative(-4.351f)
                curveToRelative(1.301f, 0.935f, 2.758f, 1.643f, 4.147f, 2.175f)
                curveToRelative(-1.389f, 0.533f, -2.846f, 1.241f, -4.147f, 2.175f)
                close()
                moveTo(19.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _gramophone!!
    }

private var _gramophone: ImageVector? = null
