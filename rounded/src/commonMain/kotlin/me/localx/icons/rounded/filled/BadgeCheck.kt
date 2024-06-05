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

public val Icons.Filled.BadgeCheck: ImageVector
    get() {
        if (_badgeCheck != null) {
            return _badgeCheck!!
        }
        _badgeCheck = Builder(name = "BadgeCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, -1.626f, -0.714f, -3.16f, -1.925f, -4.124f)
                curveToRelative(0.14f, -1.622f, -0.44f, -3.211f, -1.59f, -4.362f)
                curveToRelative(-1.15f, -1.149f, -2.735f, -1.728f, -4.277f, -1.555f)
                curveToRelative(-2.014f, -2.556f, -6.365f, -2.604f, -8.332f, -0.035f)
                curveToRelative(-1.624f, -0.144f, -3.211f, 0.439f, -4.361f, 1.59f)
                curveToRelative(-1.149f, 1.15f, -1.729f, 2.74f, -1.555f, 4.277f)
                curveToRelative(-2.556f, 2.014f, -2.605f, 6.365f, -0.035f, 8.333f)
                curveToRelative(-0.14f, 1.622f, 0.44f, 3.211f, 1.59f, 4.362f)
                curveToRelative(1.15f, 1.149f, 2.737f, 1.73f, 4.277f, 1.555f)
                curveToRelative(2.014f, 2.556f, 6.365f, 2.604f, 8.332f, 0.035f)
                curveToRelative(1.62f, 0.136f, 3.21f, -0.439f, 4.361f, -1.59f)
                curveToRelative(1.149f, -1.15f, 1.729f, -2.74f, 1.555f, -4.277f)
                curveToRelative(1.246f, -1.048f, 1.96f, -2.582f, 1.96f, -4.208f)
                close()
                moveTo(17.54f, 10.566f)
                lineToRelative(-4.739f, 4.568f)
                curveToRelative(-1.163f, 1.161f, -3.066f, 1.151f, -4.229f, -0.013f)
                lineToRelative(-2.252f, -2.092f)
                curveToRelative(-0.404f, -0.376f, -0.428f, -1.009f, -0.052f, -1.413f)
                curveToRelative(0.377f, -0.405f, 1.011f, -0.427f, 1.413f, -0.052f)
                lineToRelative(2.278f, 2.117f)
                curveToRelative(0.418f, 0.417f, 1.05f, 0.416f, 1.44f, 0.025f)
                lineToRelative(4.752f, -4.581f)
                curveToRelative(0.398f, -0.382f, 1.031f, -0.371f, 1.414f, 0.026f)
                curveToRelative(0.384f, 0.397f, 0.372f, 1.031f, -0.025f, 1.414f)
                close()
            }
        }
        .build()
        return _badgeCheck!!
    }

private var _badgeCheck: ImageVector? = null
