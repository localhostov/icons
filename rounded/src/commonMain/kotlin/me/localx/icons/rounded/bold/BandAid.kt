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

public val Icons.Bold.BandAid: ImageVector
    get() {
        if (_bandAid != null) {
            return _bandAid!!
        }
        _bandAid = Builder(name = "BandAid", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                close()
                moveTo(14.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(9.5f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(14.5f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 9.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.5f, 5.5f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.5f, -5.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, 5.5f, -5.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, 5.5f, 5.5f)
                close()
                moveTo(18.5f, 17.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.5f, -0.051f)
                verticalLineToRelative(-9.9f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.5f, -0.049f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.5f, 0.051f)
                verticalLineToRelative(9.9f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.5f, 0.049f)
                close()
            }
        }
        .build()
        return _bandAid!!
    }

private var _bandAid: ImageVector? = null
