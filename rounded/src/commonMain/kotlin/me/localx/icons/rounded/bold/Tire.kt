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

public val Icons.Bold.Tire: ImageVector
    get() {
        if (_tire != null) {
            return _tire!!
        }
        _tire = Builder(name = "Tire", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, -9.0f, -9.0f)
                curveTo(3.452f, 0.077f, 20.549f, 0.08f, 21.0f, 12.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, true, 12.0f, 21.0f)
                close()
                moveTo(8.842f, 13.978f)
                lineTo(6.813f, 16.684f)
                arcToRelative(6.957f, 6.957f, 0.0f, false, true, -1.75f, -5.575f)
                lineTo(8.414f, 12.45f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.842f, 13.978f)
                close()
                moveTo(9.129f, 9.505f)
                lineTo(6.078f, 8.284f)
                arcTo(7.016f, 7.016f, 0.0f, false, true, 10.5f, 5.166f)
                verticalLineToRelative(3.41f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.129f, 9.505f)
                close()
                moveTo(17.922f, 8.285f)
                lineTo(14.871f, 9.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.5f, 8.576f)
                lineTo(13.5f, 5.166f)
                arcTo(7.014f, 7.014f, 0.0f, false, true, 17.922f, 8.285f)
                close()
                moveTo(19.0f, 12.0f)
                arcToRelative(6.963f, 6.963f, 0.0f, false, true, -1.813f, 4.684f)
                lineToRelative(-2.029f, -2.706f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.428f, -1.528f)
                lineToRelative(3.351f, -1.341f)
                arcTo(7.091f, 7.091f, 0.0f, false, true, 19.0f, 12.0f)
                close()
                moveTo(12.8f, 15.836f)
                lineTo(14.75f, 18.436f)
                arcToRelative(7.038f, 7.038f, 0.0f, false, true, -5.5f, 0.0f)
                lineToRelative(1.95f, -2.6f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.8f, 15.836f)
                close()
            }
        }
        .build()
        return _tire!!
    }

private var _tire: ImageVector? = null
