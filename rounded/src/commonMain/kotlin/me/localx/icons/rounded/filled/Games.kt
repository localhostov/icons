package me.localx.icons.rounded.filled

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

public val Icons.Filled.Games: ImageVector
    get() {
        if (_games != null) {
            return _games!!
        }
        _games = Builder(name = "Games", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 4.5f)
                arcToRelative(6.449f, 6.449f, 0.0f, false, false, -0.995f, -3.44f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, true, 11.256f, 1.679f)
                arcToRelative(9.409f, 9.409f, 0.0f, false, true, 2.739f, 7.019f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, -3.121f, 7.117f)
                arcToRelative(11.212f, 11.212f, 0.0f, false, true, -2.623f, 1.963f)
                lineToRelative(-9.469f, -9.465f)
                arcToRelative(6.481f, 6.481f, 0.0f, false, false, 2.213f, -4.873f)
                close()
                moveTo(9.0f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -4.5f, 4.5f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, 4.5f, -4.5f)
                close()
                moveTo(7.059f, 10.473f)
                arcToRelative(6.463f, 6.463f, 0.0f, false, true, -2.559f, 0.527f)
                curveToRelative(-0.158f, 0.0f, -0.314f, -0.013f, -0.469f, -0.024f)
                arcToRelative(9.44f, 9.44f, 0.0f, false, false, 0.5f, 2.546f)
                arcToRelative(9.838f, 9.838f, 0.0f, false, false, 0.55f, 1.478f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, true, -0.081f, 0.578f)
                lineToRelative(-3.814f, 2.664f)
                verticalLineToRelative(0.014f)
                arcToRelative(3.238f, 3.238f, 0.0f, true, false, 4.634f, 4.459f)
                lineToRelative(0.01f, 0.006f)
                lineToRelative(2.57f, -3.721f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.6f, -0.119f)
                arcToRelative(10.082f, 10.082f, 0.0f, false, false, 4.514f, 1.112f)
                arcToRelative(9.33f, 9.33f, 0.0f, false, false, 2.725f, -0.34f)
                close()
            }
        }
        .build()
        return _games!!
    }

private var _games: ImageVector? = null
