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

public val Icons.Bold.Seal: ImageVector
    get() {
        if (_seal != null) {
            return _seal!!
        }
        _seal = Builder(name = "Seal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 9.033f)
                lineTo(21.0f, 3.0f)
                horizontalLineToRelative(-6.033f)
                lineTo(12.0f, 0.033f)
                lineToRelative(-2.967f, 2.967f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(6.033f)
                lineTo(0.032f, 12.0f)
                lineToRelative(2.968f, 2.967f)
                verticalLineToRelative(6.033f)
                horizontalLineToRelative(6.033f)
                lineToRelative(2.967f, 2.967f)
                lineToRelative(2.967f, -2.967f)
                horizontalLineToRelative(6.033f)
                verticalLineToRelative(-6.033f)
                lineToRelative(2.968f, -2.967f)
                lineToRelative(-2.968f, -2.967f)
                close()
                moveTo(18.0f, 13.724f)
                verticalLineToRelative(4.275f)
                horizontalLineToRelative(-4.275f)
                lineToRelative(-1.725f, 1.725f)
                lineToRelative(-1.725f, -1.725f)
                horizontalLineToRelative(-4.275f)
                verticalLineToRelative(-4.275f)
                lineToRelative(-1.725f, -1.725f)
                lineToRelative(1.725f, -1.725f)
                verticalLineToRelative(-4.275f)
                horizontalLineToRelative(4.275f)
                lineToRelative(1.725f, -1.725f)
                lineToRelative(1.725f, 1.725f)
                horizontalLineToRelative(4.275f)
                verticalLineToRelative(4.275f)
                lineToRelative(1.725f, 1.725f)
                lineToRelative(-1.725f, 1.725f)
                close()
            }
        }
        .build()
        return _seal!!
    }

private var _seal: ImageVector? = null
