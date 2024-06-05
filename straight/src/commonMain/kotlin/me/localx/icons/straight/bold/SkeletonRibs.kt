package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                moveTo(24.0f, 3.0f)
                lineTo(13.5f, 3.0f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 3.0f)
                lineTo(0.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.8f, 6.0f)
                lineTo(1.148f, 17.272f)
                curveToRelative(-0.387f, 1.646f, -0.007f, 3.349f, 1.042f, 4.674f)
                curveToRelative(1.05f, 1.325f, 2.621f, 2.085f, 4.316f, 2.085f)
                lineToRelative(10.994f, -0.032f)
                curveToRelative(1.69f, 0.0f, 3.262f, -0.76f, 4.312f, -2.085f)
                reflectiveCurveToRelative(1.43f, -3.029f, 1.042f, -4.674f)
                lineToRelative(-2.644f, -11.241f)
                horizontalLineToRelative(3.791f)
                lineTo(24.001f, 3.0f)
                close()
                moveTo(10.5f, 21.02f)
                lineToRelative(-3.998f, 0.012f)
                curveToRelative(-0.769f, 0.0f, -1.483f, -0.346f, -1.96f, -0.948f)
                curveToRelative(-0.468f, -0.591f, -0.639f, -1.349f, -0.478f, -2.083f)
                horizontalLineToRelative(6.437f)
                verticalLineToRelative(3.02f)
                close()
                moveTo(10.5f, 15.0f)
                lineTo(4.764f, 15.0f)
                lineToRelative(0.706f, -3.0f)
                horizontalLineToRelative(5.03f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(10.5f, 9.0f)
                lineTo(6.176f, 9.0f)
                lineToRelative(0.706f, -3.0f)
                horizontalLineToRelative(3.618f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(13.5f, 6.0f)
                horizontalLineToRelative(3.628f)
                lineToRelative(0.706f, 3.0f)
                horizontalLineToRelative(-4.333f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(13.5f, 12.0f)
                horizontalLineToRelative(5.039f)
                lineToRelative(0.706f, 3.0f)
                horizontalLineToRelative(-5.745f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(19.46f, 20.052f)
                curveToRelative(-0.478f, 0.602f, -1.191f, 0.948f, -1.964f, 0.948f)
                lineToRelative(-3.996f, 0.012f)
                verticalLineToRelative(-3.012f)
                horizontalLineToRelative(6.442f)
                curveToRelative(0.148f, 0.725f, -0.021f, 1.469f, -0.482f, 2.052f)
                close()
            }
        }
        .build()
        return _skeletonRibs!!
    }

private var _skeletonRibs: ImageVector? = null
