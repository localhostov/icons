package me.localx.icons.straight.outline

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

public val Icons.Outline.Condition: ImageVector
    get() {
        if (_condition != null) {
            return _condition!!
        }
        _condition = Builder(name = "Condition", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.84f, 13.0f)
                lineToRelative(-5.84f, -4.492f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.508f)
                lineToRelative(-5.84f, 4.492f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(3.16f)
                lineToRelative(6.84f, 5.262f)
                lineToRelative(6.84f, -5.262f)
                horizontalLineToRelative(3.16f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-5.16f)
                close()
                moveTo(12.0f, 17.738f)
                lineToRelative(-4.86f, -3.738f)
                lineToRelative(4.86f, -3.738f)
                lineToRelative(4.86f, 3.738f)
                lineToRelative(-4.86f, 3.738f)
                close()
                moveTo(17.043f, 8.543f)
                lineToRelative(2.043f, -2.043f)
                lineToRelative(-2.043f, -2.043f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.043f, 2.043f)
                lineToRelative(2.043f, -2.043f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.043f, 2.043f)
                lineToRelative(2.043f, 2.043f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.043f, -2.043f)
                lineToRelative(-2.043f, 2.043f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(3.419f, 9.914f)
                lineTo(0.082f, 6.576f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.923f, 1.924f)
                lineToRelative(3.643f, -3.644f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-5.057f, 5.058f)
                close()
            }
        }
        .build()
        return _condition!!
    }

private var _condition: ImageVector? = null
