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

public val Icons.Bold.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
                moveTo(16.217f, 21.218f)
                curveTo(19.541f, 17.9f, 22.3f, 10.33f, 22.411f, 10.009f)
                lineTo(23.136f, 8.0f)
                lineTo(20.513f, 8.0f)
                lineTo(23.857f, 0.1f)
                lineTo(16.0f, 3.571f)
                lineTo(16.0f, 0.864f)
                lineToRelative(-2.009f, 0.725f)
                curveTo(13.67f, 1.705f, 6.105f, 4.46f, 2.783f, 7.782f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 16.217f, 21.218f)
                close()
                moveTo(13.0f, 8.179f)
                lineTo(18.143f, 5.9f)
                lineTo(15.987f, 11.0f)
                horizontalLineToRelative(2.8f)
                curveTo(17.8f, 13.36f, 16.0f, 17.194f, 14.1f, 19.1f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 4.9f, 9.9f)
                curveTo(6.806f, 8.0f, 10.64f, 6.2f, 13.0f, 5.209f)
                close()
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
