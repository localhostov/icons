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

public val Icons.Outline.Beer: ImageVector
    get() {
        if (_beer != null) {
            return _beer!!
        }
        _beer = Builder(name = "Beer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 9.0f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -2.016f, -3.485f)
                arcToRelative(4.093f, 4.093f, 0.0f, false, false, -2.359f, -0.5f)
                arcToRelative(0.593f, 0.593f, 0.0f, false, true, -0.54f, -0.223f)
                arcToRelative(4.509f, 4.509f, 0.0f, false, false, -7.332f, 0.229f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 2.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 7.0f)
                lineTo(1.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                horizontalLineToRelative(0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 23.0f, 15.5f)
                verticalLineToRelative(-3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 19.5f, 9.0f)
                close()
                moveTo(6.0f, 4.0f)
                arcToRelative(0.963f, 0.963f, 0.0f, false, true, 0.171f, 0.021f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.068f, -0.567f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.486f, 3.0f)
                arcToRelative(2.576f, 2.576f, 0.0f, false, false, 2.332f, 1.012f)
                arcToRelative(2.157f, 2.157f, 0.0f, false, true, 1.228f, 0.271f)
                arcTo(1.938f, 1.938f, 0.0f, false, true, 16.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 9.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(7.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 4.0f)
                close()
                moveTo(17.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(6.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(3.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 9.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineTo(11.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(21.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 17.0f)
                lineTo(19.0f, 17.0f)
                lineTo(19.0f, 11.0f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 12.5f)
                close()
            }
        }
        .build()
        return _beer!!
    }

private var _beer: ImageVector? = null
