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

public val Icons.Outline.ShoePrints: ImageVector
    get() {
        if (_shoePrints != null) {
            return _shoePrints!!
        }
        _shoePrints = Builder(name = "ShoePrints", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                curveToRelative(-2.408f, 0.0f, -5.0f, 2.19f, -5.0f, 7.0f)
                curveToRelative(0.0f, 1.736f, 0.816f, 3.369f, 1.605f, 4.947f)
                curveToRelative(0.717f, 1.434f, 1.395f, 2.789f, 1.395f, 4.053f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.377f, 0.229f, -2.291f, 0.47f, -3.257f)
                curveToRelative(0.261f, -1.042f, 0.53f, -2.12f, 0.53f, -3.743f)
                curveToRelative(0.0f, -7.383f, -4.331f, -9.0f, -6.0f, -9.0f)
                close()
                moveTo(21.0f, 20.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(21.53f, 14.257f)
                curveToRelative(-0.203f, 0.812f, -0.412f, 1.646f, -0.494f, 2.743f)
                horizontalLineToRelative(-3.123f)
                curveToRelative(-0.23f, -1.368f, -0.883f, -2.675f, -1.519f, -3.947f)
                curveToRelative(-0.717f, -1.434f, -1.395f, -2.789f, -1.395f, -4.053f)
                curveToRelative(0.0f, -3.283f, 1.509f, -5.0f, 3.0f, -5.0f)
                curveToRelative(0.04f, 0.0f, 4.0f, 0.19f, 4.0f, 7.0f)
                curveToRelative(0.0f, 1.377f, -0.229f, 2.291f, -0.47f, 3.257f)
                close()
                moveTo(6.0f, 0.0f)
                curveTo(4.331f, 0.0f, 0.0f, 1.617f, 0.0f, 9.0f)
                curveToRelative(0.0f, 1.623f, 0.27f, 2.701f, 0.53f, 3.743f)
                curveToRelative(0.241f, 0.967f, 0.47f, 1.88f, 0.47f, 3.257f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.264f, 0.678f, -2.619f, 1.395f, -4.053f)
                curveToRelative(0.789f, -1.579f, 1.605f, -3.211f, 1.605f, -4.947f)
                curveTo(11.0f, 2.19f, 8.408f, 0.0f, 6.0f, 0.0f)
                close()
                moveTo(6.0f, 18.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(7.605f, 11.053f)
                curveToRelative(-0.636f, 1.272f, -1.289f, 2.579f, -1.519f, 3.947f)
                lineTo(2.964f, 15.0f)
                curveToRelative(-0.082f, -1.097f, -0.291f, -1.931f, -0.494f, -2.743f)
                curveToRelative(-0.241f, -0.967f, -0.47f, -1.88f, -0.47f, -3.257f)
                curveTo(2.0f, 2.19f, 5.96f, 2.0f, 6.0f, 2.0f)
                curveToRelative(1.491f, 0.0f, 3.0f, 1.717f, 3.0f, 5.0f)
                curveToRelative(0.0f, 1.264f, -0.678f, 2.619f, -1.395f, 4.053f)
                close()
            }
        }
        .build()
        return _shoePrints!!
    }

private var _shoePrints: ImageVector? = null
