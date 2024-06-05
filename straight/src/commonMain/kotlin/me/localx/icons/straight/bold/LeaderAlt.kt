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

public val Icons.Bold.LeaderAlt: ImageVector
    get() {
        if (_leaderAlt != null) {
            return _leaderAlt!!
        }
        _leaderAlt = Builder(name = "LeaderAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.383f)
                lineToRelative(5.836f, -3.183f)
                lineToRelative(-1.438f, -2.634f)
                lineToRelative(-5.164f, 2.817f)
                lineTo(3.5f, 6.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(21.161f, 2.839f)
                lineToRelative(-0.829f, -2.839f)
                horizontalLineToRelative(-0.647f)
                lineToRelative(-0.841f, 2.837f)
                lineToRelative(-2.844f, 0.831f)
                verticalLineToRelative(0.647f)
                lineToRelative(2.843f, 0.842f)
                lineToRelative(0.842f, 2.843f)
                horizontalLineToRelative(0.647f)
                lineToRelative(0.831f, -2.844f)
                lineToRelative(2.837f, -0.841f)
                verticalLineToRelative(-0.647f)
                lineToRelative(-2.839f, -0.829f)
                close()
                moveTo(18.004f, 9.402f)
                lineToRelative(-0.871f, -2.773f)
                lineToRelative(-4.133f, 2.254f)
                verticalLineToRelative(3.201f)
                lineToRelative(5.003f, -2.682f)
                close()
            }
        }
        .build()
        return _leaderAlt!!
    }

private var _leaderAlt: ImageVector? = null
