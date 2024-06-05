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
                moveTo(14.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 12.5f)
                close()
                moveTo(13.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 11.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.0f, 8.5f)
                close()
                moveTo(14.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 15.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.0f, 9.5f)
                close()
                moveTo(16.0f, 17.061f)
                verticalLineToRelative(0.11f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, true, -0.878f, 2.121f)
                lineTo(13.5f, 20.914f)
                lineTo(13.5f, 24.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 20.914f)
                lineTo(8.879f, 19.293f)
                arcTo(2.982f, 2.982f, 0.0f, false, true, 8.0f, 17.171f)
                lineTo(8.0f, 17.06f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 8.0f, 0.0f)
                close()
                moveTo(18.0f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.0f, 6.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 18.0f, 9.0f)
                close()
            }
        }
        .build()
        return _golfBall!!
    }

private var _golfBall: ImageVector? = null
