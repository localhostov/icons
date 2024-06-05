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

public val Icons.Filled.ContainerStorage: ImageVector
    get() {
        if (_containerStorage != null) {
            return _containerStorage!!
        }
        _containerStorage = Builder(name = "ContainerStorage", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(14.0f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(23.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(8.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(13.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(18.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _containerStorage!!
    }

private var _containerStorage: ImageVector? = null
