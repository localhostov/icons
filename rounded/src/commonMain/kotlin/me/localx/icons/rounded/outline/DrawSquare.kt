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

public val Icons.Outline.DrawSquare: ImageVector
    get() {
        if (_drawSquare != null) {
            return _drawSquare!!
        }
        _drawSquare = Builder(name = "DrawSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 17.338f)
                lineTo(22.0f, 6.662f)
                curveToRelative(1.181f, -0.563f, 2.0f, -1.769f, 2.0f, -3.162f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.393f, 0.0f, -2.599f, 0.819f, -3.162f, 2.0f)
                lineTo(6.662f, 2.0f)
                curveToRelative(-0.563f, -1.181f, -1.769f, -2.0f, -3.162f, -2.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                curveToRelative(0.0f, 1.393f, 0.819f, 2.599f, 2.0f, 3.162f)
                verticalLineToRelative(10.677f)
                curveToRelative(-1.181f, 0.563f, -2.0f, 1.769f, -2.0f, 3.162f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.393f, 0.0f, 2.599f, -0.819f, 3.162f, -2.0f)
                horizontalLineToRelative(10.677f)
                curveToRelative(0.563f, 1.181f, 1.769f, 2.0f, 3.162f, 2.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.393f, -0.819f, -2.599f, -2.0f, -3.162f)
                close()
                moveTo(17.036f, 20.0f)
                lineTo(6.964f, 20.0f)
                curveToRelative(-0.22f, -1.53f, -1.434f, -2.744f, -2.964f, -2.964f)
                lineTo(4.0f, 6.964f)
                curveToRelative(1.53f, -0.22f, 2.744f, -1.434f, 2.964f, -2.964f)
                horizontalLineToRelative(10.072f)
                curveToRelative(0.22f, 1.53f, 1.434f, 2.744f, 2.964f, 2.964f)
                verticalLineToRelative(10.072f)
                curveToRelative(-1.53f, 0.22f, -2.744f, 1.434f, -2.964f, 2.964f)
                close()
                moveTo(20.5f, 2.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3.5f, 2.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3.5f, 22.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20.5f, 22.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _drawSquare!!
    }

private var _drawSquare: ImageVector? = null
