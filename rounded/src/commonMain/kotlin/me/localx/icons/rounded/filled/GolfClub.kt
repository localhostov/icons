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

public val Icons.Filled.GolfClub: ImageVector
    get() {
        if (_golfClub != null) {
            return _golfClub!!
        }
        _golfClub = Builder(name = "GolfClub", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.033f, 0.014f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -1.152f, 0.821f)
                lineTo(20.01f, 11.98f)
                lineTo(7.236f, 9.291f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 0.0f, 15.162f)
                lineTo(0.0f, 18.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(6.014f)
                arcToRelative(9.518f, 9.518f, 0.0f, false, false, 8.715f, -5.687f)
                arcTo(9.335f, 9.335f, 0.0f, false, false, 21.4f, 15.8f)
                lineTo(23.854f, 1.166f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.033f, 0.014f)
                close()
                moveTo(10.979f, 19.486f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.978f, 0.793f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, true, -0.208f, -0.022f)
                lineTo(4.83f, 19.207f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.414f, -1.957f)
                lineToRelative(4.963f, 1.05f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.979f, 19.486f)
                close()
                moveTo(15.494f, 16.263f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.977f, 0.795f)
                arcToRelative(1.029f, 1.029f, 0.0f, false, true, -0.206f, -0.021f)
                lineTo(5.8f, 15.252f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 6.21f, 13.3f)
                lineToRelative(8.511f, 1.785f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.494f, 16.263f)
                close()
            }
        }
        .build()
        return _golfClub!!
    }

private var _golfClub: ImageVector? = null
