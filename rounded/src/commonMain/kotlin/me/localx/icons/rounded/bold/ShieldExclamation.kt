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

public val Icons.Bold.ShieldExclamation: ImageVector
    get() {
        if (_shieldExclamation != null) {
            return _shieldExclamation!!
        }
        _shieldExclamation = Builder(name = "ShieldExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 24.0f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, true, -0.671f, -0.159f)
                lineToRelative(-0.38f, -0.191f)
                curveToRelative(-2.097f, -1.05f, -8.949f, -4.979f, -8.949f, -11.499f)
                verticalLineToRelative(-5.1f)
                arcToRelative(5.273f, 5.273f, 0.0f, false, true, 3.617f, -5.01f)
                lineToRelative(5.911f, -1.965f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, true, 0.944f, 0.0f)
                lineToRelative(5.911f, 1.96f)
                arcToRelative(5.273f, 5.273f, 0.0f, false, true, 3.617f, 5.01f)
                verticalLineToRelative(5.1f)
                curveToRelative(0.0f, 7.37f, -6.922f, 10.728f, -9.043f, 11.581f)
                lineToRelative(-0.394f, 0.159f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, true, -0.563f, 0.114f)
                close()
                moveTo(12.0f, 3.08f)
                lineTo(6.561f, 4.88f)
                arcToRelative(2.274f, 2.274f, 0.0f, false, false, -1.561f, 2.166f)
                verticalLineToRelative(5.1f)
                curveToRelative(0.0f, 4.607f, 5.143f, 7.705f, 7.068f, 8.7f)
                curveToRelative(1.9f, -0.808f, 6.932f, -3.444f, 6.932f, -8.7f)
                verticalLineToRelative(-5.1f)
                arcToRelative(2.274f, 2.274f, 0.0f, false, false, -1.561f, -2.162f)
                close()
                moveTo(13.5f, 12.5f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _shieldExclamation!!
    }

private var _shieldExclamation: ImageVector? = null
