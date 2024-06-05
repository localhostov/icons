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

public val Icons.Bold.DirectionSignal: ImageVector
    get() {
        if (_directionSignal != null) {
            return _directionSignal!!
        }
        _directionSignal = Builder(name = "DirectionSignal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.854f, 14.232f)
                lineToRelative(-1.207f, -1.207f)
                curveToRelative(-0.661f, -0.661f, -1.54f, -1.025f, -2.475f, -1.025f)
                horizontalLineToRelative(-4.671f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-5.503f)
                lineToRelative(0.003f, -0.492f)
                curveToRelative(0.004f, -0.828f, -0.663f, -1.503f, -1.492f, -1.508f)
                curveToRelative(-0.819f, 0.016f, -1.503f, 0.663f, -1.508f, 1.492f)
                lineToRelative(-0.003f, 0.508f)
                horizontalLineToRelative(-4.669f)
                curveToRelative(-0.935f, 0.0f, -1.814f, 0.364f, -2.475f, 1.025f)
                lineToRelative(-1.207f, 1.207f)
                curveToRelative(-0.975f, 0.975f, -0.975f, 2.561f, 0.0f, 3.535f)
                lineToRelative(1.207f, 1.207f)
                curveToRelative(0.661f, 0.661f, 1.54f, 1.025f, 2.475f, 1.025f)
                horizontalLineToRelative(4.671f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.493f)
                lineToRelative(0.007f, 2.504f)
                curveToRelative(0.002f, 0.827f, 0.673f, 1.496f, 1.5f, 1.496f)
                horizontalLineToRelative(0.004f)
                curveToRelative(0.828f, -0.002f, 1.498f, -0.676f, 1.496f, -1.504f)
                lineToRelative(-0.007f, -2.496f)
                horizontalLineToRelative(4.678f)
                curveToRelative(0.935f, 0.0f, 1.814f, -0.364f, 2.475f, -1.025f)
                lineToRelative(1.207f, -1.207f)
                curveToRelative(0.975f, -0.975f, 0.975f, -2.561f, 0.0f, -3.535f)
                close()
                moveTo(5.475f, 6.854f)
                lineToRelative(-0.854f, -0.854f)
                lineToRelative(0.854f, -0.854f)
                curveToRelative(0.095f, -0.094f, 0.22f, -0.146f, 0.354f, -0.146f)
                horizontalLineToRelative(13.171f)
                verticalLineToRelative(2.0f)
                lineTo(5.829f, 7.0f)
                curveToRelative(-0.134f, 0.0f, -0.259f, -0.052f, -0.354f, -0.146f)
                close()
                moveTo(18.526f, 16.854f)
                curveToRelative(-0.095f, 0.094f, -0.22f, 0.146f, -0.354f, 0.146f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(13.171f)
                curveToRelative(0.134f, 0.0f, 0.259f, 0.052f, 0.354f, 0.146f)
                lineToRelative(0.854f, 0.854f)
                lineToRelative(-0.854f, 0.854f)
                close()
            }
        }
        .build()
        return _directionSignal!!
    }

private var _directionSignal: ImageVector? = null
