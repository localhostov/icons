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

public val Icons.Filled.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) {
            return _swipeRight!!
        }
        _swipeRight = Builder(name = "SwipeRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.0f)
                curveToRelative(0.0f, 0.617f, -0.24f, 1.197f, -0.678f, 1.634f)
                lineToRelative(-2.072f, 2.073f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.292f, -1.293f)
                horizontalLineToRelative(-6.128f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.128f)
                lineToRelative(-1.292f, -1.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.073f, 2.074f)
                curveToRelative(0.437f, 0.436f, 0.677f, 1.016f, 0.677f, 1.633f)
                close()
                moveTo(18.115f, 11.855f)
                lineToRelative(-8.115f, -2.355f)
                lineTo(10.0f, 2.107f)
                curveToRelative(0.0f, -0.996f, -0.681f, -1.92f, -1.664f, -2.08f)
                curveToRelative(-1.253f, -0.204f, -2.336f, 0.758f, -2.336f, 1.973f)
                verticalLineToRelative(14.899f)
                lineToRelative(-2.252f, -2.292f)
                curveToRelative(-0.097f, -0.097f, -0.265f, -0.222f, -0.487f, -0.367f)
                curveToRelative(-0.931f, -0.519f, -2.157f, -0.313f, -2.853f, 0.619f)
                curveToRelative(-0.667f, 0.894f, -0.482f, 2.169f, 0.305f, 2.958f)
                lineToRelative(3.977f, 4.073f)
                curveToRelative(1.317f, 1.349f, 3.123f, 2.109f, 5.008f, 2.109f)
                horizontalLineToRelative(7.301f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                verticalLineToRelative(-4.304f)
                curveToRelative(0.0f, -1.78f, -1.176f, -3.345f, -2.885f, -3.841f)
                close()
            }
        }
        .build()
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
