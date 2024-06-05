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

public val Icons.Bold.BroomBall: ImageVector
    get() {
        if (_broomBall != null) {
            return _broomBall!!
        }
        _broomBall = Builder(name = "BroomBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(15.66f, 11.781f)
                curveToRelative(0.561f, 0.561f, 0.407f, 1.506f, -0.302f, 1.86f)
                lineToRelative(-1.58f, 0.79f)
                curveToRelative(0.146f, 0.526f, 0.222f, 1.075f, 0.222f, 1.636f)
                curveToRelative(0.0f, 1.621f, -0.631f, 3.145f, -1.777f, 4.291f)
                curveToRelative(-0.426f, 0.425f, -1.721f, 1.721f, -8.887f, 3.558f)
                curveToRelative(-0.225f, 0.058f, -0.451f, 0.086f, -0.675f, 0.086f)
                curveToRelative(-0.697f, 0.0f, -1.368f, -0.273f, -1.878f, -0.784f)
                curveToRelative(-0.674f, -0.674f, -0.936f, -1.629f, -0.698f, -2.554f)
                curveToRelative(1.839f, -7.167f, 3.132f, -8.461f, 3.558f, -8.886f)
                curveToRelative(1.146f, -1.146f, 2.67f, -1.777f, 4.29f, -1.777f)
                curveToRelative(0.561f, 0.0f, 1.11f, 0.076f, 1.636f, 0.222f)
                lineToRelative(0.79f, -1.58f)
                curveToRelative(0.355f, -0.709f, 1.3f, -0.862f, 1.86f, -0.302f)
                lineToRelative(0.66f, 0.66f)
                lineTo(21.439f, 0.439f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                lineToRelative(-8.561f, 8.561f)
                lineToRelative(0.66f, 0.66f)
                close()
                moveTo(11.0f, 16.067f)
                curveToRelative(0.0f, -0.819f, -0.319f, -1.589f, -0.898f, -2.168f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.579f, -0.58f, -1.35f, -0.899f, -2.169f, -0.899f)
                reflectiveCurveToRelative(-1.59f, 0.319f, -2.169f, 0.899f)
                curveToRelative(-0.504f, 0.504f, -1.485f, 2.631f, -2.632f, 6.969f)
                curveToRelative(4.337f, -1.145f, 6.464f, -2.127f, 6.97f, -2.632f)
                curveToRelative(0.579f, -0.58f, 0.898f, -1.35f, 0.898f, -2.169f)
                close()
            }
        }
        .build()
        return _broomBall!!
    }

private var _broomBall: ImageVector? = null
