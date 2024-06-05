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

public val Icons.Filled.BadgeLeaf: ImageVector
    get() {
        if (_badgeLeaf != null) {
            return _badgeLeaf!!
        }
        _badgeLeaf = Builder(name = "BadgeLeaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 12.0f)
                curveToRelative(0.0f, 1.302f, -0.839f, 2.402f, -2.0f, 2.816f)
                verticalLineToRelative(-3.816f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.816f)
                curveToRelative(-1.161f, -0.414f, -2.0f, -1.514f, -2.0f, -2.816f)
                curveToRelative(0.0f, -1.63f, 1.673f, -3.874f, 2.861f, -4.946f)
                curveToRelative(0.04f, -0.036f, 0.09f, -0.054f, 0.139f, -0.054f)
                curveToRelative(0.05f, 0.0f, 0.099f, 0.018f, 0.139f, 0.053f)
                curveToRelative(1.188f, 1.073f, 2.861f, 3.316f, 2.861f, 4.947f)
                close()
                moveTo(22.041f, 16.208f)
                curveToRelative(0.174f, 1.537f, -0.405f, 3.127f, -1.555f, 4.277f)
                curveToRelative(-1.15f, 1.15f, -2.741f, 1.728f, -4.362f, 1.59f)
                curveToRelative(-0.963f, 1.21f, -2.497f, 1.925f, -4.124f, 1.925f)
                reflectiveCurveToRelative(-3.16f, -0.714f, -4.208f, -1.959f)
                curveToRelative(-1.531f, 0.179f, -3.126f, -0.405f, -4.277f, -1.555f)
                reflectiveCurveToRelative(-1.729f, -2.74f, -1.59f, -4.362f)
                curveToRelative(-1.21f, -0.963f, -1.925f, -2.497f, -1.925f, -4.124f)
                reflectiveCurveToRelative(0.714f, -3.16f, 1.959f, -4.208f)
                curveToRelative(-0.174f, -1.537f, 0.405f, -3.127f, 1.555f, -4.277f)
                curveToRelative(1.149f, -1.15f, 2.738f, -1.733f, 4.362f, -1.59f)
                curveToRelative(0.963f, -1.21f, 2.497f, -1.925f, 4.124f, -1.925f)
                reflectiveCurveToRelative(3.16f, 0.714f, 4.208f, 1.959f)
                curveToRelative(1.535f, -0.171f, 3.126f, 0.405f, 4.277f, 1.555f)
                curveToRelative(1.15f, 1.15f, 1.729f, 2.74f, 1.59f, 4.362f)
                curveToRelative(1.21f, 0.963f, 1.925f, 2.497f, 1.925f, 4.124f)
                reflectiveCurveToRelative(-0.714f, 3.16f, -1.959f, 4.208f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(0.0f, -2.573f, -2.303f, -5.332f, -3.522f, -6.432f)
                curveToRelative(-0.843f, -0.76f, -2.114f, -0.761f, -2.957f, 0.0f)
                curveToRelative(-1.218f, 1.099f, -3.521f, 3.858f, -3.521f, 6.431f)
                curveToRelative(0.0f, 2.414f, 1.721f, 4.434f, 4.0f, 4.899f)
                verticalLineToRelative(1.101f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.101f)
                curveToRelative(2.279f, -0.465f, 4.0f, -2.484f, 4.0f, -4.899f)
                close()
            }
        }
        .build()
        return _badgeLeaf!!
    }

private var _badgeLeaf: ImageVector? = null
