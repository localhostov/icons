package me.localx.icons.rounded.bold

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

public val Icons.Bold.FlyingDisc: ImageVector
    get() {
        if (_flyingDisc != null) {
            return _flyingDisc!!
        }
        _flyingDisc = Builder(name = "FlyingDisc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.886f, 2.115f)
                curveTo(18.101f, -1.671f, 10.793f, -0.291f, 5.252f, 5.252f)
                curveTo(-0.291f, 10.796f, -1.669f, 18.102f, 2.114f, 21.885f)
                curveToRelative(1.439f, 1.44f, 3.39f, 2.132f, 5.558f, 2.132f)
                curveToRelative(3.531f, 0.0f, 7.643f, -1.836f, 11.076f, -5.27f)
                curveToRelative(2.559f, -2.558f, 4.327f, -5.63f, 4.979f, -8.649f)
                curveToRelative(0.704f, -3.256f, 0.05f, -6.092f, -1.842f, -7.983f)
                close()
                moveTo(7.373f, 7.374f)
                curveToRelative(2.677f, -2.677f, 5.947f, -4.232f, 8.618f, -4.365f)
                curveToRelative(0.098f, 0.07f, 0.19f, 0.146f, 0.273f, 0.23f)
                curveToRelative(0.763f, 0.763f, 0.94f, 2.171f, 0.487f, 3.864f)
                curveToRelative(-0.537f, 2.006f, -1.846f, 4.125f, -3.686f, 5.964f)
                curveToRelative(-1.84f, 1.839f, -3.958f, 3.148f, -5.964f, 3.685f)
                curveToRelative(-1.694f, 0.453f, -3.1f, 0.275f, -3.864f, -0.488f)
                curveToRelative(-0.084f, -0.084f, -0.16f, -0.175f, -0.229f, -0.273f)
                curveToRelative(0.133f, -2.671f, 1.688f, -5.94f, 4.364f, -8.617f)
                close()
                moveTo(20.796f, 9.465f)
                curveToRelative(-0.532f, 2.463f, -2.013f, 5.006f, -4.169f, 7.162f)
                curveToRelative(-4.101f, 4.101f, -9.595f, 5.571f, -12.194f, 3.32f)
                curveToRelative(0.3f, 0.038f, 0.609f, 0.057f, 0.928f, 0.057f)
                curveToRelative(0.79f, 0.0f, 1.635f, -0.117f, 2.518f, -0.353f)
                curveToRelative(2.508f, -0.671f, 5.104f, -2.256f, 7.31f, -4.462f)
                curveToRelative(2.207f, -2.207f, 3.792f, -4.802f, 4.463f, -7.31f)
                curveToRelative(0.332f, -1.239f, 0.427f, -2.401f, 0.296f, -3.446f)
                curveToRelative(1.001f, 1.156f, 1.304f, 2.929f, 0.85f, 5.033f)
                close()
            }
        }
        .build()
        return _flyingDisc!!
    }

private var _flyingDisc: ImageVector? = null
