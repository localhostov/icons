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

public val Icons.Outline.VrCardboard: ImageVector
    get() {
        if (_vrCardboard != null) {
            return _vrCardboard!!
        }
        _vrCardboard = Builder(name = "VrCardboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveTo(2.243f, 3.0f, 0.0f, 5.243f, 0.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(2.352f)
                curveToRelative(1.062f, 0.0f, 2.056f, -0.57f, 2.592f, -1.488f)
                lineToRelative(1.189f, -2.039f)
                curveToRelative(0.262f, -0.45f, 0.693f, -0.499f, 0.867f, -0.499f)
                reflectiveCurveToRelative(0.605f, 0.048f, 0.867f, 0.499f)
                lineToRelative(1.19f, 2.039f)
                curveToRelative(0.535f, 0.918f, 1.528f, 1.488f, 2.591f, 1.488f)
                horizontalLineToRelative(2.352f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 16.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.352f)
                curveToRelative(-0.354f, 0.0f, -0.686f, -0.19f, -0.863f, -0.496f)
                lineToRelative(-1.189f, -2.039f)
                curveToRelative(-0.545f, -0.934f, -1.515f, -1.491f, -2.596f, -1.491f)
                reflectiveCurveToRelative(-2.051f, 0.557f, -2.596f, 1.491f)
                lineToRelative(-1.188f, 2.039f)
                curveToRelative(-0.179f, 0.306f, -0.51f, 0.496f, -0.864f, 0.496f)
                horizontalLineToRelative(-2.352f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(16.5f, 7.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(16.5f, 12.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7.5f, 7.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(7.5f, 12.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _vrCardboard!!
    }

private var _vrCardboard: ImageVector? = null
