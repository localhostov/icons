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

public val Icons.Outline.JugBottle: ImageVector
    get() {
        if (_jugBottle != null) {
            return _jugBottle!!
        }
        _jugBottle = Builder(name = "JugBottle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.658f, 5.966f)
                lineToRelative(-5.658f, -0.943f)
                verticalLineToRelative(-3.023f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                verticalLineToRelative(3.178f)
                lineToRelative(-0.755f, 0.283f)
                curveToRelative(-1.941f, 0.728f, -3.245f, 2.609f, -3.245f, 4.682f)
                verticalLineToRelative(8.857f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-9.088f)
                curveToRelative(0.0f, -1.963f, -1.406f, -3.623f, -3.342f, -3.945f)
                close()
                moveTo(20.0f, 9.911f)
                verticalLineToRelative(5.588f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.013f, 0.0f, 0.023f, -0.007f, 0.036f, -0.007f)
                curveToRelative(0.858f, 0.239f, 1.464f, 1.01f, 1.464f, 1.919f)
                close()
                moveTo(17.0f, 21.999f)
                lineTo(7.0f, 21.999f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-8.857f)
                curveToRelative(0.0f, -1.244f, 0.782f, -2.373f, 1.947f, -2.809f)
                lineToRelative(1.404f, -0.526f)
                curveToRelative(0.39f, -0.146f, 0.649f, -0.52f, 0.649f, -0.937f)
                verticalLineToRelative(-3.871f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.871f)
                curveToRelative(0.0f, 0.489f, 0.354f, 0.906f, 0.835f, 0.986f)
                lineToRelative(3.807f, 0.634f)
                curveToRelative(-0.402f, 0.57f, -0.643f, 1.26f, -0.643f, 2.009f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.539f, 0.0f, 1.044f, -0.133f, 1.5f, -0.351f)
                verticalLineToRelative(0.351f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _jugBottle!!
    }

private var _jugBottle: ImageVector? = null
