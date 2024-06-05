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

public val Icons.Bold.DocumentSigned: ImageVector
    get() {
        if (_documentSigned != null) {
            return _documentSigned!!
        }
        _documentSigned = Builder(name = "DocumentSigned", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.682f, 3.561f)
                lineToRelative(-2.242f, -2.242f)
                arcToRelative(4.526f, 4.526f, 0.0f, false, false, -3.182f, -1.319f)
                horizontalLineToRelative(-9.758f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-17.257f)
                arcToRelative(4.474f, 4.474f, 0.0f, false, false, -1.318f, -3.182f)
                close()
                moveTo(5.0f, 21.0f)
                verticalLineToRelative(-17.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(13.868f, 15.023f)
                lineTo(16.716f, 15.969f)
                curveToRelative(-0.369f, 1.131f, -1.539f, 3.031f, -3.581f, 3.031f)
                arcToRelative(3.683f, 3.683f, 0.0f, false, true, -2.275f, -0.8f)
                arcToRelative(1.409f, 1.409f, 0.0f, false, false, -0.308f, -0.2f)
                arcToRelative(3.234f, 3.234f, 0.0f, false, false, -0.8f, 0.825f)
                lineToRelative(-2.5f, -1.664f)
                curveToRelative(0.339f, -0.502f, 1.574f, -2.161f, 3.235f, -2.161f)
                arcToRelative(3.407f, 3.407f, 0.0f, false, true, 2.111f, 0.756f)
                curveToRelative(0.3f, 0.217f, 0.354f, 0.244f, 0.537f, 0.244f)
                curveToRelative(0.204f, 0.0f, 0.586f, -0.55f, 0.733f, -0.977f)
                close()
            }
        }
        .build()
        return _documentSigned!!
    }

private var _documentSigned: ImageVector? = null
