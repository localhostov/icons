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

public val Icons.Bold.PingPong: ImageVector
    get() {
        if (_pingPong != null) {
            return _pingPong!!
        }
        _pingPong = Builder(name = "PingPong", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.876f)
                arcToRelative(9.518f, 9.518f, 0.0f, false, false, -2.769f, -7.1f)
                arcToRelative(9.988f, 9.988f, 0.0f, false, false, -12.491f, -1.06f)
                arcToRelative(4.989f, 4.989f, 0.0f, true, false, -4.707f, 8.184f)
                arcToRelative(11.369f, 11.369f, 0.0f, false, false, 1.048f, 5.1f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, true, -0.081f, 0.578f)
                lineToRelative(-3.814f, 2.664f)
                verticalLineToRelative(0.014f)
                arcToRelative(3.238f, 3.238f, 0.0f, true, false, 4.634f, 4.459f)
                lineToRelative(0.01f, 0.006f)
                lineToRelative(2.57f, -3.721f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.6f, -0.119f)
                arcToRelative(10.7f, 10.7f, 0.0f, false, false, 4.462f, 1.157f)
                arcToRelative(7.468f, 7.468f, 0.0f, false, false, 1.144f, -0.08f)
                arcToRelative(9.908f, 9.908f, 0.0f, false, false, 6.251f, -2.919f)
                arcToRelative(10.565f, 10.565f, 0.0f, false, false, 3.143f, -7.163f)
                close()
                moveTo(3.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(15.378f, 16.8f)
                lineTo(7.746f, 9.171f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 2.254f, -4.171f)
                arcToRelative(4.816f, 4.816f, 0.0f, false, false, -0.049f, -0.483f)
                arcToRelative(7.028f, 7.028f, 0.0f, false, true, 9.149f, 0.383f)
                arcToRelative(6.543f, 6.543f, 0.0f, false, true, 1.9f, 4.885f)
                arcToRelative(7.587f, 7.587f, 0.0f, false, true, -2.261f, 5.133f)
                arcToRelative(6.93f, 6.93f, 0.0f, false, true, -3.361f, 1.882f)
                close()
            }
        }
        .build()
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
