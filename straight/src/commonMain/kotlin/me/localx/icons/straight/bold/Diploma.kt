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

public val Icons.Bold.Diploma: ImageVector
    get() {
        if (_diploma != null) {
            return _diploma!!
        }
        _diploma = Builder(name = "Diploma", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 15.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -2.0f, -3.738f)
                verticalLineToRelative(-8.262f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(7.551f)
                arcToRelative(4.481f, 4.481f, 0.0f, false, false, -2.0f, 8.187f)
                verticalLineToRelative(4.762f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(2.5f, 2.5f)
                verticalLineToRelative(-4.762f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 2.0f, -3.738f)
                close()
                moveTo(19.5f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                close()
                moveTo(17.0f, 8.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(7.0f, 10.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _diploma!!
    }

private var _diploma: ImageVector? = null
