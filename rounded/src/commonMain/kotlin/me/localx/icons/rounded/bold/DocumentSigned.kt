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
                moveToRelative(16.652f, 15.548f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.189f, 2.1f)
                arcToRelative(5.981f, 5.981f, 0.0f, false, true, -3.47f, 1.352f)
                arcToRelative(3.33f, 3.33f, 0.0f, false, true, -2.179f, -0.841f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -0.236f, -0.174f)
                arcToRelative(3.535f, 3.535f, 0.0f, false, false, -1.1f, 0.649f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.969f, -2.263f)
                arcToRelative(5.409f, 5.409f, 0.0f, false, true, 3.126f, -1.371f)
                arcToRelative(3.133f, 3.133f, 0.0f, false, true, 2.032f, 0.8f)
                curveToRelative(0.256f, 0.2f, 0.27f, 0.2f, 0.326f, 0.2f)
                arcToRelative(3.028f, 3.028f, 0.0f, false, false, 1.551f, -0.656f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.108f, 0.204f)
                close()
                moveTo(15.5f, 10.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(22.0f, 7.157f)
                verticalLineToRelative(11.343f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.5f, 5.5f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.5f, -5.5f)
                verticalLineToRelative(-13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, 5.5f, -5.5f)
                horizontalLineToRelative(7.343f)
                arcToRelative(5.464f, 5.464f, 0.0f, false, true, 3.889f, 1.611f)
                lineToRelative(1.657f, 1.657f)
                arcToRelative(5.464f, 5.464f, 0.0f, false, true, 1.611f, 3.889f)
                close()
                moveTo(19.0f, 18.5f)
                verticalLineToRelative(-11.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _documentSigned!!
    }

private var _documentSigned: ImageVector? = null
