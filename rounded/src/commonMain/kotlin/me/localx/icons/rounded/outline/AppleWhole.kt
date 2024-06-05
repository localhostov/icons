package me.localx.icons.rounded.outline

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

public val Icons.Outline.AppleWhole: ImageVector
    get() {
        if (_appleWhole != null) {
            return _appleWhole!!
        }
        _appleWhole = Builder(name = "AppleWhole", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.246f, 6.193f)
                verticalLineToRelative(0.0f)
                arcToRelative(6.744f, 6.744f, 0.0f, false, false, 1.737f, -3.94f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.749f, 0.016f)
                arcTo(6.318f, 6.318f, 0.0f, false, false, 12.133f, 2.6f)
                arcTo(8.162f, 8.162f, 0.0f, false, false, 10.711f, 0.271f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.428f, 1.4f)
                arcTo(7.583f, 7.583f, 0.0f, false, true, 10.942f, 6.0f)
                horizontalLineTo(8.5f)
                arcTo(8.771f, 8.771f, 0.0f, false, false, 0.0f, 15.0f)
                curveToRelative(-0.161f, 5.6f, 5.644f, 10.773f, 10.75f, 8.385f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.605f, 0.019f)
                arcTo(4.444f, 4.444f, 0.0f, false, false, 15.5f, 24.0f)
                curveTo(25.764f, 23.716f, 27.066f, 8.582f, 17.246f, 6.193f)
                close()
                moveTo(14.223f, 3.168f)
                arcTo(4.783f, 4.783f, 0.0f, false, true, 17.0f, 2.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, true, -1.167f, 2.772f)
                arcToRelative(4.793f, 4.793f, 0.0f, false, true, -2.778f, 1.168f)
                arcTo(4.785f, 4.785f, 0.0f, false, true, 14.223f, 3.168f)
                close()
                moveTo(15.5f, 22.0f)
                arcToRelative(2.542f, 2.542f, 0.0f, false, true, -1.244f, -0.381f)
                arcTo(4.62f, 4.62f, 0.0f, false, false, 12.0f, 21.0f)
                arcToRelative(4.527f, 4.527f, 0.0f, false, false, -2.137f, 0.593f)
                curveTo(6.005f, 23.261f, 1.9f, 19.141f, 2.0f, 15.0f)
                arcTo(6.772f, 6.772f, 0.0f, false, true, 8.5f, 8.0f)
                horizontalLineToRelative(7.0f)
                curveTo(24.1f, 8.321f, 24.1f, 21.682f, 15.5f, 22.0f)
                close()
            }
        }
        .build()
        return _appleWhole!!
    }

private var _appleWhole: ImageVector? = null
