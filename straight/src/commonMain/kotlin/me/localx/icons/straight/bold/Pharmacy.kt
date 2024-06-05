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

public val Icons.Bold.Pharmacy: ImageVector
    get() {
        if (_pharmacy != null) {
            return _pharmacy!!
        }
        _pharmacy = Builder(name = "Pharmacy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(11.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _pharmacy!!
    }

private var _pharmacy: ImageVector? = null
