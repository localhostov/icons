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

public val Icons.Filled.DocumentSigned: ImageVector
    get() {
        if (_documentSigned != null) {
            return _documentSigned!!
        }
        _documentSigned = Builder(name = "DocumentSigned", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 0.3f)
                arcToRelative(4.968f, 4.968f, 0.0f, false, true, 1.879f, 1.164f)
                lineToRelative(1.656f, 1.658f)
                arcToRelative(4.954f, 4.954f, 0.0f, false, true, 1.165f, 1.878f)
                horizontalLineToRelative(-4.7f)
                close()
                moveTo(21.0f, 7.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                close()
                moveTo(16.808f, 17.413f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, -0.222f)
                arcToRelative(4.586f, 4.586f, 0.0f, false, true, -2.273f, 0.809f)
                arcToRelative(1.347f, 1.347f, 0.0f, false, true, -0.864f, -0.345f)
                arcToRelative(3.025f, 3.025f, 0.0f, false, false, -1.832f, -0.655f)
                arcToRelative(5.861f, 5.861f, 0.0f, false, false, -3.046f, 1.206f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.214f, 1.588f)
                arcToRelative(3.951f, 3.951f, 0.0f, false, true, 1.832f, -0.794f)
                curveToRelative(0.246f, 0.0f, 0.371f, 0.078f, 0.7f, 0.3f)
                arcToRelative(3.252f, 3.252f, 0.0f, false, false, 2.0f, 0.7f)
                arcToRelative(6.464f, 6.464f, 0.0f, false, false, 3.456f, -1.193f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.213f, -1.394f)
                close()
                moveTo(17.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(17.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _documentSigned!!
    }

private var _documentSigned: ImageVector? = null
