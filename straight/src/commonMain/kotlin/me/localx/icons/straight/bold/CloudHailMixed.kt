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

public val Icons.Bold.CloudHailMixed: ImageVector
    get() {
        if (_cloudHailMixed != null) {
            return _cloudHailMixed!!
        }
        _cloudHailMixed = Builder(name = "CloudHailMixed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 10.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 14.5f)
                close()
                moveTo(6.8f, 23.271f)
                lineTo(9.709f, 24.0f)
                lineToRelative(1.5f, -6.0f)
                lineTo(8.3f, 17.271f)
                close()
                moveTo(13.5f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 15.0f, 22.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 21.0f)
                close()
                moveTo(24.0f, 12.478f)
                lineTo(24.0f, 12.5f)
                arcToRelative(8.048f, 8.048f, 0.0f, false, true, -6.382f, 7.822f)
                lineToRelative(0.879f, -3.514f)
                arcTo(5.013f, 5.013f, 0.0f, false, false, 21.0f, 12.5f)
                verticalLineToRelative(-0.022f)
                horizontalLineToRelative(0.0f)
                arcTo(4.517f, 4.517f, 0.0f, false, false, 16.452f, 8.0f)
                lineTo(15.37f, 7.965f)
                lineToRelative(-0.308f, -1.038f)
                arcTo(5.4f, 5.4f, 0.0f, false, false, 10.091f, 3.0f)
                arcTo(4.935f, 4.935f, 0.0f, false, false, 5.0f, 8.0f)
                arcToRelative(5.918f, 5.918f, 0.0f, false, false, 0.247f, 2.024f)
                lineToRelative(0.479f, 1.258f)
                lineToRelative(-1.2f, 0.613f)
                arcTo(2.787f, 2.787f, 0.0f, false, false, 3.0f, 14.387f)
                arcToRelative(3.159f, 3.159f, 0.0f, false, false, 1.652f, 2.776f)
                lineToRelative(0.313f, 0.159f)
                lineToRelative(1.18f, 0.316f)
                lineToRelative(-0.719f, 2.874f)
                lineToRelative(-0.693f, -0.15f)
                arcTo(6.156f, 6.156f, 0.0f, false, true, 0.0f, 14.387f)
                verticalLineToRelative(-0.011f)
                arcTo(5.767f, 5.767f, 0.0f, false, true, 2.133f, 9.893f)
                arcTo(11.943f, 11.943f, 0.0f, false, true, 2.0f, 8.0f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 8.091f, -8.0f)
                arcToRelative(8.292f, 8.292f, 0.0f, false, true, 7.492f, 5.1f)
                arcTo(7.411f, 7.411f, 0.0f, false, true, 24.0f, 12.478f)
                close()
                moveTo(0.005f, 14.387f)
                lineTo(0.0f, 14.387f)
                curveTo(0.0f, 14.4f, 0.0f, 14.405f, 0.005f, 14.387f)
                close()
                moveTo(2.999f, 14.387f)
                lineTo(3.0f, 14.387f)
                curveTo(3.0f, 14.405f, 3.0f, 14.4f, 3.0f, 14.387f)
                close()
                moveTo(12.8f, 19.0f)
                lineToRelative(2.91f, 0.728f)
                lineToRelative(1.5f, -6.0f)
                lineTo(14.3f, 13.0f)
                close()
            }
        }
        .build()
        return _cloudHailMixed!!
    }

private var _cloudHailMixed: ImageVector? = null
