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

public val Icons.Outline.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.119f, 0.882f)
                arcToRelative(2.966f, 2.966f, 0.0f, false, false, -2.8f, -0.8f)
                lineToRelative(-16.0f, 3.37f)
                arcToRelative(4.995f, 4.995f, 0.0f, false, false, -2.853f, 8.481f)
                lineTo(3.184f, 13.65f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.293f, 0.708f)
                verticalLineToRelative(3.168f)
                arcToRelative(2.965f, 2.965f, 0.0f, false, false, 0.3f, 1.285f)
                lineToRelative(-0.008f, 0.007f)
                lineToRelative(0.026f, 0.026f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.157f, 20.2f)
                lineToRelative(0.026f, 0.026f)
                lineToRelative(0.007f, -0.008f)
                arcToRelative(2.965f, 2.965f, 0.0f, false, false, 1.285f, 0.3f)
                lineTo(9.643f, 20.518f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.707f, 0.292f)
                lineToRelative(1.717f, 1.717f)
                arcTo(4.963f, 4.963f, 0.0f, false, false, 15.587f, 24.0f)
                arcToRelative(5.049f, 5.049f, 0.0f, false, false, 1.605f, -0.264f)
                arcToRelative(4.933f, 4.933f, 0.0f, false, false, 3.344f, -3.986f)
                lineTo(23.911f, 3.715f)
                arcTo(2.975f, 2.975f, 0.0f, false, false, 23.119f, 0.882f)
                close()
                moveTo(4.6f, 12.238f)
                lineTo(2.881f, 10.521f)
                arcToRelative(2.94f, 2.94f, 0.0f, false, true, -0.722f, -3.074f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, true, 2.5f, -2.026f)
                lineTo(20.5f, 2.086f)
                lineTo(5.475f, 17.113f)
                lineTo(5.475f, 14.358f)
                arcTo(2.978f, 2.978f, 0.0f, false, false, 4.6f, 12.238f)
                close()
                moveTo(18.571f, 19.408f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -5.089f, 1.712f)
                lineTo(11.762f, 19.4f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, false, -2.119f, -0.878f)
                lineTo(6.888f, 18.522f)
                lineTo(21.915f, 3.5f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
