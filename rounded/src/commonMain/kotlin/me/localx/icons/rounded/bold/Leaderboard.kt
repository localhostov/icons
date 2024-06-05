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

public val Icons.Bold.Leaderboard: ImageVector
    get() {
        if (_leaderboard != null) {
            return _leaderboard!!
        }
        _leaderboard = Builder(name = "Leaderboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.625f, 7.862f)
                curveToRelative(-0.549f, -0.622f, -1.497f, -0.68f, -2.117f, -0.132f)
                curveToRelative(-0.621f, 0.548f, -0.68f, 1.496f, -0.132f, 2.117f)
                curveToRelative(0.291f, 0.329f, 0.483f, 0.728f, 0.57f, 1.153f)
                lineTo(3.047f, 11.0f)
                curveToRelative(0.084f, -0.455f, 0.279f, -0.871f, 0.573f, -1.202f)
                curveToRelative(0.551f, -0.619f, 0.495f, -1.567f, -0.124f, -2.118f)
                curveToRelative(-0.62f, -0.551f, -1.567f, -0.495f, -2.118f, 0.124f)
                curveToRelative(-0.89f, 1.0f, -1.379f, 2.312f, -1.379f, 3.696f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.342f, -0.489f, -2.634f, -1.375f, -3.638f)
                close()
                moveTo(10.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(3.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(3.051f, 19.0f)
                horizontalLineToRelative(3.949f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.207f, 0.0f, -2.217f, -0.86f, -2.449f, -2.0f)
                close()
                moveTo(18.5f, 21.0f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.949f)
                curveToRelative(-0.232f, 1.14f, -1.242f, 2.0f, -2.449f, 2.0f)
                close()
                moveTo(6.0f, 6.664f)
                lineTo(6.0f, 1.023f)
                curveToRelative(0.0f, -0.395f, 0.222f, -0.742f, 0.58f, -0.908f)
                curveToRelative(0.329f, -0.149f, 0.718f, -0.128f, 0.972f, 0.054f)
                curveToRelative(0.042f, 0.03f, 1.738f, 2.29f, 1.738f, 2.29f)
                lineToRelative(1.631f, -1.964f)
                curveToRelative(0.607f, -0.607f, 1.539f, -0.621f, 2.105f, -0.06f)
                lineToRelative(1.712f, 2.021f)
                lineToRelative(1.468f, -2.061f)
                curveToRelative(0.29f, -0.355f, 0.729f, -0.479f, 1.13f, -0.336f)
                curveToRelative(0.404f, 0.146f, 0.664f, 0.515f, 0.664f, 0.942f)
                verticalLineToRelative(5.68f)
                curveToRelative(0.0f, 0.624f, -0.243f, 1.21f, -0.685f, 1.651f)
                curveToRelative(-0.441f, 0.44f, -1.026f, 0.682f, -1.649f, 0.682f)
                horizontalLineToRelative(-0.004f)
                lineToRelative(-7.333f, -0.017f)
                curveToRelative(-1.284f, -0.003f, -2.328f, -1.05f, -2.328f, -2.333f)
                close()
            }
        }
        .build()
        return _leaderboard!!
    }

private var _leaderboard: ImageVector? = null
