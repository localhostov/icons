package me.localx.icons.straight.filled

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
                moveToRelative(14.0f, 7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-17.0f)
                close()
                moveTo(7.0f, 10.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(7.0f, 14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(13.135f, 21.0f)
                arcToRelative(3.154f, 3.154f, 0.0f, false, true, -1.986f, -0.706f)
                curveToRelative(-0.314f, -0.223f, -0.424f, -0.294f, -0.662f, -0.294f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, false, -1.786f, 0.713f)
                lineToRelative(-1.408f, -1.42f)
                arcToRelative(4.763f, 4.763f, 0.0f, false, true, 3.194f, -1.293f)
                arcToRelative(2.925f, 2.925f, 0.0f, false, true, 1.821f, 0.664f)
                arcToRelative(1.235f, 1.235f, 0.0f, false, false, 0.827f, 0.336f)
                curveToRelative(0.725f, 0.0f, 1.688f, -1.055f, 2.041f, -1.566f)
                lineToRelative(1.65f, 1.13f)
                curveToRelative(-0.171f, 0.249f, -1.72f, 2.436f, -3.691f, 2.436f)
                close()
                moveTo(16.0f, 0.219f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.586f, 0.953f)
                lineToRelative(2.242f, 2.242f)
                arcToRelative(3.969f, 3.969f, 0.0f, false, true, 0.957f, 1.586f)
                horizontalLineToRelative(-4.785f)
                close()
            }
        }
        .build()
        return _documentSigned!!
    }

private var _documentSigned: ImageVector? = null
