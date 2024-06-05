package me.localx.icons.rounded.filled

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

public val Icons.Filled.Smog: ImageVector
    get() {
        if (_smog != null) {
            return _smog!!
        }
        _smog = Builder(name = "Smog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 24.0f)
                close()
                moveTo(13.0f, 24.0f)
                lineTo(1.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(13.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 24.0f)
                close()
                moveTo(23.0f, 20.0f)
                lineTo(11.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(23.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 20.0f)
                close()
                moveTo(7.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(7.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 20.0f)
                close()
                moveTo(19.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 16.0f)
                close()
                moveTo(13.0f, 16.0f)
                lineTo(1.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(13.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 16.0f)
                close()
                moveTo(16.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -2.336f, -0.579f)
                arcToRelative(6.271f, 6.271f, 0.0f, false, true, -5.536f, -0.152f)
                arcToRelative(0.587f, 0.587f, 0.0f, false, false, -0.571f, 0.028f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 0.134f, 5.829f)
                arcTo(4.95f, 4.95f, 0.0f, false, true, 3.811f, 2.138f)
                arcToRelative(5.092f, 5.092f, 0.0f, false, true, 2.374f, 0.0f)
                arcToRelative(0.277f, 0.277f, 0.0f, false, false, 0.283f, -0.074f)
                arcToRelative(6.033f, 6.033f, 0.0f, false, true, 8.8f, -0.287f)
                curveToRelative(0.065f, 0.065f, 0.217f, 0.219f, 0.734f, 0.219f)
                arcToRelative(4.978f, 4.978f, 0.0f, false, true, 3.9f, 1.875f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.193f, 0.148f)
                arcToRelative(3.579f, 3.579f, 0.0f, false, true, 1.438f, 0.129f)
                arcToRelative(3.443f, 3.443f, 0.0f, false, true, 2.348f, 2.433f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -4.341f, 4.282f)
                curveToRelative(-0.274f, -0.079f, -0.333f, -0.032f, -0.358f, -0.011f)
                arcTo(4.932f, 4.932f, 0.0f, false, true, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _smog!!
    }

private var _smog: ImageVector? = null
