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

public val Icons.Bold.MoonStars: ImageVector
    get() {
        if (_moonStars != null) {
            return _moonStars!!
        }
        _moonStars = Builder(name = "MoonStars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 16.058f, 0.71f)
                arcToRelative(2.931f, 2.931f, 0.0f, false, true, 0.815f, 5.068f)
                curveToRelative(-5.106f, 3.917f, -5.089f, 8.54f, 0.0f, 12.444f)
                arcToRelative(2.931f, 2.931f, 0.0f, false, true, -0.816f, 5.068f)
                arcTo(12.229f, 12.229f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 2.925f, 17.508f)
                curveToRelative(-6.511f, -5.065f, -6.49f, -11.968f, 0.0f, -17.016f)
                arcTo(9.322f, 9.322f, 0.0f, false, false, 12.0f, 3.0f)
                close()
                moveTo(16.863f, 12.145f)
                lineTo(18.413f, 12.587f)
                lineTo(18.855f, 14.137f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, 2.29f, 0.0f)
                lineToRelative(0.442f, -1.55f)
                lineToRelative(1.55f, -0.442f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, 0.0f, -2.29f)
                lineToRelative(-1.55f, -0.442f)
                lineToRelative(-0.442f, -1.55f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, false, -2.29f, 0.0f)
                lineToRelative(-0.442f, 1.55f)
                lineToRelative(-1.55f, 0.442f)
                arcTo(1.191f, 1.191f, 0.0f, false, false, 16.863f, 12.145f)
                close()
                moveTo(21.0f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 18.5f)
                close()
            }
        }
        .build()
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
