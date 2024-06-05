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

public val Icons.Bold.Utensils: ImageVector
    get() {
        if (_utensils != null) {
            return _utensils!!
        }
        _utensils = Builder(name = "Utensils", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.327f, 0.758f)
                arcToRelative(2.69f, 2.69f, 0.0f, false, false, -2.9f, -0.55f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 16.0f, 2.449f)
                verticalLineTo(22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(20.017f)
                curveTo(25.114f, 15.384f, 25.64f, 5.855f, 20.327f, 0.758f)
                close()
                moveTo(19.0f, 15.744f)
                verticalLineToRelative(-12.0f)
                curveTo(21.491f, 6.636f, 21.712f, 12.722f, 19.0f, 15.744f)
                close()
                moveTo(13.0f, 1.5f)
                verticalLineToRelative(6.0f)
                arcToRelative(6.506f, 6.506f, 0.0f, false, true, -5.0f, 6.318f)
                verticalLineTo(22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineTo(13.818f)
                arcTo(6.506f, 6.506f, 0.0f, false, true, 0.0f, 7.5f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 2.0f, 3.149f)
                verticalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(9.149f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 10.0f, 7.5f)
                verticalLineToRelative(-6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 1.5f)
                close()
            }
        }
        .build()
        return _utensils!!
    }

private var _utensils: ImageVector? = null
