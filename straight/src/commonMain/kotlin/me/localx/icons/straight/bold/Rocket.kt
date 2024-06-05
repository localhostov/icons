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

public val Icons.Bold.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                close()
                moveTo(16.5f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                close()
                moveTo(10.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                close()
                moveTo(23.841f, 3.553f)
                lineTo(23.766f, 3.762f)
                curveToRelative(-1.488f, 4.126f, -2.906f, 8.051f, -5.823f, 11.538f)
                arcToRelative(13.989f, 13.989f, 0.0f, false, true, -4.772f, 8.7f)
                horizontalLineToRelative(-4.171f)
                verticalLineToRelative(-3.333f)
                lineToRelative(-1.773f, -1.773f)
                lineToRelative(-2.027f, 2.026f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.026f, -2.027f)
                lineToRelative(-1.773f, -1.773f)
                horizontalLineToRelative(-3.333f)
                verticalLineToRelative(-4.171f)
                arcToRelative(13.211f, 13.211f, 0.0f, false, true, 8.766f, -4.829f)
                curveToRelative(3.47f, -2.88f, 7.372f, -4.288f, 11.472f, -5.766f)
                lineToRelative(0.209f, -0.075f)
                arcToRelative(2.652f, 2.652f, 0.0f, false, true, 3.394f, 3.394f)
                close()
                moveTo(20.768f, 3.232f)
                curveToRelative(-4.356f, 1.573f, -8.133f, 3.008f, -11.368f, 6.24f)
                arcToRelative(24.084f, 24.084f, 0.0f, false, false, -3.16f, 4.2f)
                lineToRelative(4.088f, 4.088f)
                arcToRelative(24.242f, 24.242f, 0.0f, false, false, 4.2f, -3.159f)
                curveToRelative(3.232f, -3.236f, 4.672f, -7.013f, 6.24f, -11.369f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
