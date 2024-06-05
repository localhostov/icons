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

public val Icons.Bold.Wink: ImageVector
    get() {
        if (_wink != null) {
            return _wink!!
        }
        _wink = Builder(name = "Wink", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 7.0f)
                arcTo(2.587f, 2.587f, 0.0f, false, true, 18.0f, 9.667f)
                curveTo(18.0f, 11.0f, 16.881f, 11.0f, 15.5f, 11.0f)
                reflectiveCurveTo(13.0f, 11.0f, 13.0f, 9.667f)
                arcTo(2.587f, 2.587f, 0.0f, false, true, 15.5f, 7.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -9.0f, -9.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, true, 21.0f, 12.0f)
                close()
                moveTo(17.557f, 15.564f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.109f, -2.133f)
                arcTo(5.814f, 5.814f, 0.0f, false, true, 12.0f, 15.0f)
                arcToRelative(5.812f, 5.812f, 0.0f, false, true, -3.443f, -1.564f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.114f, 2.128f)
                arcTo(8.813f, 8.813f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(8.813f, 8.813f, 0.0f, false, false, 17.557f, 15.564f)
                close()
                moveTo(11.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 8.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 9.5f)
                close()
            }
        }
        .build()
        return _wink!!
    }

private var _wink: ImageVector? = null
