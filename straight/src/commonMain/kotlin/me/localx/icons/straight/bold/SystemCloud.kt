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

public val Icons.Bold.SystemCloud: ImageVector
    get() {
        if (_systemCloud != null) {
            return _systemCloud!!
        }
        _systemCloud = Builder(name = "SystemCloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 0.692f, 0.23f, 1.815f, 0.23f, 1.815f)
                lineToRelative(-0.921f, 0.507f)
                curveToRelative(-0.808f, 0.444f, -1.309f, 1.278f, -1.309f, 2.178f)
                curveToRelative(0.0f, 1.208f, 0.86f, 2.217f, 2.0f, 2.449f)
                verticalLineToRelative(3.025f)
                curveToRelative(-2.799f, -0.254f, -5.0f, -2.611f, -5.0f, -5.475f)
                curveToRelative(0.0f, -1.647f, 0.749f, -3.19f, 2.006f, -4.226f)
                curveToRelative(-0.004f, -0.093f, -0.006f, -0.184f, -0.006f, -0.274f)
                curveTo(3.0f, 3.589f, 6.589f, 0.0f, 11.0f, 0.0f)
                curveToRelative(3.028f, 0.0f, 5.737f, 1.673f, 7.103f, 4.324f)
                curveToRelative(2.88f, 0.904f, 4.897f, 3.595f, 4.897f, 6.676f)
                curveToRelative(0.0f, 3.164f, -2.112f, 5.842f, -5.0f, 6.705f)
                verticalLineToRelative(-3.262f)
                curveToRelative(1.19f, -0.694f, 2.0f, -1.97f, 2.0f, -3.444f)
                curveToRelative(0.0f, -1.916f, -1.364f, -3.567f, -3.244f, -3.926f)
                lineToRelative(-0.808f, -0.154f)
                lineToRelative(-0.304f, -0.765f)
                curveToRelative(-0.763f, -1.917f, -2.585f, -3.155f, -4.644f, -3.155f)
                close()
                moveTo(20.5f, 19.0f)
                curveToRelative(-0.815f, 0.0f, -1.532f, 0.396f, -1.989f, 1.0f)
                horizontalLineToRelative(-2.511f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(5.511f)
                curveToRelative(0.456f, 0.604f, 1.173f, 1.0f, 1.989f, 1.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(8.0f, 20.0f)
                horizontalLineToRelative(-2.511f)
                curveToRelative(-0.456f, -0.604f, -1.173f, -1.0f, -1.989f, -1.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.815f, 0.0f, 1.532f, -0.396f, 1.989f, -1.0f)
                horizontalLineToRelative(5.511f)
                lineTo(11.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _systemCloud!!
    }

private var _systemCloud: ImageVector? = null
