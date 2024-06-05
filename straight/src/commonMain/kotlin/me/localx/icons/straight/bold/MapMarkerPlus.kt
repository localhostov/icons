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

public val Icons.Bold.MapMarkerPlus: ImageVector
    get() {
        if (_mapMarkerPlus != null) {
            return _mapMarkerPlus!!
        }
        _mapMarkerPlus = Builder(name = "MapMarkerPlus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.668f, 511.885f)
                lineToRelative(150.667f, -147.364f)
                curveToRelative(83.577f, -82.846f, 84.169f, -217.758f, 1.323f, -301.334f)
                reflectiveCurveToRelative(-217.758f, -84.169f, -301.334f, -1.323f)
                curveToRelative(-0.443f, 0.439f, -0.884f, 0.88f, -1.323f, 1.323f)
                curveToRelative(-83.211f, 83.213f, -83.21f, 218.126f, 0.002f, 301.337f)
                curveToRelative(0.084f, 0.084f, 0.169f, 0.169f, 0.253f, 0.253f)
                lineTo(255.668f, 511.885f)
                close()
                moveTo(150.216f, 108.38f)
                curveToRelative(58.76f, -57.732f, 153.196f, -56.898f, 210.928f, 1.862f)
                curveToRelative(56.922f, 57.936f, 57.025f, 150.767f, 0.232f, 208.829f)
                lineTo(255.668f, 422.478f)
                lineTo(150.194f, 319.327f)
                curveToRelative(-58.251f, -58.245f, -58.256f, -152.685f, -0.011f, -210.936f)
                curveToRelative(0.004f, -0.004f, 0.007f, -0.007f, 0.011f, -0.011f)
                horizontalLineTo(150.216f)
                close()
                moveTo(223.706f, 245.815f)
                horizontalLineToRelative(-53.269f)
                verticalLineToRelative(-63.923f)
                horizontalLineToRelative(53.269f)
                verticalLineToRelative(-53.269f)
                horizontalLineToRelative(63.923f)
                verticalLineToRelative(53.269f)
                horizontalLineToRelative(53.269f)
                verticalLineToRelative(63.923f)
                horizontalLineToRelative(-53.269f)
                verticalLineToRelative(53.269f)
                horizontalLineToRelative(-63.923f)
                verticalLineTo(245.815f)
                close()
            }
        }
        .build()
        return _mapMarkerPlus!!
    }

private var _mapMarkerPlus: ImageVector? = null
