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

public val Icons.Bold.GolfBall: ImageVector
    get() {
        if (_golfBall != null) {
            return _golfBall!!
        }
        _golfBall = Builder(name = "GolfBall", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 8.062f, 17.091f)
                arcToRelative(4.66f, 4.66f, 0.0f, false, false, 1.37f, 2.56f)
                lineTo(10.5f, 20.719f)
                lineTo(10.5f, 22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(13.5f, 20.719f)
                lineToRelative(1.068f, -1.068f)
                arcToRelative(4.667f, 4.667f, 0.0f, false, false, 1.37f, -2.56f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.0f, -6.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, true, 12.0f, 15.0f)
                close()
                moveTo(14.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 12.5f)
                close()
                moveTo(15.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 14.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 8.0f)
                close()
                moveTo(11.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 13.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 10.0f)
                close()
            }
        }
        .build()
        return _golfBall!!
    }

private var _golfBall: ImageVector? = null
