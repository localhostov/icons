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

public val Icons.Bold.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 3.0f)
                horizontalLineToRelative(-0.642f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 14.0f, 0.0f)
                lineTo(10.0f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.142f, 3.0f)
                lineTo(5.5f, 3.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 8.5f)
                verticalLineToRelative(10.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 24.0f, 18.5f)
                lineTo(24.0f, 8.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 18.5f, 3.0f)
                close()
                moveTo(5.5f, 6.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 8.5f)
                lineTo(21.0f, 11.0f)
                lineTo(3.0f, 11.0f)
                lineTo(3.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 6.0f)
                close()
                moveTo(18.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                lineTo(3.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 21.0f)
                close()
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
