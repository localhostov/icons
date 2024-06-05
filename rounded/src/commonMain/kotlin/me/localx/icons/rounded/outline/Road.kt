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

public val Icons.Outline.Road: ImageVector
    get() {
        if (_road != null) {
            return _road!!
        }
        _road = Builder(name = "Road", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.46f, 4.134f)
                arcTo(4.992f, 4.992f, 0.0f, false, false, 16.536f, 0.0f)
                lineTo(7.451f, 0.0f)
                arcTo(4.992f, 4.992f, 0.0f, false, false, 2.525f, 4.138f)
                lineToRelative(-2.449f, 14.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 5.0f, 24.0f)
                lineTo(19.0f, 24.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.925f, -5.866f)
                close()
                moveTo(21.3f, 20.929f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.955f, -3.518f)
                lineToRelative(2.449f, -14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.451f, 2.0f)
                horizontalLineToRelative(9.085f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.49f, 4.48f)
                lineToRelative(2.463f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.3f, 20.929f)
                close()
                moveTo(13.0f, 5.0f)
                lineTo(13.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(13.0f, 11.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(13.0f, 17.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _road!!
    }

private var _road: ImageVector? = null
