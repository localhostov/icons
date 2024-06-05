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

public val Icons.Bold.SkeletonRibs: ImageVector
    get() {
        if (_skeletonRibs != null) {
            return _skeletonRibs!!
        }
        _skeletonRibs = Builder(name = "SkeletonRibs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(13.5f, 3.0f)
                lineTo(13.5f, 1.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(1.5f, 3.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                lineTo(3.907f, 6.0f)
                curveToRelative(-1.32f, 3.232f, -2.296f, 7.138f, -2.839f, 11.428f)
                curveToRelative(-0.312f, 2.467f, 0.506f, 3.988f, 1.248f, 4.829f)
                curveToRelative(0.991f, 1.125f, 2.478f, 1.744f, 4.185f, 1.744f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.707f, 0.0f, 3.193f, -0.619f, 4.185f, -1.744f)
                curveToRelative(0.741f, -0.841f, 1.56f, -2.362f, 1.247f, -4.829f)
                curveToRelative(-0.542f, -4.289f, -1.518f, -8.195f, -2.839f, -11.428f)
                horizontalLineToRelative(2.407f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                close()
                moveTo(10.5f, 6.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.994f, 9.0f)
                curveToRelative(0.36f, -1.069f, 0.755f, -2.074f, 1.185f, -3.0f)
                horizontalLineToRelative(3.321f)
                close()
                moveTo(19.52f, 15.0f)
                horizontalLineToRelative(-6.02f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.379f)
                curveToRelative(0.24f, 0.964f, 0.454f, 1.965f, 0.641f, 3.0f)
                close()
                moveTo(10.5f, 15.0f)
                lineTo(4.48f, 15.0f)
                curveToRelative(0.187f, -1.035f, 0.401f, -2.036f, 0.642f, -3.0f)
                horizontalLineToRelative(5.378f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(4.566f, 20.272f)
                curveToRelative(-0.446f, -0.506f, -0.622f, -1.295f, -0.533f, -2.272f)
                horizontalLineToRelative(6.467f)
                verticalLineToRelative(3.0f)
                lineTo(6.5f, 21.0f)
                curveToRelative(-0.59f, 0.0f, -1.404f, -0.126f, -1.934f, -0.728f)
                close()
                moveTo(19.434f, 20.272f)
                curveToRelative(-0.529f, 0.602f, -1.344f, 0.728f, -1.934f, 0.728f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.466f)
                curveToRelative(0.089f, 0.978f, -0.086f, 1.766f, -0.533f, 2.272f)
                close()
                moveTo(18.007f, 9.0f)
                horizontalLineToRelative(-4.506f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.321f)
                curveToRelative(0.43f, 0.926f, 0.825f, 1.931f, 1.185f, 3.0f)
                close()
            }
        }
        .build()
        return _skeletonRibs!!
    }

private var _skeletonRibs: ImageVector? = null
