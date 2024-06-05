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

public val Icons.Outline.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) {
            return _flowerTulip!!
        }
        _flowerTulip = Builder(name = "FlowerTulip", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.535f, 14.725f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, false, -1.726f, -0.716f)
                arcTo(11.993f, 11.993f, 0.0f, false, false, 13.0f, 18.987f)
                lineTo(13.0f, 13.91f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 18.0f, 8.0f)
                curveToRelative(0.0f, -2.793f, -1.943f, -5.152f, -3.844f, -7.091f)
                arcToRelative(3.085f, 3.085f, 0.0f, false, false, -4.312f, 0.0f)
                curveTo(7.943f, 2.848f, 6.0f, 5.207f, 6.0f, 8.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, 5.0f, 5.91f)
                verticalLineToRelative(5.077f)
                arcToRelative(11.993f, 11.993f, 0.0f, false, false, -8.809f, -4.978f)
                arcToRelative(1.992f, 1.992f, 0.0f, false, false, -1.726f, 0.716f)
                arcToRelative(1.971f, 1.971f, 0.0f, false, false, -0.393f, 1.792f)
                curveTo(2.111f, 23.855f, 11.591f, 24.0f, 11.994f, 24.0f)
                horizontalLineToRelative(0.012f)
                curveToRelative(0.4f, 0.0f, 9.884f, -0.145f, 11.923f, -7.483f)
                arcTo(1.975f, 1.975f, 0.0f, false, false, 23.535f, 14.725f)
                close()
                moveTo(8.0f, 8.0f)
                curveToRelative(0.0f, -2.654f, 3.318f, -5.719f, 3.338f, -5.736f)
                curveTo(10.973f, 3.2f, 8.693f, 8.9f, 11.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(13.472f, 13.472f, 0.0f, false, true, 1.257f, -5.137f)
                curveTo(14.688f, 4.393f, 16.0f, 6.154f, 16.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(2.006f, 16.0f)
                arcToRelative(10.268f, 10.268f, 0.0f, false, true, 8.462f, 5.863f)
                curveTo(7.971f, 21.517f, 3.2f, 20.3f, 2.006f, 16.0f)
                close()
                moveTo(13.545f, 21.861f)
                arcTo(10.379f, 10.379f, 0.0f, false, true, 22.0f, 15.981f)
                curveTo(20.806f, 20.283f, 16.046f, 21.511f, 13.545f, 21.861f)
                close()
            }
        }
        .build()
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
