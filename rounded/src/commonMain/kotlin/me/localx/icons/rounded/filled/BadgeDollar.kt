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

public val Icons.Filled.BadgeDollar: ImageVector
    get() {
        if (_badgeDollar != null) {
            return _badgeDollar!!
        }
        _badgeDollar = Builder(name = "BadgeDollar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, -1.626f, -0.714f, -3.16f, -1.925f, -4.124f)
                curveToRelative(0.14f, -1.622f, -0.44f, -3.211f, -1.59f, -4.362f)
                curveToRelative(-1.15f, -1.149f, -2.734f, -1.731f, -4.277f, -1.555f)
                curveToRelative(-2.014f, -2.556f, -6.365f, -2.605f, -8.332f, -0.035f)
                curveToRelative(-1.624f, -0.14f, -3.212f, 0.439f, -4.362f, 1.59f)
                curveToRelative(-1.15f, 1.15f, -1.729f, 2.74f, -1.555f, 4.277f)
                curveToRelative(-2.555f, 2.014f, -2.605f, 6.366f, -0.035f, 8.332f)
                curveToRelative(-0.14f, 1.622f, 0.44f, 3.212f, 1.59f, 4.362f)
                curveToRelative(1.15f, 1.151f, 2.744f, 1.732f, 4.277f, 1.555f)
                curveToRelative(2.015f, 2.556f, 6.365f, 2.605f, 8.333f, 0.035f)
                curveToRelative(1.618f, 0.139f, 3.21f, -0.439f, 4.361f, -1.59f)
                curveToRelative(1.149f, -1.15f, 1.729f, -2.74f, 1.555f, -4.277f)
                curveToRelative(1.246f, -1.048f, 1.96f, -2.582f, 1.96f, -4.208f)
                close()
                moveTo(13.0f, 17.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.006f, 1.308f, -1.994f, 1.307f, -2.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.268f)
                curveToRelative(-1.319f, 0.125f, -3.767f, -1.645f, -2.233f, -2.865f)
                curveToRelative(0.477f, -0.277f, 1.089f, -0.113f, 1.366f, 0.365f)
                curveToRelative(0.178f, 0.308f, 0.511f, 0.5f, 0.867f, 0.5f)
                horizontalLineToRelative(2.268f)
                curveToRelative(0.997f, 0.065f, 1.442f, -1.55f, 0.356f, -1.76f)
                lineToRelative(-3.042f, -0.507f)
                curveToRelative(-3.501f, -0.65f, -2.747f, -5.753f, 0.685f, -5.733f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.006f, -1.308f, 1.994f, -1.307f, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.268f)
                curveToRelative(1.067f, 0.0f, 2.063f, 0.575f, 2.598f, 1.5f)
                curveToRelative(0.277f, 0.478f, 0.113f, 1.089f, -0.364f, 1.366f)
                curveToRelative(-0.48f, 0.276f, -1.092f, 0.113f, -1.366f, -0.365f)
                curveToRelative(-0.179f, -0.309f, -0.511f, -0.5f, -0.867f, -0.5f)
                horizontalLineToRelative(-2.268f)
                curveToRelative(-0.997f, -0.065f, -1.443f, 1.55f, -0.356f, 1.76f)
                lineToRelative(3.041f, 0.507f)
                curveToRelative(3.502f, 0.649f, 2.748f, 5.753f, -0.685f, 5.733f)
                close()
            }
        }
        .build()
        return _badgeDollar!!
    }

private var _badgeDollar: ImageVector? = null
