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

public val Icons.Bold.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = Builder(name = "Bank", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 21.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-24.0f)
                close()
                moveTo(24.0f, 8.1f)
                verticalLineToRelative(1.9f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-22.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.9f)
                arcToRelative(3.408f, 3.408f, 0.0f, false, true, 1.777f, -3.0f)
                lineToRelative(8.59f, -4.684f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 3.266f, 0.0f)
                lineToRelative(8.591f, 4.684f)
                arcToRelative(3.409f, 3.409f, 0.0f, false, true, 1.776f, 3.0f)
                close()
                moveTo(4.562f, 7.0f)
                horizontalLineToRelative(14.875f)
                lineToRelative(-7.237f, -3.95f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.39f, 0.0f)
                close()
                moveTo(11.0f, 10.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(6.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bank!!
    }

private var _bank: ImageVector? = null
