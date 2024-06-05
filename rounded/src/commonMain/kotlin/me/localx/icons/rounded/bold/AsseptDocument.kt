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

public val Icons.Bold.AsseptDocument: ImageVector
    get() {
        if (_asseptDocument != null) {
            return _asseptDocument!!
        }
        _asseptDocument = Builder(name = "AsseptDocument", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.389f, 4.268f)
                lineToRelative(-2.657f, -2.657f)
                arcToRelative(5.462f, 5.462f, 0.0f, false, false, -3.889f, -1.611f)
                horizontalLineToRelative(-6.343f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -5.5f, 5.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, 5.5f, -5.5f)
                verticalLineToRelative(-10.343f)
                arcToRelative(5.464f, 5.464f, 0.0f, false, false, -1.611f, -3.889f)
                close()
                moveTo(16.5f, 21.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(9.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                close()
                moveTo(17.086f, 11.466f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.052f, 2.12f)
                lineToRelative(-3.586f, 3.414f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -4.923f, -0.025f)
                lineToRelative(-1.525f, -1.355f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.0f, -2.24f)
                lineToRelative(1.586f, 1.414f)
                arcToRelative(0.584f, 0.584f, 0.0f, false, false, 0.414f, 0.206f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.353f, -0.146f)
                lineToRelative(3.613f, -3.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.12f, 0.052f)
                close()
            }
        }
        .build()
        return _asseptDocument!!
    }

private var _asseptDocument: ImageVector? = null
