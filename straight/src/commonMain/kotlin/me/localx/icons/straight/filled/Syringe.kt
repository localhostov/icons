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

public val Icons.Filled.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.535f, 7.324f)
                lineToRelative(1.43f, -1.4f)
                lineToRelative(-5.75f, -5.873f)
                lineToRelative(-1.43f, 1.4f)
                lineToRelative(2.256f, 2.3f)
                lineToRelative(-2.179f, 2.041f)
                lineToRelative(-0.912f, -0.913f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.233f, -0.008f)
                lineToRelative(3.206f, 3.206f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.209f, -3.207f)
                lineToRelative(-1.584f, 1.586f)
                lineToRelative(3.207f, 3.207f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.209f, -3.207f)
                lineToRelative(-1.584f, 1.586f)
                lineToRelative(3.207f, 3.207f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.209f, -3.207f)
                lineToRelative(-1.3f, 1.302f)
                verticalLineToRelative(6.0f)
                lineToRelative(-2.957f, 2.957f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.957f, -2.957f)
                horizontalLineToRelative(6.0f)
                lineToRelative(8.707f, -8.707f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -4.243f)
                lineToRelative(-0.844f, -0.843f)
                lineToRelative(2.163f, -2.023f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
