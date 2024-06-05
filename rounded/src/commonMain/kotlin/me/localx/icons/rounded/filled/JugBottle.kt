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

public val Icons.Filled.JugBottle: ImageVector
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
                moveTo(20.0f, 15.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-6.022f)
                curveToRelative(0.0f, -0.816f, 0.684f, -1.478f, 1.5f, -1.478f)
                curveToRelative(0.816f, 0.0f, 1.5f, 0.662f, 1.5f, 1.478f)
                verticalLineToRelative(6.022f)
                close()
            }
        }
        .build()
        return _jugBottle!!
    }

private var _jugBottle: ImageVector? = null
