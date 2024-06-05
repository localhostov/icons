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

public val Icons.Filled.BandAid: ImageVector
    get() {
        if (_bandAid != null) {
            return _bandAid!!
        }
        _bandAid = Builder(name = "BandAid", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-14.0f)
                close()
                moveTo(24.0f, 19.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(17.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-14.0f)
                close()
                moveTo(13.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(11.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(11.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(15.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _bandAid!!
    }

private var _bandAid: ImageVector? = null
