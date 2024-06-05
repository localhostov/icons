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

public val Icons.Bold.Sort: ImageVector
    get() {
        if (_sort != null) {
            return _sort!!
        }
        _sort = Builder(name = "Sort", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.443f, 11.0f)
                lineTo(5.557f, 11.0f)
                arcTo(2.549f, 2.549f, 0.0f, false, true, 3.2f, 9.459f)
                arcToRelative(2.432f, 2.432f, 0.0f, false, true, 0.5f, -2.676f)
                lineTo(9.8f, 0.911f)
                arcTo(3.069f, 3.069f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(3.113f, 3.113f, 0.0f, false, true, 2.253f, 0.961f)
                lineToRelative(6.009f, 5.783f)
                arcTo(2.451f, 2.451f, 0.0f, false, true, 20.8f, 9.459f)
                arcTo(2.549f, 2.549f, 0.0f, false, true, 18.443f, 11.0f)
                close()
                moveTo(18.143f, 8.867f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(6.76f, 8.0f)
                lineTo(17.242f, 8.0f)
                lineTo(12.0f, 3.0f)
                curveToRelative(-0.016f, 0.017f, -0.106f, 0.057f, -0.123f, 0.073f)
                close()
                moveTo(12.0f, 24.0f)
                arcToRelative(3.113f, 3.113f, 0.0f, false, true, -2.253f, -0.961f)
                lineTo(3.738f, 17.256f)
                arcTo(2.451f, 2.451f, 0.0f, false, true, 3.2f, 14.541f)
                arcTo(2.549f, 2.549f, 0.0f, false, true, 5.557f, 13.0f)
                lineTo(18.443f, 13.0f)
                arcToRelative(2.549f, 2.549f, 0.0f, false, true, 2.36f, 1.541f)
                arcToRelative(2.432f, 2.432f, 0.0f, false, true, -0.5f, 2.676f)
                lineToRelative(-6.1f, 5.872f)
                arcTo(3.069f, 3.069f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(6.758f, 16.0f)
                lineTo(12.0f, 21.0f)
                curveToRelative(0.016f, -0.017f, 0.106f, -0.057f, 0.123f, -0.073f)
                lineTo(17.24f, 16.0f)
                close()
                moveTo(18.443f, 16.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _sort!!
    }

private var _sort: ImageVector? = null
