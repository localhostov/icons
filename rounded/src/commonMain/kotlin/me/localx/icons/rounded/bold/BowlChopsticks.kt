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

public val Icons.Bold.BowlChopsticks: ImageVector
    get() {
        if (_bowlChopsticks != null) {
            return _bowlChopsticks!!
        }
        _bowlChopsticks = Builder(name = "BowlChopsticks", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.735f, 10.0f)
                lineTo(4.265f, 10.0f)
                curveToRelative(-1.326f, 0.0f, -2.6f, 0.631f, -3.407f, 1.688f)
                curveTo(0.065f, 12.727f, -0.194f, 14.036f, 0.146f, 15.28f)
                curveToRelative(0.689f, 2.522f, 2.083f, 4.767f, 4.031f, 6.49f)
                curveToRelative(1.626f, 1.438f, 3.799f, 2.229f, 6.119f, 2.229f)
                horizontalLineToRelative(3.408f)
                curveToRelative(2.32f, 0.0f, 4.493f, -0.792f, 6.119f, -2.23f)
                curveToRelative(1.948f, -1.723f, 3.341f, -3.967f, 4.031f, -6.489f)
                curveToRelative(0.34f, -1.244f, 0.081f, -2.554f, -0.712f, -3.593f)
                curveToRelative(-0.807f, -1.057f, -2.081f, -1.688f, -3.407f, -1.688f)
                close()
                moveTo(20.961f, 14.489f)
                curveToRelative(-0.535f, 1.958f, -1.616f, 3.698f, -3.125f, 5.033f)
                curveToRelative(-1.077f, 0.953f, -2.544f, 1.478f, -4.131f, 1.478f)
                horizontalLineToRelative(-3.408f)
                curveToRelative(-1.587f, 0.0f, -3.054f, -0.524f, -4.131f, -1.477f)
                curveToRelative(-1.51f, -1.336f, -2.59f, -3.076f, -3.125f, -5.034f)
                curveToRelative(-0.125f, -0.458f, 0.074f, -0.812f, 0.204f, -0.981f)
                curveToRelative(0.247f, -0.322f, 0.619f, -0.508f, 1.022f, -0.508f)
                horizontalLineToRelative(15.47f)
                curveToRelative(0.403f, 0.0f, 0.775f, 0.186f, 1.022f, 0.508f)
                curveToRelative(0.13f, 0.17f, 0.329f, 0.523f, 0.204f, 0.981f)
                close()
                moveTo(3.002f, 2.583f)
                curveToRelative(-0.046f, -0.827f, 0.587f, -1.535f, 1.415f, -1.581f)
                lineTo(22.417f, 0.002f)
                curveToRelative(0.824f, -0.031f, 1.535f, 0.588f, 1.581f, 1.415f)
                reflectiveCurveToRelative(-0.587f, 1.535f, -1.415f, 1.581f)
                curveToRelative(0.0f, 0.0f, -18.056f, 1.002f, -18.084f, 1.002f)
                curveToRelative(-0.79f, 0.0f, -1.452f, -0.618f, -1.496f, -1.417f)
                close()
                moveTo(3.0f, 6.5f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(4.5f, 8.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _bowlChopsticks!!
    }

private var _bowlChopsticks: ImageVector? = null
